package ExerciciosComClass.dominio;

public class GradeBook {

    private String courseName;
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public GradeBook(String courseName){
        setCourseName(courseName);
    }
    public String getCourseName(){
        return courseName;
    }
    public void displayMessage(){
        System.out.println("Bem vindo ao livro de notas para "+getCourseName());
    }
}
