package Area;

import Personal.Accountant;
import Personal.Secretary;

public class Administration {
    private Accountant accountant;
    private Secretary secretary;
    private String area;

    public Administration (){}

    public Administration(Accountant accountant, Secretary secretary, String area) {
        this.accountant = accountant;
        this.secretary = secretary;
        this.area = area;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

