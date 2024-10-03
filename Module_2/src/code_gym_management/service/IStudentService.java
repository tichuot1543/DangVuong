package code_gym_management.service;

import code_gym_management.model.Student;

import java.awt.*;

public interface IStudentService {
//    quy định các method CRUD
    List findAll();
    void add(Student student);
}
