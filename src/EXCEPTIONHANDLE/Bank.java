package EXCEPTIONHANDLE;

public class Bank {
    public static void main(String[] args) {
        Account hong = new Account("홍길동");
        hong.deposit(20);
        try {
            // 1st-1 try: normal
            hong.withdraw(15);
            // hong.deposit(-20);
            // 2nd try: abnormal
            // hong.withdraw(-50); //BalanceOutOfBoundsException 예외 발생
        } catch (BalanceOutOfBoundsException be) {
            be.printStackTrace();
        } catch (MalformedData me) {
            me.printStackTrace();
        }
        hong.check();
        // 1st try: abnormal
        // hong.withdraw(1); //BalanceOutOfBoundsException 예외 발생
        // 2nd try-catch
        try {
            hong.withdraw(10);
            // BalanceOutOfBoundsException 예외 발생
        } catch (BalanceOutOfBoundsException be) {
            be.printStackTrace();
        }
        System.out.println("normal termination");
    }
}
