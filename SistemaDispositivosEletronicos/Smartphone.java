package SistemaDispositivosEletronicos;

public class Smartphone extends DispositivoEletronico {
    private String sistemaOperacional;

    public Smartphone (String marca,String modelo,String sistemaOperacional){
        super(marca, modelo);
    this.sistemaOperacional=sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    @Override
    public void executarFuncaoPrincipal() {
        if (estaLigado()) {
            System.out.println("Abrindo aplicativo no smartphone.");
        } else {
            System.out.println("Não é possível abrir aplicativo, smartphone desligado.");
        }
    }

    @Override
    public void exibirStatus() {
        String estado = estaLigado() ? "Ligado" : "Desligado";
        System.out.println("Smartphone " + getMarca() + " " + getModelo() +
                " - SO: " + sistemaOperacional + " - Estado: " + estado);
    }

}
