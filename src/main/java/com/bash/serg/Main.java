package com.bash.serg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Created by Serg Bash on 18.01.2016.
 */
@Configuration
@ComponentScan
public class Main{
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Controller controller = context.getBean(Controller.class);
        controller.initialize();
    }
}
