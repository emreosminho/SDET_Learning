public class CarMain {
    public static void main(String[] args){
        Car audi = new Car();
        audi.model = "Audi A3";
        audi.speed = 10;
        audi.hizlanma(50);
        audi.hizlanma(60);
        audi.hizlanma(59);
        audi.printSpeed();


        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.printSpeed();


        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        mercedes.printSpeed();



    }
}
