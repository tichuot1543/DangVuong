package code_gym_management.repository;

import code_gym_management.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void add (Student student);
}
