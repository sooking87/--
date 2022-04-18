package EXCEPTIONHANDLE;

public class MalformedData extends RuntimeException {
    public MalformedData() {
        super("데이터 포멧이 잘못되었습니다.");
    }
}