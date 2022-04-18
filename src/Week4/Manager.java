package Week4;

public class Manager extends Human {
    int startWorkTime;
    int endWorkTime;

    public Manager() {
    }

    public Manager(String name, int age, int height, int startWorkTime, int endWorkTime) {
        this(name, age, height, "Manager", startWorkTime, endWorkTime);
    }

    public Manager(String name, int age, int height, String career, int startWorkTime, int endWorkTime) {
        super(name, age, height, career);
        this.startWorkTime = startWorkTime;
        this.endWorkTime = endWorkTime;
    }

    public void setStartAndEnd(int startWorkTime, int endWorkTime) {
        this.startWorkTime = startWorkTime;
        this.endWorkTime = endWorkTime;
    }

    public void printWorkTime() {
        System.out.println("근무 시간은 " + startWorkTime + "시부터 " + endWorkTime + "시까지 입니다.");
    }

    @Override
    public void showInfo() {
        System.out.print(name + "님의 나이는 " + age + "이고, 키는 " + height + "cm 입니다. 직업은 " + career + "입니다. ");
        printWorkTime();
        System.out.println();
    }
}
