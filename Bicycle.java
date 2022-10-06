class Bicycle {
    private int wheels = 2;
    private boolean stopped = true;
    private int numPedals = 2;

    public Bicycle() { }

    public Bicycle(int amountWheels) {
        wheels = amountWheels;
    }

    public Bicycle(int amountWheels, boolean isStopped) {
        wheels = amountWheels;
        stopped = isStopped;
    }

    public Bicycle(int amountWheels, boolean isStopped, int amountOfPedals) {
        wheels = amountWheels;
        stopped = isStopped;
        numPedals = amountOfPedals;
    }

    public void setNumPedals(int newNumPedals){
        numPedals = newNumPedals;
        if (numPedals == 0) {stopped = true;}
    }

    public void setNumWheels(int newNumWheels){
        wheels = newNumWheels;
        if (numPedals == 0) {stopped = true;}
    }

    public int getNumPedals() {
        return numPedals;
    }

    public void x(int amountWheels, boolean isStopped, int amountPedals) {
        System.out.print(amountWheels);
        System.out.print(isStopped);
        System.out.print(amountPedals);
    }

    public void braking() {
        stopped = true;
    }
}