public abstract class Staff extends Persona{

    private Integer jobId;

    public Staff(String name, String lastName, Integer jobId, Integer idNumber, Integer cuilNumber) {
        setJobId(jobId);
        setName(name);
        setLastName(lastName);
        setIdNumber(idNumber, cuilNumber);
    }

    public abstract void work(String work);

    public final Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(Object o) {
        Staff staff = (Staff) o;
        return getName().equals(staff.getName()) && getLastName().equals(staff.getLastName()) && getJobId().equals(staff.getJobId()) ;
    }
}
