import java.text.SimpleDateFormat;
import java.util.Date;

public class DateChecker {

    private DateChecker(){

    }

    private static final SimpleDateFormat iso8601 = new SimpleDateFormat("yyyy-MM-dd");

    public static void checkDate(String dateStr) {
        try {
            Date parsedDate = iso8601.parse(dateStr);
            String formattedDate = iso8601.format(parsedDate);
            if (!dateStr.equals(formattedDate)) {
                throw new IllegalArgumentException("Date is not valid or not in ISO 8601 format");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Date is not valid or not in ISO 8601 format", e);
        }
    }
}
