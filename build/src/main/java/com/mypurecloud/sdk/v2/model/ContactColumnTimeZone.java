package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactColumnTimeZone
 */

public class ContactColumnTimeZone  implements Serializable {
  
  private String timeZone = null;

  private static class ColumnTypeEnumDeserializer extends StdDeserializer<ColumnTypeEnum> {
    public ColumnTypeEnumDeserializer() {
      super(ColumnTypeEnumDeserializer.class);
    }

    @Override
    public ColumnTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ColumnTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Column Type will be either PHONE or ZIP
   */
 @JsonDeserialize(using = ColumnTypeEnumDeserializer.class)
  public enum ColumnTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PHONE("PHONE"),
    ZIP("ZIP");

    private String value;

    ColumnTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ColumnTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ColumnTypeEnum value : ColumnTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ColumnTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ColumnTypeEnum columnType = null;

  
  /**
   * Time zone that the column matched to. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London
   **/
  public ContactColumnTimeZone timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time zone that the column matched to. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  @ApiModelProperty(example = "null", value = "Column Type will be either PHONE or ZIP")
  @JsonProperty("columnType")
  public ColumnTypeEnum getColumnType() {
    return columnType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactColumnTimeZone contactColumnTimeZone = (ContactColumnTimeZone) o;
    return Objects.equals(this.timeZone, contactColumnTimeZone.timeZone) &&
        Objects.equals(this.columnType, contactColumnTimeZone.columnType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeZone, columnType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactColumnTimeZone {\n");
    
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

