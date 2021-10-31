package main.java.com.solvd.secondTaskTheHospitalClasses.models.Areas;

public class AreaCirugias extends AreasHospital {

    private String name;
    private String description;


    public AreaCirugias(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
