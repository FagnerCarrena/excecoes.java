import java.util.ArrayList;
import java.util.List;

public class respostas_04 extends Exception {




    }

    public class OperacaoBancaria {
        public static void main(String[] args) {
            try {
                double saldo = 100.0;
                double valorSaque = 200.0;

                if (valorSaque > saldo) {
                    throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque!");
                }

                System.out.println("Saque realizado com sucesso.");
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
    }
