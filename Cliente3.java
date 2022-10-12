import java.util.Scanner;

public class Cliente3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Cliente2 lista = new Cliente2();

        while (opcao != 6) {
            System.out.println();
            System.out.println("====LISTA TELEFONICA====");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover ");
            System.out.println("3 - Editar");
            System.out.println("4 - Imprimir cliente");
            System.out.println("5 - Imprimir agenda completa");
            System.out.println("6 - Sair");

            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                System.out.println("Quantas pessoas voce quer adicionar");
                int quantidade = Integer.parseInt(sc.nextLine());
                lista.adicionarCliente(quantidade);
                lista.imprimeAgenda();
                System.out.println("Pessoa armazenada com sucesso");

            } else if (opcao == 2) {
                System.out.println("Insira o id que deseja remover");
                int id = Integer.parseInt(sc.nextLine());
                lista.apagaCliente(id);

            } else if (opcao == 3) {
                System.out.println("Insira o id que deseja editar");
                int id = Integer.parseInt(sc.nextLine());
                lista.editarCliente(id);

            } else if (opcao == 4) {
                System.out.println("Insira o ID que deseja imprimir");
                int id = Integer.parseInt(sc.nextLine());
                lista.buscaCliente(id);

            } else if (opcao == 5) {
                System.out.println("Lista");
                lista.imprimeAgenda();

            } else {
                System.out.println("FECHANDO AGORA");
                break;
            }
        }
        sc.close();
    }
}
