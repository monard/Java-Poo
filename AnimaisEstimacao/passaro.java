package AnimaisEstimacao;

public class passaro extends Animais {
    private  String corpena;

    /*  public passaro(String corpena,String exibirinformacao, String comer,String emitirsom) {
          super(emitirsom,comer,exibirinformacao);
          this.corpena=corpena;

      }*/
    public passaro(String nome, int idade, String corpena)  {
        super(nome,idade);
        this.corpena = corpena;
    }

    public String getcorpena() {
        return corpena;
    }

    public void setcorpena(String corpena) {
        this.corpena = corpena;
    }

    @Override
    public void emitiSom() {
        System.out.println("Piu piu!");
    }

    @Override
    public void comer() {
        System.out.println("O pássaro está comendo sementes");
    }

    @Override
    public void exibirInformacao() {
        System.out.println("O nome do Passaro " + this.getNome()+
                "\nIdade do Passaro"+this.getIdade()+
                "\nCor da asa do Passaro"+this.getcorpena());
    }

}
