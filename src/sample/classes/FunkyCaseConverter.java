package sample.classes;

import sample.interfaces.Converter;

/**
 * Created by Serg Bash on 18.01.2016.
 */
public class FunkyCaseConverter implements Converter{

    private String inputText;

    @Override
    public String convert(){
        if(getInputText() != null){
            toFunkyCase();
        }
        else {
            return "Convert of null imposible! ";
        }
        return toFunkyCase();
    }

    public String toFunkyCase() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < getInputText().length(); i++) {
            if (i % 2 == 0) {
                res.append(Character.toUpperCase(getInputText().charAt(i)));
            } else {
                res.append(getInputText().charAt(i));
            }
        }
        return res.toString();
    }
    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }
}
