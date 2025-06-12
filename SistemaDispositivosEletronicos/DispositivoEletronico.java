package SistemaDispositivosEletronicos;

public abstract class DispositivoEletronico {
    private String marca;
    private String modelo;
    private boolean ligado=false;

    public DispositivoEletronico (String marca,String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    // Getters e Setters
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

    // Métodos Concretos ON
    public boolean estaLigado() {
        return ligado;
    }
    // Métodos Concretos ON
    public void Ligado() {
        this.ligado = true;
        System.out.println("Dispositivo " + marca + " " + modelo + " ligado.");
    }

    // Métodos Concretos OFF
    public void desLigado() {
        this.ligado = false;
        System.out.println("Dispositivo " + marca + " " + modelo + " Desligado.");
    }

// Métodos Abstratos
public abstract void executarFuncaoPrincipal();
public abstract void exibirStatus();

    public void ligar() {
    }

    public void desligar() {
    }
}
