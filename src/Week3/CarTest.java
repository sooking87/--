package Week3;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("blue", 60);
        Car car2 = new Car();
        Car car3 = new Car("white", 120);
        Car car4 = new Car("black", 40);

        car1.speedUp(100);
        car1.changeColor("black");
        car1.showCarInfo("car1");

        car2.setColor("red");
        car2.setSpeed(80);
        car2.showCarInfo("car2");

        car3.speedUp(200);
        car3.showCarInfo("car3");

        car4.speedDown(-10);
        car4.showCarInfo("car4");

    }
}
