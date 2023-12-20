package org.calculus.history;
import java.util.ArrayList;


/**
 * This class defines a History logic for the Calcs.
 */
public abstract class History {
    private static final ArrayList<String> history = new ArrayList<>();

    public static void addValue(String value) {
        history.add(value);

        if (history.size() > 10) {
            // Removing the 1st value if the history is bigger the 10
            history.remove(0);
        }
    }
    public static ArrayList<String> getHistory() {
        return history;
    }
}