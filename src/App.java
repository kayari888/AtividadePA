import java.util.ArrayList;
import java.util.Scanner;

public class App {
<<<<<<< HEAD
    public static void main(String[] args) {

        Scanner inUser = new Scanner(System.in);
        ArrayList<String> listaCompras = new ArrayList<String>();

        int opcaoLista = 0;
        int opcao = 0;
        String novoItem;

        do {
            try {
                System.out.println(
                        "Bem vindos ao programa lista de compras\n\n" +
                        "Escolha a opcao desejada\n\n" +
                        "1 - Criar uma nova lista de compras\n" +
                        "2 - Sair\n");
                opcaoLista = inUser.nextInt();
                inUser.nextLine();

                switch (opcaoLista) {
                    case 1:
                        System.out.println("Lista criada com sucesso!");

                        do {
                            System.out.println(
                                    "Escolha a opcao desejada:\n" +
                                    "1 - Adicionar um item a lista\n" +
                                    "2 - Remover um item a lista\n" +
                                    "3 - Exibir a lista de compras\n" +
                                    "4 - Limpar a lista de compras\n" +
                                    "5 - Alterar item\n" +
                                    "6 - Voltar ao menu principal\n");

                            opcao = inUser.nextInt();
                            inUser.nextLine();

                            switch (opcao) {
                                case 1:
                                    System.out.println("Voce escolheu criar um item da lista");
                                    System.out.println("Digite o nome do produto");
                                    novoItem = inUser.nextLine();
                                    listaCompras.add(novoItem);
                                    break;
                                case 2:
                                    System.out.println("Voce escolheu remover um item:");
                                    System.out.println("Digite o nome do produto para remover:");
                                    String comprasRemover = inUser.nextLine();
                                    boolean removido = listaCompras.remove(comprasRemover);
                                    if (removido) {
                                        System.out.println("Compra removida com sucesso!");
                                    } else {
                                        System.out.println("Item nao encontrado.");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Voce escolheu ver a lista");
                                    for (int i = 0; i < listaCompras.size(); i++) {
                                        System.out.println((i + 1) + " - " + listaCompras.get(i));
                                    }
                                    break;
                                case 4:
                                    listaCompras.clear();
                                    System.out.println("Lista de compras limpa com sucesso!");
                                    break;
                                case 5:
                                    System.out.println("Digite o nome do item que deseja alterar:");
                                    String itemAntigo = inUser.nextLine();
                                    int indice = listaCompras.indexOf(itemAntigo);
                                    if (indice != -1) {
                                        System.out.println("Digite o novo nome do item:");
                                        String itemNovo = inUser.nextLine();
                                        listaCompras.set(indice, itemNovo);
                                        System.out.println("Item alterado com sucesso!");
                                    } else {
                                        System.out.println("Item nao encontrado.");
                                    }
                                    break;
                                case 6:
                                    System.out.println("Voltando ao menu principal...");
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                                    break;
                            }
                        } while (opcao != 6);
                        break;
                    case 2:
                        System.out.println("Obrigada por utilizar nosso sistema.");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            } catch (Exception erro) {
                System.out.println("Erro na entrada. Tente novamente.");
                inUser.nextLine();
                opcaoLista = 1;
            }
        } while (opcaoLista != 2);

        inUser.close();
    }
=======
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner (System.in);
         ArrayList<String> listaCompras = new ArrayList<>();

    int opcaoLista = 0;
    int opcao = 0;
    String novoItem;
    int contadora = 0; 
    // não tenho certeza sobre a contadora
    

    
              do{

                try{
    System.out.println("""
                Bem vindos ao programa lista de compras

                Escolha a opção desejada

                1 - Criar um nova lista de compras
                2 - Sair
            
        """);
        opcaoLista = inUser.nextInt();
        inUser.nextLine();

        switch(opcaoLista){
            case 1 -> {System.out.println("Lista criada com sucesso!");

                do{
                    System.out.println(""" 
                        escolha a opcao desejada:
                        1 - Adicionar aum item a lista
                        2 - Remover um item a lista
                        3 - Exibir a lista de compras
                        4 - Limpar a lista de compras
                        5 - alterar item
                        6 - Voltar ao menu principal 
                    """);
                     
                    opcao = inUser.nextInt();
                    inUser.nextLine();

                    switch(opcao){
                        case 1 -> {
                            System.out.println("Você escolheu criar um item da lista");
                            System.out.println("Digite o nome do produto");
                            
                            novoItem = inUser.nextLine();
                            listaCompras.add(novoItem);

                        }

                          case 2 -> {
                                    System.out.println("Você escolheu remover uma atividade:");
                                    String comprasRemover = inUser.nextLine();

                                    boolean removido = listaCompras.remove(comprasRemover);

                                if (removido) {
                                    System.out.println("Compra removida com sucesso!");
                                } else {
                                    System.out.println("Item não encontrado.");
                                    }
                                }



                        case 3 ->{
                            System.out.println("Você escolheu ver a lista");
                            for(String item : listaCompras){
                                System.out.printf("%d %s \n", contadora, item);
                                contadora++;
                            }
                        }

                        case 4 -> {
        listaCompras.clear();
        System.out.println("Lista de compras limpa com sucesso!");
    }

                    case 5 -> {
            
}


                    }

                }while(opcao != 5);


            }
            case 2 -> System.out.println("Obrigada por utilizar nosso sistema.");
            default -> System.out.println("Opção inválida");
            }
   

    

    }catch(Exception erro){
        System.out.println("Erro na Entrada");
        opcaoLista = 1;
    }
         }while(opcaoLista != 2);

         inUser.close();
    }
      
  
>>>>>>> 17f81683ae9edd9a64fdf3fcf85072df4d3ceb1c
}