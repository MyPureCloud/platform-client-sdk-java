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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleExecutionSettings
 */

public class CampaignRuleExecutionSettings  implements Serializable {
  

  private static class FrequencyEnumDeserializer extends StdDeserializer<FrequencyEnum> {
    public FrequencyEnumDeserializer() {
      super(FrequencyEnumDeserializer.class);
    }

    @Override
    public FrequencyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FrequencyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Execution control frequency
   */
 @JsonDeserialize(using = FrequencyEnumDeserializer.class)
  public enum FrequencyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONEACHTRIGGER("onEachTrigger"),
    ONCEPERDAY("oncePerDay");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FrequencyEnum fromString(String key) {
      if (key == null) return null;

      for (FrequencyEnum value : FrequencyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FrequencyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FrequencyEnum frequency = null;
  private String timeZoneId = null;

  
  /**
   * Execution control frequency
   **/
  public CampaignRuleExecutionSettings frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Execution control frequency")
  @JsonProperty("frequency")
  public FrequencyEnum getFrequency() {
    return frequency;
  }
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  /**
   * The time zone for the execution control frequency=\"oncePerDay\"; for example, Africa/Abidjan. This property is ignored when frequency is not \"oncePerDay\"
   **/
  public CampaignRuleExecutionSettings timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }
  
  @ApiModelProperty(example = "Africa/Abidjan", value = "The time zone for the execution control frequency=\"oncePerDay\"; for example, Africa/Abidjan. This property is ignored when frequency is not \"oncePerDay\"")
  @JsonProperty("timeZoneId")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleExecutionSettings campaignRuleExecutionSettings = (CampaignRuleExecutionSettings) o;

    return Objects.equals(this.frequency, campaignRuleExecutionSettings.frequency) &&
            Objects.equals(this.timeZoneId, campaignRuleExecutionSettings.timeZoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, timeZoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleExecutionSettings {\n");
    
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
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

