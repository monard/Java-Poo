package SistemaDispositivosEletronicos;

public class Televisao extends DispositivoEletronico {
    private int tamanhoPolegadas;

    public Televisao(String marca,String modelo,int tamanhoPolegadas) {
        super(marca, modelo);
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public int getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(int tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }
    @Override
    public void executarFuncaoPrincipal() {
        if (estaLigado()) {
            System.out.println("Trocando de canal na televisão.");
        } else {
            System.out.println("Não é possível trocar canal, televisão desligada.");
        }
    }

    @Override
    public void exibirStatus() {
        String estado = estaLigado() ? "Ligado" : "Desligado";
        System.out.println("Televisão " + getMarca() + " " + getModelo() +
                " - " + tamanhoPolegadas + "\" - Estado: " + estado);
    }
}
