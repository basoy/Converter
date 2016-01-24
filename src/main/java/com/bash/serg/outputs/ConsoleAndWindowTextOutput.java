package com.bash.serg.outputs;

import com.bash.serg.converters.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by serega on 20.01.2016.
 */
@Component("consoleAndWindow")
public class ConsoleAndWindowTextOutput implements TextOutput {

    @Autowired
    @Named("consoleOut")
    private TextOutput consoleTextOutput;
    @Autowired
    @Named("windowOut")
    private TextOutput windowTextOutput;
    @Autowired
    @Named("funky")
    private Converter funkyCaseConverter;

    @Override
    public void showText(String outputText) {
        consoleTextOutput.showText(funkyCaseConverter.convert(outputText));
        windowTextOutput.showText(funkyCaseConverter.convert(outputText));
    }
}
