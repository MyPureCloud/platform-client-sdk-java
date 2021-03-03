package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate
 */

public class WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate  implements Serializable {
  

  private static class UpdateTypeEnumDeserializer extends StdDeserializer<UpdateTypeEnum> {
    public UpdateTypeEnumDeserializer() {
      super(UpdateTypeEnumDeserializer.class);
    }

    @Override
    public UpdateTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UpdateTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets updateType
   */
 @JsonDeserialize(using = UpdateTypeEnumDeserializer.class)
  public enum UpdateTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADDED("Added"),
    EDITED("Edited"),
    DELETED("Deleted");

    private String value;

    UpdateTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UpdateTypeEnum fromString(String key) {
      if (key == null) return null;

      for (UpdateTypeEnum value : UpdateTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UpdateTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UpdateTypeEnum updateType = null;
  private List<Date> shiftStartDates = new ArrayList<Date>();

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate updateType(UpdateTypeEnum updateType) {
    this.updateType = updateType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updateType")
  public UpdateTypeEnum getUpdateType() {
    return updateType;
  }
  public void setUpdateType(UpdateTypeEnum updateType) {
    this.updateType = updateType;
  }

  
  /**
   **/
  public WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate shiftStartDates(List<Date> shiftStartDates) {
    this.shiftStartDates = shiftStartDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shiftStartDates")
  public List<Date> getShiftStartDates() {
    return shiftStartDates;
  }
  public void setShiftStartDates(List<Date> shiftStartDates) {
    this.shiftStartDates = shiftStartDates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate wfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate = (WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate) o;
    return Objects.equals(this.updateType, wfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate.updateType) &&
        Objects.equals(this.shiftStartDates, wfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate.shiftStartDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateType, shiftStartDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentScheduleUpdateTopicWfmAgentScheduleUpdate {\n");
    
    sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
    sb.append("    shiftStartDates: ").append(toIndentedString(shiftStartDates)).append("\n");
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

