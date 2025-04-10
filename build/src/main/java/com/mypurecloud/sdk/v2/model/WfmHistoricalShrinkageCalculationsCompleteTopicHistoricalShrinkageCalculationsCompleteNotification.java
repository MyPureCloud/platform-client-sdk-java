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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification
 */

public class WfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification  implements Serializable {
  
  private String operationId = null;
  private List<String> downloadUrls = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    COMPLETE("Complete"),
    ERROR("Error"),
    PROCESSING("Processing");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  public WfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      downloadUrls = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public WfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  /**
   **/
  public WfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification downloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadUrls")
  public List<String> getDownloadUrls() {
    return downloadUrls;
  }
  public void setDownloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
  }


  /**
   **/
  public WfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification wfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification = (WfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification) o;

    return Objects.equals(this.operationId, wfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification.operationId) &&
            Objects.equals(this.downloadUrls, wfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification.downloadUrls) &&
            Objects.equals(this.state, wfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, downloadUrls, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalShrinkageCalculationsCompleteTopicHistoricalShrinkageCalculationsCompleteNotification {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

