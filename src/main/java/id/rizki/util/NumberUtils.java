package id.rizki.util;

import java.math.BigDecimal;

/**
 * @author: Dhanan_Simian <dhanan.dwi@simian.co.id>
 * @since: 5 Oct 2022
 */
public class NumberUtils {
    public static String format(BigDecimal val, int prec) {
        String result = val.setScale(prec, BigDecimal.ROUND_HALF_UP).toString();
        return result;
    }
}
