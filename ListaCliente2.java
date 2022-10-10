import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaCliente2 {
    ArrayList<ListaCliente> client = new ArrayList<ListaCliente>();

    static Scanner sc = new Scanner(System.in);

    public void armazenaCliente(ListaCliente p) {
        client.add(p);
    }

    public void buscaCliente(int id) {
        for (int i = 0; i < client.size(); i++) {
            ListaCliente p = client.get(i);
            if (p.getId().equals(p.id)) {
                System.out.println("ID: " + p.getId());
                System.out.println("Nome do cliente: " + p.getNm_cliente());
                System.out.println("Email: " + p.getNm_email());
                System.out.println("Cep: " + p.getNr_cep());
                System.out.println("Endereco: " + p.getNm_endereco());
                System.out.println("Bairro: " + p.getNm_bairro());
                System.out.println("Complemento: " + p.getNm_complemento());
                System.out.println("Cidade: " + p.getNm_cidade());
                i = client.size();
            } else {
                System.out.println("Nome nao encontrado!!");
            }
        }
    }

    public void imprimeAgenda() {
        System.out.println("==== Relacao de todas as pessoas ====");
        for (int i = 0; i < client.size(); i++) {
            ListaCliente p = client.get(i);
            if (p.getId().equals(p.id)) {
                System.out.println("ID: " + p.getId());
                System.out.println("Nome do cliente: " + p.getNm_cliente());
                System.out.println("Email: " + p.getNm_email());
                System.out.println("Cep: " + p.getNr_cep());
                System.out.println("Endereco: " + p.getNm_endereco());
                System.out.println("Bairro: " + p.getNm_bairro());
                System.out.println("Complemento: " + p.getNm_complemento());
                System.out.println("Cidade: " + p.getNm_cidade());
            }
        }
    }

    @Override
    public String toString() {
        return "Agenda" + client;
    }

    public void apagaCliente(int id) {
        boolean ativo = false;
        for (int i = 0; i < client.size(); i++) {
            ListaCliente p = client.get(i);
            if (p.getId().equals(id)) {
                client.remove(p);
                System.out.println("CLIENTE EXCLUIDO COM SUCESSO!!");
                ativo = true;
            }
        }
        if (ativo) {
        } else {
            System.out.println("Nome nao encontrado.");
        }
    }

}