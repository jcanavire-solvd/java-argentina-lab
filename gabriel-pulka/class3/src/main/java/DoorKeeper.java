public class DoorKeeper extends Staff {

    final static Integer quantityOfDoorKeepersAllowed = 1;
    private static Integer quantityOfDoorKeepers;

    static
    {
        quantityOfDoorKeepers=0;
    }

    private DoorKeeper(String nombre, String apellido, Integer cargoId, Integer idNumber, Integer cuilNumber) {
        super(nombre, apellido, cargoId, idNumber, cuilNumber);
    }

    public static DoorKeeper getDoorKeeper(String nombre, String apellido, Integer cargoId, Integer idNumber, Integer cuilNumber){
        quantityOfDoorKeepers ++;
        if (quantityOfDoorKeepers > quantityOfDoorKeepersAllowed){
            System.out.println("Too many door keepers!");
            return null;
        }else{
            return new DoorKeeper(nombre, apellido, cargoId, idNumber, cuilNumber);
        }
    }

    @Override
    public void work(String work) {
        System.out.println(work);
    }


}
