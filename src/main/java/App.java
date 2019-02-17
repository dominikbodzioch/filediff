import java.io.File;

public class App {

    public static void main(String[] args) {

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


    }

}
