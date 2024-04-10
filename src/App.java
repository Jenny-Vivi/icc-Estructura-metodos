public class App {
    public static void main(String[] args) throws Exception {
       //crear la instancia de la clase u objeto)(clase u objeto)Metodosordenamiento
       MetodosOrdenamiento metodosOrdenamiento=new MetodosOrdenamiento();
       int[]numeros={30,7,12,5};
       //Mandar imprimir un arrglo
       int[]arregloOrdenadoBuble=metodosOrdenamiento.sortByBubble(numeros,true);
       //Mandar imprimir mi nuevo arreglo 
       metodosOrdenamiento.imprime((arregloOrdenadoBuble));
       System.out.println("-Si es mayor asi que cambio");
       

    }
}
