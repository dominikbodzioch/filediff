public class ExtWithNumbers {

    private Ext ext;
    private Numbers numbers;

    public ExtWithNumbers(Ext ext, Numbers numbers) {
        this.ext = ext;
        this.numbers = numbers;
    }

    public Ext getExt() {
        return ext;
    }

    public void setExt(Ext ext) {
        this.ext = ext;
    }

    public Numbers getNumbers() {
        return numbers;
    }

    public void setNumbers(Numbers numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExtWithNumbers{");
        sb.append("ext=").append(ext);
        sb.append(", numbers=").append(numbers);
        sb.append('}');
        return sb.toString();
    }
}
