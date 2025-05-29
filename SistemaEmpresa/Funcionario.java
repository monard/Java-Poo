package SistemaEmpresa;
/*Crie a Superclasse Funcionario:

Atributos: nome (String), salarioBase (double).
Construtor.
Método calcularBonus() (double) que retorna 0.0 (bônus padrão, será sobrescrito).
*/
public class Funcionario {
   private String nome;
  private double salarioBasa;

    public Funcionario (String nome,double salarioBasa) {
        this.nome = nome;
        this.salarioBasa = salarioBasa;
    }
        public double calculaBonus(){
            System.out.println("bônus padrão, será sobrescrito!");
            return 0.0;

    }
    public double salariobase(){
        System.out.println("bônus padrão, será sobrescrito!");
        return 0.0;

    }
    public double nome(){
        System.out.println("bônus padrão, será sobrescrito!");
        return 0.0;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBasa() {
        return salarioBasa;
    }

    public void setSalarioBasa(double salarioBasa) {
        this.salarioBasa = salarioBasa;
    }
}
