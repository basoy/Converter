package com.bash.serg.outputs;

import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * Created by serega on 20.01.2016.
 */
@Component("windowOut")
public class WindowTextOutput implements TextOutput {
    @Override
    public void showText(String outputText) {
        JFrame frame = new JFrame("Convertor v1.0");
        JOptionPane.showMessageDialog(frame, outputText);
        System.exit(0);
    }
}
