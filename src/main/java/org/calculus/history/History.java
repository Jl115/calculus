package org.calculus.history;
import java.util.ArrayList;


/**
 * This class defines a History logic for the Calcs.
 */
public class History {
    private final ArrayList<String> history = new ArrayList<>();
    public final int maxHistorySize = 10;

    public void addValue(String value) {
        history.add(value);
        if (history.size() > maxHistorySize) {
            // Removing the 1st value if the history is bigger the 10
            history.remove(0);
        }
    }
    public ArrayList<String> getHistory() {
        return history;
    }
}
