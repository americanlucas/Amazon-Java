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
		  int contadorConta = 0;
		  int contadorProduto = 0;

          while(indexMenu != 8) {

			//Menu
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
			  if (sc.hasNextLine()) {
				sc.nextLine();  // Consumir o '\n' que ficou no buffer
			  }
	          
	          //Casos
	          switch (indexMenu) {
	               case 1:
	                    System.out.println("Nome de usuário: ");
	                    MinhaConta.setUsername(sc.nextLine());
	                    //System.out.println();
	                    System.out.println("Email: ");
	                    MinhaConta.setEmail(sc.nextLine());
	                    //System.out.println();
	                    System.out.println("Senha: "); 
	                    MinhaConta.setSenha(sc.nextLine());
						MinhaConta.adicionar(contadorConta);
						contadorConta++;
	                    break;
	               
	               case 2:
	                    System.out.println("Digite o nome de usuário para excluir a conta: ");
	                    String usuario = sc.nextLine();
	                    System.out.println();
	                    MinhaConta.excluir(usuario);
						contadorConta--;
	                    break;

	               case 3:
	                    System.out.println("Digite o nome de usuário para alterar as informações: ");
	                    String usuario_alterar = sc.nextLine();
	                    System.out.println();
	                    System.out.println("Digite o novo email: ");
	                    String novo_email = sc.nextLine();
	                    System.out.println();
	                    System.out.println("Digite a nova senha: ");
	                    String nova_senha = sc.nextLine();
	                    System.out.println();
						MinhaConta.alterar(usuario_alterar, novo_email, nova_senha);
	                    break;

	               case 4:
	                    MinhaConta.mostrar();
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
