class Car {
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(Car c){
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);
        System.out.println("c1의 color는 " + c1.color+ ", gearType은 "
                + c1.gearType + ", door의 개수는 "+ c1.door + "이다.");
        System.out.println("c2의 color는 " + c2.color+ ", gearType은 "
                + c2.gearType + ", door의 개수는 "+ c2.door + "이다.");

        c1.door = 100;

        System.out.println("c1의 color는 " + c1.color+ ", gearType은 "
                + c1.gearType + ", door의 개수는 "+ c1.door + "이다.");
        System.out.println("c2의 color는 " + c2.color+ ", gearType은 "
                + c2.gearType + ", door의 개수는 "+ c2.door + "이다.");
    }
}
