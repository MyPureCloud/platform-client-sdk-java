package com.mypurecloud.sdk.v2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {
    public LocalDateDeserializer() {
        this(null);
    }

    public LocalDateDeserializer(Class<?> t) {
        super(t);
    }
    
    @Override
    public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);
        String text = node.asText();
        return LocalDate.parse(text);
    }
}
