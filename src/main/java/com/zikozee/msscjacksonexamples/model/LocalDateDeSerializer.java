package com.zikozee.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.apache.tomcat.jni.Local;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author: Ezekiel Eromosei
 * @created: 30 May 2022
 */

public class LocalDateDeSerializer extends StdDeserializer<LocalDate> {

    protected LocalDateDeSerializer() {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return LocalDate.parse(jsonParser.readValueAs(String.class), DateTimeFormatter.BASIC_ISO_DATE);
    }

}


//public class LocalDateDeSerializer extends JsonDeserializer<LocalDate> {
//
//    @Override
//    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
//        return LocalDate.parse(jsonParser.readValueAs(String.class), DateTimeFormatter.BASIC_ISO_DATE);
//    }
//}
