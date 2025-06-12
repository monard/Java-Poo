package AnimaisEstimacao;

public class cachorro extends Animais {
    private  String raca ;

  /*  public cachorro (,String raca ,String exibirinformacao, String comer,String emitirsom) {
        super(exibirinformacao,comer,emitirsom);
        this.raca =raca;

    }*/

    public cachorro(String nome, int idade, String raca)  {
        super(nome,idade);
        this.raca = raca;
    }

    public String getraca() {
        return raca;
    }

    public void setraca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitiSom() {
        System.out.println("Au-Au");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo ração");
    }

    @Override
    public void exibirInformacao() {
        System.out.println("O nome do cachorro é " + this.getNome()+
                "\nIdade do cachorro é "+this.getIdade()+" anos"+
                "\nRaça do cachoro é "+this.getraca());
        System.out.println("-----------------------------------");
    }

}