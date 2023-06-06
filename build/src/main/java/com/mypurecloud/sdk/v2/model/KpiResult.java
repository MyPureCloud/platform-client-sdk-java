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
 * KpiResult
 */

public class KpiResult  implements Serializable {
  
  private Long kpiTotalOn = null;
  private Long kpiTotalOff = null;
  private Long interactionCountOn = null;
  private Long interactionCountOff = null;

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Media type used for the KPI
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("voice"),
    EMAIL("email"),
    MESSAGE("message");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private Double percentageBenefit = null;

  
  @ApiModelProperty(example = "null", value = "Absolute metric (in which the KPI is based) total for the interactions handled by predictive routing (GPR was on)")
  @JsonProperty("kpiTotalOn")
  public Long getKpiTotalOn() {
    return kpiTotalOn;
  }


  @ApiModelProperty(example = "null", value = "Absolute metric (in which the KPI is based) total for the interactions not routed by predictive routing (GPR was off)")
  @JsonProperty("kpiTotalOff")
  public Long getKpiTotalOff() {
    return kpiTotalOff;
  }


  @ApiModelProperty(example = "null", value = "Total interactions handled by predictive routing (GPR was on)")
  @JsonProperty("interactionCountOn")
  public Long getInteractionCountOn() {
    return interactionCountOn;
  }


  @ApiModelProperty(example = "null", value = "Total interactions not routed by predictive routing (GPR was off)")
  @JsonProperty("interactionCountOff")
  public Long getInteractionCountOff() {
    return interactionCountOff;
  }


  @ApiModelProperty(example = "null", value = "Media type used for the KPI")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }


  @ApiModelProperty(example = "null", value = "The percentage benefit for this media type for the duration of the comparison period")
  @JsonProperty("percentageBenefit")
  public Double getPercentageBenefit() {
    return percentageBenefit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiResult kpiResult = (KpiResult) o;

    return Objects.equals(this.kpiTotalOn, kpiResult.kpiTotalOn) &&
            Objects.equals(this.kpiTotalOff, kpiResult.kpiTotalOff) &&
            Objects.equals(this.interactionCountOn, kpiResult.interactionCountOn) &&
            Objects.equals(this.interactionCountOff, kpiResult.interactionCountOff) &&
            Objects.equals(this.mediaType, kpiResult.mediaType) &&
            Objects.equals(this.percentageBenefit, kpiResult.percentageBenefit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kpiTotalOn, kpiTotalOff, interactionCountOn, interactionCountOff, mediaType, percentageBenefit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiResult {\n");
    
    sb.append("    kpiTotalOn: ").append(toIndentedString(kpiTotalOn)).append("\n");
    sb.append("    kpiTotalOff: ").append(toIndentedString(kpiTotalOff)).append("\n");
    sb.append("    interactionCountOn: ").append(toIndentedString(interactionCountOn)).append("\n");
    sb.append("    interactionCountOff: ").append(toIndentedString(interactionCountOff)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    percentageBenefit: ").append(toIndentedString(percentageBenefit)).append("\n");
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

