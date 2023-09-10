
import org.testng.annotations.Test;


public class TextFileOperationsTest {
    TxtFileOperations txtFileOperations = new TxtFileOperations();

    @Test(description = "Read text file data line by line")
    void test1() {
        txtFileOperations.readTextFileLineByLine("TextFiles/namesAndEmails.txt");
    }

    @Test(description = "Read 1st line in text file")
    void test2() {
        txtFileOperations.read1stLine("TextFiles/namesAndEmails.txt");
    }

    @Test(description = "Read last line in text file")
    void test3() {
        txtFileOperations.readLastLine("TextFiles/namesAndEmails.txt");
    }
}
