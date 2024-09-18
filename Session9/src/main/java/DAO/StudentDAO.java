package DAO;

import Interface.Session9;
import Models.Student;
import java.util.ArrayList;

public class StudentDAO implements Session9 {
    ArrayList<Student> students = new ArrayList<>();

    @Override
    public boolean save(Object obj) {
        Student student = (Student) obj; //Castear
        try {
            students.add(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByName(String name) {
        try {
            for (Student student : students) {
                if (student.getName().equals(name)) {
                    System.out.println(student);
                }
            }
            System.out.println("No se encontró el estudiante");
        } catch (Exception e) {
            System.out.println("Ocurrió un problema al buscar al estudiante. "
            + e.getMessage());
        }
    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public int getAverageAge() {
        int sumOfAges = 0;
        int numberOfStudents = 0;
        for (Student student : students) {
            sumOfAges = sumOfAges + student.getAge();
            numberOfStudents++;
        }
        return sumOfAges / numberOfStudents;
    }
}
