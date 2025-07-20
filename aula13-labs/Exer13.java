import java.util.Scanner;

class Exer13 {
    public static void main(String[] args) {
        double altura, pesoPessoa, pesoIdealHomem, pesoIdealMulher;
        String sexo;
        boolean resultadoHomem, resultadoMulher;

        Scanner scan = new Scanner(System.in);

        System.out.println ("informe a sua altura: ");
        altura = scan.nextDouble();
        System.out.println("informe o seu sexo F para Feminino ou M para Masculino");
        sexo = scan.next();
        
        pesoIdealHomem = (72.7 * altura) - 58;
        pesoIdealMulher = (62.1 * altura) - 44.7;

        System.out.println("informe o seu pesso atual");
        pesoPessoa = scan.nextDouble();

        resultadoMulher = pesoPessoa == pesoIdealMulher;
        resultadoHomem = pesoPessoa == pesoIdealHomem;

        System.out.println ("Se voce eh \nhomem o seu peso eh ideal " + resultadoHomem + "\nse voce eh mulher o seu peso eh ideal " + resultadoMulher);

    }
}
