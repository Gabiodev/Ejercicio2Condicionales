public class Main {
    public static void main(String[] args)
    {
        //CONDICIONAL IF
    int numerolf=-0;

        if (numerolf < 0) {
            System.out.println("El numero es negativo");
            }
             else if (numerolf == 0)
             {
                System.out.println("El numero es cero");

            }
             else {
                System.out.println("El numero es positivo");
            }

        //CONDICIONAL WHILE
        int numeroWhile=0;
             while (numeroWhile<3)
             {
                 System.out.println("El numero es while es..:  "+numeroWhile);
                 numeroWhile++;
             }

        //CONDICIONAL DO-WHILE
        int numeroDoWhile=0;
             do {
                 System.out.println("EL NUMERO DOWHILE ES...:"+numeroDoWhile);
                 numeroDoWhile++;
             }
             while (numeroDoWhile<1);

        //CONDICIONAL FOR
        int numeroFor=0;
        for (numeroFor=0; numeroFor<=3;numeroFor++)
        {
            System.out.println("El numeroFor es..:"+numeroFor);
        }

        //CONDICIONAL SWITCH
        String Estacion="invierno";
        switch (Estacion)
        {
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "otoño":
                System.out.println("La estacion es otoño");
                break;
            case "invierno":
                System.out.println("La estacion es invierno");
                break;
            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            default:
                System.out.println("No es ninguna estacion del año");

        }
     }

}