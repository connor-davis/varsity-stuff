package za.edu.vcconnect.st10068305.screens;

import za.edu.vcconnect.st10068305.api.employee.BaseTeacher;
import za.edu.vcconnect.st10068305.database.Databases;
import za.edu.vcconnect.st10068305.utils.Line;
import za.edu.vcconnect.st10068305.utils.Logger;

import java.util.Scanner;

public class AddTeacher {
    public void display(Scanner scanner) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("********************(TeacherDB)********************"),
        });

        BaseTeacher baseTeacher = new BaseTeacher();

        baseTeacher.requestTeacherEmployeeNumber(scanner);
        baseTeacher.requestTeacherName(scanner);
        baseTeacher.requestTeacherSubject(scanner);

        Databases.getTeachersDatabase().addTeacher(baseTeacher);
        Databases.getTeachersDatabase().save();
    }
}
