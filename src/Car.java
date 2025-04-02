class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    void hizlanma(int hizHesap){
        if ((speed + hizHesap) < speedLimit){
            speed += hizHesap;
        }
    }

    void printSpeed(){
        System.out.println(model + " Hızı: " + speed);
    }

}
