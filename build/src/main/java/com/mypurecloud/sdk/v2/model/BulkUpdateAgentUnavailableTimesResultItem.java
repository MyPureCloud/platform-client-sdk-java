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
import com.mypurecloud.sdk.v2.model.TargetUnavailableTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkUpdateAgentUnavailableTimesResultItem
 */

public class BulkUpdateAgentUnavailableTimesResultItem  implements Serializable {
  
  private TargetUnavailableTime unavailableTime = null;

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
   * The status of the operation
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETE("Complete"),
    ERROR("Error"),
    SKIPPED("Skipped");

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

  public BulkUpdateAgentUnavailableTimesResultItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BulkUpdateAgentUnavailableTimesResultItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The unavailable time that was created, updated, or deleted. Populated when the operation completed successfully
   **/
  public BulkUpdateAgentUnavailableTimesResultItem unavailableTime(TargetUnavailableTime unavailableTime) {
    this.unavailableTime = unavailableTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unavailable time that was created, updated, or deleted. Populated when the operation completed successfully")
  @JsonProperty("unavailableTime")
  public TargetUnavailableTime getUnavailableTime() {
    return unavailableTime;
  }
  public void setUnavailableTime(TargetUnavailableTime unavailableTime) {
    this.unavailableTime = unavailableTime;
  }


  /**
   * The status of the operation
   **/
  public BulkUpdateAgentUnavailableTimesResultItem status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the operation")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUpdateAgentUnavailableTimesResultItem bulkUpdateAgentUnavailableTimesResultItem = (BulkUpdateAgentUnavailableTimesResultItem) o;

    return Objects.equals(this.unavailableTime, bulkUpdateAgentUnavailableTimesResultItem.unavailableTime) &&
            Objects.equals(this.status, bulkUpdateAgentUnavailableTimesResultItem.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unavailableTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpdateAgentUnavailableTimesResultItem {\n");
    
    sb.append("    unavailableTime: ").append(toIndentedString(unavailableTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

