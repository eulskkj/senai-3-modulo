public class ArList02 {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> numeros = new java.util.ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(10);

        for (int i=0; i< numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        numeros.set(1, 50);
        System.out.println("=========================");
        numeros.remove(0);

        for (Integer n: numeros) {
            System.out.println(n);
        }
    }
}
