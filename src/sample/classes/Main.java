package sample.classes;

/**
 * Created by Serg Bash on 18.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        //ConsoleTextProvider ctp = new ConsoleTextProvider();
        //ctp.putText();
        FunkyCaseConverter fcc = new FunkyCaseConverter();
        fcc.setInputText("abbateens");
        System.out.println(fcc.convert());
    }
}
