import java.util.Locale;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    final var localeEUA = new Locale("pt ", "BR");
    NumberFormat decimalFormat = NumberFormat.getNumberInstance(localeEUA);
    decimalFormat.setMaximumFractionDigits(2);

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto/100;
        this.itens = itens;
    }

    public double calcularTotal(){
        double totalPedido = 0;
        double totalItem = 0;
        for (ItemPedido item: this.itens) {
            totalItem = item.getQuantidade()*item.getProduto().obterPrecoLiquido();
            totalPedido+= totalItem;
        }
        return totalPedido;
    }

    public double calcularDesconto(){
        return this.percentualDesconto*calcularTotal();
    }

    public void apresentarResumoPedido(){
        System.out.println("------- RESUMO PEDIDO -------");
        double totalPedido = 0;
        double totalItem = 0;
        for (ItemPedido item: this.itens) {
            totalItem = item.getQuantidade()*item.getProduto().obterPrecoLiquido();
            totalPedido+= totalItem;
            String textoItem = String.format("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f", item.getProduto().getClass().getSimpleName(),
                    item.getProduto().getTitulo(), 
                    decimalFormat.format(item.getProduto().obterPrecoLiquido()), 
                    item.getQuantidade(), 
                    decimalFormat.format(totalItem));
            System.out.println(textoItem);
        }
        System.out.println("----------------------------");
        System.out.println(String.format("DESCONTO: %.2f", decimalFormat.format(this.calcularDesconto())));
        System.out.println(String.format("TOTAL PRODUTOS: %.2f", decimalFormat.format(this.calcularTotal())));
        System.out.println("----------------------------");
        System.out.println(String.format("TOTAL PEDIDO: %.2f", decimalFormat.format(this.calcularTotal() - this.calcularDesconto())));
        System.out.println("----------------------------");
    }
}
