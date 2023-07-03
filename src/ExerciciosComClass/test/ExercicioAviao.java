package ExerciciosComClass.test;

import java.util.Scanner;

//Exercício: Implemente um código que tenha uma classe avião com os dados públicos de velocidade máxima, tipo e com um
// procedimento de inicialização que retorne se tipo 1 = velocidade máxima é de 100 e tipo planador;
// se tipo 2 = velocidade máxima é de 200 e tipo monomotor; se tipo 3 = velocidade máxima é de 300 e tipo jato.
// E imprima a informação para o usuário no código principal.
public class ExercicioAviao {
    public int velocidade_max;
    public String tipo;
    public void inicializacao(int tip){
        switch (tip){
            case 1:
                velocidade_max = 100;
                tipo = "Planador";
                break;
            case 2:
                velocidade_max = 200;
                tipo = "Monomotor";
                break;
            case 3:
                velocidade_max = 300;
                tipo = "Jato";
                break;
            default:
                System.out.println("Insira um tipo valido!");
                break;
        }
    }

    public static void main(String[] args) {
        ExercicioAviao exercicioAviao = new ExercicioAviao();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tipo de avião: ");
        System.out.println("1 - planador \n" + "2 - Monomotor\n" + "3 - Jato");
        int tip=scan.nextInt();

        exercicioAviao.inicializacao(tip);

        System.out.println("Velocidade máxima: "+exercicioAviao.velocidade_max+" km/h");
        System.out.println("Tipo: "+exercicioAviao.tipo);
    }
}
