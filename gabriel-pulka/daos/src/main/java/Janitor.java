public class Janitor extends Staff {


    public Janitor(String name, String lastName, Integer jobId, Integer idNumber, Integer cuilNumber) {
        super(name, lastName, jobId, idNumber, cuilNumber);
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }
}
