package Week4;

public class HumanTest2 {
    public static void main(String[] args) {
        Human Sohn = new Student2();
        Human Yoon = new Professor();
        Human Kim = new Manager();
        Human Choi = new Manager();

        if (Sohn instanceof Human) {
            System.out.println("Sohn은 Human 타입입니다.");
        }
        if (Sohn instanceof Student2) {
            System.out.println("Sohn은 Student 타입입니다.");
        }
        if (Sohn instanceof Professor) {
            System.out.println("Sohn은 Professor 타입입니다. ");
        }
        if (Sohn instanceof Manager) {
            System.out.println("Sohn은 Manager 타입입니다. ");
        }

    }
}
