import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        System.out.println("aula15 - switch case");

        Scanner scan = new Scanner(System.in);
        
        int diaSemana;
        System.out.println("Entre com um dia válido (1-7)");
        diaSemana = scan.nextInt();

        if (diaSemana == 1) {
            System.out.println("domingo");
        } else if (diaSemana == 2) {
            System.out.println("segunda-feira");
        } else if (diaSemana == 3) {
            System.out.println("terça-feira");
        } else if (diaSemana == 4) {
            System.out.println("quarta-feira");
        } else if (diaSemana == 5) {
            System.out.println("quinta-feira");
        } else if (diaSemana == 6) {
            System.out.println("sexta-feira");
        } else if (diaSemana == 7) {
            System.out.println("sábado");
        } else {
            System.out.println("Dia inválido");
        }

        // exemplo com Switch Case

        System.out.println("entre com novo dia válido (1-7)");
        diaSemana = scan.nextInt();
        
        switch (diaSemana) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("segunda-feira"); break;
            case 3: System.out.println("terça-feira"); break;
            case 4: System.out.println("quarta-feira"); break;
            case 5: System.out.println("quinta-feira"); break;
            case 6: System.out.println("sexta-feira"); break;
            case 7: System.out.println("sábado"); break;
            default: System.out.println("nao eh um dia válido");
        }


        
    }
}
