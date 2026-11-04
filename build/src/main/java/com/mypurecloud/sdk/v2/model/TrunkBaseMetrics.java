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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * TrunkBaseMetrics
 */

public class TrunkBaseMetrics  implements Serializable {
  
  private String id = null;
  private String name = null;
  private AddressableEntityRef trunkBase = null;

  private static class TrunkTypeEnumDeserializer extends StdDeserializer<TrunkTypeEnum> {
    public TrunkTypeEnumDeserializer() {
      super(TrunkTypeEnumDeserializer.class);
    }

    @Override
    public TrunkTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TrunkTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the TrunkBase
   */
 @JsonDeserialize(using = TrunkTypeEnumDeserializer.class)
  public enum TrunkTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EXTERNAL("EXTERNAL"),
    PHONE("PHONE"),
    EDGE("EDGE");

    private String value;

    TrunkTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TrunkTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TrunkTypeEnum value : TrunkTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TrunkTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TrunkTypeEnum trunkType = null;
  private Integer inboundCallCount = null;
  private Integer outboundCallCount = null;
  private Date eventTime = null;
  private Integer qosMismatchCount = null;
  private String selfUri = null;

  public TrunkBaseMetrics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public TrunkBaseMetrics(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public TrunkBaseMetrics name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * TrunkBase resource identifier
   **/
  public TrunkBaseMetrics trunkBase(AddressableEntityRef trunkBase) {
    this.trunkBase = trunkBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "TrunkBase resource identifier")
  @JsonProperty("trunkBase")
  public AddressableEntityRef getTrunkBase() {
    return trunkBase;
  }
  public void setTrunkBase(AddressableEntityRef trunkBase) {
    this.trunkBase = trunkBase;
  }


  /**
   * The type of the TrunkBase
   **/
  public TrunkBaseMetrics trunkType(TrunkTypeEnum trunkType) {
    this.trunkType = trunkType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the TrunkBase")
  @JsonProperty("trunkType")
  public TrunkTypeEnum getTrunkType() {
    return trunkType;
  }
  public void setTrunkType(TrunkTypeEnum trunkType) {
    this.trunkType = trunkType;
  }


  /**
   * The number of inbound calls
   **/
  public TrunkBaseMetrics inboundCallCount(Integer inboundCallCount) {
    this.inboundCallCount = inboundCallCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of inbound calls")
  @JsonProperty("inboundCallCount")
  public Integer getInboundCallCount() {
    return inboundCallCount;
  }
  public void setInboundCallCount(Integer inboundCallCount) {
    this.inboundCallCount = inboundCallCount;
  }


  /**
   * The number of outbound calls
   **/
  public TrunkBaseMetrics outboundCallCount(Integer outboundCallCount) {
    this.outboundCallCount = outboundCallCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of outbound calls")
  @JsonProperty("outboundCallCount")
  public Integer getOutboundCallCount() {
    return outboundCallCount;
  }
  public void setOutboundCallCount(Integer outboundCallCount) {
    this.outboundCallCount = outboundCallCount;
  }


  /**
   * The timestamp of the data publication. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TrunkBaseMetrics eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp of the data publication. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }


  /**
   * The number of QoS mismatch events
   **/
  public TrunkBaseMetrics qosMismatchCount(Integer qosMismatchCount) {
    this.qosMismatchCount = qosMismatchCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of QoS mismatch events")
  @JsonProperty("qosMismatchCount")
  public Integer getQosMismatchCount() {
    return qosMismatchCount;
  }
  public void setQosMismatchCount(Integer qosMismatchCount) {
    this.qosMismatchCount = qosMismatchCount;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkBaseMetrics trunkBaseMetrics = (TrunkBaseMetrics) o;

    return Objects.equals(this.id, trunkBaseMetrics.id) &&
            Objects.equals(this.name, trunkBaseMetrics.name) &&
            Objects.equals(this.trunkBase, trunkBaseMetrics.trunkBase) &&
            Objects.equals(this.trunkType, trunkBaseMetrics.trunkType) &&
            Objects.equals(this.inboundCallCount, trunkBaseMetrics.inboundCallCount) &&
            Objects.equals(this.outboundCallCount, trunkBaseMetrics.outboundCallCount) &&
            Objects.equals(this.eventTime, trunkBaseMetrics.eventTime) &&
            Objects.equals(this.qosMismatchCount, trunkBaseMetrics.qosMismatchCount) &&
            Objects.equals(this.selfUri, trunkBaseMetrics.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, trunkBase, trunkType, inboundCallCount, outboundCallCount, eventTime, qosMismatchCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkBaseMetrics {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    trunkBase: ").append(toIndentedString(trunkBase)).append("\n");
    sb.append("    trunkType: ").append(toIndentedString(trunkType)).append("\n");
    sb.append("    inboundCallCount: ").append(toIndentedString(inboundCallCount)).append("\n");
    sb.append("    outboundCallCount: ").append(toIndentedString(outboundCallCount)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    qosMismatchCount: ").append(toIndentedString(qosMismatchCount)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

