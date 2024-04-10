public class MetodosOrdenamiento {
    // 1.metodo que devuelve un arreglo de
    // enteros ordenados por burbuja
    public int[] sortByBubble(int[] arreglo, boolean logs) {
        //code to sort
        //Obtener el tamaño del arreglo 
        int tamano = arreglo.length;
        //bucle externo que va recorrer todo el arreglo
        for (int i = 0; i < tamano; i++) {
            System.out.println("\n Pasado numero"+i);
            for (int j = i + 1; j < tamano; j++) {
                System.out.println("i="+arreglo[i]"j="+arreglo[j]);
                if (arreglo[i] > arreglo[j]) {
                    System.out.println("-Si es mayor asi que cambio");
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                    if(logs)
                        syso
                    System.out.println(" ");

                }
            }
        }
        return arreglo;

    }

    // 2.Metodos que devuelve un arreglo de
    // enteros ordenados por sellecion

    // 3.Metodo que devuelve un arreglo de
    // enteros ordenados por Insercion

    // 4.Metodo que imprime un arreglo
    public void imprime(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + "");
            System.out.println(arreglo + "");

        }

        System.out.println();
        for(int )

    }

}
