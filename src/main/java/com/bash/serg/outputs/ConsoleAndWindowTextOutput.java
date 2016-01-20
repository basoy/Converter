package com.bash.serg.outputs;

import com.bash.serg.converters.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by serega on 20.01.2016.
 */
@Component
public class ConsoleAndWindowTextOutput implements TextOutput {

    @Inject
    private TextOutput consoleTextOutput;
    @Inject
    private TextOutput windowTextOutput;
    @Inject
    private Converter funkyCaseConverter;

    @Override
    public void showText(String outputText) {
      getConsoleTextOutput().showText(getFuncyCaseConverter().convert(outputText));
      getWindowTextOutput().showText(getFuncyCaseConverter().convert(outputText));
    }

    public Converter getFuncyCaseConverter() {
        return funkyCaseConverter;
    }

    public void setFuncyCaseConverter(Converter funcyCaseConverter) {
        this.funkyCaseConverter = funcyCaseConverter;
    }

    public TextOutput getConsoleTextOutput() {
        return consoleTextOutput;
    }

    public void setConsoleTextOutput(TextOutput consoleTextOutput) {
        this.consoleTextOutput = consoleTextOutput;
    }

    public TextOutput getWindowTextOutput() {
        return windowTextOutput;
    }

    public void setWindowTextOutput(TextOutput windowTextOutput) {
        this.windowTextOutput = windowTextOutput;
    }
}
