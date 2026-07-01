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
import com.mypurecloud.sdk.v2.model.ListWrapperInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentTimeOffRequestPatch
 */

public class AgentTimeOffRequestPatch  implements Serializable {
  
  private Boolean markedAsRead = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of this time off request. Can only be canceled if the requested date has not already passed
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CANCELED("CANCELED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String notes = null;
  private ListWrapperInteger fullDayEarliestStartOffsetMinutes = null;
  private ListWrapperInteger fullDayLatestEndOffsetMinutes = null;

  public AgentTimeOffRequestPatch() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentTimeOffRequestPatch(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether this request has been read by the agent
   **/
  public AgentTimeOffRequestPatch markedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this request has been read by the agent")
  @JsonProperty("markedAsRead")
  public Boolean getMarkedAsRead() {
    return markedAsRead;
  }
  public void setMarkedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
  }


  /**
   * The status of this time off request. Can only be canceled if the requested date has not already passed
   **/
  public AgentTimeOffRequestPatch status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of this time off request. Can only be canceled if the requested date has not already passed")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Notes about the time off request. Can only be edited while the request is still pending
   **/
  public AgentTimeOffRequestPatch notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes about the time off request. Can only be edited while the request is still pending")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  /**
   * Earliest start offset in minutes for each full-day request date. Values may be null when time-off estimation is disabled or no estimate is available
   **/
  public AgentTimeOffRequestPatch fullDayEarliestStartOffsetMinutes(ListWrapperInteger fullDayEarliestStartOffsetMinutes) {
    this.fullDayEarliestStartOffsetMinutes = fullDayEarliestStartOffsetMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Earliest start offset in minutes for each full-day request date. Values may be null when time-off estimation is disabled or no estimate is available")
  @JsonProperty("fullDayEarliestStartOffsetMinutes")
  public ListWrapperInteger getFullDayEarliestStartOffsetMinutes() {
    return fullDayEarliestStartOffsetMinutes;
  }
  public void setFullDayEarliestStartOffsetMinutes(ListWrapperInteger fullDayEarliestStartOffsetMinutes) {
    this.fullDayEarliestStartOffsetMinutes = fullDayEarliestStartOffsetMinutes;
  }


  /**
   * Latest end offset in minutes for each full-day request date. Values may be null when time-off estimation is disabled or no estimate is available
   **/
  public AgentTimeOffRequestPatch fullDayLatestEndOffsetMinutes(ListWrapperInteger fullDayLatestEndOffsetMinutes) {
    this.fullDayLatestEndOffsetMinutes = fullDayLatestEndOffsetMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latest end offset in minutes for each full-day request date. Values may be null when time-off estimation is disabled or no estimate is available")
  @JsonProperty("fullDayLatestEndOffsetMinutes")
  public ListWrapperInteger getFullDayLatestEndOffsetMinutes() {
    return fullDayLatestEndOffsetMinutes;
  }
  public void setFullDayLatestEndOffsetMinutes(ListWrapperInteger fullDayLatestEndOffsetMinutes) {
    this.fullDayLatestEndOffsetMinutes = fullDayLatestEndOffsetMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentTimeOffRequestPatch agentTimeOffRequestPatch = (AgentTimeOffRequestPatch) o;

    return Objects.equals(this.markedAsRead, agentTimeOffRequestPatch.markedAsRead) &&
            Objects.equals(this.status, agentTimeOffRequestPatch.status) &&
            Objects.equals(this.notes, agentTimeOffRequestPatch.notes) &&
            Objects.equals(this.fullDayEarliestStartOffsetMinutes, agentTimeOffRequestPatch.fullDayEarliestStartOffsetMinutes) &&
            Objects.equals(this.fullDayLatestEndOffsetMinutes, agentTimeOffRequestPatch.fullDayLatestEndOffsetMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markedAsRead, status, notes, fullDayEarliestStartOffsetMinutes, fullDayLatestEndOffsetMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentTimeOffRequestPatch {\n");
    
    sb.append("    markedAsRead: ").append(toIndentedString(markedAsRead)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    fullDayEarliestStartOffsetMinutes: ").append(toIndentedString(fullDayEarliestStartOffsetMinutes)).append("\n");
    sb.append("    fullDayLatestEndOffsetMinutes: ").append(toIndentedString(fullDayLatestEndOffsetMinutes)).append("\n");
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

