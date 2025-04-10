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
 * WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity
 */

public class WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity  implements Serializable {
  
  private String requestId = null;

  private static class ReasonEnumDeserializer extends StdDeserializer<ReasonEnum> {
    public ReasonEnumDeserializer() {
      super(ReasonEnumDeserializer.class);
    }

    @Override
    public ReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets reason
   */
 @JsonDeserialize(using = ReasonEnumDeserializer.class)
  public enum ReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    DELETEINPROGRESS("DeleteInProgress"),
    VALIDATIONINPROGRESS("ValidationInProgress"),
    REQUESTIDNOTFOUND("RequestIdNotFound"),
    INVALIDREQUEST("InvalidRequest");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReasonEnum fromString(String key) {
      if (key == null) return null;

      for (ReasonEnum value : ReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ReasonEnum reason = null;

  public WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  /**
   **/
  public WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity wfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity = (WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity) o;

    return Objects.equals(this.requestId, wfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity.requestId) &&
            Objects.equals(this.reason, wfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

