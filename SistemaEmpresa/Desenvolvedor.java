package SistemaEmpresa;

public class Desenvolvedor extends Funcionario {
    private  String linguagemPreferida;


    public Desenvolvedor(String linguagemPreferida,String nome, double salarioBase) {
        super(nome,salarioBase);
        this.linguagemPreferida=linguagemPreferida;

    }

    public String getLinguagemPreferida() {
        return linguagemPreferida;
    }

    public void setLinguagemPreferida(String linguagemPreferida) {
        this.linguagemPreferida = linguagemPreferida;
    }

    @Override
    public double calculaBonus() {
        return this.getSalarioBasa() * 0.10;
    }
}
