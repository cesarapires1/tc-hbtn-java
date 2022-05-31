import java.util.ArrayList;

public class Pedido {
    private ArrayList <PedidoCookie> cookies = new ArrayList<>();

    public Pedido() {

    }


    public void adicionarPedidoCookie(PedidoCookie cookieNovo) {
        boolean cookieExist = false;
        for (PedidoCookie cookie : cookies) {
            if (cookie.getSabor().equals(cookieNovo.getSabor())) {
                int quantidadeCaixa = cookieNovo.getQuantidadeCaixas() + cookie.getQuantidadeCaixas();
                cookie.setQuantidadeCaixas(quantidadeCaixa);
                cookieExist = true;
            }
        }

        if (!cookieExist) {
            cookies.add(cookieNovo);
        }
    }

    public int obterTotalCaixas() {
        int totalCaixas = 0;
        for (PedidoCookie cookie : cookies) {
            totalCaixas += cookie.getQuantidadeCaixas();
        }
        return totalCaixas;
    }

    public int removerSabor(String sabor){
        int quantidadeExcluido = 0;
        for (PedidoCookie cookie : cookies) {
            if (cookie.getSabor().equals(sabor)) {
                quantidadeExcluido += cookie.getQuantidadeCaixas();
                cookie.setQuantidadeCaixas(cookie.getQuantidadeCaixas() - quantidadeExcluido);
            }
        }

        return quantidadeExcluido;
    }
}
