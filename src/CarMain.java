public class CarMain {
    public static void main(String[] args){
        Car audi = new Car("Audi", 179, "Siyah");
        audi.printInfo();

        System.out.println("=====================");

        Car bmw = new Car("BWM", 180,"Mavi");
        bmw.printInfo();


        /* Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.printSpeed();


        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        mercedes.printSpeed(); */



    }
}
