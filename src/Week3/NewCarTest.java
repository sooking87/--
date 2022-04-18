package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewCarTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NewCar newcar = new NewCar("blue", 80);
        newcar.showCarInfo("newcar");

        // 차 속도를 바꾸기 위한 무한 루프
        while (true) {
            System.out.print("차의 희망 속도를 입력해주세요: ");
            int newSpeed = Integer.parseInt(br.readLine());
            // 속도가 0이거나 음수면 차를 정지시키고, 무한 루프를 나옵니다.
            if (newSpeed <= 0) {
                newcar.speedDown(0);
                break;
            }

            if (newSpeed < newcar.getSpeed()) { // 입력받은 새로운 속도가 현재 속도보다 작다면 속도를 낮추겠다는 의미입니다.
                newcar.speedDown(newSpeed);
            } else if (newSpeed > newcar.getSpeed()) { // 입력받은 새로운 속도가 현재 속도보다 크다면 속도를 높이겠다는 의미입니다.
                newcar.speedUp(newSpeed);
            } else { // 입력받은 새로운 속도가 현재 속도와 같다면, 속도를 유지하겠다는 의미입니다.
                System.out.println("속도를 유지합니다.");
            }
        }
        newcar.showCarInfo();

        System.out.print("차 색깔을 바꾸시겠습니까?(Y/N) ");
        String answer = br.readLine();

        // 차 색깔을 바꾸기 위한 조건문
        if (answer.compareTo("Y") == 0 || answer.compareTo("yes") == 0) {
            System.out.print("무슨 색깔로 바꾸시겠습니까? ");
            String newColor = br.readLine();
            newcar.changeColor(newColor);
            newcar.showCarInfo("newcar");
        }
        System.out.println("시스템을 종료합니다. ");
    }
}
