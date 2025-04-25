package EmpresaTecnologia;

public class Funcionario {
    private String nome;
    private int matricula;
    private float salario;

    private Funcionario(String nome, int matricula, float salario) {
        if (matricula<=0){
            System.out.println("Matricula não pode ser negativo e tem que ser diferente de 'Zero'");
        }
        if (salario<1200){
            System.out.println("Salario minimo tem que ser maior que R$1.200,00");
        }
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula<0){
            System.out.println("Matricula não pode ser negativo e tem que ser diferente de 'Zero'");
        }
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario<1200){
            System.out.println("Salario minimo tem que ser maior que R$1.200,00");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                "\nmatricula: " + matricula +
                "\nsalario:R$ " + salario;
    }
}