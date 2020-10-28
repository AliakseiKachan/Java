package exceptions.mainTask;

public class Group extends Faculty {

    private int groupNumber;

    public Group() {
    }

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("groupNumber=").append(groupNumber);
        sb.append('}');
        return sb.toString();
    }
}