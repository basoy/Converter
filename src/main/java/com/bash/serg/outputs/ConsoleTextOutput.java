package com.bash.serg.outputs;

import com.bash.serg.converters.FunkyCaseConverter;
import com.bash.serg.inputs.ConsoleTextProvider;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by Serg Bash on 18.01.2016.
 */
@Component
public class  ConsoleTextOutput implements TextOutput {

    @Override
    public void showText(String outputText) {
        System.out.println(outputText);
    }


}
