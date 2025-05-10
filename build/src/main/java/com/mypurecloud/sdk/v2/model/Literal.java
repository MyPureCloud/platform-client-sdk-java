package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.Date;

import java.io.Serializable;
/**
 * Literal
 */

public class Literal  implements Serializable {
  
  private String string = null;
  private Integer integer = null;
  private Double number = null;
  private LocalDate date = null;
  private Date datetime = null;

  private static class SpecialEnumDeserializer extends StdDeserializer<SpecialEnum> {
    public SpecialEnumDeserializer() {
      super(SpecialEnumDeserializer.class);
    }

    @Override
    public SpecialEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SpecialEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * A special value enum, such as Wildcard, Null, etc
   */
 @JsonDeserialize(using = SpecialEnumDeserializer.class)
  public enum SpecialEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WILDCARD("Wildcard"),
    NULL("Null"),
    EMPTY("Empty"),
    CURRENTTIME("CurrentTime");

    private String value;

    SpecialEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SpecialEnum fromString(String key) {
      if (key == null) return null;

      for (SpecialEnum value : SpecialEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SpecialEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SpecialEnum special = null;
  private Boolean _boolean = null;

  public Literal() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A string value
   **/
  public Literal string(String string) {
    this.string = string;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A string value")
  @JsonProperty("string")
  public String getString() {
    return string;
  }
  public void setString(String string) {
    this.string = string;
  }


  /**
   * An integer value
   **/
  public Literal integer(Integer integer) {
    this.integer = integer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An integer value")
  @JsonProperty("integer")
  public Integer getInteger() {
    return integer;
  }
  public void setInteger(Integer integer) {
    this.integer = integer;
  }


  /**
   * A decimal value
   **/
  public Literal number(Double number) {
    this.number = number;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A decimal value")
  @JsonProperty("number")
  public Double getNumber() {
    return number;
  }
  public void setNumber(Double number) {
    this.number = number;
  }


  /**
   * A date value, must be in the format of yyyy-MM-dd, e.g. 2024-09-23. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public Literal date(LocalDate date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A date value, must be in the format of yyyy-MM-dd, e.g. 2024-09-23. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }


  /**
   * A date time value, must be in the format of yyyy-MM-dd'T'HH:mm:ss.SSSZ, e.g. 2024-10-02T01:01:01.111Z. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Literal datetime(Date datetime) {
    this.datetime = datetime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A date time value, must be in the format of yyyy-MM-dd'T'HH:mm:ss.SSSZ, e.g. 2024-10-02T01:01:01.111Z. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("datetime")
  public Date getDatetime() {
    return datetime;
  }
  public void setDatetime(Date datetime) {
    this.datetime = datetime;
  }


  /**
   * A special value enum, such as Wildcard, Null, etc
   **/
  public Literal special(SpecialEnum special) {
    this.special = special;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A special value enum, such as Wildcard, Null, etc")
  @JsonProperty("special")
  public SpecialEnum getSpecial() {
    return special;
  }
  public void setSpecial(SpecialEnum special) {
    this.special = special;
  }


  /**
   * A boolean value
   **/
  public Literal _boolean(Boolean _boolean) {
    this._boolean = _boolean;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A boolean value")
  @JsonProperty("boolean")
  public Boolean getBoolean() {
    return _boolean;
  }
  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Literal literal = (Literal) o;

    return Objects.equals(this.string, literal.string) &&
            Objects.equals(this.integer, literal.integer) &&
            Objects.equals(this.number, literal.number) &&
            Objects.equals(this.date, literal.date) &&
            Objects.equals(this.datetime, literal.datetime) &&
            Objects.equals(this.special, literal.special) &&
            Objects.equals(this._boolean, literal._boolean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(string, integer, number, date, datetime, special, _boolean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Literal {\n");
    
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    special: ").append(toIndentedString(special)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
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

