public class Main {
    public static void main(String[] args) {
        System.out.println("TEMA 4: \n");

        // Parte 1: If
        {
            int numeroIf = 5;

            if (numeroIf > 0) {
                System.out.println("El número es positivo\n");
            } else if (numeroIf < 0) {
                System.out.println("El número es negativo\n");
            } else {
                System.out.println("El número es 0\n");
            }
        }


        // Parte 2: While
        {
            int numeroWhile = 0;


            while (numeroWhile < 3) {
                numeroWhile++;
                System.out.println("El número es numeroWhile es " + numeroWhile);
            }
            System.out.println();
        }


            // Parte 3: DoWhile
        {
            int numeroDoWhile = 0;

            do {
                numeroDoWhile++;
                System.out.println("El número es numeroDoWhile es " + numeroDoWhile);
            } while (numeroDoWhile <3) ;
        }


        // Parte 4: For
        {
            int numeroFor = 0;
        }
    }
}