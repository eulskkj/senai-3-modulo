import java.util.Scanner;

public class CadrastoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] quant = new int[5];

        int qtd = 0;
        int opcao;

        while (true){
            System.out.println("BEM-VINDO AO SISTEMA");
            System.out.println("1- CADRASTO");
            System.out.println("2- LISTAR");
            System.out.println("3- PESQUISAR");
            System.out.println("4- ALTERAR");
            System.out.println("5- REMOVER");
            System.out.println("0- SAIR");
            opcao = sc.nextInt();
            sc.nextLine();


            if (opcao == 0){
            System.out.println("Saindo...");
            break;
            }

            switch (opcao) {
                case 1:
                    if (qtd == nomes.length){
                        System.out.println("LISTA CHEIA! NÃO É POSSIVEL CADASTRAR");
                        break;
                    }

                    System.out.println("Digite o nome do produto: ");
                    nomes[qtd] = sc.nextLine();

                    System.out.println("Digite a quantidade do produto: ");
                    quant[qtd] = sc.nextInt();
                    sc.nextLine();

                    qtd++;
                    System.out.println("Produto cadastrado");
                    break;
                case 2:
                    if (qtd == 0){
                    System.out.println("Não possui nenhnum produto");
                    break;
                }
                    System.out.println("\nDados cadrastados: ");
                    for (int i = 0; i<5; i++){
                        System.out.println(i+ "-" +nomes[1] + "-" + quant[1] + "anos");
                    }
                    break;
                
                case 3: 
                    if (qtd == 0){
                        System.out.println("Nenhum cadastro");
                        break;
                    }

                    System.out.println("Digite o nome que quer buscar: ");
                    String busca = sc.nextLine();

                    int posBusca = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes [i].equalsIgnoreCase(busca)) {
                            posBusca = i;
                            break;
                        }
                    }

                    if (posBusca== -1) {
                        System.out.println("Pessoa não encontrada.");
                    } else {
                        System.out.println("Encontrado: "+ nomes [posBusca] + "-" + quant[posBusca]+ "anos");
                    }
                    break;
                    case 4: 
                    if (qtd == 0) {
                        System.out.println("Nenhum produto. ");
                        break;
                    }

                    System.out.println("Digite um  nome para alterar: ");
                    String nomeAlterar = sc.nextLine();

                    int posAlt = -1;
                    for (int i = 0; i <qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
                            posAlt = i;
                            break;
                        }
                    
                        if (posAlt == -1) {
                            System.out.println("Pessoa não encontrada.");
                        } else {
                            System.out.println("Novo nome: ");
                            String novoNome = sc.nextLine();
                            
                            System.out.println("Nova Quantidade: ");
                            int novaQuant = sc.nextInt();
                            sc.nextLine();

                            nomes[posAlt] = novoNome;
                            quant[posAlt] = novaQuant;

                            System.out.println("Alterado com sucesso!");
                        }
                        break;

                        case 5:

                    
                default:
                    break;
            }
        }

        sc.close();
    }
}
