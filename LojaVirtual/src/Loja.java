public class Loja {
    
private String NomeLoja ;
private String endereco;

public Loja(String NomeLoja, String endereco){
    this.NomeLoja = NomeLoja;
    this.endereco = endereco;
}

public Loja(){
   // this.NomeLoja;
   // this.endereco;
}
    public String getEndereco() {
        return endereco;
    }

    public String getNomeLoja() {
        return NomeLoja;
    }

    
}
