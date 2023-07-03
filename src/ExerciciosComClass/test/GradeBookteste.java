package ExerciciosComClass.test;

import ExerciciosComClass.dominio.GradeBook;

public class GradeBookteste {
    public static void main(String[] args) {
        GradeBook gradeBook1 = new GradeBook("Linguagem de Programação");
        GradeBook gradeBook2 = new GradeBook("Algoritmos");

        System.out.println("gradeBook1 criado para a disciplina: "+gradeBook1.getCourseName());
        System.out.println("gradeBook2 criado para a disciplina: "+gradeBook2.getCourseName());

        gradeBook1.displayMessage();
        gradeBook2.displayMessage();
    }
}
