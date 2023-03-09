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
 * WorkitemsQueueEventsNotificationDelta
 */

public class WorkitemsQueueEventsNotificationDelta  implements Serializable {
  

  private static class OpEnumDeserializer extends StdDeserializer<OpEnum> {
    public OpEnumDeserializer() {
      super(OpEnumDeserializer.class);
    }

    @Override
    public OpEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OpEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets op
   */
 @JsonDeserialize(using = OpEnumDeserializer.class)
  public enum OpEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADD("add"),
    REMOVE("remove"),
    REPLACE("replace"),
    UNKNOWN("unknown");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OpEnum fromString(String key) {
      if (key == null) return null;

      for (OpEnum value : OpEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OpEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OpEnum op = null;
  private String field = null;
  private String oldValue = null;
  private String newValue = null;

  
  /**
   **/
  public WorkitemsQueueEventsNotificationDelta op(OpEnum op) {
    this.op = op;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("op")
  public OpEnum getOp() {
    return op;
  }
  public void setOp(OpEnum op) {
    this.op = op;
  }


  /**
   **/
  public WorkitemsQueueEventsNotificationDelta field(String field) {
    this.field = field;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }


  /**
   **/
  public WorkitemsQueueEventsNotificationDelta oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oldValue")
  public String getOldValue() {
    return oldValue;
  }
  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }


  /**
   **/
  public WorkitemsQueueEventsNotificationDelta newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("newValue")
  public String getNewValue() {
    return newValue;
  }
  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemsQueueEventsNotificationDelta workitemsQueueEventsNotificationDelta = (WorkitemsQueueEventsNotificationDelta) o;

    return Objects.equals(this.op, workitemsQueueEventsNotificationDelta.op) &&
            Objects.equals(this.field, workitemsQueueEventsNotificationDelta.field) &&
            Objects.equals(this.oldValue, workitemsQueueEventsNotificationDelta.oldValue) &&
            Objects.equals(this.newValue, workitemsQueueEventsNotificationDelta.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, field, oldValue, newValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsQueueEventsNotificationDelta {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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

