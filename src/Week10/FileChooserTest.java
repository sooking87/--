package Week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FileChooserTest extends JFrame implements ActionListener {
    JButton openBtn = new JButton("File Open!");
    JButton saveBtn = new JButton("File save!");
    JFileChooser fileChooser = new JFileChooser();
    JPanel fcPanel = new JPanel();
    JLabel pathLabel = new JLabel("선택한 파일의 경로 보여주기");

    public FileChooserTest() {
        setTitle("File Chooser Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // 버튼에 이벤트 리스너 등록
        openBtn.addActionListener(this);
        saveBtn.addActionListener(this);

        // openBtn, saveBtn, pathLabel을 패널에 붙힙니다.
        fcPanel.add(openBtn);
        fcPanel.add(saveBtn);
        fcPanel.add(pathLabel);

        add(fcPanel, BorderLayout.NORTH);
        add(fileChooser, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int returnValue;

        // openBtn 클릭
        if (e.getSource() == openBtn) {
            returnValue = fileChooser.showOpenDialog(this);
            String path = fileChooser.getSelectedFile().getPath();

            // open 버튼을 눌렀다면
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                pathLabel.setText(path);
            } else { // cancel 버튼을 눌렀다면
                pathLabel.setText("선택한 파일이 없습니다.");
            }
        } else if (e.getSource() == saveBtn) { // saveBtn 버튼을 눌렀다면
            returnValue = fileChooser.showSaveDialog(this);

            if (returnValue == JFileChooser.APPROVE_OPTION) { // save 버튼을 눌렀다면
                pathLabel.setText("선택한 파일을 저장합니다. ");
            } else { // cancel 버튼을 눌렀다면
                pathLabel.setText("선택한 파일이 없습니다.");
            }
        }

    }
}
