package ProjetoComSingleton;

public class JogoSingleton {
  private static JogoSingleton instancia;

  private int pontuacao;
  private int tempoRestante;
  private int nivelAtual;

  private JogoSingleton() {
      this.pontuacao = 0;
      this.tempoRestante = 60;
      this.nivelAtual = 1;
  }

  // Aplicação do padrão Singleton
  public static JogoSingleton getInstancia() {
      if (instancia == null) {
          instancia = new JogoSingleton();
      }
      return instancia;
  }

  public int getPontuacao() {
      return pontuacao;
  }

  public void setPontuacao(int pontuacao) {
    this.pontuacao = pontuacao;
  }

  public int getTempoRestante() {
    return tempoRestante;
  }

  public void setTempoRestante(int tempoRestante) {
    this.tempoRestante = tempoRestante;
  }

  public int getNivelAtual() {
    return nivelAtual;
  }

  public void setNivelAtual(int nivelAtual) {
    this.nivelAtual = nivelAtual;
  }

  // ... métodos para simular o jogo
}
