package com.mypurecloud.sdk.v2;

import com.google.common.collect.Lists;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.ISODateTimeFormat;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class JodaApiDateFormat extends DateFormat {

    private final List<DateTimeFormatter> formats;
    private final DateTimePrinter printer = new DateTimeFormatterBuilder()
            .append(ISODateTimeFormat.dateTime())
            .toPrinter();

    public JodaApiDateFormat() {
        setCalendar(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
        setNumberFormat(NumberFormat.getInstance());

        formats = Lists.newArrayList(
                ISODateTimeFormat.dateTime(),
                DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ"),
                DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS")
        );
    }

    @Override
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        if (toAppendTo == null) {
            toAppendTo = new StringBuffer(printer.estimatePrintedLength());
        }
        printer.printTo(toAppendTo, new LocalDateTime(date), Locale.US);
        return toAppendTo;
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
