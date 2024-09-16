package aplicação;

import java.util.Scanner;

import entidades.Conta;
import entidades.Produtos;

public class ProgramaAmazon {
     public static void main(String[] args) {
    	 
          Conta MinhaConta = new Conta(null, null, null);
          Produtos MeusProdutos = new Produtos(null, null, null, null, null, null, null, null, null);
          Scanner sc = new Scanner (System.in);
          int indexMenu = 0;

          while(indexMenu != 8) {
			//definindo produtos
		      MeusProdutos.setProduto1("Geladeira Eletrolux");
		      MeusProdutos.setDescricaoproduto1("Perfeito para guardar comida.");
		      MeusProdutos.setPreco1("R$ 2499,99");
		
		      MeusProdutos.setProduto2("Monitor Gamer 144hz");
		      MeusProdutos.setDescricaoproduto2("Veja os inimigos na tela antes que eles vejam você");
		      MeusProdutos.setPreco2("R$ 799,99");
		
		      MeusProdutos.setProduto3("Colchão Cama de Casal");
		      MeusProdutos.setDescricaoproduto3("Perfeito para dormir, principalmente com namorado(a).");
		      MeusProdutos.setPreco3("R$ 689,99");
		
		      //usuário padrão
		      MinhaConta.setUsername("João da Silva");
		      System.out.println("Menu");
	          System.out.println();
	          System.out.println("1. Criar conta");
	          System.out.println("2. Excluir conta");
	          System.out.println("3. Alterar Email e Senha");
	          System.out.println("4. Mostrar clientes");
	          System.out.println("5. Mostrar produtos");
	          System.out.println("6. Adicionar produto");
	          System.out.println("7. Excluir produto");
	          System.out.println("8. Finalizar Atendimento");
	          System.out.println();
	          System.out.println("Digite um número para o menu: ");
	          indexMenu = sc.nextInt();
	          
	          //Casos
	          switch (indexMenu) {
	               case 1:
	                    System.out.println("Nome de usuário, Email e Senha: ");
	                    MinhaConta.setUsername(sc.nextLine());
	                    //System.out.println();
	                    //System.out.println("Email: ");
	                    MinhaConta.setEmail(sc.nextLine());
	                    //System.out.println();
	                    //System.out.println("Senha: "); 
	                    MinhaConta.setSenha(sc.nextLine());
	                    //System.out.println();
	                    //System.out.println("Conta cadastrada com sucesso! ");
	                    break;
	               
	               case 2:
	                    System.out.println("Digite o nome de usuário para excluir a conta: ");
	                    MinhaConta.setUsername(sc.nextLine());
	                    System.out.println();
	                    System.out.println("Digite a Senha: ");
	                    MinhaConta.setSenha(sc.nextLine());
	                    System.out.println();
	                    System.out.println();
	                    System.out.println("Deseja realmente excluir a conta (Digite Sim ou Não.)?");
	                    String confirmaExclusao = sc.nextLine();
	                    System.out.println();
	                    if (confirmaExclusao.equalsIgnoreCase("Sim")) {
	                         System.out.println("Conta excluída com sucesso!");
	                    } else {
	                         System.out.println("Operação cancelada!");
	                    }
	                    break;

	               case 3:
	                    System.out.println("Digite o nome de usuário para alterar as informações: ");
	                    MinhaConta.setUsername(sc.nextLine());
	                    System.out.println();
	                    System.out.println("Digite a Senha: ");
	                    MinhaConta.setSenha(sc.nextLine());
	                    System.out.println();
	                    System.out.println("Digite o novo email: ");
	                    MinhaConta.setEmail(sc.nextLine());
	                    System.out.println();
	                    System.out.println("Digite a nova senha: ");
	                    MinhaConta.setSenha(sc.nextLine());
	                    System.out.println("Informações alteradas com sucesso!");
	                    System.out.println();
	                    break;

	               case 4:
	                    System.out.println("Clientes ativos: ");
	                    System.out.println(MinhaConta.getUsername());
	                    break;

	               case 5:
	                    System.out.println("Produtos: ");
	                    System.out.println(MeusProdutos.getProduto1());
	                    System.out.println(MeusProdutos.getDescricaoproduto1());
	                    System.out.println(MeusProdutos.getPreco1());
	                    System.out.println();
	                    System.out.println(MeusProdutos.getProduto2());
	                    System.out.println(MeusProdutos.getDescricaoproduto2());
	                    System.out.println(MeusProdutos.getPreco2());
	                    System.out.println();
	                    System.out.println(MeusProdutos.getProduto3());
	                    System.out.println(MeusProdutos.getDescricaoproduto3());
	                    System.out.println(MeusProdutos.getPreco3());
	                    System.out.println();
	                    break;
	               
	               case 6: 
	                    System.out.println("Escolha um produto para adicionar ao carrinho(1 - Geladeira, 2 - Monitor, 3 - Colchão): ");
	                    int indexCarrinho = sc.nextInt();
	                    if (indexCarrinho == 1) {
	                         System.out.println(MeusProdutos.getProduto1() + " foi adicionado ao carrinho.");
	                    } else if (indexCarrinho == 2) {
	                         System.out.println(MeusProdutos.getProduto2() + " foi adicionado ao carrinho.");
	                    } else {
	                         System.out.println(MeusProdutos.getProduto3() + " foi adicionado ao carrinho.");
	                    }
	                    break;

	               case 7:
	                    System.out.println("Escolha um produto para remover do carrinho(1 - Geladeira, 2 - Monitor, 3 - Colchão): ");
	                    indexCarrinho = sc.nextInt();
	                    if (indexCarrinho == 1) {
	                         System.out.println(MeusProdutos.getProduto1() + " foi removido do carrinho.");
	                    } else if (indexCarrinho == 2) {
	                         System.out.println(MeusProdutos.getProduto2() + " foi removido do carrinho.");
	                    } else {
	                         System.out.println(MeusProdutos.getProduto3() + " foi removido do carrinho.");
	                    }
	                    break;
	               
	               case 8: 
	                    System.out.println("Atendimento Finalizado! ");
	                    break;

	               default:
	                    System.out.println("Opção inválida.");
	                    break;
	          }
          }

          sc.close();
     }

}
