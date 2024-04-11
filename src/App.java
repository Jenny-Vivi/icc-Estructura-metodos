import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        int opcion;
        int[] arregloNumeros=new int[0];

        do {
            System.out.println("\nMenu principal");
            System.out.println("1.ingrese un arrego");
            System.out.println("2.Ordenar arreglo");
            System.out.println("0.Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tamaño de su arreglo");
                    int tamano = scanner.nextInt();
                    arregloNumeros = new int[tamano];

                    for (int i = 0; i < arregloNumeros.length; i++) {
                        System.out.println("Ingrese el valor para " + (i + 1) + ": ");
                        arregloNumeros[i] = scanner.nextInt();
                    }
                    metodos.imprime(arregloNumeros);
                    break;
                case 2:
                    /// Sub menu
                    mostrarSubMenuMetodos(scanner,metodos, arregloNumeros);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...\n Adios");
                    break;

                default:
                    System.out.println("Opcion no valido . Repita");
            }

        } while (opcion != 0);
        scanner.close();
    }
    public static void mostrarSubMenuMetodos(Scanner scanner, MetodosOrdenamiento metodos, int []arreglo){
        int opcionMetodo;
        do{
            System.out.println("\n Escoja un metodo de Ordenamiento");
            System.out.println("Metodo Burbuja");
            System.out.println("Metodo Seleccion");
            System.out.println("Metodo Insercion");
            System.out.println("0.Regresar al MENU principal");
            opcionMetodo=scanner.nextInt();
            switch (opcionMetodo) {
                case 1:
                //ingrese A-para logs y b - sin logs
                //String opcionLog
                //boolean condicion
                //if opcionLog.equuals(A) cond - true
                //else cond- false
                //metodos.sortByBubble(arreglo,cond)
                    int [] arregloOrdenado=metodos.sortByBubble(arreglo, false);
                    metodos.imprime(arregloOrdenado);
                    
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                    case 0:
                    break;
            
                default:
                    break;
            }





        }while(opcionMetodo!=0);
    }
}
