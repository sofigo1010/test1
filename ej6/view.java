import java.util.Scanner;

public class view {

    Scanner sc = new Scanner(System.in);
    
    view (){

    }

    int respuesta;
    String answ;

    public void inicio (){
        //pregunta nombre
        System.out.println("Bienvenido a tu dispositivo zoom! Como te llamas?");
        answ= sc.next();
    }

    public void  tipodisp(){
        //pregunta el device para setearlo
        System.out.println("Que tipo de dispositivo usas? \n1. celular\n2. Carro\n3. Tablet/compu");
        respuesta = sc.nextInt();
    }

    public void opcioninvalida(){
        // para decir que su opcion es invalida
        System.out.println("Esa opcion no es valida, vuelve a intentarlo");
    }



    public void tipozoom (){
        //para ver si quiere crear un zoom o meterse a uno
        System.out.println("Quieres 1. ingresar a un zoom o 2.crear un zoom?");
        respuesta = sc.nextInt();
    }

    public void cualID (){
        //para que escoja a que zoom se quiere meter
        System.out.println("\n\nIngresa el ID del zoom al que te quieres meter");
        respuesta = sc.nextInt();
    }

    public void contra (){
        //pregunta la contra del zoom
        System.out.println("Ingresa la contrasena del zoom que escogiste");
        respuesta = sc.nextInt();
    }

    public void ingresaste(){
        //mensaje de bienvenida cuando ya entra al zoom que escogio
        System.out.println("\t\t\t\t\t\t\t\t\t\tBienvenido al zoom");
    }

    public void camerastate(usuario us){
        //ver si tiene la camara apagada o encendida
        if (us.getCamera() == false){
            System.out.println("Camara: apagada");
        }
        else if (us.getCamera() == true){
            System.out.println("Camara: encendida");
        }
    }

    public void micstate(usuario us ){
        if (us.getMic() == false){
            System.out.println("Microfono: apagado");
        }
        else if (us.getMic() == true){
            System.out.println("Microfono: encendido");
        }

    }

    public void opcioneszoominvitado(){
        //opciones del invitado en el zoom
        System.out.println("\n\nQue quieres hacer?\n1. Encender microfono\n2.Apagar microfono\n3.Encender camara\n4.Apagar camara\n5.Ver chat general\n6. Ver chat privado\n7. Ver lista de invitados\n8. Salir del zoom");
        respuesta = sc.nextInt();
    }

    public void introinvites(){
        //para decir la lista de invitados
        System.out.println("Estos son los invitados en el zoom:");
    }

    public void adioszoom (){
        System.out.println("Esperamos tu experiencia en el zoom haya sido placentera!");
    }

    public void opcioneszoomhost(){
        System.out.println("\n\nQue quieres hacer?\n1. Encender microfono\n2.Apagar microfono\n3.Encender camara\n4.Apagar camara\n5.Ver chat general\n6. Ver chat privado\n7. Ver lista de invitados \n8. Encender/apagar el mic de alguien mas\n9. Salir del zoom");
        respuesta = sc.nextInt();
    }
    public void opcionesinvite(){
        System.out.println("A que invitado deseas hacerle esto? (ingresa su numero de indice)");
        answ = sc.next();
    }

    public void accion(){
        System.out.println("Quieres 1. Encender su camara 2. Apagar su camara 3. Encender su mic 4. Apagar su mic");
        respuesta = sc.nextInt();
    }




    
}
