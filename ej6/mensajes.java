public class mensajes {
    private String them;
    private String mensaje;
    String mensajeschat[]= {"Me perdi un poco", "jajaja", "hola a todos", "Holaaa", "Que tal todos?", "buena esa", "muy bien", "gracias","excelente", "entendido","me tengo que retirar"};
    String mensajespriv[]={"Que hueva jajaj", "ya me aburri", "nombreee enserio", "JAJAJAJ que oso", "quien es ese","vamos a comprar miches despues de esto", "que paso men?", "nauuur she purred"};
    mensajes (String mm, String msg){
        them = mm;
        mensaje = msg;
    }
    
    public String getMensaje() {
        return mensaje;
    }
    public String getThem() {
        return them;
    }
    public void setThem(String them) {
        this.them = them;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public String[] getMensajeschat() {
        return mensajeschat;
    }
    public void setMensajeschat(String[] mensajeschat) {
        this.mensajeschat = mensajeschat;
    }
    public String[] getMensajespriv() {
        return mensajespriv;
    }
    public void setMensajespriv(String[] mensajespriv) {
        this.mensajespriv = mensajespriv;
    }

    

}
