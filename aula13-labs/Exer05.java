import java.util.Scanner;

class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int metros, centimetros;

        System.out.println("Informe o valor em metros");
        metros = scan.nextInt();

        centimetros = metros * 100;
        System.out.println(metros + " metros equivale a " + centimetros + " centimetros");

    }
}
