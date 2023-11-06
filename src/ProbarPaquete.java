import com.corenetworks.Modelo.Paquete;
import com.corenetworks.Modelo.Servidor;

import java.util.Scanner;

public class ProbarPaquete {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String ipDestino;
        String ipOrigen;
        String mensaje;
        int numPaquetes;

        System.out.println("Escribe el mensaje");
        mensaje= teclado.nextLine();
        System.out.println("Escribe la ip de destino");
        ipDestino= teclado.nextLine();
        System.out.println("Escribe la ip de origen");
        ipOrigen= teclado.nextLine();

        int longitud= mensaje.length();

        if (mensaje.length()%20==0){
            numPaquetes= mensaje.length()/20;
        }else {
            numPaquetes= mensaje.length()/20+1;
        }
        Paquete[] paquetes = new Paquete[numPaquetes];
        for (int i=0;i<numPaquetes;i++){
            int posicioninicial= i*20;
           Paquete p1= new Paquete(ipOrigen,ipDestino,numPaquetes);
            paquetes[i]= p1;
            if (mensaje.length()%20 !=0 && i== (paquetes.length-1)){
              p1.setMensaje(mensaje.substring(posicioninicial));
              break;

            }
p1.setMensaje(mensaje.substring(posicioninicial,posicioninicial + 20));
        }
for(Paquete elemento: paquetes){
    System.out.println(elemento);
}
        Servidor s1= new Servidor();
        System.out.println(s1.leerPaquetes(paquetes));
        System.out.println(s1.VerificarPaquetes(paquetes));

}
    }







