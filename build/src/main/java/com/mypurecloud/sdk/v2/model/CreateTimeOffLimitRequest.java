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
 * Contains property values of time off limit to be created
 */
@ApiModel(description = "Contains property values of time off limit to be created")

public class CreateTimeOffLimitRequest  implements Serializable {
  

  private static class GranularityEnumDeserializer extends StdDeserializer<GranularityEnum> {
    public GranularityEnumDeserializer() {
      super(GranularityEnumDeserializer.class);
    }

    @Override
    public GranularityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GranularityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Granularity choice for time off limit. If not specified, 'Daily' is assumed
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GranularityEnum fromString(String key) {
      if (key == null) return null;

      for (GranularityEnum value : GranularityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GranularityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GranularityEnum granularity = null;
  private Integer defaultLimitMinutes = null;

  
  /**
   * Granularity choice for time off limit. If not specified, 'Daily' is assumed
   **/
  public CreateTimeOffLimitRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Granularity choice for time off limit. If not specified, 'Daily' is assumed")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  
  /**
   * The default limit value in minutes per granularity.If not specified, then 0 is assumed, which means there are no time off minutes available
   **/
  public CreateTimeOffLimitRequest defaultLimitMinutes(Integer defaultLimitMinutes) {
    this.defaultLimitMinutes = defaultLimitMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default limit value in minutes per granularity.If not specified, then 0 is assumed, which means there are no time off minutes available")
  @JsonProperty("defaultLimitMinutes")
  public Integer getDefaultLimitMinutes() {
    return defaultLimitMinutes;
  }
  public void setDefaultLimitMinutes(Integer defaultLimitMinutes) {
    this.defaultLimitMinutes = defaultLimitMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTimeOffLimitRequest createTimeOffLimitRequest = (CreateTimeOffLimitRequest) o;
    return Objects.equals(this.granularity, createTimeOffLimitRequest.granularity) &&
        Objects.equals(this.defaultLimitMinutes, createTimeOffLimitRequest.defaultLimitMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularity, defaultLimitMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTimeOffLimitRequest {\n");
    
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    defaultLimitMinutes: ").append(toIndentedString(defaultLimitMinutes)).append("\n");
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

