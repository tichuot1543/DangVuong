package code_gym_management.service;

import code_gym_management.model.Student;
import code_gym_management.repository.IStudentRepository;
import code_gym_management.repository.StudentRepository;

import java.awt.*;

public class StudentService implements IStudentService{

    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public List findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);

    }
}
