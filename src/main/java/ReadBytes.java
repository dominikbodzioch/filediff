import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadBytes {

    private File dirPath;
    private FileNameWithExt fileNameWithExt;

    public ReadBytes(File dirPath, FileNameWithExt fileNameWithExt) {
        this.dirPath = dirPath;
        this.fileNameWithExt = fileNameWithExt;
    }

    boolean isContentCoherentWithExt() throws IOException {

        Ext ext = fileNameWithExt.getfExt();
        Path path = Paths.get(pathSelector());
        byte[] data = Files.readAllBytes(path);

        int numOfBytesRequired = amountOfNumbers(ext);

        String contentHead = "";
        String contentPattern = getPatternCorrespondingToExt(ext);
        if (ext.getExt().equals("txt")){
            return true;
        }
        if (data.length >= numOfBytesRequired){
            contentHead = convertToHexBytesOf(numOfBytesRequired,data).trim();
        }

        return contentHead.equals(contentPattern);
    }

    private String convertToHexBytesOf(int numOfBytes, byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numOfBytes; i++) {
            sb.append(String.format("%02X ", bytes[i]));
        }
        return sb.toString();
    }

    private String pathSelector() {
        String ps = dirPath + "/" + fileNameWithExt.getfName().getFileName() + "." + fileNameWithExt.getfExt().getExt();
        return ps;
    }

    private String getPatternCorrespondingToExt(Ext ext) {    // maska autentyczności pliku
        String pattern = "";
        for (ExtWithNumbers e : MagicNumbersDB.magicDB) {
            if (e.getExt().equals(ext)) {
                return e.getNumbers().getNumbersStr();
            }
        }
        return pattern;
    }

    private int amountOfNumbers(Ext ext) {
        String numbers = getPatternCorrespondingToExt(ext);
        String[] n = numbers.split(" ");
        return n.length;
    }

}
