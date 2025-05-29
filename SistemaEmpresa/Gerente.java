package SistemaEmpresa;

public class Gerente extends Funcionario {
    private int projetoGerenciados;

    public Gerente(int projetoGerenciados,String nome, double salarioBase) {
        super (nome,salarioBase);
        this.projetoGerenciados = projetoGerenciados;
    }

    public int getProjetoGerenciados() {
        return this.projetoGerenciados;
    }

    public void setProjetoGerenciados(int projetoGerenciados) {
        this.projetoGerenciados = projetoGerenciados;
    }

    @Override
    public double calculaBonus() {
        return this.getSalarioBasa() * 0.15;
    }
}
