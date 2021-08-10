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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Format
 */

public class Format  implements Serializable {
  

  private static class FlagsEnumDeserializer extends StdDeserializer<FlagsEnum> {
    public FlagsEnumDeserializer() {
      super(FlagsEnumDeserializer.class);
    }

    @Override
    public FlagsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlagsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets flags
   */
 @JsonDeserialize(using = FlagsEnumDeserializer.class)
  public enum FlagsEnum {
    BOOLPLAYYESNO("BoolPlayYesNo"),
    CURRENCYASMINORUNITS("CurrencyAsMinorUnits"),
    CURRENCYMAJORUNITSONLY("CurrencyMajorUnitsOnly"),
    CURRENCYMINORUNITSONLY("CurrencyMinorUnitsOnly"),
    CURRENCYPLAYDIGITS("CurrencyPlayDigits"),
    DATELONGYEAR("DateLongYear"),
    DATESHORTYEAR("DateShortYear"),
    DATESHORTMONTHANDDAY("DateShortMonthAndDay"),
    DATEDAYOFWEEKONLY("DateDayOfWeekOnly"),
    DATEDAYONLY("DateDayOnly"),
    DATEMONTHONLY("DateMonthOnly"),
    DATESHORTYEARONLY("DateShortYearOnly"),
    DATELONGYEARONLY("DateLongYearOnly"),
    TIMETWENTYFOURHOURS("TimeTwentyFourHours"),
    TIMETWELVEHOURS("TimeTwelveHours"),
    TIMEPARTDAYS("TimePartDays"),
    TIMEPARTHOURS("TimePartHours"),
    TIMEPARTMINUTES("TimePartMinutes"),
    TIMEPARTSECONDS("TimePartSeconds"),
    STRINGPLAYCHARS("StringPlayChars"),
    NUMBERPLAYDIGITS("NumberPlayDigits"),
    NUMBERORDINAL("NumberOrdinal"),
    LANGUAGECASEARTICLE("LanguageCaseArticle"),
    LANGUAGECASEACCUSATIVE("LanguageCaseAccusative"),
    LANGUAGECASEDATIVE("LanguageCaseDative"),
    LANGUAGECASEGENITIVE("LanguageCaseGenitive"),
    LANGUAGECASENOMINATIVE("LanguageCaseNominative"),
    LANGUAGEQUANTITYPLURAL("LanguageQuantityPlural"),
    LANGUAGEQUANTITYSINGULAR("LanguageQuantitySingular"),
    LANGUAGEGENDERCOMMON("LanguageGenderCommon"),
    LANGUAGEGENDERFEMININE("LanguageGenderFeminine"),
    LANGUAGEGENDERMASCULINE("LanguageGenderMasculine"),
    LANGUAGEGENDERNEUTER("LanguageGenderNeuter");

    private String value;

    FlagsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlagsEnum fromString(String key) {
      if (key == null) return null;

      for (FlagsEnum value : FlagsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlagsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<FlagsEnum> flags = new ArrayList<FlagsEnum>();

  
  /**
   * The Set of prompt segment format flags i.e. each entry is a part of describing the overall format. E.g. \"format\": { \"flags\": [StringPlayChars] }
   **/
  public Format flags(List<FlagsEnum> flags) {
    this.flags = flags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Set of prompt segment format flags i.e. each entry is a part of describing the overall format. E.g. \"format\": { \"flags\": [StringPlayChars] }")
  @JsonProperty("flags")
  public List<FlagsEnum> getFlags() {
    return flags;
  }
  public void setFlags(List<FlagsEnum> flags) {
    this.flags = flags;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Format format = (Format) o;
    return Objects.equals(this.flags, format.flags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Format {\n");
    
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
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

