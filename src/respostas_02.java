import java.util.Scanner;

public class respostas_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            System.out.println("Número digitado: " + numero);
        } catch (Exception e) {
            System.out.println("Erro: Insira um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }
}
