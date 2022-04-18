package week1;

class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer(); // StringBuffer 객체가 buf라는 변수로 만들어짐

        buf.append("Hello ");
        buf.append("Sohn Soo Kyoung");

        System.out.println(buf.toString()); // toString 메서드 : 연속적인 데이터 스트림을 보여주는 메서드

    }
}
