import java.util.ArrayList;

public class ListVeiculo {
    public ArrayList<Veiculos> veiculos;

    public ListVeiculo() {
        // lista vazia
        veiculos = new ArrayList<Veiculos>();
    }

    public void create(Veiculos novo) {
        veiculos.add(novo);
    }

    public void read() {
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println(veiculos.get(i).toString());
        }
    }

    public void percorre() {
        int i;
        System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        int n = veiculos.size();
        for (i=0; i<n; i++) {
        System.out.printf("Posição %d- %s\n", i, veiculos.get(i));
        }
    }

    
}
