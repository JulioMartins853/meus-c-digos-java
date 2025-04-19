import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntar nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Ler as 3 notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular média
        double media = (nota1 + nota2 + nota3) / 3;

        // Mostrar média e situação
        System.out.printf("Média de %s: %.2f\n", nome, media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado(a)");
        } else if (media >= 5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado(a)");
        }

        scanner.close();
    }
}
