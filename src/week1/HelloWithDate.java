package week1;

import java.util.Date;

public class HelloWithDate {

    public static void main(String[] args) {

        String msg = "Sohn SooKyoung";

        System.out.println("Hello Java!");
        System.out.println("Me is " + msg);

        Date date = new Date(); // new: 객체를 만드는 예약어, 객체 지향의 가장 중요한 생성자(construct)이다.

        System.out.println("Today: " + date); // 첫 시도 -> 에러가 발생했다.(err:cannot file symbol) -> Date 클래스는 자바에서 제공하는 것이므로
                                              // 불러와야 된다. -> import 사용
    }
}
