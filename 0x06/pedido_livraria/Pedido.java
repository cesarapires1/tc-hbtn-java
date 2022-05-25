public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

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
        return totalPedido*(1-(this.percentualDesconto));
    }
}
