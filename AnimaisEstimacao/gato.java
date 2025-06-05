package AnimaisEstimacao;

public class gato extends Animais{
    private  String corpele;

   /* public gato(String corpele,String exibirinformacao, String comer,String emitirsom) {
        super(emitirsom,comer,exibirinformacao);
        this.corpele=corpele;

    }*/
   public gato(String nome, int idade, String corpele){
       super(nome,idade);
       this.corpele = corpele;
   }
    public String getcorpele() {
        return corpele;
    }

    public void setcorpele(String corpele) {
        this.corpele = corpele;
    }

    @Override
    public void emitiSom() {
        System.out.println("Miau!");
    }

    @Override
    public void comer() {
        System.out.println("O gato está comendo peixe.");
    }

    @Override
    public void exibirInformacao() {
        System.out.println("O nome do gato " + this.getNome()+
                "\nIdade do gato"+this.getIdade()+
                "\nCor do gato"+this.getcorpele());
    }
}
