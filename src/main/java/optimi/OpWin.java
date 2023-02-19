package optimi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OpWin {
    private static JFrame frame = new JFrame();
    public static OpWin createFrame(String title, int width, int height) {
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return this;
    }
    public static OpWin createFrame(String title, int width, int height, Image icon) {
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon);
        return this;
    }
    
    public OpWin setLayout(Layout Layout) {
        frame.setLayout(layout);
        return this;
    }
    public static OpWin moveComp(Component component, int x, int y) {
        component.setLocation(component.getX() + x, component.getY() + y);
        return this;
    }
    public static JButton createButton(String text, int x, int y, int x_size, int y_size, ActionListener event) {
        JButton button = new JButton(text);
        button.setBounds(x, y, x_size, y_size);
        button.addActionListener(event);
        return button;
    }
    public static JButton createButton(ImageIcon image, int x, int y, int x_size, int y_size, ActionListener event) {
        JButton button = new JButton(image);
        button.setBounds(x, y, x_size, y_size);
        button.addActionListener(event);
        return button;
    }
    public static JLabel createLabel(String text, int x, int y, int x_size, int y_size) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, x_size, y_size);
        return label;
    }
}
