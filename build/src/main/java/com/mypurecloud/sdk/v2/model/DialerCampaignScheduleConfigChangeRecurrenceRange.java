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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * the schedule range
 */
@ApiModel(description = "the schedule range")

public class DialerCampaignScheduleConfigChangeRecurrenceRange  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOEND("NoEnd"),
    NUMBERED("Numbered"),
    ENDDATE("EndDate");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String end = null;
  private Long numberOfOccurrences = null;
  private Map<String, Object> additionalProperties = null;
  private Map<String, Object> getAdditionalProperties = null;

  public DialerCampaignScheduleConfigChangeRecurrenceRange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public DialerCampaignScheduleConfigChangeRecurrenceRange type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * the range end date
   **/
  public DialerCampaignScheduleConfigChangeRecurrenceRange end(String end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the range end date")
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }
  public void setEnd(String end) {
    this.end = end;
  }


  /**
   * the number of occurrences to happen before ending
   **/
  public DialerCampaignScheduleConfigChangeRecurrenceRange numberOfOccurrences(Long numberOfOccurrences) {
    this.numberOfOccurrences = numberOfOccurrences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the number of occurrences to happen before ending")
  @JsonProperty("numberOfOccurrences")
  public Long getNumberOfOccurrences() {
    return numberOfOccurrences;
  }
  public void setNumberOfOccurrences(Long numberOfOccurrences) {
    this.numberOfOccurrences = numberOfOccurrences;
  }


  /**
   **/
  public DialerCampaignScheduleConfigChangeRecurrenceRange additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   **/
  public DialerCampaignScheduleConfigChangeRecurrenceRange getAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("getAdditionalProperties")
  public Map<String, Object> getGetAdditionalProperties() {
    return getAdditionalProperties;
  }
  public void setGetAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCampaignScheduleConfigChangeRecurrenceRange dialerCampaignScheduleConfigChangeRecurrenceRange = (DialerCampaignScheduleConfigChangeRecurrenceRange) o;

    return Objects.equals(this.type, dialerCampaignScheduleConfigChangeRecurrenceRange.type) &&
            Objects.equals(this.end, dialerCampaignScheduleConfigChangeRecurrenceRange.end) &&
            Objects.equals(this.numberOfOccurrences, dialerCampaignScheduleConfigChangeRecurrenceRange.numberOfOccurrences) &&
            Objects.equals(this.additionalProperties, dialerCampaignScheduleConfigChangeRecurrenceRange.additionalProperties) &&
            Objects.equals(this.getAdditionalProperties, dialerCampaignScheduleConfigChangeRecurrenceRange.getAdditionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, end, numberOfOccurrences, additionalProperties, getAdditionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignScheduleConfigChangeRecurrenceRange {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    numberOfOccurrences: ").append(toIndentedString(numberOfOccurrences)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    getAdditionalProperties: ").append(toIndentedString(getAdditionalProperties)).append("\n");
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

