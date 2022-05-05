package Week9;

import java.awt.event.*; //For Event
import java.awt.*;
import javax.swing.*; //For Swing

public class HWJButtonTest implements ActionListener {
    JFrame jf;
    Container c;
    JPanel jp;
    JLabel jl;
    JButton jb;

    public HWJButtonTest(String msg) {
        // Frame 생성
        jf = new JFrame(msg);
        jf.setTitle("JButton Event : SSK");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();

        // Label과 Button 생성하여 패널에 추가
        jl = new JLabel("Click JButton to see Image");
        jb = new JButton("See Image!!");

        // JButton에 대하여 Event Listener 등록 : 클릭에 대한 Event를 받을 준비
        jb.addActionListener(this);
        jp = new JPanel();
        jp.add(jl);
        jp.add(jb);
        c.add(jp);

        // JFrame에 Panel을 부착
        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    // ActionListener 내에 정의된 메소드에 대해서 Implements를 함
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if (source.getText().equals("Good Luck")) {
            jl.setIcon(null);
            jl.setText("Click JButton to see Image");
            jb.setText("See Image!!");
        } else {
            ImageIcon dog = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\dog.png");
            jl.setIcon(dog);
            jl.setText("Dog Joji");
            jb.setText("Good Luck");
        }
    }
}