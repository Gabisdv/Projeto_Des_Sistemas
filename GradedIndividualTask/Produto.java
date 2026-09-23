public class Produto {

    private int codigo;
    private String nome;
    private String categoria;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nome, String categoria, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean temEstoque(int quantidade) {
        return estoque >= quantidade;
    }

    public void diminuirEstoque(int quantidade) {
        estoque -= quantidade;
    }
}