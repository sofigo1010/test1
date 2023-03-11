/**
 * @author Fernando Echeverria
 * Folder: HDT6
 * Archivo: View.java
 * Fecha: 05/03/2023
 */

import java.util.Scanner;

public class View {
    int respuesta; 
    Scanner sc = new Scanner(System.in);
    String respuesta2;
    
    /** menú inicial para escoger el tipo de mapa a utilizar 
     * 
     * @return int
     */
    public int menumaps (){
        System.out.println("Bienvenido al juego de cartas Popshmack!\n\n\nCon qué tipo de Mapa desea visualizar el inventario?\n1.HashMap\n2. TreeMap\n3. LinkedHashMap\nIngrese el número de índice: ");
        respuesta = sc.nextInt();
        return respuesta;
    }
    
    /** Opciones del menu 
     * @return int
     */
    public int menusupermercado(){
        System.out.println("\t\t\t\t\t\tCARTAS POPSHMACK\n\nQué desea hacer?\n1. Agregar una carta a la colección\n2. Ver la categoría de una carta específica\n3. Mostrar el nombre, tipo y cantidad de cada carta que hay en su colección.\n4. Mostrar el nombre, tipo y cantidad de cada carta que tiene en su colección, ordenadas por tipo.\n5. Mostrar el nombre y tipo de todas las cartas existentes.\n6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.\n7. Salir del programa\n\nIngrese el número de índice");
        respuesta = sc.nextInt();
        return respuesta;
    }

    
    /** ingresar la categoria de una carta que quiere agregar 
     * @return String
     */
    public String categoriaproductonuevo(){
        System.out.println("Ingresa la categoría de la carta");
        respuesta2 = sc.next();
        return respuesta2;
    }

    
    /** ingresar el nombre de una carta  que quiere agregar 
     * @return String
     */
    public String nombreproductnuevo(){
        System.out.println("Ingresa su nombre");
        respuesta2 = sc.next();
        respuesta2 += sc.nextLine();
        return respuesta2;
    }

    
    /** ingresar la cantidad de una carta  que quiere agregar 
     * @return int
     */
    public int cantidadproductonuevo(){
        System.out.println("Ingresa la cantidad de cartas que quieres agregar");
        int respuesta = sc.nextInt();
        return respuesta;
    }

    /** 
     * mensaje a imprimir en caso de que no se encuentre una carta  que quiere agregar
     */
    public void noencuentro(){
        System.out.println("No se encontró la carta.");
    }

    /** 
     * ensena las cartas
     */
    public void verproduscarrito(String listado){
        System.out.println("\t\t\t\t\t\t\tLISTADO DE CARTAS\n\n"+listado);

    }

    /** 
     * ensena las cartas del inventario
     */
    public void verproductosinventario(String listado){
        System.out.println("\t\t\t\t\t\t\tLISTADO DE CARTAS GENERAL\n\n"+listado);
    }

    /** 
     * cuando no entra una opcion valida aparece esto en pantalla
     */
    public void error(){
        System.out.println("Ingrese una opción válida");
    }

    /** 
     * mensaje de salida del programa
     */
    public void adios(){
        System.out.println("CARTAS POPSHMACK TE DESEA UN EXCELENTE DÍA Y ESPERA QUE REGRESES PRONTO! HASTA LUEGO");
    }

    /** 
     * muestra la categoria de una carta 
     */
    public void vercategoriaproducto(String categoria){
        System.out.println(categoria);
    }
    

}
