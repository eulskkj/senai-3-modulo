package MostarErroException;
public class Ex01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int resultado = a/b;
            System.out.println("Resultado: "+resultado);
        } catch(ArithmeticException e){
            System.out.println("Error: Nâo é possivel dividir por 0");
        }
        finally {
            System.out.println("Programa finalizado!");
        }
    }
}
