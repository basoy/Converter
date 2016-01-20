package com.bash.serg.converters;

import org.springframework.stereotype.Component;

/**
 * Created by Serg Bash on 18.01.2016.
 */
@Component("funky")
public class FunkyCaseConverter implements Converter {

    @Override
    public String convert(String inputText){
        if(inputText != null){
            return toFunkyCase(inputText);
        }
        else {
            return "Convert of null imposible! ";
        }
    }

    public String toFunkyCase(String inputText) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < inputText.length(); i++) {
            if (i % 2 == 0) {
                res.append(Character.toUpperCase(inputText.charAt(i)));
            } else {
                res.append(Character.toLowerCase(inputText.charAt(i)));
            }
        }
        return res.toString();
    }
}
