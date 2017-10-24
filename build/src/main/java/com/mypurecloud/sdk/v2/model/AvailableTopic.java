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

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public AvailableTopic requiresPermissions(List<String> requiresPermissions) {
    this.requiresPermissions = requiresPermissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
        Objects.equals(this.schema, availableTopic.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, requiresPermissions, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTopic {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requiresPermissions: ").append(toIndentedString(requiresPermissions)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

