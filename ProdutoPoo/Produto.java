package ProdutoPoo;

public class Produto {
    private String nome;
    private double preco;

    public Produto (String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }
    public Produto(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nBem Vindo ao Sitema de Produtos" +
                "\nNome: " + " " + nome +
                "\nPreco:" + " R$ " + preco;
    }
}

