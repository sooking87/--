package Week3;

public class Car {
    String color;
    int speed;

    public Car() {

    }

    // Car클래스 생성자
    public Car(String col) {
        color = col;
        speed = 0;
    }

    // Car클래스 생성자
    public Car(int spe) {
        color = null;
        speed = spe;
    }

    // Car클래스 생성자
    public Car(String col, int spe) {
        color = col;
        speed = spe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedUp(int limit) {
        if (limit <= speed) {
            System.out.println("현재 속도는 희망 속도까지 올릴 수 없습니다.");
        } else {
            if (limit > 150) {
                System.out.println("너무 빠릅니다. 희망 속도를 다시 세팅해주세요.");
            } else {
                speed = limit;
                System.out.println("현재 속도를 " + speed + "까지 올립니다.");
            }
        }
    }

    public void speedDown(int limit) {
        if (limit >= speed) {
            System.out.println("현재 속도는 제한 속도까지 줄일 수 없습니다. ");
        } else {
            if (limit <= 0) {
                speed = 0;
                System.out.println("현재 차가 멈추었습니다.");
            } else {
                speed = limit;
                System.out.println("현재 속도를 " + speed + "까지 줄입니다.");
            }
        }
    }

    public void changeColor(String col) {
        color = col;
        System.out.println("차 색깔이 " + color + "로 바뀌었습니다. 축하드립니다.^^");
    }

    public void showCarInfo() {
        System.out.println("현재 차의 색깔은 " + color + "이며, 현재 속도는 " + speed + "입니다.");
    }

    public void showCarInfo(String carName) {
        System.out.println(carName + "의 색깔은 " + color + "이며, 현재 속도는 " + speed + "입니다.\n");
    }
}
