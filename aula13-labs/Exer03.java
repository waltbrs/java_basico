import java.util.Scanner;
class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe o primero numero");
        int numero1 = scan.nextInt();
        System.out.println("informe o segundo numero");
        int numero2 = scan.nextInt();

        int somaNumeros = numero1 + numero2;

        System.out.println("A soma dos números eh " + somaNumeros);

    }
} 
