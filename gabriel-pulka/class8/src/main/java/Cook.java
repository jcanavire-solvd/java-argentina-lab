public class Cook extends Staff {


    public Cook(String Name, String lastName, Integer jobId, Integer idNumber, Integer cuilNumber) {
        super(Name, lastName, jobId, idNumber, cuilNumber);
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }

    public void prepareFood(KitchenMenu kitchenMenu){
        System.out.println("Today: " + kitchenMenu.name() + ". Will be ready in " + kitchenMenu.getMinutes() + " minutes");
    }

    @Override
    public String toString() {
        return  "Cook " + getName() + " " + getLastName();

    }
}
