public class Livro {

    private String autores;
    private String livro;
    private Double preco;

    public Livro(){

    }
    public Livro(String autor, String livro){
        this.autores = autor;
        this.livro = livro;
    }
    public Livro(String autor, String livro, Double preco){
        this.autores = autor;
        this.livro = livro;
        this.preco = preco;
    }

    public String getAutores() {
        return autores;
    }
    public void setAutores(String autores) {
        this.autores = autores;
    }
    
    public String getLivro() {
        return livro;
    }
    
    public void setLivro(String livro) {
        this.livro = livro;
    }
   
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
