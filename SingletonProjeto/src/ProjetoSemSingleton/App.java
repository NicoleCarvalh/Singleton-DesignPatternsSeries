package ProjetoSemSingleton;

public class App {
public static void main(String[] args) throws Exception {
    Jogo jogo = new Jogo(); // Nova instância do jogo

    System.out.println("Pontuação final: " + jogo.getPontuacao());
    System.out.println("Tempo restante: " + jogo.getTempoRestante());
    System.out.println("Nível atual: " + jogo.getNivelAtual());
}
}
