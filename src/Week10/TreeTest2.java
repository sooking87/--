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
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        ImageIcon leafIcon = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\leafFile.png");
        leafIcon = imageSetSize(leafIcon, 15, 20);
        renderer.setLeafIcon(leafIcon);

        ImageIcon ClosedIcon = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\closedFolder.png");
        ClosedIcon = imageSetSize(ClosedIcon, 20, 20);
        renderer.setClosedIcon(ClosedIcon);

        ImageIcon OpenIcon = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\openFolder.png");
        OpenIcon = imageSetSize(OpenIcon, 20, 20);
        renderer.setOpenIcon(OpenIcon);

        tree.setCellRenderer(renderer);
        tree.setEditable(true);

        jf.getContentPane().add(tree);
        jf.setSize(500, 500);
        jf.setVisible(true);

    }

    ImageIcon imageSetSize(ImageIcon icon, int width, int height) {
        Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
        Image yimg = ximg.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        // 이미지 화질 유지를 하면서 크기를 조절할 수 있는 메소드 getScaledInstance
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }
}
