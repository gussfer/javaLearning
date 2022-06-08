import java.util.Scanner; // classe scanner para input
import java.util.Iterator;
import java.util.ArrayList;



public class testaVeiculo {
    public static void main(String[] args) {
        ListVeiculo vei = new ListVeiculo();
        try (Scanner input = new Scanner(System.in)) {

            String veiculoTipo;
            double consumo;
            int placa;
            int numRodas;

            System.out.println("Digite o tipo de veículo:");
            veiculoTipo = input.next();
            System.out.println("Digite o consumo do veículo:");
            consumo = input.nextInt();
            System.out.println("Digite a placa do veículo:");
            placa = input.nextInt();
            System.out.println("Digite o numero de rodas do veículo:");
            numRodas = input.nextInt();

            vei.create(new Veiculos(veiculoTipo, consumo, placa, numRodas));

            
        }
        vei.read();
    }

}
