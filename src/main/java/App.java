import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, ExtensionNotHandledException {

        File dirPath = new File("src/testFiles");
        FilesInDirectory filesInDirectory = new FilesInDirectory(dirPath);

        MagicNumbersDB magicNumbersDB = new MagicNumbersDB();

        System.out.println("Verification of files contained in the folder '" + dirPath + "':");
        System.out.println("--------------------------------------------------------------");

        if (FilesInDirectory.filesRegister.size() == 0) {
            System.out.println("The folder above is empty - add some files to verify...");
        } else {

            for (FileNameWithExt f : FilesInDirectory.filesRegister) {

                ReadBytes readBytes = new ReadBytes(dirPath, f);
                String ext = f.getfExt().getExt();

                boolean extIsHandled = magicNumbersDB.isExtHandled(ext);
                boolean extIsTrue = readBytes.isContentCoherentWithExt();
                String fileName = f.getfName().getFileName();
                String fileExt = f.getfExt().getExt();

                try {
                    if (!extIsHandled) {
                        throw new ExtensionNotHandledException("Extension '" + ext + "' is not handled!");
                    }
                } catch (ExtensionNotHandledException e) {
                    System.out.println(e.getMessage());
                }

                if (extIsHandled && extIsTrue) {
                    System.out.println("A '" + fileName + "." + fileExt + "' file is a '" + ext + "' file");
                } else if (extIsHandled && !extIsTrue) {
                    System.out.println("A '" + fileName + "." + fileExt + "' file is in real a '" + "XXXXX" + "' file");
                }

            }

        }

        System.out.println("--------------------------------------------------------------");
    }

}
