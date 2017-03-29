package com.mypurecloud.sdk.v2;

import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ApiDateFormat extends DateFormat {

    List<String> formatStrings = new ArrayList<>(Arrays.asList(
        // Standard ISO-8601 format used by PureCloud
        "yyyy-MM-dd'T'HH:mm:ss.SSSXXX",
        // Alternate format without ms
        "yyyy-MM-dd'T'HH:mm:ssXXX",
        // Alternate format without timezone (API-2107)
        "yyyy-MM-dd'T'HH:mm:ss.SSS"
    ));

    List<SimpleDateFormat> formats = new ArrayList<SimpleDateFormat>();

    public ApiDateFormat() {
        super();
        setCalendar(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
        setNumberFormat(NumberFormat.getInstance());

        // Initialize formats
        for (String formatString : formatStrings) {
            SimpleDateFormat format = new SimpleDateFormat(formatString);
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            formats.add(format);
        }
    }

    @Override
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        return formats.get(0).format(date, toAppendTo, fieldPosition);
    }

    @Override
    public Date parse(String source, ParsePosition pos) {
        for (SimpleDateFormat format : formats) {
            try {
                Date d = format.parse(source, pos);
                if (d != null)
                    return d;
            }
            catch (NullPointerException e) {}
        }

        return null;
    }
}
