import DAO.StudentDAO;
import Models.Student;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Karen", 20, "kmryfonseca@uamv.edu.ni");
        Student std2 = new Student("César", 19, "casilva@uamv.edu.ni");
        Student std3 = new Student("Silvio", 19, "samora@uamv.edu.ni");

        StudentDAO students = new StudentDAO();

        if(students.save(std1)){
            System.out.println("Estudiante almacenado correctamente");
        } else {
            System.out.println("Ocurrió un problema al almacenar al estudiante");
        }

        if(students.save(std2)){
            System.out.println("Estudiante almacenado correctamente");
        } else {
            System.out.println("Ocurrió un problema al almacenar al estudiante");
        }

        if(students.save(std3)){
            System.out.println("Estudiante almacenado correctamente");
        } else {
            System.out.println("Ocurrió un problema al almacenar al estudiante");
        }

        students.showStudents();
    }
}
