package ExerciciosComClass.dominio;

public class GradeBook01 {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        if (courseName.length()<=25)
            this.courseName = courseName;
        else {
            this.courseName = courseName.substring(0,25);
            System.out.println("A frase "+courseName+" excede o comprimento máximo(25) \n" +
                    "Limitando para os 25 primeiros caracteres.\n");
        }
    }

    public GradeBook01(String courseName) {
        setCourseName(courseName);
    }

    public void displayMessage(){
        System.out.println("Bem Vindo ao livro de notas de "+getCourseName());
    }
}
