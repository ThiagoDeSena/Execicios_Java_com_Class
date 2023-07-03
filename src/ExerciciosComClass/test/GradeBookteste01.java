package ExerciciosComClass.test;

import ExerciciosComClass.dominio.GradeBook01;

public class GradeBookteste01 {
    public static void main(String[] args) {

    GradeBook01 gradeBook1 = new GradeBook01("Introdução a Linguagem de Programação em Java");
    GradeBook01 gradeBook2 = new GradeBook01("Ling. de Programação");

        System.out.println("O nome inicial de grandeBook1 é: "+gradeBook1.getCourseName());
        System.out.println("O nome inicial de grandeBook2 é: "+gradeBook2.getCourseName());

        gradeBook1.setCourseName("Introdução a Java");
        System.out.println("O nome da disciplina de gradeBook1 é: "+gradeBook1.getCourseName());
        System.out.println("O nome da disciplina de gradeBook2 é: "+gradeBook2.getCourseName());

    }
}
