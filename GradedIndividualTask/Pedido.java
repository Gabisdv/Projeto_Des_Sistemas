import java.util.ArrayList;

public class Pedido {

    private int numero;
    private ArrayList<ItemPedido> itens;

    public Pedido(int numero) {
        this.numero = numero;
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public boolean temItens() {
        return !itens.isEmpty();
    }

    public boolean verificarEstoque() {

        for (ItemPedido item : itens) {

            if (!item.getProduto().temEstoque(item.getQuantidade())) {
                return false;
            }
        }

        return true;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }
}