package ExerciciosComClass.test;

public class GradeBookConstrutor {
    private String couserName;

    public GradeBookConstrutor(String couserName) {
       setCouseName(couserName);
    }

    void setCouseName(String couserName){
        this.couserName = couserName;
    }

    String getCouserName(){
        return couserName;
    }

    public void displayMessage(){
        System.out.println("Bem vindo para o livro de notas de "+getCouserName());
    }

    public static void main(String[] args) {
        GradeBookConstrutor gradeBookConstrutor1 = new GradeBookConstrutor("Linguagem de Programação");
        GradeBookConstrutor gradeBookConstrutor2 = new GradeBookConstrutor("Algoritmos");

        System.out.println("gradeBookConstrutor1 criado para a disciplina: "+gradeBookConstrutor1.getCouserName());
        System.out.println("gradeBookConstrutor2 criado para a disciplina: "+gradeBookConstrutor2.getCouserName());

        gradeBookConstrutor1.displayMessage();
        gradeBookConstrutor2.displayMessage();
    }
}
