import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        State state = State.INIT;

        File dirPath = new File("src/testFiles");
        FilesInDirectory filesInDirectory = new FilesInDirectory(dirPath);

        MagicNumbersDB magicNumbersDB = new MagicNumbersDB();

        System.out.println("Verification of files contained in the folder '" + dirPath + "':");
        System.out.println("--------------------------------------------------------------");

        if(FilesInDirectory.filesRegister.size() == 0){
            System.out.println("The folder above is empty - add some files to verify...");
        } else {
            //todo
        }

        for (FileNameWithExt f : FilesInDirectory.filesRegister) {

            ReadBytes readBytes = new ReadBytes(dirPath, f);
            String ext = f.getfExt().getExt();

            try {
                if(!magicNumbersDB.isExtHandled(ext)){
                    throw new ExtensionNotHandledException("Extension '" + ext + "' is not handled!");

                }

            } catch (ExtensionNotHandledException e) {
                System.out.println(e.getMessage());
                state = State.EXT_NOT_HANDLED;
            }


            System.out.println("Extension of file '" + f.getfName().getFileName() + "." + f.getfExt().getExt() + "' is " + readBytes.isContentCoherentWithExt());

        }

    }

}
