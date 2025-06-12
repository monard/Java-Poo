package GeracaoRelatorio;


import java.util.ArrayList;
import java.util.Scanner;

public class MainRelatorio {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Array
        ArrayList<Relatorio> relatorios = new ArrayList<>();

        relatorios.add(new RelatorioVendas("Relatório de Vendas:","12/06/2025",12.500));
        relatorios.add(new RelatorioFinanceiro("Relatório Financeiro - Junho", "12/06/2025", 89000.00));
        relatorios.add(new RelatorioEstoque("Relatório de Estoque - Junho", "12/06/2025", 320));

        // Polimorfismo em ação
        for (Relatorio relatorio : relatorios) {
            relatorio.imprimir();
        }
    }
}
