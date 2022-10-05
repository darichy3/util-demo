package id.rizki.util;

/**
 * @author: Dhanan_Simian <dhanan.dwi@simian.co.id>
 * @since: 5 Oct 2022
 */
public class StringTools {
    public static String ifEmpty(String check) {
        String result = check == null ? "" : check;
        return result;
    }

    public static boolean isEmpty(String check) {
        Boolean result = check == null || check.isEmpty();
        return result;
    }

    public static String ifEmpty(String check, String defaultValue) {
        String result = check == null ? defaultValue : check;
        return result;
    }
}
