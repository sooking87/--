package Week10;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class TreeTest1 {
    JFrame jf;

    /* DefaultMutableTreeNode : 각 노드를 트리의 데이터로 표현하기 위해 사용 */
    DefaultMutableTreeNode jcomponent;
    DefaultMutableTreeNode jpanel;
    DefaultMutableTreeNode jtextcomponent;
    DefaultMutableTreeNode jtree;
    DefaultMutableTreeNode jtextarea;
    DefaultMutableTreeNode jtextfield;
    /* ----------------- */

    JTree tree;
    JScrollPane sp;

    public TreeTest1(String msg) {
        // 컨테이너 생성
        jf = new JFrame(msg);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 트리에 데이터 표현을 위한 노드 데이터 생성
        jcomponent = new DefaultMutableTreeNode("JComponent");
        jpanel = new DefaultMutableTreeNode("JPanel");
        jtextcomponent = new DefaultMutableTreeNode("JTextComopnent");
        jtree = new DefaultMutableTreeNode("JTree");

        // jcomponent : 부모 노드
        // jpanel, jtextcomponent, jtree : 자식 노드
        jcomponent.add(jpanel);
        jcomponent.add(jtextcomponent);
        jcomponent.add(jtree);

        // 트리에 데이터 표현을 위한 노드 데이터 생성
        jtextarea = new DefaultMutableTreeNode("JTextArea");
        jtextfield = new DefaultMutableTreeNode("JTextField");

        // jtextcomponent : 자식 트리의 부모 노드
        // jtextarea, jtextfield : 자식 트리의 자식 노드
        jtextcomponent.add(jtextarea);
        jtextcomponent.add(jtextfield);

        // 최상위 부모 노드(jcomponent)를 tree 객체에 붙힙니다.
        tree = new JTree(jcomponent);
        sp = new JScrollPane(tree);

        jf.getContentPane().add(sp, BorderLayout.CENTER);
        jf.setSize(300, 200);
        jf.setVisible(true);
    }

}
