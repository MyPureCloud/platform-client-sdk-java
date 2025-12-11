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

import java.io.Serializable;
/**
 * YearMonth
 */

public class YearMonth  implements Serializable {
  
  private Integer year = null;

  private static class MonthEnumDeserializer extends StdDeserializer<MonthEnum> {
    public MonthEnumDeserializer() {
      super(MonthEnumDeserializer.class);
    }

    @Override
    public MonthEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MonthEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets month
   */
 @JsonDeserialize(using = MonthEnumDeserializer.class)
  public enum MonthEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    JANUARY("JANUARY"),
    FEBRUARY("FEBRUARY"),
    MARCH("MARCH"),
    APRIL("APRIL"),
    MAY("MAY"),
    JUNE("JUNE"),
    JULY("JULY"),
    AUGUST("AUGUST"),
    SEPTEMBER("SEPTEMBER"),
    OCTOBER("OCTOBER"),
    NOVEMBER("NOVEMBER"),
    DECEMBER("DECEMBER");

    private String value;

    MonthEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MonthEnum fromString(String key) {
      if (key == null) return null;

      for (MonthEnum value : MonthEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MonthEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MonthEnum month = null;
  private Integer monthValue = null;
  private Boolean leapYear = null;

  public YearMonth() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public YearMonth year(Integer year) {
    this.year = year;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }


  /**
   **/
  public YearMonth month(MonthEnum month) {
    this.month = month;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("month")
  public MonthEnum getMonth() {
    return month;
  }
  public void setMonth(MonthEnum month) {
    this.month = month;
  }


  /**
   **/
  public YearMonth monthValue(Integer monthValue) {
    this.monthValue = monthValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("monthValue")
  public Integer getMonthValue() {
    return monthValue;
  }
  public void setMonthValue(Integer monthValue) {
    this.monthValue = monthValue;
  }


  /**
   **/
  public YearMonth leapYear(Boolean leapYear) {
    this.leapYear = leapYear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("leapYear")
  public Boolean getLeapYear() {
    return leapYear;
  }
  public void setLeapYear(Boolean leapYear) {
    this.leapYear = leapYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YearMonth yearMonth = (YearMonth) o;

    return Objects.equals(this.year, yearMonth.year) &&
            Objects.equals(this.month, yearMonth.month) &&
            Objects.equals(this.monthValue, yearMonth.monthValue) &&
            Objects.equals(this.leapYear, yearMonth.leapYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, monthValue, leapYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YearMonth {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    monthValue: ").append(toIndentedString(monthValue)).append("\n");
    sb.append("    leapYear: ").append(toIndentedString(leapYear)).append("\n");
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

