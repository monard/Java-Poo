package AnimaisEstimacao;

public abstract class Animais {
    private String nome;
    private int idade;
    public abstract void emitiSom();
    public abstract void comer();
    public abstract void exibirInformacao();

    public Animais(String nome, int idade)  {
        if (idade < 0){
            System.out.println("Idade não pode ser Negativa");
        }
        this.nome = nome;
        this.idade = idade;
    }

     public Animais (){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
