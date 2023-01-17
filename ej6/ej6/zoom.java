import java.util.Random;

public class zoom {
    private int id;
    private int contra;

    zoom (){
        Random rand = new Random();
        id = rand.nextInt(200)+1;
        contra = rand.nextInt(10000)+1000;
    }

    
    /** 
     * @return int
     */
    public int getId() {
        return id;
    }

    
    /** 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /** 
     * @return int
     */
    public int getContra() {
        return contra;
    }

    
    /** 
     * @param contra
     */
    public void setContra(int contra) {
        this.contra = contra;
    }
    
    
}
