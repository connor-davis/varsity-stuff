package za.edu.vcconnect.st10068305.database;

import za.edu.vcconnect.st10068305.api.employee.BaseTeacher;
import za.edu.vcconnect.st10068305.api.employee.Teacher;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TeachersDatabase extends Database {
    public Teacher[] teachers;

    public TeachersDatabase() {
        super("teachers");
    }

    public void addTeacher(Teacher teacher) {
        this.teachers = Arrays.copyOf(this.teachers, this.teachers.length + 1);
        this.teachers[this.teachers.length - 1] = teacher;
    }

    public void deleteTeacher(int index) {
        this.teachers[index] = null;
        this.teachers = Arrays.copyOf(this.teachers, this.teachers.length - 1);
    }

    public void save() {
        try {
            this.writer = new FileWriter("databases/" + databaseName + ".json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String jsonString = this.gson.toJson(teachers);

        try {
            this.writer.write(jsonString, 0, jsonString.length());
            this.writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void load() {
        try {
            this.teachers = this.gson.fromJson(this.getStoredJsonDataString(), BaseTeacher[].class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
