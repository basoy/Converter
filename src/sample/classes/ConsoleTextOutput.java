package sample.classes;

import sample.interfaces.TextOutput;

/**
 * Created by Serg Bash on 18.01.2016.
 */
public class ConsoleTextOutput implements TextOutput {

    @Override
    public void getText(String outputText) {
        System.out.println(outputText);
    }
}
