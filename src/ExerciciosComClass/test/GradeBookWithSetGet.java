package ExerciciosComClass.test;

import java.util.Scanner;

public class GradeBookWithSetGet {
    private String coursename;

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursename() {
        return coursename;
    }

    public void displayMessage(){
        System.out.println("Bem vindo ao livro de notas de "+getCoursename());
    }

    public static void main(String[] args) {
        GradeBookWithSetGet gradeBookWithSetGet = new GradeBookWithSetGet();
        Scanner scan = new Scanner(System.in);

        System.out.println("O nome inicial da disciplina é :"+gradeBookWithSetGet.getCoursename());

        System.out.println("Por favor, entre com o nome da disciplina: ");
        String nameOfCourse = scan.nextLine();

        gradeBookWithSetGet.setCoursename(nameOfCourse);
        gradeBookWithSetGet.displayMessage();
    }
}
