package Task4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            Task4 task = new Task4();
            task.doTask();
            System.out.println("Done");
        }
        catch (RuntimeException e){
            System.out.println("Failure");
        }
    }
}
