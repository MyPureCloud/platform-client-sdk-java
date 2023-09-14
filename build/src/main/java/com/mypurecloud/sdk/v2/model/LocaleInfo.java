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
import com.mypurecloud.sdk.v2.model.FlowHealthErrorInfo;
import com.mypurecloud.sdk.v2.model.LocaleFlowVersionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LocaleInfo
 */

public class LocaleInfo  implements Serializable {
  

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
   * Status of health computation for this flow version.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    ERROR("Error");

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
  private FlowHealthErrorInfo errorInfo = null;
  private LocaleFlowVersionInfo flowVersionInfo = null;

  
  /**
   * Status of health computation for this flow version.
   **/
  public LocaleInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of health computation for this flow version.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Error details for the flow version, if any.
   **/
  public LocaleInfo errorInfo(FlowHealthErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error details for the flow version, if any.")
  @JsonProperty("errorInfo")
  public FlowHealthErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(FlowHealthErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   * Info about given flow version.
   **/
  public LocaleInfo flowVersionInfo(LocaleFlowVersionInfo flowVersionInfo) {
    this.flowVersionInfo = flowVersionInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Info about given flow version.")
  @JsonProperty("flowVersionInfo")
  public LocaleFlowVersionInfo getFlowVersionInfo() {
    return flowVersionInfo;
  }
  public void setFlowVersionInfo(LocaleFlowVersionInfo flowVersionInfo) {
    this.flowVersionInfo = flowVersionInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocaleInfo localeInfo = (LocaleInfo) o;

    return Objects.equals(this.status, localeInfo.status) &&
            Objects.equals(this.errorInfo, localeInfo.errorInfo) &&
            Objects.equals(this.flowVersionInfo, localeInfo.flowVersionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errorInfo, flowVersionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocaleInfo {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    flowVersionInfo: ").append(toIndentedString(flowVersionInfo)).append("\n");
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

