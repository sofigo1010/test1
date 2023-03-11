import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cardmanager {
    
    public Cardmanager (){}

    
    /** agrega una carta 
     * @param manager
     * @param name
     * @param category
     * @param amount
     */
    public void agregaralcarrito(Map<Integer, Cards> manager, String name, String category, int amount){
        int indice = manager.size();
        manager.put((indice+1), new Cards(name, category, amount));
    }


    
    /** busca la categoria de una carta
     * @param productos
     * @param nombre
     * @return String
     */
    public String buscarCategoriaPorNombre(Map<Integer, Cards> productos, String nombre) {
        for (Map.Entry<Integer, Cards> entry : productos.entrySet()) {
            Cards producto = entry.getValue();
            if (producto.getNombre().equals(nombre)) {
                return ("\n\nLa categoría de la carta "+nombre+" es " + producto.getCategoria());
            }
        }
        return "La carta con nombre '" + nombre + "' no fue encontrada.";
    }


    
    /** regresa el listado de cartas ordenadas por categoria y orden alfabético del map
     * @param productos
     * @return String
     */
    public String obtenerProductosOrdenadosPorCategoria(Map<Integer, Cards> productos) {
        Map<String, List<Map.Entry<Integer, Cards>>> productosPorCategoria = new HashMap<>();
    
       
        for (Map.Entry<Integer, Cards> entry : productos.entrySet()) {
            Cards producto = entry.getValue();
            String categoria = producto.getCategoria();
            if (!productosPorCategoria.containsKey(categoria)) {
                productosPorCategoria.put(categoria, new ArrayList<>());
            }
            productosPorCategoria.get(categoria).add(entry);
        }
    
        // Ordenar las categorías alfabéticamente
        List<String> categoriasOrdenadas = new ArrayList<>(productosPorCategoria.keySet());
        Collections.sort(categoriasOrdenadas);
    
        // Crear un StringBuilder para construir el resultado
        StringBuilder sb = new StringBuilder();
    
        
        for (String categoria : categoriasOrdenadas) {
            sb.append("\n\nCategoría: ").append(categoria).append("\n");
            List<Map.Entry<Integer, Cards>> productosDeCategoria = productosPorCategoria.get(categoria);
            Collections.sort(productosDeCategoria, Comparator.comparing(entry -> entry.getValue().getNombre()));
            for (Map.Entry<Integer, Cards> entry : productosDeCategoria) {
                int codigo = entry.getKey();
                Cards producto = entry.getValue();
                sb.append("Indice: ").append(codigo).append(", Categoría: ").append(producto.getCategoria()).append(", Carta: ").append(producto.getNombre()).append(", Cantidad en lista: ").append(producto.getExistencias()).append("\n");
            }
        }
    
        // Devolver el resultado como un String
        return sb.toString();
    }



    
    /** regresa la lista de las cartas sin ordenar
     * @param manager
     * @return String
     */
    public String vertodoslositemsendesorden(Map<Integer, Cards> manager){
        String info = "";
        for (Map.Entry<Integer, Cards> entry : manager.entrySet()) {
            Integer key = entry.getKey();
            Cards value = entry.getValue();
            info += "Indice: " + key+ ", Categoría: " + value.getCategoria() + ", Carta: " + value.getNombre()  + ", Cantidad en lista: " + value.getExistencias() + "\n";
        }
        return info;
    }


}
