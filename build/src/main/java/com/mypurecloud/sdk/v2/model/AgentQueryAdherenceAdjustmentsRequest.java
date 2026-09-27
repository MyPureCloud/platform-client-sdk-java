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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AgentQueryAdherenceAdjustmentsRequest
 */

public class AgentQueryAdherenceAdjustmentsRequest  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private List<String> reasonCodeIds = null;

  private static class StatusesEnumDeserializer extends StdDeserializer<StatusesEnum> {
    public StatusesEnumDeserializer() {
      super(StatusesEnumDeserializer.class);
    }

    @Override
    public StatusesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets statuses
   */
 @JsonDeserialize(using = StatusesEnumDeserializer.class)
  public enum StatusesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPROVED("Approved"),
    DENIED("Denied"),
    PENDING("Pending");

    private String value;

    StatusesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusesEnum fromString(String key) {
      if (key == null) return null;

      for (StatusesEnum value : StatusesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<StatusesEnum> statuses = null;

  public AgentQueryAdherenceAdjustmentsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      reasonCodeIds = new ArrayList<String>();
      statuses = new ArrayList<StatusesEnum>();
    }
  }

  public AgentQueryAdherenceAdjustmentsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      reasonCodeIds = new ArrayList<String>();
      statuses = new ArrayList<StatusesEnum>();
    }
  }

  
  /**
   * The start timestamp of the range to query in ISO-8601 format
   **/
  public AgentQueryAdherenceAdjustmentsRequest startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start timestamp of the range to query in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The end timestamp of the range to query in ISO-8601 format
   **/
  public AgentQueryAdherenceAdjustmentsRequest endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end timestamp of the range to query in ISO-8601 format")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * A filter for the reason codes to include. Leave empty or omit entirely for all reason codes
   **/
  public AgentQueryAdherenceAdjustmentsRequest reasonCodeIds(List<String> reasonCodeIds) {
    this.reasonCodeIds = reasonCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A filter for the reason codes to include. Leave empty or omit entirely for all reason codes")
  @JsonProperty("reasonCodeIds")
  public List<String> getReasonCodeIds() {
    return reasonCodeIds;
  }
  public void setReasonCodeIds(List<String> reasonCodeIds) {
    this.reasonCodeIds = reasonCodeIds;
  }


  /**
   * A filter for which adherence adjustment statuses to include. Leave empty or omit entirely for all statuses
   **/
  public AgentQueryAdherenceAdjustmentsRequest statuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A filter for which adherence adjustment statuses to include. Leave empty or omit entirely for all statuses")
  @JsonProperty("statuses")
  public List<StatusesEnum> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentQueryAdherenceAdjustmentsRequest agentQueryAdherenceAdjustmentsRequest = (AgentQueryAdherenceAdjustmentsRequest) o;

    return Objects.equals(this.startDate, agentQueryAdherenceAdjustmentsRequest.startDate) &&
            Objects.equals(this.endDate, agentQueryAdherenceAdjustmentsRequest.endDate) &&
            Objects.equals(this.reasonCodeIds, agentQueryAdherenceAdjustmentsRequest.reasonCodeIds) &&
            Objects.equals(this.statuses, agentQueryAdherenceAdjustmentsRequest.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, reasonCodeIds, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentQueryAdherenceAdjustmentsRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    reasonCodeIds: ").append(toIndentedString(reasonCodeIds)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

