package sample.classes;

import sample.interfaces.TextProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg Bash on 18.01.2016.
 */
public class ConsoleTextProvider implements TextProvider{
    @Override
    public void putText() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.print("Enter Some Text ('x' to exit):");
                String str = br.readLine();
                UpperCaseConverter ucc = new UpperCaseConverter();
                ConsoleTextOutput cto = new ConsoleTextOutput();
               // cto.getText(ucc.convert(str));

                if ("x".equalsIgnoreCase(str)) {
                    System.out.println("Bye!");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
