import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        double valor;

        System.out.println("informe a sua idade");
        idade = scan.nextInt();
    
        if (idade >= 18) {
            System.out.println("voce eh maior de idade");
        } else {
            System.out.println("voce nao eh maior de idade");
        }

        System.out.println("informe o preco do item");
        valor = scan.nextDouble();

        if (valor <= 10 ) {
            System.out.println("esta barato pode comprar");
        } else if (valor > 10 && valor < 15) {
            System.out.println("pedir desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("pesquisar mais");
        } else {
            System.out.println("muito caro");
        }



    }
}
