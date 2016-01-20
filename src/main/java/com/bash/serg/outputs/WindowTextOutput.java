package com.bash.serg.outputs;

import javax.swing.*;

/**
 * Created by serega on 20.01.2016.
 */
public class WindowTextOutput implements TextOutput {
    @Override
    public void showText(String outputText) {
        JFrame frame = new JFrame("Convertor v1.0");
        JOptionPane.showMessageDialog(frame, outputText);
        System.exit(0);
    }
}
