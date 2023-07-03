package ExerciciosComClass.test;

import java.util.Scanner;

public class GradeBookWithParament {

    public void displayMessage(String courseName){
        System.out.println("Bem vindo ao livro de notas de "+courseName);
    }

    public static void main(String[] args) {

        GradeBookWithParament gradeBookWithParament = new GradeBookWithParament();
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da disciplina:");
        String nameOfCourse = scan.nextLine();

        gradeBookWithParament.displayMessage(nameOfCourse);

    }
}
