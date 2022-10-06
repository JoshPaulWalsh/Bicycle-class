public class Driver {
    public static void main(String args[]) {
        Bicycle carBicycle = new Bicycle();
        carBicycle.getNumPedals();
        carBicycle.setNumWheels(4);
        Bicycle tricycle = new Bicycle();
        System.out.println(tricycle.getNumPedals());
    }
}
