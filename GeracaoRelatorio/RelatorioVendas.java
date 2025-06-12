package GeracaoRelatorio;

public class RelatorioVendas extends Relatorio {
    private double totalVendas;

    public RelatorioVendas (String titulo,String dataGeracao,double totalVendas){
        super (titulo,dataGeracao);
        this.totalVendas=totalVendas;

    }
//Get e Set
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public String gerarConteudo() {
        return "Relatório de Vendas: Total vendido R$ " + totalVendas;
    }

}
