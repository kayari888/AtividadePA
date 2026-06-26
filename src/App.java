import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       Scanner inUser = new Scanner(System.in);
       ArrayList<String> listaNomes = new ArrayList<>();
       
       int opcaoNome = 0;
       int opcao = 0;
       String novoNome = "";
       
       
            do{
                try{
                    System.out.println("""
                    Bem vindos ao programa lista de nomes

                    Escolha a opção desejada:


                    1 - Criar uma nova lista de nomes
                    2 - Sair


                    """);
                    opcaoNome = inUser.nextInt();
                    inUser.nextLine();


                    switch(opcaoNome){
                        case 1 -> {
                            System.out.println("Lista Criada com sucesso");


                            do{
                                System.out.println("""
                                        Escolha a opção desejada:
                                        1 - Adicionar um nome a lista
                                        2 - Ver a sua lista
                                        3 - Sair
                                        """);
                                   
                                opcao = inUser.nextInt();
                                inUser.nextLine();
                                   
                                switch(opcao){
                                case 1 -> {
                                    System.out.println("Você escolheu criar um item da lista ");
                                    System.out.println("Digite o nome da atividade ");                                    


                                    novoNome = inUser.nextLine();
                                    listaNomes.add(novoNome);


                                }
                                case 2 ->{
                                    System.out.println("Você escolheu ver a lista");
                                     listaNomes.sort(null);

                                        System.out.println("Nomes em ordem alfabética:");
                                        for (String nome : listaNomes) {
                                         System.out.println(nome);
                                      

                                    }
                                }
                                
                                }
                           
                             }while(opcao !=3);                    




                                                                                                                   
                        }
                        case 2 -> System.out.println("Obrigado por usar o nosso sistema");
                        default -> System.out.println("opção invalida");
                    }
           
                }catch(Exception erro){
                    System.out.println("Erro!!! Entrada invalida");
                    inUser.nextLine();
                    opcaoNome = 1;
                }
           
            }while(opcaoNome != 2);        
       
       inUser.close();
    }
}
