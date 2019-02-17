public class Numbers {

    private String numbersStr;

    public Numbers(String numbersStr) {
        this.numbersStr = numbersStr;
    }

    public String getNumbersStr() {
        return numbersStr;
    }

    public void setNumbersStr(String numbersStr) {
        this.numbersStr = numbersStr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Numbers{");
        sb.append("numbersStr='").append(numbersStr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
