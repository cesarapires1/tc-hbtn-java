import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args){
        final var localeEUA = new Locale("en ", "EU");
        NumberFormat decimalFormat = NumberFormat.getNumberInstance(localeEUA);
        decimalFormat.setMaximumFractionDigits(2);
        float taxa = 0.2456f;
        float valor = 7654.321f;
        System.out.println("Valor: R$ "+ decimalFormat.format(valor));
        System.out.println("Taxa: "+ decimalFormat.format(taxa)+"%");
    }
}