import java.util.Scanner;

class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float raioCirculo, areaCirculo, pi = 3.14f;
        
        System.out.println("informe o raio do circulo");
        raioCirculo = scan.nextFloat();

        areaCirculo = pi * (raioCirculo * raioCirculo);
        System.out.println(areaCirculo);

    }
}
