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

import java.io.Serializable;
/**
 * ImportStatus
 */

public class ImportStatus  implements Serializable {
  

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
   * current status of the import
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IN_PROGRESS("IN_PROGRESS"),
    FAILED("FAILED");

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
  private Long totalRecords = null;
  private Long completedRecords = null;
  private Integer percentComplete = null;
  private String failureReason = null;

  
  @ApiModelProperty(example = "null", required = true, value = "current status of the import")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "total number of records to be imported")
  @JsonProperty("totalRecords")
  public Long getTotalRecords() {
    return totalRecords;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "number of records finished importing")
  @JsonProperty("completedRecords")
  public Long getCompletedRecords() {
    return completedRecords;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "percentage of records finished importing")
  @JsonProperty("percentComplete")
  public Integer getPercentComplete() {
    return percentComplete;
  }

  
  @ApiModelProperty(example = "null", value = "if the import has failed, the reason for the failure")
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportStatus importStatus = (ImportStatus) o;
    return Objects.equals(this.state, importStatus.state) &&
        Objects.equals(this.totalRecords, importStatus.totalRecords) &&
        Objects.equals(this.completedRecords, importStatus.completedRecords) &&
        Objects.equals(this.percentComplete, importStatus.percentComplete) &&
        Objects.equals(this.failureReason, importStatus.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, totalRecords, completedRecords, percentComplete, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportStatus {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    completedRecords: ").append(toIndentedString(completedRecords)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

