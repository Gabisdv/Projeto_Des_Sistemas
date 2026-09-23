public class Main {

    public static void main(String[] args) {

        // Cadastro dos produtos
        Produto coxinha = new Produto(
                1,
                "Coxinha",
                "Lanche",
                6.50,
                10
        );

        Produto suco = new Produto(
                2,
                "Suco",
                "Bebida",
                5.00,
                10
        );

        // Criando o pedido
        Pedido pedido = new Pedido(1);

        // Adicionando os itens
        ItemPedido item1 = new ItemPedido(coxinha, 2);
        ItemPedido item2 = new ItemPedido(suco, 1);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        // Calculando o total
        double total = pedido.calcularTotal();

        // Criando o pagamento
        Pagamento pagamento = new Pagamento(
                TipoPagamento.DINHEIRO,
                20.00
        );

        // Mostrando os dados
        System.out.println("===== VENDA =====");

        System.out.println("Produto: " + coxinha.getNome());
        System.out.println("Quantidade: " + item1.getQuantidade());

        System.out.println("Produto: " + suco.getNome());
        System.out.println("Quantidade: " + item2.getQuantidade());

        System.out.println("Total: R$ " + total);

        System.out.println("Pagamento: " + pagamento.getTipo());
        System.out.println("Valor pago: R$ " + pagamento.getValorPago());

        if (pedido.temItens() && pedido.verificarEstoque()) {

            if (pagamento.pagamentoSuficiente(total)) {

                System.out.println("Pagamento aprovado.");

                System.out.println(
                    "Troco: R$ " + pagamento.calcularTroco(total)
                );

                System.out.println("Venda finalizada.");

            } else {
                System.out.println("Pagamento insuficiente.");
            }

        } else {
            System.out.println("Não foi possível finalizar o pedido.");
        }
    }
}