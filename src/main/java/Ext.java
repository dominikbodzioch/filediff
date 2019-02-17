import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ext ext1 = (Ext) o;
        return Objects.equals(ext, ext1.ext);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ext);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ext{");
        sb.append("ext='").append(ext).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
