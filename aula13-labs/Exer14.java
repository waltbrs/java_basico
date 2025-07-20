import java.util.Scanner;
class Exer14 {
    public static void main(String[] args) {
        double pesoRegulamentado, multaPorPeso, excesso, peso, valorTotalMulta;
        pesoRegulamentado = 50.00;
        multaPorPeso = 4.00;
        boolean pagaraMulta;

        Scanner scan = new Scanner(System.in);

        System.out.println("informe o peso");
        peso = scan.nextDouble();

        excesso = peso - pesoRegulamentado;
        valorTotalMulta = multaPorPeso * excesso;

        pagaraMulta = valorTotalMulta != 0.00;

        System.out.println("O joao pagara multa? " + pagaraMulta + ", ele pagara R$ " + valorTotalMulta + " de multa");

    }
}
