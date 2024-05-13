package Task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Task4 {
    public void doTask(){
        try{
            Path path = Paths.get("test.txt");

            InputStream inputStream = Files.newInputStream(
                    path,
                    StandardOpenOption.READ
            );

            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream)
            );

            String line;
            while((line = bufferedReader.readLine()) != null){
                if(line.length() > 5){
                    throw new RuntimeException("Failure");
                }
            }
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
