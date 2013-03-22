/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rita
 */
public class ExpenseType {

    private String mTypeName;
    private int mID;

    public ExpenseType(String name, int id) {
        this.mTypeName = name;
        this.mID = id;
    }

    public String getmTypeName() {
        return mTypeName;
    }

    public int getmID() {
        return mID;
    }
}
