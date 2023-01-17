import java.util.ArrayList;

public class usuario implements iuser{
    private String nombre;
    device sup = new device("");
    private Boolean mic = false;
    private Boolean camera = false;
    private ArrayList<mensajes> privatemsg = new ArrayList<mensajes>();
    String nombres[]= {"Marco", "Pablo Emilio Escobar Gaviria", "Britney Spears", "Benito Martinez", "Camila Garcia", "Maria Orellana", "Benito Juarez", "Messi", "Miche Lover", "Paquita la del Barrio"};

    usuario (String name){
        nombre = name;
        mic = false;
        camera = false;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    
    /** 
     * @return Boolean
     */
    public Boolean getMic() {
        return mic;
    }
    
    /** 
     * @param mic
     */
    public void setMic(Boolean mic) {
        this.mic = mic;
    }
    
    /** 
     * @return Boolean
     */
    public Boolean getCamera() {
        return camera;
    }
    
    /** 
     * @param camera
     */
    public void setCamera(Boolean camera) {
        this.camera = camera;
    }
    
    /** 
     * @return ArrayList<mensajes>
     */
    public ArrayList<mensajes> getPrivatemsg() {
        return privatemsg;
    }
    
    /** 
     * @param privatemsg
     */
    public void setPrivatemsg(ArrayList<mensajes> privatemsg) {
        this.privatemsg = privatemsg;
    }

    @Override
    public void prendermic() {
        // TODO Auto-generated method stub
        System.out.println("activaste tu microfono");
    }

    @Override
    public void prendercam() {
        // TODO Auto-generated method stub
        System.out.println("activaste tu camara");
        
    }

    @Override
    public void prendersomeonelsesmic() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void prendersomeonelsescam() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void apagarmic() {
        // TODO Auto-generated method stub
        System.out.println("apagaste tu microfono");
    }


    @Override
    public void apagarcam() {
        // TODO Auto-generated method stub
        System.out.println("apagaste tu camara");
    }


    @Override
    public void apagarsomeoneelsesmic() {
        // TODO Auto-generated method stub
        
        
    }


    @Override
    public void apagarsomeoneelsescam() {
        // TODO Auto-generated method stub
        
    }



    

    

    
    

    

}
