import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente2 {
    ArrayList<Cliente> client = new ArrayList<Cliente>();

    static Scanner sc = new Scanner(System.in);

    public void armazenaCliente(Cliente cliente) {
        client.add(cliente);
    }

    public void adicionarCliente(int quantidade) {
        for (int i = 0; i < quantidade; i++) {

            System.out.println("Informe o seu ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Informe o TELEFONE: ");
            String nr_telefone = sc.nextLine();
            System.out.println("Informe o nome do Cliente: ");
            String nm_cliente = sc.nextLine();
            System.out.println("Informe o Email: ");
            String nm_email = sc.nextLine();
            System.out.println("Informe o seu CEP: ");
            String nm_cep = sc.nextLine();
            System.out.println("Informe o seu Endereco: ");
            String nm_endereco = sc.nextLine();
            System.out.println("Informe o seu Bairro: ");
            String nm_bairro = sc.nextLine();
            System.out.println("Informe o seu Complemento: ");
            String nm_complemento = sc.nextLine();
            System.out.println("Informe a sua Cidade: ");
            String nm_cidade = sc.nextLine();

            //Criando um objeto;
            Cliente p = new Cliente(id, nr_telefone, nm_cliente, nm_email, nm_cep, nm_endereco, nm_bairro, nm_complemento, nm_cidade);
            armazenaCliente(p);
            imprimeAgenda();
            System.out.println();
            System.out.println("=== PESSOA ARMAZENADA COM SUCESSO ===");
            System.out.println();
        }

    }

    public void apagaCliente(int id) {
        boolean ativo = false;
        for (int i = 0; i < client.size(); i++) {
            Cliente cliente = client.get(i);
            if (cliente.getId().equals(id)) {
                client.remove(cliente);
                System.out.println("CLIENTE EXCLUIDO COM SUCESSO !!!");
                ativo = true;
            }
        }
        if (ativo) {
        } else {
            System.out.println("NOME NAO ENCONTRADO.");
        }
    }

    public void editarCliente(int id) {
        for (int i = 0; i < client.size(); i++) {
            Cliente cliente = client.get(i);
            if (cliente.getId().equals(id)) {
                System.out.println("ID: " + cliente.getId());
                System.out.println("Informe o seu ID: ");
                id = Integer.parseInt(sc.nextLine());
                cliente.setId(id);

                System.out.println("Telefone: " + cliente.getNr_telefone());
                System.out.println("Informe o TELEFONE: ");
                String nr_telefone = sc.nextLine();
                cliente.setNr_telefone(nr_telefone);

                System.out.println("Nome do cliente: " + cliente.getNm_cliente());
                System.out.println("Informe o nome do Cliente: ");
                String nm_cliente = sc.nextLine();
                cliente.setNm_cliente(nm_cliente);

                System.out.println("Email: " + cliente.getNm_email());
                System.out.println("Informe o Email: ");
                String nm_email = sc.nextLine();
                cliente.setNm_email(nm_email);

                System.out.println("Cep: " + cliente.getNr_cep());
                System.out.println("Informe o seu CEP: ");
                String nm_cep = sc.nextLine();
                cliente.setNm_cliente(nm_cliente);

                System.out.println("Endereco: " + cliente.getNm_endereco());
                System.out.println("Informe o seu Endereco: ");
                String nm_endereco = sc.nextLine();
                cliente.setNm_endereco(nm_cliente);

                System.out.println("Bairro: " + cliente.getNm_bairro());
                System.out.println("Informe o seu Bairro: ");
                String nm_bairro = sc.nextLine();
                cliente.setNm_bairro(nm_bairro);

                System.out.println("Complemento: " + cliente.getNm_complemento());
                System.out.println("Informe o seu Complemento: ");
                String nm_complemento = sc.nextLine();
                cliente.setNm_complemento(nm_complemento);

                System.out.println("Cidade: " + cliente.getNm_cidade());
                System.out.println("Informe a sua Cidade: ");
                String nm_cidade = sc.nextLine();
                cliente.setNm_cidade(nm_cidade);

                i = client.size();
            }
        }
    }

    public void buscaCliente(int id) {
        for (int i = 0; i < client.size(); i++) {
            Cliente cliente = client.get(i);
            if (cliente.getId().equals(id)) {
                System.out.println("ID: " + cliente.getId());
                System.out.println("Telefone: " + cliente.getNr_telefone());
                System.out.println("Nome do cliente: " + cliente.getNm_cliente());
                System.out.println("Email: " + cliente.getNm_email());
                System.out.println("Cep: " + cliente.getNr_cep());
                System.out.println("Endereco: " + cliente.getNm_endereco());
                System.out.println("Bairro: " + cliente.getNm_bairro());
                System.out.println("Complemento: " + cliente.getNm_complemento());
                System.out.println("Cidade: " + cliente.getNm_cidade());
                i = client.size();
            } else {
                System.out.println("NOME NAO ENCONTRADO!!");
            }
        }
    }

    public void imprimeAgenda() {
        System.out.println("==== Relacao de todas as pessoas ====");
        for (int i = 0; i < client.size(); i++) {
            Cliente cliente = client.get(i);
            if (cliente.getId().equals(cliente.id)) {
                System.out.println("=== Cliente " + (i+1) + "# ===");
                System.out.println("ID: " + cliente.getId());
                System.out.println("Telefone: " + cliente.getNr_telefone());
                System.out.println("Nome do cliente: " + cliente.getNm_cliente());
                System.out.println("Email: " + cliente.getNm_email());
                System.out.println("Cep: " + cliente.getNr_cep());
                System.out.println("Endereco: " + cliente.getNm_endereco());
                System.out.println("Bairro: " + cliente.getNm_bairro());
                System.out.println("Complemento: " + cliente.getNm_complemento());
                System.out.println("Cidade: " + cliente.getNm_cidade());
            }
        }
    }

    @Override
    public String toString() {
        return "Agenda" + client;
    }


}