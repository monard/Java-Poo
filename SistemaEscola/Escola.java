package SistemaEscola;

public class Escola {
    public String aluno;
    public int idade;
    public float nota;

    public Escola(String aluno,int idade, float nota) {

        if (idade < 14) {
            System.out.println("A idade mínima do aluno deve ser 14 anos.");
        }
        if (nota < 0 || nota > 10) {
            System.out.println("A nota final deve estar entre 0 e 10.");
        }

        this.aluno = aluno;
        this.idade = idade;
        this.nota = nota;

    }
    public Escola () {
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 14) {
            System.out.println("A idade mínima do aluno deve ser 14 anos.");
        }
        this.idade = idade;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("A nota final deve estar entre 0 e 10.");
        }
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "Escola=" +
                "\naluno: " + " " + aluno +
                "\nidad: " + " " + idade +
                "\nnota: " + " " + nota ;
    }
}
