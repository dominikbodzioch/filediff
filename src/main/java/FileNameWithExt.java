public class FileNameWithExt {

    private FileName fName;
    private Ext fExt;

    public FileNameWithExt(FileName fName, Ext fExt) {
        this.fName = fName;
        this.fExt = fExt;
    }

    public FileName getfName() {
        return fName;
    }

    public void setfName(FileName fName) {
        this.fName = fName;
    }

    public Ext getfExt() {
        return fExt;
    }

    public void setfExt(Ext fExt) {
        this.fExt = fExt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FileNameWithExt{");
        sb.append("fName=").append(fName);
        sb.append(", fExt=").append(fExt);
        sb.append('}');
        return sb.toString();
    }
}
