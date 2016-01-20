package com.bash.serg;

import com.bash.serg.converters.Converter;
import com.bash.serg.converters.FunkyCaseConverter;
import com.bash.serg.inputs.ConsoleTextProvider;
import com.bash.serg.inputs.TextProvider;
import com.bash.serg.outputs.ConsoleAndWindowTextOutput;
import com.bash.serg.outputs.TextOutput;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

/**
 * Created by Serg Bash on 18.01.2016.
 */
@ComponentScan
public class Main{
    public static void main(String[] args) throws IOException {

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        TextProvider ctp = context.getBean(ConsoleTextProvider.class);
        Converter fcc = context.getBean(FunkyCaseConverter.class);
        TextOutput cawto = context.getBean(ConsoleAndWindowTextOutput.class);

        String inputString = ctp.putText();
        String convertedString = fcc.convert(inputString);
        cawto.showText(convertedString);

    }
}