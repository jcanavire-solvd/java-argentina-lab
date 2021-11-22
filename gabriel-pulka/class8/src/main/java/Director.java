public final class Director extends Staff {


    public Director(String name, String lastName, Integer jobId, Integer idNumber, Integer cuilNumber) {
        super(name, lastName, jobId, idNumber, cuilNumber);
    }

    @Override
    public String toString() {
        return "Director " + getName() + " " + getJobId();
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }
}
