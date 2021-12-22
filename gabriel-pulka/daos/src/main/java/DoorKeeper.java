public class DoorKeeper extends Staff {

    final static Integer quantityOfDoorKeepersAllowed = 4;
    private static Integer quantityOfDoorKeepers;

    static
    {
        quantityOfDoorKeepers=0;
    }

    private DoorKeeper(String name, String lastName, Integer jobId, Integer idNumber, Integer cuilNumber) {
        super(name, lastName, jobId, idNumber, cuilNumber);
    }

    public static DoorKeeper getDoorKeeper(String name, String lastName, Integer jobId, Integer idNumber, Integer cuilNumber) throws CountDoorKeepersException {
        quantityOfDoorKeepers ++;
        if (quantityOfDoorKeepers > quantityOfDoorKeepersAllowed){
            throw new CountDoorKeepersException("too many doorkeepers");
            //return null;
        }else{
            return new DoorKeeper(name, lastName, jobId, idNumber, cuilNumber);
        }
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }

    @Override
    public String toString() {
        return getName() + " " + getLastName();
    }
}
