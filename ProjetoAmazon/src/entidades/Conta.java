public class Conta {
     
     //atributos
     public String email;
     public String senha;
     public String username;

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

}
