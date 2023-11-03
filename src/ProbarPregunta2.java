import com.corenetworks.Modelo.Pregunta2;

import java.util.Scanner;

public class ProbarPregunta2 {
    public static void main(String[] args) {
        Pregunta2 p2 = new Pregunta2();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la ip de Origen");
        p2.setIpDestino(teclado.nextLine());
        System.out.println("Escriba la ip de origen");
        p2.setIpDestino(teclado.nextLine());
        System.out.println("Escriba el mensaje");
        p2.setMensaje(teclado.nextLine());
        Math.round(p2.getMensaje().length());
        for (int i = 0; i < p2.getMensaje().length(); i++) {
            i++;
            char c = p2.getMensaje().charAt(i);
            System.out.println(c);

        }


}
    }







