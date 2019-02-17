import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FilesInDirectoryTest {

    @Test
    public void readNameTest() {

        File dirPath = new File("src/testFiles");
        FilesInDirectory filesInDirectory = new FilesInDirectory(dirPath);

        assertEquals("real_GIF", filesInDirectory.readName(new File("src/testFiles/real_GIF.gif")));
    }

    @Test
    public void readExtTest() {
        File dirPath = new File("src/testFiles");
        FilesInDirectory filesInDirectory = new FilesInDirectory(dirPath);

        assertEquals("gif", filesInDirectory.readExt(new File("src/testFiles/real_GIF.gif")));
    }
}