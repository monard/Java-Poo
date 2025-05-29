package LivroPoo;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicação;

    public Livro (String titulo,String autor, int anoDePublicação){
        this.titulo=titulo;
        this.autor=autor;
        this.anoDePublicação=anoDePublicação;
    }
    public Livro(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicação() {
        return anoDePublicação;
    }

    public void setAnoDePublicação(int anoDePublicação) {
        this.anoDePublicação = anoDePublicação;
    }
    @Override
    public String toString() {
        return "Bem Vindo ao Sitema de Livros" +
                "\nNome: " + " " + titulo +
                "\nIdade:" + " " + autor +
                "\nAno de Publicação"+" "+anoDePublicação;
    }
}
