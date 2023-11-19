package history;

public class ShowOnlyValue {
    // Show only The result of the value the user has been selected.
    public static String getTheResultOfValue(String value){
        String[] parts = value.split(" = ");
        if (parts.length > 1) {
            return parts[1];
        }
        return "";
    }
}
