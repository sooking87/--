package Week3;

public class OldCar extends Car {
    public OldCar() {

    }

    public OldCar(String col) {
        color = col;
        speed = 0;
    }

    public OldCar(int spe) {
        color = null;
        speed = spe;
    }

    public OldCar(String col, int spe) {
        color = col;
        speed = spe;
    }

    @Override
    public void speedUp(int limit) {
        if (limit <= speed) {
            System.out.println("현재 속도는 희망 속도까지 올릴 수 없습니다.");
        } else {
            if (limit > 100) {
                System.out.println("너무 빠릅니다. 희망 속도를 다시 세팅해주세요.");
            } else {
                speed = limit;
                System.out.println("현재 속도는 " + speed + "입니다.");
            }
        }
    }
}
