package optimi;

public class OpString {
    public static String gets(String text, int start, int end) {
        String data = "";
        for (int i = start; i <= end - 1; i++) {
            data += text.charAt(i);
        }
        return data;
    }
}
