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
import java.util.Date;

import java.io.Serializable;
/**
 * Outlier
 */

public class Outlier  implements Serializable {
  
  private Date timestamp = null;

  private static class AnomalyEnumDeserializer extends StdDeserializer<AnomalyEnum> {
    public AnomalyEnumDeserializer() {
      super(AnomalyEnumDeserializer.class);
    }

    @Override
    public AnomalyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AnomalyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the anomaly
   */
 @JsonDeserialize(using = AnomalyEnumDeserializer.class)
  public enum AnomalyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADDITIVEOUTLIER("AdditiveOutlier"),
    INNOVATIVEOUTLIER("InnovativeOutlier"),
    LEVELSHIFT("LevelShift"),
    SEASONALLEVELSHIFT("SeasonalLevelShift"),
    TEMPORARYCHANGE("TemporaryChange");

    private String value;

    AnomalyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AnomalyEnum fromString(String key) {
      if (key == null) return null;

      for (AnomalyEnum value : AnomalyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AnomalyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AnomalyEnum anomaly = null;
  private Double normalizedValue = null;

  public Outlier() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public Outlier(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Timestamp of the outlier. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Outlier timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp of the outlier. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * The type of the anomaly
   **/
  public Outlier anomaly(AnomalyEnum anomaly) {
    this.anomaly = anomaly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the anomaly")
  @JsonProperty("anomaly")
  public AnomalyEnum getAnomaly() {
    return anomaly;
  }
  public void setAnomaly(AnomalyEnum anomaly) {
    this.anomaly = anomaly;
  }


  /**
   * Normalized value of the outlier
   **/
  public Outlier normalizedValue(Double normalizedValue) {
    this.normalizedValue = normalizedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Normalized value of the outlier")
  @JsonProperty("normalizedValue")
  public Double getNormalizedValue() {
    return normalizedValue;
  }
  public void setNormalizedValue(Double normalizedValue) {
    this.normalizedValue = normalizedValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outlier outlier = (Outlier) o;

    return Objects.equals(this.timestamp, outlier.timestamp) &&
            Objects.equals(this.anomaly, outlier.anomaly) &&
            Objects.equals(this.normalizedValue, outlier.normalizedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, anomaly, normalizedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outlier {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    anomaly: ").append(toIndentedString(anomaly)).append("\n");
    sb.append("    normalizedValue: ").append(toIndentedString(normalizedValue)).append("\n");
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

