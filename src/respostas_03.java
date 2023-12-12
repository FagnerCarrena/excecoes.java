import java.util.Scanner;

public class respostas_03 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Digite sua idade: ");
                int idade = scanner.nextInt();

                if (idade < 0 || idade > 150) {

                    throw new IllegalArgumentException("Idade inválida!");
                }

                System.out.println("Idade inserida: " + idade);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }

}
