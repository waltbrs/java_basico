import java.util.Scanner;
class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float tamanhoAreaQuadrado, custoPorLatas, qntdLatas, preco;
        custoPorLatas = 80.00f;
    
        System.out.println("qual tamanho em m quadrados da area ");
        tamanhoAreaQuadrado = scan.nextFloat();
        qntdLatas = tamanhoAreaQuadrado / 3;
        preco =  (qntdLatas / 18) * custoPorLatas;
        
        System.out.println("Voce precisara comprar " + qntdLatas + " latas de tintas");
        System.out.println("Com o preço total de R$ " + preco);

        
    }
}
