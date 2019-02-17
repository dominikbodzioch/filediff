public class Ext {

    private String ext;

    public Ext(String ext) {
        this.ext = ext;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ext{");
        sb.append("ext='").append(ext).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
