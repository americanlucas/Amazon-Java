package entidades;

public class Produtos {
     //atributos
     public String produto1;
     public String produto2;
     public String produto3;
     public String descricaoproduto1;
     public String descricaoproduto2;
     public String descricaoproduto3;
     public String preco1;
     public String preco2;
     public String preco3;

     //construtor
     public Produtos(String produto1, String produto2, String produto3, String descricaoproduto1,
               String descricaoproduto2, String descricaoproduto3, String preco1, String preco2, String preco3) {
          this.produto1 = produto1;
          this.produto2 = produto2;
          this.produto3 = produto3;
          this.descricaoproduto1 = descricaoproduto1;
          this.descricaoproduto2 = descricaoproduto2;
          this.descricaoproduto3 = descricaoproduto3;
          this.preco1 = preco1;
          this.preco2 = preco2;
          this.preco3 = preco3;
     }

     //metodos get e set

     public String getProduto1() {
          return produto1;
     }

     public void setProduto1(String produto1) {
          this.produto1 = produto1;
     }

     public String getProduto2() {
          return produto2;
     }

     public void setProduto2(String produto2) {
          this.produto2 = produto2;
     }

     public String getProduto3() {
          return produto3;
     }

     public void setProduto3(String produto3) {
          this.produto3 = produto3;
     }

     public String getDescricaoproduto1() {
          return descricaoproduto1;
     }

     public void setDescricaoproduto1(String descricaoproduto1) {
          this.descricaoproduto1 = descricaoproduto1;
     }

     public String getDescricaoproduto2() {
          return descricaoproduto2;
     }

     public void setDescricaoproduto2(String descricaoproduto2) {
          this.descricaoproduto2 = descricaoproduto2;
     }

     public String getDescricaoproduto3() {
          return descricaoproduto3;
     }

     public void setDescricaoproduto3(String descricaoproduto3) {
          this.descricaoproduto3 = descricaoproduto3;
     }

     public String getPreco1() {
          return preco1;
     }

     public void setPreco1(String preco1) {
          this.preco1 = preco1;
     }

     public String getPreco2() {
          return preco2;
     }

     public void setPreco2(String preco2) {
          this.preco2 = preco2;
     }

     public String getPreco3() {
          return preco3;
     }

     public void setPreco3(String preco3) {
          this.preco3 = preco3;
     }

     
}
