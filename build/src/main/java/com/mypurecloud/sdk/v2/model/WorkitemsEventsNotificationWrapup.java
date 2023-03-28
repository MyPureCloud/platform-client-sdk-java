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
 * WorkitemsEventsNotificationWrapup
 */

public class WorkitemsEventsNotificationWrapup  implements Serializable {
  
  private String code = null;
  private String userId = null;

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
    UNKNOWN("Unknown"),
    ADD("Add"),
    REMOVE("Remove");

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

  
  /**
   **/
  public WorkitemsEventsNotificationWrapup code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   **/
  public WorkitemsEventsNotificationWrapup userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public WorkitemsEventsNotificationWrapup op(OpEnum op) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemsEventsNotificationWrapup workitemsEventsNotificationWrapup = (WorkitemsEventsNotificationWrapup) o;

    return Objects.equals(this.code, workitemsEventsNotificationWrapup.code) &&
            Objects.equals(this.userId, workitemsEventsNotificationWrapup.userId) &&
            Objects.equals(this.op, workitemsEventsNotificationWrapup.op);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, userId, op);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsEventsNotificationWrapup {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
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

