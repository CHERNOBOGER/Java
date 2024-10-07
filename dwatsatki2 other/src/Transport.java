
abstract class transport {
    public abstract void move();
}

class Car extends transport {
    @Override
    public void move() {
        System.out.println("Машина едет по дороге.");
    }
}

class Bike extends transport {
    @Override
    public void move() {
        System.out.println("Велосипед едет по дороге.");
    }
}

public class Transport {
    public static void main(String[] args) {
        transport car = new Car();
        transport bike = new Bike();

        car.move();
        bike.move();
    }
}