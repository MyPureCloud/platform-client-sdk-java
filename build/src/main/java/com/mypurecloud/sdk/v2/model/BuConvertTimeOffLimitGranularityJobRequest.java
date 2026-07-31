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
 * BuConvertTimeOffLimitGranularityJobRequest
 */

public class BuConvertTimeOffLimitGranularityJobRequest  implements Serializable {
  

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
   * Granularity to convert the time-off limit to
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily"),
    FIFTEENMINUTES("FifteenMinutes");

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
  private String fullDayTimeOffStartTime = null;

  public BuConvertTimeOffLimitGranularityJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BuConvertTimeOffLimitGranularityJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Granularity to convert the time-off limit to
   **/
  public BuConvertTimeOffLimitGranularityJobRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Granularity to convert the time-off limit to")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * The start time of full day time-off requests associated with this limit interval in HH:mm format.The value can be set only once when converting the time-off limit from daily granularity to fifteen minutes.Setting this value is allowed only for time-off limit with fifteen minutes granularity.When converting time-off limit from fifteen minutes to daily granularity, the existing value is reset.
   **/
  public BuConvertTimeOffLimitGranularityJobRequest fullDayTimeOffStartTime(String fullDayTimeOffStartTime) {
    this.fullDayTimeOffStartTime = fullDayTimeOffStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "09:00", value = "The start time of full day time-off requests associated with this limit interval in HH:mm format.The value can be set only once when converting the time-off limit from daily granularity to fifteen minutes.Setting this value is allowed only for time-off limit with fifteen minutes granularity.When converting time-off limit from fifteen minutes to daily granularity, the existing value is reset.")
  @JsonProperty("fullDayTimeOffStartTime")
  public String getFullDayTimeOffStartTime() {
    return fullDayTimeOffStartTime;
  }
  public void setFullDayTimeOffStartTime(String fullDayTimeOffStartTime) {
    this.fullDayTimeOffStartTime = fullDayTimeOffStartTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuConvertTimeOffLimitGranularityJobRequest buConvertTimeOffLimitGranularityJobRequest = (BuConvertTimeOffLimitGranularityJobRequest) o;

    return Objects.equals(this.granularity, buConvertTimeOffLimitGranularityJobRequest.granularity) &&
            Objects.equals(this.fullDayTimeOffStartTime, buConvertTimeOffLimitGranularityJobRequest.fullDayTimeOffStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularity, fullDayTimeOffStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuConvertTimeOffLimitGranularityJobRequest {\n");
    
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    fullDayTimeOffStartTime: ").append(toIndentedString(fullDayTimeOffStartTime)).append("\n");
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

