package com.corenetworks.Modelo;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Servidor {
    private String ip;
    public  String leerPaquetes(Paquete[] paquetes) {
        String variable= "";
        for (Paquete elemento: paquetes){
            variable+= elemento.getMensaje();
        }
        return variable;
    }
        public boolean VerificarPaquetes (Paquete[] paquetes){
        return paquetes.length== paquetes[1].getContadordePaquetes();
        }
}
