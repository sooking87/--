package Week6;

public class ButtonTestMain {
    public static void main(String[] args) {
        new ButtonTestwithFrame();
        new ButtonTestwithFrame("초기화된 Button Frame");

        new ButtonTestnoextendsFrame();
        new ButtonTestnoextendsFrame("상속하지 않은 Button Frame");
    }
}
