package code_gym_management.repository;

import code_gym_management.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRepository implements IStudentRepository{

    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1, "Vương"));
        studentList.add(new Student(2, "Sương"));
        studentList.add(new Student(3, "Lực"));
        studentList.add(new Student(4, "Cường"));
        studentList.add(new Student(5, "Long"));
        studentList.add(new Student(6, "Phúc"));
    }
//    kết nối DB hoặc đọc ghi file
    @Override
    public List<Student> findAll() {
//        đọc file

        return studentList;
    }

    @Override
    public void add(Student student) {
//        ghi file
        studentList.add(student);
    }
}
