public class respostas_06 {



        public static void main(String[] args) {
            try {
                metodoComExcecao();
                System.out.println("Método executado com sucesso.");
            } catch (Exception e) {
                System.out.println("Erro ao executar o método: " + e.getMessage());
            }
        }

        public static void metodoComExcecao() throws Exception {
// Simula uma operação que lança uma exceção
            throw new Exception("Exceção lançada no método.");
        }

}
