public class Numero {
    public static void dividir(int a, int b){
        int c = 0;
        try  {
            c = a/b;
        } catch (Exception ex) {
            System.out.println("Nao eh possivel dividir por zero");
            c = 0;
        } finally {
            System.out.println(a+" / "+b + " = "+c);
        }        
    }
}
