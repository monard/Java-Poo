package SistemaDispositivosEletronicos;

public class Notebook extends DispositivoEletronico {
    private int memoriaRAM;

    public Notebook (String marca,String modelo,int memoriaRAM){
        super(marca,modelo);
        this.memoriaRAM=memoriaRAM;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
    @Override
    public void executarFuncaoPrincipal() {
        if (estaLigado()) {
            System.out.println("Abrindo programa no notebook.");
        } else {
            System.out.println("Não é possível abrir programa, notebook desligado.");
        }
    }

    @Override
    public void exibirStatus() {
        String estado = estaLigado() ? "Ligado" : "Desligado";
        System.out.println("Notebook " + getMarca() + " " + getModelo() +
                " - RAM: " + memoriaRAM + "GB - Estado: " + estado);
    }

}
