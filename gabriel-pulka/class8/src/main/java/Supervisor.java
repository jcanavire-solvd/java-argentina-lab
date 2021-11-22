public class Supervisor extends Staff {

    static
    {
        System.out.println("The first supervisor has arrived to School");
    }


    public Supervisor(String name, String lastName, Integer jobId, Integer idNumber, Integer cuilNumber) {
        super(name, lastName, jobId, idNumber, cuilNumber);
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }

    //this code will not work since this method is final in Staff class
    /*@Override
    public Integer getCargoId(){
        return -10;
    }*/
}
