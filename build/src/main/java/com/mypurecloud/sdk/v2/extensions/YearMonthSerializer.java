package com.mypurecloud.sdk.v2.extensions;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.YearMonth;

public class YearMonthSerializer extends StdSerializer<YearMonth> {
    public YearMonthSerializer() {
        this(null);
    }

    public YearMonthSerializer(Class<YearMonth> t) {
        super(t);
    }

    @Override
    public void serialize(
            YearMonth value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException {
        jgen.writeString(value.toString());
    }
}
