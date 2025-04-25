package Supermercado;

public class Produto {
    private String nomeprod;
    private float preco;
    private int quantidade;

    private Produto(String nomeprod, float preco, int quantidade){
        if (preco<=0){
            System.out.println("Valor Incorreto!");
        }
        if (quantidade<0){
            System.out.println("Quantidade não pode ser inferior a 'ZERO' ");
        }
        this.nomeprod=nomeprod;
        this.preco=preco;
        this.quantidade=quantidade;
    }
    public Produto(){

    }

    public String getNomeprod() {
        return nomeprod;
    }

    public void setNomeprod(String nomeprod) {
        this.nomeprod = nomeprod;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco<=0){
            System.out.println("Valor Incorreto!");
        }
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade<0){
            System.out.println("Quantidade não pode ser inferior a 'ZERO' ");
        }
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Detalhe dos Produtos:" +
                "\nNome do Produto:" + "" +nomeprod +
                "\nPreco do Produto: R$" + "" + preco +
                "\nQuantidade de Produto:" + "" + quantidade + " " + "Unidades";
    }
}
