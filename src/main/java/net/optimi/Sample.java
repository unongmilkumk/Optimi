package net.optimi;

import javax.swing.*;

public class Sample {
    public static void main(String[] args) {
        CMD.print("--------------");
        CMD.print("OpWin Test Program");
        CMD.print("--------------");
        JFrame frame = OpWin.createFrame("Optimi", 700, 700);
        JButton button = OpWin.createButton(new ImageIcon(Optimi.resources + "Optimi.png"), 100, 100, 512, 512, e -> {});
        OpWin.addCompFrame(frame, button);
        OpWin.setIconFrame(frame, new ImageIcon(Optimi.resources + "Optimi.png").getImage());
        OpWin.activeFrame(frame);
    }
}