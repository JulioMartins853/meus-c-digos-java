import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual a sua idade?");

        int idade = scanner.nextInt();

        if(idade <= 18){
            System.out.println("Você é adolescente!");
        }else if(idade >= 18 && idade <=59){
            System.out.println("Você é adulto!");
        }else if(idade >=60 && idade <=90){
            System.out.println("Você é idoso(a)!");
        }else{
            System.out.println("Só falta enterrar!");
        }

        scanner.close();

    }
    
}