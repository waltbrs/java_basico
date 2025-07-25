import java.util.Scanner;
class Exer15 {
    public static void main(String[] args) {
        double ganhoPorHora, numeroHorasTrabalhadas, salarioLiquido, descontos, salarioBruto;

        Scanner scan = new Scanner(System.in);
        System.out.println("qual o seu ganho por h");
        ganhoPorHora = scan.nextDouble();
        System.out.println("qual o numero de horas trabalhadas no mes");
        numeroHorasTrabalhadas = scan.nextDouble();

        salarioBruto = ganhoPorHora * numeroHorasTrabalhadas;
        System.out.println("o seu salario bruto eh R$ " + salarioBruto); 
         
        descontos = (0.11 + 0.08 + 0.05) * salarioBruto;
        System.out.println("voce pagou R$ " + 0.08 * salarioBruto + " ao INSS");
        System.out.println("voce pagou R$ " + 0.05 * salarioBruto + " ao sindicato");

        salarioLiquido = salarioBruto - descontos;
        System.out.println("o seu salario liquido eh R$ " + salarioLiquido);

    }
}
