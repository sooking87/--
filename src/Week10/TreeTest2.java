package Week10;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class TreeTest2 {
    public TreeTest2(String msg) {
        // 프레임 생성
        JFrame jf = new JFrame(msg);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tree Node 생성
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("ROOT");
        DefaultMutableTreeNode parent = new DefaultMutableTreeNode("PARENT");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("CHILD1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("CHILD2");

        // hierachy 구성
        parent.add(child1);
        parent.add(child2);
        root.add(parent);

        // Tree 생성
        JTree tree = new JTree(root);

        // ImageICon 추가
        DefaultTreeCellRenderer render = new DefaultTreeCellRenderer();
        render.setLeafIcon(new ImageIcon("Document.git"));
        jf.getContentPane().add(tree);
        jf.setSize(500, 500);
        jf.setVisible(true);

    }
}
