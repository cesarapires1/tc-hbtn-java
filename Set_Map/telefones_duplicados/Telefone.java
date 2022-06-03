public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        String telefone = String.format("("+getCodigoArea()+") "+getNumero());
        return telefone;
    }

    @Override
    public int hashCode(){
        int hash = 5;
        hash = hash + toString().hashCode();
        return hash;
    }

    public boolean equals(Object obj) {
        Telefone outro = (Telefone) obj;
        return this.toString().equals(outro.toString());
    }
}
