package methoddoverriding23;
//java program to illustrate the use of java Method Overriding
//Creating a parent class,
 class Vehicle {
    //defining a method
    public void run() {
        System.out.println("Vehicle is running");
    }

    //creating a child class
    static class Bike2 extends Vehicle {
        //DEFINING the sAME method as in parent class
        public void run() {
            System.out.println("Bike is running safely");
        }

        public static void main(String args[]) {
            Bike2 obj = new Bike2();
            obj.run();
        }
    }
}

