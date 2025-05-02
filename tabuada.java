import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que você quer a tabuada:");

        int numero = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            int resultado = numero *i;
            System.out.println("numero " + " X " + i + " = " + resultado);
        }
        sc.close();
        }
    }   
    

