package GeracaoRelatorio;

public class RelatorioFinanceiro extends Relatorio {
    private double saldoAtual;

    public RelatorioFinanceiro (String titulo,String dataGeracao,double saldoAtual){
        super (titulo,dataGeracao);
        this.saldoAtual=saldoAtual;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    @Override
    public String gerarConteudo() {
        return "Relatório Financeiro: Saldo atual R$" + saldoAtual;
    }

}
