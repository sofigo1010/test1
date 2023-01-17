public class host extends usuario{

    host(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    
    @Override
    public void prendercam() {
        // TODO Auto-generated method stub
        super.prendercam();
    }
    @Override
    public void prendermic() {
        // TODO Auto-generated method stub
        super.prendermic();
    }
    @Override
    public void prendersomeonelsescam() {
        // TODO Auto-generated method stub
        System.out.println("Encendiste su camara");
    }
    @Override
    public void prendersomeonelsesmic() {
        // TODO Auto-generated method stub
        System.out.println("Encendiste su microfono");
    }
    @Override
    public void apagarcam() {
        // TODO Auto-generated method stub
        super.apagarcam();
    }
    @Override
    public void apagarmic() {
        // TODO Auto-generated method stub
        super.apagarmic();
    }

    @Override
    public void apagarsomeoneelsescam() {
        // TODO Auto-generated method stub
        System.out.println("apagaste su camara");;
    }
    @Override
    public void apagarsomeoneelsesmic() {
        // TODO Auto-generated method stub
        System.out.println("apagaste su microfono");;
    }
}

