package Task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileManager {
    public void doTask(){
        try{
            Path path = Paths.get("test.txt");

            InputStream inputStream = Files.newInputStream(
                    path,
                    StandardOpenOption.READ
            );

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String longest = bufferedReader.readLine();

            String line;
            while((line = bufferedReader.readLine()) != null){
                if(longest.length() < line.length()){
                    longest = line;
                }
            }

            bufferedReader.close();


            OutputStream outputStream = Files.newOutputStream(
                    path,
                    StandardOpenOption.APPEND
            );

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

            bufferedWriter.write(longest + "\n");

            bufferedWriter.close();

            System.out.println(longest);

        }
        catch(IOException e){
            throw new RuntimeException(e);
        }


    }
}
