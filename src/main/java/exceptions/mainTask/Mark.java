package exceptions.mainTask;

public class Mark {

    private double mark;

    public Mark(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "mark=" + mark +
                '}';
    }
}
