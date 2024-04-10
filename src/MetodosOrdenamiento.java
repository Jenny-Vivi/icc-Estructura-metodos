public class MetodosOrdenamiento {
    // 1.metodo que devuelve un arreglo de
    // enteros ordenados por burbuja
    public int[] sortByBubble(int[] arreglo, boolean logs) {
        // Code sort
        // Obtener el tamaño del arreglo.
        int tamano = arreglo.length;
        // Bucle externo que va a recorrer todo el arreglo.
        for (int i = 0; i < tamano; i++) {
            if (logs){
                System.out.println("\nPasado numero "+ i);
            }
            // Bucle interno que comparta el elemento actual con los siguientes.
            for (int j = i + 1; j < tamano; j++) {
                if (logs){
                    System.out.println("i= "+ arreglo[i] + "j= "+ arreglo[j]);
                }
                if (arreglo[i] > arreglo[j]) {
                    // Intercambiamos los elementos.
                    if (logs){
                        System.out.println(" - Si es mayor asi que cambio");
                    }
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                    if (logs){
                        System.out.print(" ");
                        imprime(arreglo);
                    }
                }

            }

        }
        return arreglo;
    }

    /* 4. Método que imprime un arreglo */
    public void imprime(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

}
