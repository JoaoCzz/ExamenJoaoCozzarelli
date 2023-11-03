package com.corenetworks.Modelo;

public class Pregunta2 {
    private String IpOrigen;
    private String ipDestino;
    private String mensaje;
    private int[] ContadordePaquetes;

    public Pregunta2() {
    }

    public Pregunta2(String ipOrigen, String ipDestino, String mensaje, int[] contadordePaquetes) {
        IpOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.mensaje = mensaje;
        ContadordePaquetes = contadordePaquetes;
    }

    public String getIpOrigen() {
        return IpOrigen;
    }

    public void setIpOrigen(String ipOrigen) {
        IpOrigen = ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int[] getContadordePaquetes() {
        return ContadordePaquetes;
    }

    public void setContadordePaquetes(int[] contadordePaquetes) {
        ContadordePaquetes = contadordePaquetes;
    }
}


