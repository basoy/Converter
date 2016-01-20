package com.bash.serg.inputs;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg Bash on 18.01.2016.
 */
@Component("consoleIn")
public class ConsoleTextProvider implements TextProvider {

    @Override
    public String putText(){
        BufferedReader br;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        }
        catch(IOException e){
          e.printStackTrace();
        }
         return  null;
    }
}
