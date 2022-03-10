let fs = require("fs");
let path = require("path");

let begin = () => {
  let object = {};
  let arguments = process.argv;

  switch (arguments[2]) {
    case "--dir":
      object.dir = arguments[3];
      break;

    default:
      break;
  }

  let files = fs.readdirSync(object.dir);

  files.forEach((filePath) => {
    if (!filePath.endsWith(".pseudo")) return;

    // console.log(object);

    let file = fs.readFileSync(path.join(object.dir, filePath), {
      encoding: "utf-8",
    });
    let template = fs.readFileSync(
      path.join(__dirname, "javaFileTemplate.txt"),
      { encoding: "utf-8" }
    );

    let lines = file.split("\n");

    lines = lines.map((line) => {
      if (line.includes("num")) {
        return line.replace("num", "double").replace("\r", "").replace("\n") + ";\n";
      }

      if (line.includes("output")) {
        return (
          line.replace("output ", "System.out.println(").replace(",", " + ").replace(",", " + ").replace("\r", "").replace("\n") +
          ");\n"
        );
      }

      if (line.includes("input")) {
        return line.replace("input ", "").replace("\r", "").replace("\n") + " = Double.parseDouble(scanner.next());\n";
      }

      if (line.includes("set")) {
        return line.replace("set ", "").replace("\r", "").replace("\n") + ";\n";
      }
    });

    lines = lines.filter((line) => line !== undefined);

    let javaCode = template;
    let code = "";

    lines.forEach((line) => (code += line));

    javaCode = javaCode.replace(
      "{name}",
      filePath.replace(".\\", "").replace(".pseudo", "")
    );

    javaCode = javaCode.replace("{code}", code);

    fs.writeFileSync(
      path.join(object.dir, filePath.replace(".pseudo", ".java")),
      javaCode
    );
  });
};

begin();
