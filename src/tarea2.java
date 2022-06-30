public class tarea2 {
    public static void main(String[] args){
        //region numeroIf
        int numeroIf = 0;
        if(numeroIf > 0){
            System.out.println("El numero "+ numeroIf +"es positivo");
        }
        else if(numeroIf < 0){
            System.out.println("El numero" + numeroIf +" es negativo");
        }
        else {
            System.out.println("El numero es 0");
        }
        //endregion

        //region while
        int numeroWhile = 0;
        while(numeroWhile < 3) {
            System.out.println("Se ha ejectuado el bucle while, el numero vale:" + numeroWhile);
            numeroWhile++;
        }
        //endregion

        //region Do While
        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println("Se ha ejectuado el bucle do while, el numero vale:" + numeroDoWhile);
        }while (numeroDoWhile <3 );
        //endregion

        //region For
        for(int numeroFor = 0; numeroFor < 3; numeroFor++){
            System.out.println("se ha ejecutado el bucle for, el numero vale "+ numeroFor);
        }
        //endregion

        //region Switch
        String estacion = "primavera";
        switch (estacion){
            case "primavera":
                System.out.println("La estacion es primavera");
            case "verano":
                System.out.println("La estacion es verano");
            case "otoño":
                System.out.println("La estacion es otoño");
            case "invierno":
                System.out.println("La estacion es invierno");
            default:
                System.out.println("Esta no es una estacion");
        }
        //endregion

    }
}
