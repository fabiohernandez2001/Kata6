package toys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewMain {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        SerialNumberGenerator sng= new SerialNumberGenerator();
        while (true) {
            String command=br.readLine();
            if(command.equals("exit"))break;
            if(command.equals("next"))System.out.println(sng.next());
        }
    }

}
