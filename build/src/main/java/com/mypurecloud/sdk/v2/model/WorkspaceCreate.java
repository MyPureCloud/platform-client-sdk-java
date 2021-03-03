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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkspaceCreate
 */

public class WorkspaceCreate  implements Serializable {
  
  private String name = null;
  private String bucket = null;
  private String description = null;

  
  /**
   * The workspace name
   **/
  public WorkspaceCreate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The workspace name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public WorkspaceCreate bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bucket")
  public String getBucket() {
    return bucket;
  }
  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  
  /**
   **/
  public WorkspaceCreate description(String description) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceCreate workspaceCreate = (WorkspaceCreate) o;
    return Objects.equals(this.name, workspaceCreate.name) &&
        Objects.equals(this.bucket, workspaceCreate.bucket) &&
        Objects.equals(this.description, workspaceCreate.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bucket, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

