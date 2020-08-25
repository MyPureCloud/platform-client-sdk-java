package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AvailableTopic
 */

public class AvailableTopic  implements Serializable {
  
  private String description = null;
  private String id = null;
  private List<String> requiresPermissions = new ArrayList<String>();
  private Map<String, Object> schema = null;
  private Boolean requiresCurrentUser = null;
  private Boolean requiresCurrentUserOrPermission = null;

  /**
   * Gets or Sets transports
   */
  public enum TransportsEnum {
    ALL("All"),
    WEBSOCKET("Websocket"),
    EVENTBRIDGE("EventBridge");

    private String value;

    TransportsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TransportsEnum fromString(String key) {
      if (key == null) return null;

      for (TransportsEnum value : TransportsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TransportsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<TransportsEnum> transports = new ArrayList<TransportsEnum>();

  
  /**
   **/
  public AvailableTopic description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public AvailableTopic id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Permissions required to subscribe to the topic
   **/
  public AvailableTopic requiresPermissions(List<String> requiresPermissions) {
    this.requiresPermissions = requiresPermissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Permissions required to subscribe to the topic")
  @JsonProperty("requiresPermissions")
  public List<String> getRequiresPermissions() {
    return requiresPermissions;
  }
  public void setRequiresPermissions(List<String> requiresPermissions) {
    this.requiresPermissions = requiresPermissions;
  }

  
  /**
   **/
  public AvailableTopic schema(Map<String, Object> schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schema")
  public Map<String, Object> getSchema() {
    return schema;
  }
  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }

  
  /**
   * True if the topic user ID is required to match the subscribing user ID
   **/
  public AvailableTopic requiresCurrentUser(Boolean requiresCurrentUser) {
    this.requiresCurrentUser = requiresCurrentUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the topic user ID is required to match the subscribing user ID")
  @JsonProperty("requiresCurrentUser")
  public Boolean getRequiresCurrentUser() {
    return requiresCurrentUser;
  }
  public void setRequiresCurrentUser(Boolean requiresCurrentUser) {
    this.requiresCurrentUser = requiresCurrentUser;
  }

  
  /**
   * True if permissions are only required when the topic user ID does not match the subscribing user ID
   **/
  public AvailableTopic requiresCurrentUserOrPermission(Boolean requiresCurrentUserOrPermission) {
    this.requiresCurrentUserOrPermission = requiresCurrentUserOrPermission;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if permissions are only required when the topic user ID does not match the subscribing user ID")
  @JsonProperty("requiresCurrentUserOrPermission")
  public Boolean getRequiresCurrentUserOrPermission() {
    return requiresCurrentUserOrPermission;
  }
  public void setRequiresCurrentUserOrPermission(Boolean requiresCurrentUserOrPermission) {
    this.requiresCurrentUserOrPermission = requiresCurrentUserOrPermission;
  }

  
  /**
   * Transports that support events for the topic
   **/
  public AvailableTopic transports(List<TransportsEnum> transports) {
    this.transports = transports;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transports that support events for the topic")
  @JsonProperty("transports")
  public List<TransportsEnum> getTransports() {
    return transports;
  }
  public void setTransports(List<TransportsEnum> transports) {
    this.transports = transports;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableTopic availableTopic = (AvailableTopic) o;
    return Objects.equals(this.description, availableTopic.description) &&
        Objects.equals(this.id, availableTopic.id) &&
        Objects.equals(this.requiresPermissions, availableTopic.requiresPermissions) &&
        Objects.equals(this.schema, availableTopic.schema) &&
        Objects.equals(this.requiresCurrentUser, availableTopic.requiresCurrentUser) &&
        Objects.equals(this.requiresCurrentUserOrPermission, availableTopic.requiresCurrentUserOrPermission) &&
        Objects.equals(this.transports, availableTopic.transports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, requiresPermissions, schema, requiresCurrentUser, requiresCurrentUserOrPermission, transports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTopic {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requiresPermissions: ").append(toIndentedString(requiresPermissions)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    requiresCurrentUser: ").append(toIndentedString(requiresCurrentUser)).append("\n");
    sb.append("    requiresCurrentUserOrPermission: ").append(toIndentedString(requiresCurrentUserOrPermission)).append("\n");
    sb.append("    transports: ").append(toIndentedString(transports)).append("\n");
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

