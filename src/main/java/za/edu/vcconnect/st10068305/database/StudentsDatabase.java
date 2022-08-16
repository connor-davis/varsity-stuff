package za.edu.vcconnect.st10068305.database;

import za.edu.vcconnect.st10068305.api.student.BaseStudent;
import za.edu.vcconnect.st10068305.api.student.Student;

import java.io.IOException;
import java.util.Arrays;

public class StudentsDatabase extends Database {
    public Student[] students = new Student[]{};

    public StudentsDatabase() {
        super("students");
    }

    public void addTeacher(Student student) {
        this.students = Arrays.copyOf(this.students, this.students.length + 1);
        this.students[this.students.length - 1] = student;
    }

    public void save() {
        String jsonString = this.gson.toJson(students);

        System.out.println(jsonString);

        try {
            this.writer.write(jsonString, 0, jsonString.length());
            this.writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void load() {
        try {
            this.students = this.gson.fromJson(this.getStoredJsonDataString(), BaseStudent[].class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
