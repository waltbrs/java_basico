import java.util.Scanner;

class Exer04 {
    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4, somaNotas;
        float mediaNotas;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota");
        nota1 = scan.nextInt();
        System.out.println("Informe a segunda nota");
        nota2 = scan.nextInt();
        System.out.println("Informe a terceira nota");
        nota3 = scan.nextInt();
        System.out.println("Informe a quarta nota ");
        nota4 = scan.nextInt();

        somaNotas = nota1 + nota2 + nota3 + nota4;
        mediaNotas = somaNotas / 4;

        System.out.println("A media das 4 notas bimestrais eh " + mediaNotas);

    }
}

