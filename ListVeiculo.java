import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner; // classe scanner para input

public class ListVeiculo {
    public ArrayList<Veiculos> veiculos;
    Scanner input = new Scanner(System.in);

    public ListVeiculo() {
        // lista vazia
        veiculos = new ArrayList<Veiculos>();
    }

    public void create(Veiculos novo) {
        veiculos.add(novo);
    }

    public void read() {
        int i;
        System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        int n = veiculos.size();
        for (i=0; i<n; i++) {
        System.out.printf("Posição %d - %s\n", i, veiculos.get(i));
        }
    }

    public void delete() {
        int i;
        System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        int n = veiculos.size();
        for (i=0; i<n; i++) {
        System.out.printf("Posição %d - %s\n", i, veiculos.get(i));
        }
        System.out.printf("\nInforme a posição a ser excluída:\n");
        i = input.nextInt();
        veiculos.remove(i);
         
    }


    
}
