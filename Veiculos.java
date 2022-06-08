public class Veiculos {
    public String tipoVeiculo;
    public double consumo;
    public int placa;
    public int numRodas;

    // Construtor
    public Veiculos(String tipoVeiculo, double consumo, int placa, int numRodas) {
            this.tipoVeiculo = tipoVeiculo;
            this.consumo = consumo;
            this.placa = placa;
            this.numRodas = numRodas;
        }

    public String toString() {
        return 
            "Tipo do Veículo: " + tipoVeiculo +
            " Consumo: " + consumo +
            " Placa: " + placa +
            " Número de Rodas: " + numRodas;
    }
}
