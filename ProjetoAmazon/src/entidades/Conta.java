package entidades;

import java.util.ArrayList;
import java.util.List;

public class Conta {
     
     //atributos
     private String email;
     private String senha;
     private String username;
     List<List<String>> matriz = new ArrayList<>();

     //construtor
     public Conta(String email, String senha, String username) {
          this.email = email;
          this.senha = senha;
          this.username = username;
     }

     //metodos get e set
     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getSenha() {
          return senha;
     }

     public void setSenha(String senha) {
          this.senha = senha;
     }

     public String getUsername() {
          return username;
     }

     public void setUsername(String username) {
          this.username = username;
     }
     
     //métodos
     //Criar conta
     public void adicionar(int contador) { 
          if(matriz.size() <= 3) {
               for (int i = 0; i < 3; i++) {
                    if (matriz.size() <= i) {
                         matriz.add(new ArrayList<>());  // Cria uma nova linha se ela não existir
                    }
               }    
          }
          for (int i = 0; i < 3; i++) {
               List<String> linha = matriz.get(i);  // Obter a linha atual
       
               // Garante que a linha tem espaço suficiente para a coluna desejada
               while (linha.size() <= contador) {
                   linha.add("");  // Preenche com strings vazias se a linha for curta
               }
       
               if (i == 0) {
                   linha.set(contador, username);   // Adiciona o nome na coluna especificada da linha 0
               } else if (i == 1) {
                   linha.set(contador, senha);  // Adiciona a senha na coluna especificada da linha 1
               } else if (i == 2) {
                   linha.set(contador, email);  // Adiciona o email na coluna especificada da linha 2
               }
          }
          System.out.println("Conta adicionada!\n");
     }

     //Excluir Conta
     public void excluir(String usuario) {
          for (int i = 0; i < matriz.size(); i++) {
               List<String> row = matriz.get(i);
               for (int j = 0; j < row.size(); j++) {
                   if (row.get(j).equals(usuario)) {
                       row.remove(j);
                       j--;
                   }
               }
          }
          System.out.println("Usuário excluído!");
     }

     //Alterar email e senha
     public void alterar(String usuario, String email, String senha) {
          for (int i = 0; i < matriz.size(); i++) {
               List<String> row = matriz.get(i);
               for (int j = 0; j < row.size(); j++) {
                   if (row.get(j).equals(usuario)) {
                       if (j + 1 < row.size()) { 
                           row.set(j + 1, email);
                       }
                       if (j + 2 < row.size()) { 
                           row.set(j + 2, senha);
                       }
                       System.out.println("Senha e Email alterados!");
                       return; 
                   }
               }
           }
           System.out.println("Usuário não encontrado!");
     }

     //Mostrar clientes
     public void mostrar() {
          for(int i = 0; i < matriz.size(); i++) {
               List<String> row = matriz.get(i);
               for(int j = 0; j < row.size(); j++) {
                    System.out.print(row.get(j) + "\t");
               }
               System.out.println();
          }
     }

}
