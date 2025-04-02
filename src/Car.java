class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;


    Car(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;
    }

    void hizlanma(int hizHesap){
        if ((speed + hizHesap) < speedLimit){
            this.speed += hizHesap;
        }
    }

    void printSpeed(){
        System.out.println(model + " Hızı: " + speed);
    }

    void printInfo(){
        System.out.println("Model : " + this.model);
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type);
        System.out.println("Speed : " + this.speed);
    }

}
