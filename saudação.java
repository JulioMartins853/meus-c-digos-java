import java.util.Scanner;

public class saudação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + " Você tem " + idade + " anos.");


        
    }
    
}
