import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Número");

        int N = scanner.nextInt();

        if(N<12){
            System.out.println("Bom dia!");
        }else if(N<18){
            System.out.println("Boa Tarde!");
        }else{
            System.out.println("Boa noite!");
        }
        scanner.close();
    }
    
}
