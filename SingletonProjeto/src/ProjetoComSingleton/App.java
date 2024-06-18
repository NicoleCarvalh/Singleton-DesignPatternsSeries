package ProjetoComSingleton;

public class App {
  public static void main(String[] args) throws Exception {
    JogoSingleton jogo = JogoSingleton.getInstancia(); // Instância única do jogo

    System.out.println("Pontuação final: " + jogo.getPontuacao());
    System.out.println("Tempo restante: " + jogo.getTempoRestante());
    System.out.println("Nível atual: " + jogo.getNivelAtual());
}
}
