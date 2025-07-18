import java.util.Scanner;
class Exer08 {
    public static void main(String[] args) {
        int horasTrabalhadas;
        double ganhoPorHora, salario;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu ganho em R$ por hora trabalhadas");
        ganhoPorHora = scan.nextDouble();
        System.out.println("Quantidade de horas trabalhadas");
        horasTrabalhadas = scan.nextInt();
        
        salario = horasTrabalhadas * ganhoPorHora;
        System.out.println(salario);

    }
}
