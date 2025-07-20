import java.util.Scanner;

class Exer12 {
    public static void main(String[] args) {
        double altura, pesoIdeal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a sua altura: ");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58.00;

        System.out.println("o seu peso ideal eh " + pesoIdeal + " kg.");

    }
}
