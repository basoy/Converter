package sample.classes;

import sample.interfaces.Converter;

/**
 * Created by Serg Bash on 18.01.2016.
 */
public class UpperCaseConverter implements Converter {

   private String inputText;

    @Override
    public String convert(){
        if(getInputText() == null){
            return "Convert of null imposible! ";
        }
        return toUpperCase();
    }

    public String toUpperCase() {
        StringBuilder res = new StringBuilder();
        res.append(getInputText().toUpperCase());
        return res.toString();
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }
}
