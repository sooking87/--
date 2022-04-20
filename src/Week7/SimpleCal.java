package Week7;

import java.awt.*;

public class SimpleCal {

    Frame f;
    Panel display, board;
    TextField tf;

    public SimpleCal() {
        f = new Frame("Simple Cal : SSK");
        f.setLayout(new BorderLayout());

        display = new Panel();
        board = new Panel();

        tf = new TextField(80);
        display.add(tf);

        // 키보드 구성
        board.setLayout(new GridLayout(5, 4));
        board.add(new Button("C"));
        board.add(new Button("%"));
        board.add(new Button("del"));
        board.add(new Button("/"));

        board.add(new Button("7"));
        board.add(new Button("8"));
        board.add(new Button("9"));
        board.add(new Button("*"));

        board.add(new Button("4"));
        board.add(new Button("5"));
        board.add(new Button("6"));
        board.add(new Button("+"));

        board.add(new Button("1"));
        board.add(new Button("2"));
        board.add(new Button("3"));
        board.add(new Button("-"));

        board.add(new Button("0"));
        board.add(new Button("."));
        board.add(new Button("+/-"));
        board.add(new Button("="));

        f.add(display, "North");
        f.add(board);

        f.setSize(600, 500);
        f.setVisible(true);
    }
}
