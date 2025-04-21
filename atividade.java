import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número:");

        int número = scanner.nextInt();

        if(número % 2 == 0) {
            System.out.println("O número " + número + "É Par.");
        }else{
            System.out.println("O número " + número + " É Ímpar.");
        }

        scanner.close();
    }
    
}
