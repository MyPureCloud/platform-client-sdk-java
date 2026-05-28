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
import java.util.Date;

import java.io.Serializable;
/**
 * A change in an external event definition
 */
@ApiModel(description = "A change in an external event definition")

public class ExternalEventChange  implements Serializable {
  

  private static class ChangeCategoryEnumDeserializer extends StdDeserializer<ChangeCategoryEnum> {
    public ChangeCategoryEnumDeserializer() {
      super(ChangeCategoryEnumDeserializer.class);
    }

    @Override
    public ChangeCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ChangeCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The category of the change
   */
 @JsonDeserialize(using = ChangeCategoryEnumDeserializer.class)
  public enum ChangeCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ERROR("Error"),
    UPDATED("Updated"),
    NEW("New");

    private String value;

    ChangeCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ChangeCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ChangeCategoryEnum value : ChangeCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ChangeCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ChangeCategoryEnum changeCategory = null;
  private String schemaId = null;
  private String eventName = null;
  private Date dateDetected = null;

  private static class SystemStatusEnumDeserializer extends StdDeserializer<SystemStatusEnum> {
    public SystemStatusEnumDeserializer() {
      super(SystemStatusEnumDeserializer.class);
    }

    @Override
    public SystemStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SystemStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the change
   */
 @JsonDeserialize(using = SystemStatusEnumDeserializer.class)
  public enum SystemStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NEW("New"),
    UPDATED("Updated"),
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    ERROR("Error");

    private String value;

    SystemStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SystemStatusEnum fromString(String key) {
      if (key == null) return null;

      for (SystemStatusEnum value : SystemStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SystemStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SystemStatusEnum systemStatus = null;
  private String errorCode = null;
  private String errorDescription = null;

  public ExternalEventChange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ExternalEventChange(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The category of the change")
  @JsonProperty("changeCategory")
  public ChangeCategoryEnum getChangeCategory() {
    return changeCategory;
  }


  @ApiModelProperty(example = "null", value = "The unique identifier for the schema")
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }


  @ApiModelProperty(example = "null", value = "The name of the event")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }


  @ApiModelProperty(example = "null", value = "The timestamp when the change was detected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDetected")
  public Date getDateDetected() {
    return dateDetected;
  }


  @ApiModelProperty(example = "null", value = "The status of the change")
  @JsonProperty("systemStatus")
  public SystemStatusEnum getSystemStatus() {
    return systemStatus;
  }


  @ApiModelProperty(example = "null", value = "A code representing the error, only present for ERROR category changes")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }


  @ApiModelProperty(example = "null", value = "A description of the error, only present for ERROR category changes")
  @JsonProperty("errorDescription")
  public String getErrorDescription() {
    return errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalEventChange externalEventChange = (ExternalEventChange) o;

    return Objects.equals(this.changeCategory, externalEventChange.changeCategory) &&
            Objects.equals(this.schemaId, externalEventChange.schemaId) &&
            Objects.equals(this.eventName, externalEventChange.eventName) &&
            Objects.equals(this.dateDetected, externalEventChange.dateDetected) &&
            Objects.equals(this.systemStatus, externalEventChange.systemStatus) &&
            Objects.equals(this.errorCode, externalEventChange.errorCode) &&
            Objects.equals(this.errorDescription, externalEventChange.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeCategory, schemaId, eventName, dateDetected, systemStatus, errorCode, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalEventChange {\n");
    
    sb.append("    changeCategory: ").append(toIndentedString(changeCategory)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    dateDetected: ").append(toIndentedString(dateDetected)).append("\n");
    sb.append("    systemStatus: ").append(toIndentedString(systemStatus)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

