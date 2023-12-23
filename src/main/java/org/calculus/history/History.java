package org.calculus.history;
import java.util.ArrayList;


/**
 * This class defines a History logic for the Calcs.
 */
public abstract class History {
    // Creating an ArrayList to store history values
    private static final ArrayList<String> history = new ArrayList<>();
    // Method to add a value to the history
    public static void addValue(String value) {
        history.add(value);
        if (history.size() > 10) {
            history.remove(0);
        }
    }

    // Method to retrieve the entire history
    public static ArrayList<String> getHistory() {
        // Return the ArrayList containing the stored values
        return history;
    }
}