package com.bash.serg.converters;

import org.springframework.stereotype.Component;

/**
 * Created by Serg Bash on 18.01.2016.
 */
@Component("upper")
public class UpperCaseConverter implements Converter {

    @Override
    public String convert(String inputText){
        if(inputText == null){
            return "Convert of null imposible! ";
        }
        return toUpperCase(inputText);
    }

    public String toUpperCase(String inputText) {
        StringBuilder res = new StringBuilder();
        res.append(inputText.toUpperCase());
        return res.toString();
    }
}
