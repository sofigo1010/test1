public class device implements idevice{

    private String tipo;
    private Boolean on;
    String opts[] = {"celular", "Carro", "tablet/compu"};

    device (String type){
        this.tipo = type;
        on = true;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Boolean getOn() {
        return on;
    }

    public void setOn(boolean s) {
        this.on = s;
    }

    @Override
    public void encender() {
        // TODO Auto-generated method stub
        System.out.println("Encendiste tu dispositivo");
    }

    @Override
    public void apagar() {
        // TODO Auto-generated method stub
        System.out.println("Apagaste tu dispositivo");
    }

    @Override
    public void llamar() {
        // TODO Auto-generated method stub
        System.out.println("Estás realizando una llamada");
    }

    @Override
    public void recibirllamara() {
        // TODO Auto-generated method stub
        System.out.println("Estás recibiendo una llamada");
    }

    @Override
    public void frenar() {
        // TODO Auto-generated method stub
        System.out.println("Estás frenando el auto");
    }

    @Override
    public void manejar() {
        // TODO Auto-generated method stub
        
        System.out.println("Todo listo para manejar");
    }

    @Override
    public void instalar() {
        // TODO Auto-generated method stub
        System.out.println("Instalando app");
    }

    @Override
    public void correrapp() {
        // TODO Auto-generated method stub
        System.out.println("corriendo app");
    }

    

    
}
