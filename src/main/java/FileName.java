public class FileName {

    private String fileName;

    public FileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FileName{");
        sb.append("fileName='").append(fileName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
