package com.mypurecloud.sdk.v2;

import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ApiDateFormat extends DateFormat {

    // Regex to detect values generated from a java.time.Instant with microseconds and nanoseconds precision
    private static final Pattern ISO_NANOS_UTC =
        Pattern.compile("^(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3})\\d+Z$");

    List<String> formatStrings = new ArrayList<>(Arrays.asList(
        // Standard ISO-8601 format used by PureCloud
        "yyyy-MM-dd'T'HH:mm:ss.SSSXXX",
        // Alternate format without ms
        "yyyy-MM-dd'T'HH:mm:ssXXX",
        // Alternate format without timezone (API-2107)
        "yyyy-MM-dd'T'HH:mm:ss.SSS",
        // Alternate format - date only (API-3286)
        "yyyy-MM-dd"
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
        if (source == null) return null;
        String sourceToParse = source;

        // Detect values generated from a java.time.Instant with microseconds and nanoseconds precision
        Matcher m = ISO_NANOS_UTC.matcher(source);
        if (m.matches()) {
            // keep up to milliseconds + Z to preserve comatibility with java.util.Date
            sourceToParse = m.group(1) + "Z";
        }
        
        for (SimpleDateFormat format : formats) {
            try {
                Date d = format.parse(sourceToParse, pos);
                if (d != null)
                    return d;
            }
            catch (NullPointerException e) {}
        }

        return null;
    }

    @Override
    public Object clone()
    {
        DateFormat dateFormat = new ApiDateFormat();
        dateFormat.setTimeZone(this.getTimeZone());
        return dateFormat;
    }
    
    @Override
    public void setTimeZone(TimeZone zone)
    {
        // Set this
        calendar.setTimeZone(zone);
        
        // Set each format
        for (SimpleDateFormat format : formats) {
            format.setTimeZone(zone);
        }
    }
}
