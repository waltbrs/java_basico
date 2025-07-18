import java.util.Scanner;
class Exer07 {
    public static void main(String[] args) {
        float larguraQuadrado, comprimentoQuadrado, areaQuadrado, dobroAreaQuadrado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a largura do quadrado");
        larguraQuadrado = scan.nextFloat();
        System.out.println("Informe o comprimento do quadrado");
        comprimentoQuadrado = scan.nextFloat();

        areaQuadrado = larguraQuadrado * comprimentoQuadrado;
        System.out.println("A area do quadrado eh " + areaQuadrado);

        dobroAreaQuadrado = areaQuadrado * 2;

        System.out.println("O dobro da area do quadrado eh " + dobroAreaQuadrado);

    }
}
