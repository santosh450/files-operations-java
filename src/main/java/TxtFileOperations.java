
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class TxtFileOperations {

    InputStream inputStream=null;
    BufferedReader bufferedReader=null;
    BufferedReader intialize (String inputFile) {
        try {
            System.out.println("1---------");
            inputStream = getClass().getResourceAsStream(inputFile);
            System.out.println("2---------");
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println("3---------");
            return bufferedReader;
        }catch(Exception e) {
                throw new RuntimeException(e.getMessage());
            }
    }

    void close(){
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

     void  readTextFileLineByLine(String inputFile) {
             bufferedReader =intialize(inputFile);
         String contents = bufferedReader.lines()
                .collect(Collectors.joining(System.lineSeparator()));
         System.out.println("All lines: ");
        System.out.println(contents);
         close();
    }

    void  readTNthLine(String inputFile, int lineNum)  {
        bufferedReader =intialize(inputFile);
        List<String> data = bufferedReader.lines().collect(Collectors.toList());
        System.out.println(lineNum+" line: ");
        System.out.println(data.get(lineNum-1));
        close();
    }

    void  read1stLine(String inputFile) {
        readTNthLine(inputFile, 1);
    }
    void  readLastLine(String inputFile) {
        bufferedReader =intialize(inputFile);
        List<String> data = bufferedReader.lines().collect(Collectors.toList());
        System.out.println("Last line: ");
        System.out.println(data.get(data.size()-1));
        close();
    }
}
