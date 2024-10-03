package code_gym_management.controller;

import code_gym_management.model.Student;
import code_gym_management.service.IStudentService;
import code_gym_management.service.StudentService;

import java.awt.*;
import java.util.Scanner;

public class StudentController {

    private Scanner scanner = new Scanner(System.in);

    private IStudentService studentService = new StudentService();

    public void showStudentMenu(){
        System.out.println("Chọn chức năng \n" +
                "1. Hiển thị danh sách \n" +
                "2. Thêm mới \n" +
                "3. Xóa \n" +
                "4. Thoát \n");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.println("-----------Danh sách-----------");
                List<Student> studentList = studentService.findAll();
                break;
            case 2:
                System.out.println("Thêm mới");
                break;
            case 3:
                System.out.println("Xóa");
                break;
            default:
                System.exit(0);
        }
    }
}
