package AlunoPoo;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno (String nome, int matricula,double nota){
        this.nome=nome;
        this.matricula=matricula;
        this.nota=nota;
    }
    public Aluno(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getmatricula() {
        return matricula;
    }

    public void setmatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Bem Vindo ao Sitema de Alunos" +
                "\nNome: " + " " + nome +
                "\nmatricula:" + " " + matricula+
                "\nNota Final: "+nota;
    }
}
