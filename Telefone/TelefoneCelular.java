package Telefone;

public class TelefoneCelular {
  private   String marca;
    private  String modelo;
    private double preco;
    private  double memoria;

    public TelefoneCelular (String marca,String modelo, double preco,double memoria){
        this.marca=marca;
        this.modelo=modelo;
        this.preco=preco;
        this.memoria=memoria;
    }
    public TelefoneCelular(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Telefone/Celular" +
                "\nmarca:"+ " " +marca +
                "\nmodelo: "+ " " + modelo +
                "\npreco:" + " " + preco +
                "\nmemoria=" + memoria;
    }
}
