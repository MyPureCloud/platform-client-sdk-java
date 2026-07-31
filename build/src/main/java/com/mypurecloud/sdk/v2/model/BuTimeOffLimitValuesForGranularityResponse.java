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
import com.mypurecloud.sdk.v2.model.BuTimeOffLimitReference;
import com.mypurecloud.sdk.v2.model.BuTimeOffLimitValues;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuTimeOffLimitValuesForGranularityResponse
 */

public class BuTimeOffLimitValuesForGranularityResponse  implements Serializable {
  
  private BuTimeOffLimitReference timeOffLimit = null;

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
   * Granularity choice for time-off limit
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
  private List<BuTimeOffLimitValues> limitValues = null;
  private WfmVersionedEntityMetadata metadata = null;

  public BuTimeOffLimitValuesForGranularityResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      limitValues = new ArrayList<BuTimeOffLimitValues>();
    }
  }

  public BuTimeOffLimitValuesForGranularityResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      limitValues = new ArrayList<BuTimeOffLimitValues>();
    }
  }

  
  /**
   * The ID of the time-off limit
   **/
  public BuTimeOffLimitValuesForGranularityResponse timeOffLimit(BuTimeOffLimitReference timeOffLimit) {
    this.timeOffLimit = timeOffLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the time-off limit")
  @JsonProperty("timeOffLimit")
  public BuTimeOffLimitReference getTimeOffLimit() {
    return timeOffLimit;
  }
  public void setTimeOffLimit(BuTimeOffLimitReference timeOffLimit) {
    this.timeOffLimit = timeOffLimit;
  }


  /**
   * Granularity choice for time-off limit
   **/
  public BuTimeOffLimitValuesForGranularityResponse granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Granularity choice for time-off limit")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * Values for time-off limit
   **/
  public BuTimeOffLimitValuesForGranularityResponse limitValues(List<BuTimeOffLimitValues> limitValues) {
    this.limitValues = limitValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Values for time-off limit")
  @JsonProperty("limitValues")
  public List<BuTimeOffLimitValues> getLimitValues() {
    return limitValues;
  }
  public void setLimitValues(List<BuTimeOffLimitValues> limitValues) {
    this.limitValues = limitValues;
  }


  /**
   * Version metadata for the time-off limit
   **/
  public BuTimeOffLimitValuesForGranularityResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the time-off limit")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuTimeOffLimitValuesForGranularityResponse buTimeOffLimitValuesForGranularityResponse = (BuTimeOffLimitValuesForGranularityResponse) o;

    return Objects.equals(this.timeOffLimit, buTimeOffLimitValuesForGranularityResponse.timeOffLimit) &&
            Objects.equals(this.granularity, buTimeOffLimitValuesForGranularityResponse.granularity) &&
            Objects.equals(this.limitValues, buTimeOffLimitValuesForGranularityResponse.limitValues) &&
            Objects.equals(this.metadata, buTimeOffLimitValuesForGranularityResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffLimit, granularity, limitValues, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuTimeOffLimitValuesForGranularityResponse {\n");
    
    sb.append("    timeOffLimit: ").append(toIndentedString(timeOffLimit)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    limitValues: ").append(toIndentedString(limitValues)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

