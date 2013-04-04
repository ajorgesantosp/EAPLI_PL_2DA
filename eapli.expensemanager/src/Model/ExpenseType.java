package Model;

public class ExpenseType {
    private String mDescription;
    private int mID;

    public ExpenseType(String description, int id) {
        this.mDescription = description;
        this.mID = id;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getId() {
        return mID;
    }
}
