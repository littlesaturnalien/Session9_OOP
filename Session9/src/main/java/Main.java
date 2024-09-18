import DAO.StudentDAO;
import Models.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO students = new StudentDAO();
        Scanner scanner = new Scanner(System.in);

        String menu = "1. Agregar estudiante\n" +
                "2. Buscar estudiante\n" +
                "3. Mostrar estudiantes\n" +
                "4. Salir\n" +
                " ---> ";

        int option = 0;

        while (option != 4) {
            System.out.print(menu);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String name = scanner.next();
                    System.out.println("Ingrese la edad del estudiante: ");
                    int age = scanner.nextInt();
                    System.out.println("Ingrese el email del estudiante: ");
                    String email = scanner.next();
                    Student student = new Student(name, age, email);
                    if(students.save(student)){
                        System.out.println("\nEstudiante almacenado correctamente\n");
                    } else {
                        System.out.println("\nOcurrió un problema al almacenar al estudiante\n");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del estudiante a buscar: ");
                    String nameToFind = scanner.next();
                    students.findByName(nameToFind);
                    System.out.println();
                    break;

                case 3:
                    students.showStudents();
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        }

    }
}
