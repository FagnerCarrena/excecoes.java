
import java.util.Scanner;

public class respostas_01 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Digite o dividendo: ");
                int dividendo = scanner.nextInt();

                System.out.print("Digite o divisor: ");
                int divisor = scanner.nextInt();

                if (divisor == 0) {
                    throw new ArithmeticException("Não é possível dividir por zero!");
                }

                int resultado = dividendo / divisor;
                System.out.println("Resultado da divisão: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }



}
