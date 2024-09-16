package entidades;

import java.util.ArrayList;
import java.util.List;

public class Conta {
     
     //atributos
     private String email;
     private String senha;
     private String username;
     List<List<Integer>> matriz = new ArrayList<>();
     

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
     public void adicionar(String nome,String email,String senha, int contador) { 
    	 if(matriz.size() <= 3) {
    		 for (int i = 0; i < 3; i++) {
    	        if (matriz.size() <= i) {
    	            matriz.add(new ArrayList<>());  // Cria uma nova linha se ela não existir
    	        }
    	    }
    	 }
    	 
     }

}
