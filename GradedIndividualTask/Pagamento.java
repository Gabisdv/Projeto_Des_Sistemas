public class Pagamento {

    private TipoPagamento tipo;
    private double valorPago;

    public Pagamento(TipoPagamento tipo, double valorPago) {
        this.tipo = tipo;
        this.valorPago = valorPago;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public double getValorPago() {
        return valorPago;
    }

    public boolean pagamentoSuficiente(double total) {
        return valorPago >= total;
    }

    public double calcularTroco(double total) {
        return valorPago - total;
    }
}