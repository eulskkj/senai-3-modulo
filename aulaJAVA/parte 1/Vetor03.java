public class Vetor03 {
    public static void main(String[] args) {
        int [] numeros = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição "+i+" tem o valor: "+numeros[i]);
        }
        for (int n: numeros){
            System.out.println(n);
        }
}}
