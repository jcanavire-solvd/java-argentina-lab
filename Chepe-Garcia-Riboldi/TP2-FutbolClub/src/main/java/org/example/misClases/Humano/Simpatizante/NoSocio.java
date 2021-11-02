package org.example.misClases.Humano.Simpatizante;

import org.example.misClases.Humano.Hincha;

public class NoSocio extends Hincha {
    private String requestStatus;
    private boolean aptToBeAffiliate;


    public NoSocio(String name, int id, String address, String fanaticism, String reqStatus, boolean apt){
        super(name, id, address, fanaticism);
        this.requestStatus=reqStatus;
        this.aptToBeAffiliate=apt;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public boolean isAptToBeAffiliate() {
        return aptToBeAffiliate;
    }

    public void setAptToBeAffiliate(boolean aptToBeAffiliate) {
        this.aptToBeAffiliate = aptToBeAffiliate;
    }
}

