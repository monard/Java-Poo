package SistemaEmpresa;

public class Estagiario extends Funcionario {
    private int horasEstagio;

    public Estagiario (int horasEstagio,String nome, double salarioBase){
        super(nome,salarioBase);
        this.horasEstagio=horasEstagio;

    }

    public int getHorasEstagio() {
        return horasEstagio;
    }

    public void setHorasEstagio(int horasEstagio) {
        this.horasEstagio = horasEstagio;
    }

    @Override
    public double calculaBonus() {
        return this.getSalarioBasa() * 0.05;
    }
}
