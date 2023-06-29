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
                System.out.println("El número es numeroWhile es: " + numeroWhile);
            }
            System.out.println();
        }


            // Parte 3: DoWhile
        {
            int numeroDoWhile = 0;

            do {
                numeroDoWhile++;
                System.out.println("El número es numeroDoWhile es: " + numeroDoWhile);
            } while (numeroDoWhile <3) ;

            System.out.println();
        }


        // Parte 4: For
        {
            for (int numeroFor = 0; numeroFor <= 3; numeroFor++)
                System.out.println("El número for es: " + numeroFor);
            System.out.println();
        }


        // Parte 5: Switch
        {
        String estacion = "verano";

        switch (estacion){
            case "otoño":
                System.out.println("Es Otoño");
            break;
            
            case "Invierno":
                System.out.println("Es invierno");
            break;
            
            case "Primavera":
                System.out.println("Es Primavera");
            break;
            
            default:
                System.out.println("Es Verano");
            break;

        }
    }

    }
}