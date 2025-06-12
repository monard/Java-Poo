package CadastroVeiculos;

public class Veiculos {
    private String modeloVeiculo;
    private String placa;
    private double km;

    private Veiculos (String modeloVeiculo, String placa, double km){
        this.modeloVeiculo=modeloVeiculo;
        this.placa=placa;
        this.km=km;
    }
    public Veiculos (){
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Veiculos" +
                "\nModelo do Veiculo= " + " " + modeloVeiculo +
                "\nPlaca do Veiculo=" + " " + placa +
                "\nQuilometragem= " + " " + km + " KM";
    }
}
