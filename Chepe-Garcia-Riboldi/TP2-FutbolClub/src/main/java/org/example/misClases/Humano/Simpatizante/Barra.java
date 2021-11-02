package org.example.misClases.Humano.Simpatizante;

import org.example.misClases.Humano.Hincha;

public class Barra extends Hincha {
    private String precedes;
    private int DangerLevel;


    public Barra(String name, int id, String address, String fanaticism, String preced, int DangLevel) {
        super(name, id, address, fanaticism);
        this.precedes=preced;
        this.DangerLevel=DangLevel;

    }

    public String getPrecedes() {
        return precedes;

    }

    public void setPrecedes(String precedes) {
        this.precedes = precedes;
    }

    public int getDangerLevel() {
        return DangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        DangerLevel = dangerLevel;
    }
}

