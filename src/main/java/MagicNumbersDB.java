import java.util.ArrayList;
import java.util.List;

public class MagicNumbersDB {

    static List<ExtWithNumbers> magicDB = new ArrayList<>();

    public MagicNumbersDB() {
        fillDB();
    }

    private void fillDB(){
        magicDB.add(new ExtWithNumbers(new Ext("png"),new Numbers("89 50 4E 47 0D 0A 1A 0A")));
        magicDB.add(new ExtWithNumbers(new Ext("jpg"),new Numbers("FF D8 FF")));
        magicDB.add(new ExtWithNumbers(new Ext("gif"),new Numbers("47 49 46 38 39 61")));
        magicDB.add(new ExtWithNumbers(new Ext("class"),new Numbers("CA FE BA BE")));
        magicDB.add(new ExtWithNumbers(new Ext("txt"),new Numbers("")));
    }

    boolean isExtHandled(String ext) throws ExtensionNotHandledException {
        boolean contains = false;
        for(ExtWithNumbers e: magicDB){
            if(e.getExt().getExt().equals(ext)){
                contains = true;
            }
        }
        return contains;
    }

}
