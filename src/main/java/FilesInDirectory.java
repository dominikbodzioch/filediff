import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilesInDirectory {

    private File dirPath;
    static List<FileNameWithExt> filesRegister = new ArrayList<>();

    FilesInDirectory(File dirPath) {
        this.dirPath = dirPath;
        fillRegister();
    }

    private void fillRegister() {
        File[] dirFiles = dirPath.listFiles();
        if (dirFiles != null || dirFiles.length > 0) {
            for (File file : dirFiles) {
                if (file.isFile()) {
                    filesRegister.add(new FileNameWithExt(new FileName(readName(file)), new Ext(readExt(file))));
                }
            }
        }
    }

    String readName(File fileWithRelPath) {
        String[] relativePath = fileWithRelPath.toString().substring(dirPath.toString().length() + 1).split("\\.", 2);
        return relativePath[0];
    }

    String readExt(File fileWithRelPath) {
        String[] relativePath = fileWithRelPath.toString().split("\\.", 2);
        return relativePath[1];
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FilesInDirectory{");
        sb.append("dirPath=").append(dirPath);
        sb.append('}');
        return sb.toString();
    }
}
