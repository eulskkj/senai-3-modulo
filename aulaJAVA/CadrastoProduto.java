import java.util.Scanner;

public class CadrastoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produto = new String[5];
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
                    if (qtd == produto.length){
                        System.out.println("LISTA CHEIA! NÃO É POSSIVEL CADASTRAR");
                        break;
                    }

                    System.out.println("Digite o nome do produto: ");
                    produto[qtd] = sc.nextLine();

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
                        System.out.println(i+ "-" +produto[1] + "-" + quant[1] + "quantidades");
                    }
                    break;
                
                case 3: 
                    if (qtd == 0){
                        System.out.println("Nenhum cadastro");
                        break;
                    }

                    System.out.println("Digite o produto que quer buscar: ");
                    String busca = sc.nextLine();

                    int posBusca = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (produto [i].equalsIgnoreCase(busca)) {
                            posBusca = i;
                            break;
                        }
                    }

                    if (posBusca== -1) {
                        System.out.println("Produto não encontrada.");
                    } else {
                        System.out.println("Encontrado: "+ produto [posBusca] + "-" + quant[posBusca]+ "anos");
                    }
                    break;
                    case 4: 
                    if (qtd == 0) {
                        System.out.println("Nenhum produto. ");
                        break;
                    }

                    System.out.println("Digite um produto para alterar: ");
                    String produtoAlterar = sc.nextLine();

                    int posAlt = -1;
                    for (int i = 0; i <qtd; i++) {
                        if (produto[i].equalsIgnoreCase(produtoAlterar)) {
                            posAlt = i;
                            break;
                        }
                    
                        if (posAlt == -1) {
                            System.out.println("Pessoa não encontrada.");
                        } else {
                            System.out.println("Novo produto: ");
                            String novoProduto = sc.nextLine();
                            
                            System.out.println("Nova Quantidade: ");
                            int novaQuant = sc.nextInt();
                            sc.nextLine();

                            produto[posAlt] = novoProduto;
                            quant[posAlt] = novaQuant;

                            System.out.println("Alterado com sucesso!");
                        }}
                        break; 
                    
                        case 5:
                        if (qtd == 0) {
                            System.out.println("Nenhum produto.");
                            break;
                        }
                        System.out.println("Digite o nome do produto para remover: ");
                        String produtoRemover = sc.nextLine();

                        int posRem =-1;
                        for (int i =0; i < qtd;i++ ){
                            if (produto[i].equalsIgnoreCase(produtoRemover)) {
                                posRem = i;
                                break;
                            }
                        }
                        if (posRem == -1) {
                            System.out.println("Produto não encontrado!");
                        } else {
                            for (int i = posRem; i < qtd - 1; i++) {
                                produto[i] = produto [i + 1];
                                quant[i] = quant [i + 1];
                            }
                            produto[qtd - 1] = null;
                            quant[qtd - 1] = 0;

                            qtd--;
                            System.out.println("Produto removido com sucesso!");
                        }
                        break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}
