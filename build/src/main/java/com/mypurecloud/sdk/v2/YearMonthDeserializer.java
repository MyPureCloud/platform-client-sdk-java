package com.mypurecloud.sdk.v2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.YearMonth;

public class YearMonthDeserializer extends StdDeserializer<YearMonth> {
    public YearMonthDeserializer() {
        this(null);
    }

    public YearMonthDeserializer(Class<?> t) {
        super(t);
    }
    
    @Override
    public YearMonth deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);
        String text = node.asText();
        return YearMonth.parse(text);
    }
}
