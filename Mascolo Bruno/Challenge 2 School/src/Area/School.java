package Area;

public class School {
    private String name;
    private String web;
    private int phone;

    public School(){}

    public School(String name, String web, int phone) {
        this.name = name;
        this.web = web;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
