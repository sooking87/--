package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RepaintBottomPanel extends Order {
    boolean change;
    JPanel bottom;

    public RepaintBottomPanel(ListPanel li) {
        new BottomPanel(li);
    }

}
