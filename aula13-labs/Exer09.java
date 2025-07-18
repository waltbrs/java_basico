import java.util.Scanner;

class Exer09 {
    public static void main(String[] args) {
        float grausFarenheit, grausCelsius;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Farenheit");
        grausFarenheit = scan.nextFloat();

        grausCelsius = (5 * (grausFarenheit - 32) / 9);
        System.out.println(grausFarenheit + " farenheit equivalem a " + grausCelsius + " celsius");
    }
}
