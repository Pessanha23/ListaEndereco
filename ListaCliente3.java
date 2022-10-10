import java.util.Scanner;

public class ListaCliente3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        ListaCliente2 lista = new ListaCliente2();

        while (opcao != 5) {
            System.out.println();
            System.out.println("===LISTA TELEFONICA===");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Remover cliente");
            System.out.println("3 - Imprimir cliente");
            System.out.println("4 - Imprimir agenda completa");
            System.out.println("5 - Sair");

            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
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
                ListaCliente p = new ListaCliente(id, nr_telefone, nm_cliente, nm_email, nm_cep, nm_endereco, nm_bairro, nm_complemento, nm_cidade);
                lista.armazenaCliente(p);
                lista.imprimeAgenda();
                System.out.println("Pessoa armazenada com sucesso");

            }
            else if (opcao == 2) {
                System.out.println("Insira o id que deseja excluir");
                int id = Integer.parseInt(sc.nextLine());
                lista.apagaCliente(id);
            }else if (opcao == 3) {
                System.out.println("Insira o id que deseja buscar");
                int id = Integer.parseInt(sc.nextLine());
                lista.buscaCliente(id);

            }
            else if (opcao == 4) {
                lista.imprimeAgenda();

                System.out.println("Lista");
            }
            else {
                System.out.println("FECHANDO AGORA");
                break;
            }
        }
        sc.close();
    }
}
