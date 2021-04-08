package com.company;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
       if(hora < 0 || hora > 23){
            System.out.println("Hora incorrecta");
       }
       else{
            this.hora = hora;
            if(minutos < 0 || segundos > 59){
                System.out.println("Hora incorrecta");
            }else{
             this.minutos = minutos;
                if(minutos < 0 || segundos > 59){
                    System.out.println("Hora incorrecta");
                }
                else{
                    this.segundos = segundos;
                }
            }
        }
    }

    public Hora() {
       this.hora = 0;
       this.minutos = 0;
       this.segundos = 0;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void mostrarHora(){
        System.out.println(String.format("%02d:%02d:%02d", hora,minutos,segundos));
    }

    public Hora avanzarSegundo(){
        this.segundos++;
        if(this.segundos >= 60){
            this.segundos = 0;
            this.minutos++;
            if(this.minutos >= 60){
                this.minutos = 0;
                this.hora++;
                if(this.hora >= 24){
                    this.hora = 0;
                    this.minutos = 0;
                    this.segundos = 0;
                }
            }

        }
        return this;
    }

    public Hora retrocederSegundo(){
        this.segundos--;
        if(this.segundos <= 0){
            this.segundos = 59;
            this.minutos--;
            if(this.minutos <= 0){
                this.minutos = 59;
                this.hora--;
                if(this.hora <= 0){
                    this.hora = 23;
                    this.minutos = 59;
                    this.segundos = 59;
                }
            }

        }
        return this;
    }
}
