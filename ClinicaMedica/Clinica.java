package ClinicaMedica;

public class Clinica {
    private String nomeCliente;
    private String cpf;  // duvida: qual função devo usar para caracteres especiais?
    private String email; //duvida: qual função devo usar para caracteres especiais?

    private Clinica(String nomeCliente, String cpf, String email){

        if (cpf.length() < 12) {
            System.out.println("O CPF valido!");
        } else if (cpf.length() > 12) {
            System.out.println("O CPF deve ter 11 caracteres.");
        }


        this.nomeCliente=nomeCliente;
        this.cpf=cpf;
        this.email=email;

    }
    public Clinica(){
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        if (cpf.length() < 12) {
            System.out.println("O CPF valido!");
        } else if (cpf.length() > 12) {
            System.out.println("O CPF deve ter 11 caracteres.");
        }
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Clinica=" +
                "\nnomeCliente: " + " " + nomeCliente +
                "\ncpf="+ " " + cpf +
                "\nemail: " + " " + email ;
    }
}
