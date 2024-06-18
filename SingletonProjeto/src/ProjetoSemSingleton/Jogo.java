package ProjetoSemSingleton;

public class Jogo {
  private int pontuacao;
  private int tempoRestante;
  private int nivelAtual;

  public Jogo() {
    this.pontuacao = 0;
    this.tempoRestante = 60; 
    this.nivelAtual = 1;
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

}
