package GeracaoRelatorio;

public abstract class Relatorio {
    private String titulo;
    private String dataGeracao;

    public  Relatorio (String titulo,String dataGeracao){
        this.titulo=titulo;
        this.dataGeracao=dataGeracao;
    }
    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }
    // Métodos abstratos
    public abstract String gerarConteudo();

   //sobrescreve a Classe
    public void imprimir() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Data de Geração: " + getDataGeracao());
        System.out.println(gerarConteudo());
        System.out.println("-----------------------------------");
    }
}
