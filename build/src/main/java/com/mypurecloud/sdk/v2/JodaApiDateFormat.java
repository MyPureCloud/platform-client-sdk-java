package com.mypurecloud.sdk.v2;

import com.google.common.collect.Lists;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class JodaApiDateFormat extends DateFormat {

    private final List<DateTimeFormatter> formats;

    public JodaApiDateFormat() {
        setCalendar(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
        setNumberFormat(NumberFormat.getInstance());

        formats = Lists.newArrayList(
                ISODateTimeFormat.dateTimeParser(),
                DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ"),
                DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS")
        );
    }

    @Override
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        StringBuffer stringBuffer = new StringBuffer();
        formats.get(0).printTo(stringBuffer, new Instant(date));
        return stringBuffer;
    }

    @Override
    public Date parse(String source, ParsePosition pos) {
        for (DateTimeFormatter format : formats) {
            try {
                DateTime date = format.parseDateTime(source);
                if (date != null) {
                    pos.setIndex(source.length() - 1);
                    return date.toDate();
                }
            } catch (Exception e) {
                // no-op
            }
        }
        return null;
    }
}
