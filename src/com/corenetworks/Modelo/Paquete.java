package com.corenetworks.Modelo;

public class Paquete {
    private String IpOrigen;
    private String ipDestino;
    private String mensaje;
    private int ContadordePaquetes;


    public Paquete() {

    }

    @Override
    public String toString() {
        return "Pregunta2{" +
                "IpOrigen='" + IpOrigen + '\'' +
                ", ipDestino='" + ipDestino + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", ContadordePaquetes=" + ContadordePaquetes +
                '}';
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

    public int getContadordePaquetes() {
        return ContadordePaquetes;
    }

    public void setContadordePaquetes(int contadordePaquetes) {
        ContadordePaquetes = contadordePaquetes;
    }

    public Paquete(String ipOrigen, String ipDestino, int contadordePaquetes) {
        IpOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        ContadordePaquetes = contadordePaquetes;
    }
}


