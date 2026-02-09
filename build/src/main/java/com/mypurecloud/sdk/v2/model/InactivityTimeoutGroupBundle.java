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
 * InactivityTimeoutGroupBundle
 */

public class InactivityTimeoutGroupBundle  implements Serializable {
  
  private Integer priority = null;
  private Integer timeoutSeconds = null;

  private static class InactivityTimeoutUnitEnumDeserializer extends StdDeserializer<InactivityTimeoutUnitEnum> {
    public InactivityTimeoutUnitEnumDeserializer() {
      super(InactivityTimeoutUnitEnumDeserializer.class);
    }

    @Override
    public InactivityTimeoutUnitEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InactivityTimeoutUnitEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The unit for the timeout (MINUTES or HOURS).
   */
 @JsonDeserialize(using = InactivityTimeoutUnitEnumDeserializer.class)
  public enum InactivityTimeoutUnitEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MINUTES("Minutes"),
    HOURS("Hours");

    private String value;

    InactivityTimeoutUnitEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InactivityTimeoutUnitEnum fromString(String key) {
      if (key == null) return null;

      for (InactivityTimeoutUnitEnum value : InactivityTimeoutUnitEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InactivityTimeoutUnitEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InactivityTimeoutUnitEnum inactivityTimeoutUnit = null;
  private List<String> groups = null;

  public InactivityTimeoutGroupBundle() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      groups = new ArrayList<String>();
    }
  }

  
  /**
   * The priority of the group bundle (1-5).
   **/
  public InactivityTimeoutGroupBundle priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The priority of the group bundle (1-5).")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   * The timeout value in seconds (300 to 28800, representing 5 to 480 minutes).
   **/
  public InactivityTimeoutGroupBundle timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timeout value in seconds (300 to 28800, representing 5 to 480 minutes).")
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  /**
   * The unit for the timeout (MINUTES or HOURS).
   **/
  public InactivityTimeoutGroupBundle inactivityTimeoutUnit(InactivityTimeoutUnitEnum inactivityTimeoutUnit) {
    this.inactivityTimeoutUnit = inactivityTimeoutUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unit for the timeout (MINUTES or HOURS).")
  @JsonProperty("inactivityTimeoutUnit")
  public InactivityTimeoutUnitEnum getInactivityTimeoutUnit() {
    return inactivityTimeoutUnit;
  }
  public void setInactivityTimeoutUnit(InactivityTimeoutUnitEnum inactivityTimeoutUnit) {
    this.inactivityTimeoutUnit = inactivityTimeoutUnit;
  }


  /**
   * The list of group IDs to select.
   **/
  public InactivityTimeoutGroupBundle groups(List<String> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of group IDs to select.")
  @JsonProperty("groups")
  public List<String> getGroups() {
    return groups;
  }
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InactivityTimeoutGroupBundle inactivityTimeoutGroupBundle = (InactivityTimeoutGroupBundle) o;

    return Objects.equals(this.priority, inactivityTimeoutGroupBundle.priority) &&
            Objects.equals(this.timeoutSeconds, inactivityTimeoutGroupBundle.timeoutSeconds) &&
            Objects.equals(this.inactivityTimeoutUnit, inactivityTimeoutGroupBundle.inactivityTimeoutUnit) &&
            Objects.equals(this.groups, inactivityTimeoutGroupBundle.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, timeoutSeconds, inactivityTimeoutUnit, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InactivityTimeoutGroupBundle {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    inactivityTimeoutUnit: ").append(toIndentedString(inactivityTimeoutUnit)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

