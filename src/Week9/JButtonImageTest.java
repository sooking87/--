package Week9;

import java.awt.event.*; //For Event
import javax.swing.*; //For Swing

public class JButtonImageTest implements ActionListener {
    JFrame jf;
    JPanel jp;
    JLabel jl;
    JButton jb;

    public JButtonImageTest(String msg) {
        // Frame 생성
        jf = new JFrame(msg);
        jf.setTitle("JButton Event : SSK");
        jf.setSize(500, 500);

        // Label과 Button 생성하여 패널에 추가
        jl = new JLabel("Click JButton to see Image");
        jb = new JButton("See Image!!");

        // JButton에 대하여 Event Listener 등록 : 클릭에 대한 Event를 받을 준비
        jb.addActionListener(this);
        jp = new JPanel();
        jp.add(jl);
        jp.add(jb);

        // JFrame에 Panel을 부착
        jf.add(jp);
        jf.setVisible(true);
    }

    // ActionListener 내에 정의된 메소드에 대해서 Implements를 함
    @Override
    public void actionPerformed(ActionEvent e) {
        ImageIcon dog = new ImageIcon("../Images/dog.png");
        System.out.println(dog);
        jl.setIcon(dog);
        jl.setText("Dog Joji");
        jb.setText("Good Luck");
    }

}