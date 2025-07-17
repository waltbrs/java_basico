import java.util.Scanner;

class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        /* System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo eh: " + nomeCompleto);


        System.out.println("Digite o seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome eh: " + primeiroNome);
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade eh: " + idade); */

        System.out.println("Digite o seu primeiro, idade, quantidade de filhos, altura e se tem bichinho de estimacao");
        String primeiroNome = scan.next();
        byte idade = scan.nextByte();
        int qtdFilhos = scan.nextInt();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Voce digitou os seguintes valores: ");
        System.out.println("Seu primeiro nome eh: " + primeiroNome);
        System.out.println("Sua idade eh: " + idade);
        System.out.println("Quantidade de filhos eh: " + qtdFilhos);
        System.out.println("A sua altura eh: " + altura);
        System.out.println("Tem pet eh: " + temPet);

        

    }
}

