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
 * AgentStateSegmentTypeCount
 */

public class AgentStateSegmentTypeCount  implements Serializable {
  

  private static class SegmentTypeEnumDeserializer extends StdDeserializer<SegmentTypeEnum> {
    public SegmentTypeEnumDeserializer() {
      super(SegmentTypeEnumDeserializer.class);
    }

    @Override
    public SegmentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SegmentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Segment type
   */
 @JsonDeserialize(using = SegmentTypeEnumDeserializer.class)
  public enum SegmentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERT("alert"),
    BARGING("barging"),
    CALLBACK("callback"),
    COACHING("coaching"),
    CONTACTING("contacting"),
    CONVERTING("converting"),
    DELAY("delay"),
    DIALING("dialing"),
    HOLD("hold"),
    INTERACT("interact"),
    IVR("ivr"),
    MONITORING("monitoring"),
    PARKED("parked"),
    SCHEDULED("scheduled"),
    SHARING("sharing"),
    SYSTEM("system"),
    TRANSMITTING("transmitting"),
    UNKNOWN("unknown"),
    UPLOADING("uploading"),
    VOICEMAIL("voicemail"),
    WRAPUP("wrapup");

    private String value;

    SegmentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SegmentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SegmentTypeEnum value : SegmentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SegmentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SegmentTypeEnum segmentType = null;
  private Integer count = null;

  
  /**
   * Segment type
   **/
  public AgentStateSegmentTypeCount segmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Segment type")
  @JsonProperty("segmentType")
  public SegmentTypeEnum getSegmentType() {
    return segmentType;
  }
  public void setSegmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
  }


  /**
   * Count of segment type
   **/
  public AgentStateSegmentTypeCount count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of segment type")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStateSegmentTypeCount agentStateSegmentTypeCount = (AgentStateSegmentTypeCount) o;

    return Objects.equals(this.segmentType, agentStateSegmentTypeCount.segmentType) &&
            Objects.equals(this.count, agentStateSegmentTypeCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentType, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStateSegmentTypeCount {\n");
    
    sb.append("    segmentType: ").append(toIndentedString(segmentType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

