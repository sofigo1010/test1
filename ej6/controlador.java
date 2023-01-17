import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class controlador {
    ArrayList<mensajes> chat = new ArrayList<mensajes>();
    ArrayList<zoom> zoomopts = new ArrayList<zoom>();
    ArrayList<usuario> invites = new ArrayList<usuario>();
    
    mensajes msg = new mensajes(null, null);
    view vista = new view();
    usuario mainuser = new usuario(null);
    Random rand = new Random(); 
    boolean inicio = true;
    device dev = new device(null);
    zoom zoomenuso;
    Scanner sc = new Scanner(System.in);
    int respuesta;
    boolean segundo = true;
    boolean zoomactivo;
    
    controlador (){
        
    }
    public void menu() {
        while (inicio == true){
            vista.inicio();//pregunta el nombre
            mainuser.setNombre(vista.answ);//cambia el nombre
            mainuser.getNombre();
            vista.tipodisp();//pregunta el dispositivo
            if (vista.respuesta == 1){
                mainuser.sup.setTipo("Celular");
                inicio = false;
            }
            else if (vista.respuesta == 2){
                mainuser.sup.setTipo("Carro");
                inicio=false;
            }
            else if (vista.respuesta == 3){
                mainuser.sup.setTipo("tablet/compu");
                inicio = false;
            }
            else{
                vista.opcioninvalida();
            }
        }

        while (segundo = true){
            System.out.println("Que deseas hacer?");
            if (mainuser.sup.getTipo() =="Celular"){
                System.out.println("\n1. Apagar tu dispositivo\n2.Encender tu dispositivo\n3.llamar\n4.recibir llamada\n5.zoom\n6. salir");
                respuesta = sc.nextInt();
            }
            else if (mainuser.sup.getTipo() == "Carro"){
                System.out.println("\n1. apagar\n2.arrancar\n3.conducir\n4.frenar\n5.zoom\n6. salir");
                respuesta=sc.nextInt();
            }
            else if (mainuser.sup.getTipo() == "tablet/compu"){
                System.out.println("\n1. Apagar tu dispositivo \n2. Encender tu dispositivo\n3. instalar app\n4. correr app \n5. zoom\n6. salir");
                respuesta = sc.nextInt();
            }
            System.out.println("6. Salir");
            
            if (respuesta == 1 && mainuser.sup.getOn() == true){
                mainuser.sup.setOn(false);
                mainuser.sup.apagar();
            }
            else if (respuesta == 2 && mainuser.sup.getOn() == false){
                mainuser.sup.setOn(true);
                mainuser.sup.encender();
            }
            else if (respuesta == 3 && mainuser.sup.getTipo().equals("Celular")){
                mainuser.sup.llamar();
            }
            else if (respuesta == 3 && mainuser.sup.getTipo().equals("Carro")){
                mainuser.sup.manejar();
            }
            else if (respuesta == 3 && mainuser.sup.getTipo().equals("tablet/compu")){
                mainuser.sup.instalar();
            }
            else if (respuesta == 4 && mainuser.sup.getTipo().equals("Celular")){
                mainuser.sup.recibirllamara();
            }
            else if (respuesta == 4 && mainuser.sup.getTipo().equals("Carro")){
                mainuser.sup.frenar();
            }
            else if (respuesta == 4 && mainuser.sup.getTipo().equals("tablet/compu")){
                mainuser.sup.correrapp();
            }
            else if (respuesta ==5){
                crearinvites();
                crearzooms();
                crearcomentarioschat();
                crearcomentariospriv();
                vista.tipozoom();
                if (vista.respuesta == 1){
                    //si se quiere meter a un zoom
                    for ( int i= 0; i < zoomopts.size();i++){
                        System.out.println(zoomopts.get(i).getId() + zoomopts.get(i).getContra()+ "\n");
                    }
                    vista.cualID();
                    vista.contra();
                    vista.ingresaste();
                    zoomuser();
                    
                }
                if (vista.respuesta == 2){
                    zoomhost();
                }

            }
            else if (respuesta ==6){
                vista.adioszoom();
                segundo = false;
                break;

            }

            
        }


    }

    public void crearzooms(){
        //creara reuniones zoom aleatoriamente
        int contador = 0;
        while (contador < 7){
            zoom zooms = new zoom();
            zoomopts.add(zooms);
            contador++;
        }
    }
    public void crearcomentarioschat (){
        //creara comentarios para el chat principal aleatoriamente
        int contador = 0;

        while (contador < 12){
            int muc = rand.nextInt(msg.mensajeschat.length);
            int nam = rand.nextInt(invites.size());
            msg = new mensajes(invites.get(nam).getNombre(), msg.mensajeschat[muc]);
            chat.add(msg);
            contador++;
        }
    }

    public void crearcomentariospriv (){
        //creara comentarios privados aleatoriamente
        int contador = 0;
        while (contador < 9){
            int muc = rand.nextInt(msg.mensajespriv.length);
            int nam = rand.nextInt(invites.size());
            msg = new mensajes(invites.get(nam).getNombre(), msg.mensajespriv[muc]);
            mainuser.getPrivatemsg().add(msg);
            contador++;
        }
    }

    public void crearinvites (){
        //creara usuarios random para el zoom 
        int contador = 0;
        while (contador < 11){
            int muc= rand.nextInt(dev.opts.length);
            int nam = rand.nextInt(mainuser.nombres.length);
            usuario invitee = new usuario(mainuser.nombres[nam]);
            invitee.sup.setTipo(dev.opts[muc]);
            invites.add(invitee);
            contador++;
        }
    }

    public void zoomuser (){

        //mecanica del zoom cuando uno es user
        zoomactivo = true;
        while (zoomactivo == true){
            vista.camerastate(mainuser);
            vista.micstate(mainuser);
            vista.opcioneszoominvitado();
            if (vista.respuesta == 1 && mainuser.getMic() == false){
                mainuser.setMic(true);
                mainuser.prendermic();
            }
            else if (vista.respuesta == 2 && mainuser.getMic() == true){
                mainuser.setMic(false);
                mainuser.apagarmic();
            }
            else if (vista.respuesta == 3 && mainuser.getCamera()== false){
                mainuser.setCamera(true);
                mainuser.prendercam();;
            }
            else if (vista.respuesta == 4 && mainuser.getCamera() == true){
                mainuser.setCamera(false);
                mainuser.apagarcam();
            }
            else if (vista.respuesta == 5){
                for (int i = 0; i< chat.size(); i++){
                    System.out.println(chat.get(i).getThem() + "" +chat.get(i).getMensaje());
                }
            }
            else if (vista.respuesta == 6){
                for (int i = 0; i< mainuser.getPrivatemsg().size(); i++){
                    System.out.println(mainuser.getPrivatemsg().get(i).getThem()+ "" +mainuser.getPrivatemsg().get(i).getMensaje());
                }
            }
            else if ( vista.respuesta == 7){
                vista.introinvites();
                for (int i = 0; i < invites.size(); i ++){
                    System.out.println(i+". "+invites.get(i).getNombre());
                }
            }
            else if (vista.respuesta == 8){
                vista.adioszoom();
                zoomactivo = false;
            }
            else{
                vista.opcioninvalida();
            }

        }

    }
    public void zoomhost(){
        //cambia a las opciones de un host
        zoomactivo = true;
        host hoes = new host(mainuser.getNombre());//cambia de user a host
        hoes.sup.setTipo(mainuser.sup.getTipo());
        while (zoomactivo == true){
            vista.opcioneszoomhost();
            vista.camerastate(hoes);
            vista.micstate(hoes);
            if (vista.respuesta == 1 && mainuser.getMic() == false){
                mainuser.setMic(true);
                mainuser.prendermic();
            }
            else if (vista.respuesta == 2 && mainuser.getMic() == true){
                mainuser.setMic(false);
                mainuser.apagarmic();
            }
            else if (vista.respuesta == 3 && mainuser.getCamera()== false){
                mainuser.setCamera(true);
                mainuser.prendercam();;
            }
            else if (vista.respuesta == 4 && mainuser.getCamera() == true){
                mainuser.setCamera(false);
                mainuser.apagarcam();
            }
            else if (vista.respuesta == 5){
                for (int i = 0; i< chat.size(); i++){
                    System.out.println(chat.get(i).getThem() + "" +chat.get(i).getMensaje());
                }
            }
            else if (vista.respuesta == 6){
                for (int i = 0; i< mainuser.getPrivatemsg().size(); i++){
                    System.out.println(mainuser.getPrivatemsg().get(i).getThem()+ "" +mainuser.getPrivatemsg().get(i).getMensaje());
                }
            }
            else if ( vista.respuesta == 7){
                vista.introinvites();
                for (int i = 0; i < invites.size(); i ++){
                    System.out.println(i+". "+invites.get(i).getNombre());
                }
            }
            else if (vista.respuesta == 8){
                vista.introinvites();
                for (int i = 0; i < invites.size(); i ++){
                    System.out.println(i+". "+invites.get(i).getNombre());
                }
                vista.opcionesinvite();
                int target = vista.respuesta;
                usuario persona = invites.get(target);
                vista.camerastate(persona);
                vista.micstate(persona);
                vista.accion();

                if (vista.respuesta ==1 && invites.get(target).getCamera() == false){
                    invites.get(target).setCamera(true);
                    hoes.prendersomeonelsescam();
                }
                else if (vista.respuesta == 2 && invites.get(target).getCamera() == true ){
                    invites.get(target).setCamera(false);
                    hoes.apagarcam();
                }
                else if (vista.respuesta == 3 && invites.get(target).getMic()== false){
                    invites.get(target).setMic(true);
                    hoes.prendermic();
                }
                else if (vista.respuesta == 4 && invites.get(target).getMic() == true ){
                    invites.get(target).setMic(false);
                    hoes.apagarmic();
                }

            }
            else if (vista.respuesta == 9){
                vista.adioszoom();
                zoomactivo = false;
            }
            else{
                vista.opcioninvalida();
            }

        }
    }


    
}
