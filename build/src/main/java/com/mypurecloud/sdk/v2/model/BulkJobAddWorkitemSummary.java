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
import com.mypurecloud.sdk.v2.model.WorkbinReference;
import com.mypurecloud.sdk.v2.model.WorktypeReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkJobAddWorkitemSummary
 */

public class BulkJobAddWorkitemSummary  implements Serializable {
  
  private String id = null;
  private String name = null;
  private WorkbinReference workbin = null;
  private WorktypeReference type = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public BulkJobAddWorkitemSummary name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The workbin of the workitem.
   **/
  public BulkJobAddWorkitemSummary workbin(WorkbinReference workbin) {
    this.workbin = workbin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The workbin of the workitem.")
  @JsonProperty("workbin")
  public WorkbinReference getWorkbin() {
    return workbin;
  }
  public void setWorkbin(WorkbinReference workbin) {
    this.workbin = workbin;
  }


  /**
   * The worktype of the workitem.
   **/
  public BulkJobAddWorkitemSummary type(WorktypeReference type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The worktype of the workitem.")
  @JsonProperty("type")
  public WorktypeReference getType() {
    return type;
  }
  public void setType(WorktypeReference type) {
    this.type = type;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkJobAddWorkitemSummary bulkJobAddWorkitemSummary = (BulkJobAddWorkitemSummary) o;

    return Objects.equals(this.id, bulkJobAddWorkitemSummary.id) &&
            Objects.equals(this.name, bulkJobAddWorkitemSummary.name) &&
            Objects.equals(this.workbin, bulkJobAddWorkitemSummary.workbin) &&
            Objects.equals(this.type, bulkJobAddWorkitemSummary.type) &&
            Objects.equals(this.selfUri, bulkJobAddWorkitemSummary.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, workbin, type, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkJobAddWorkitemSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workbin: ").append(toIndentedString(workbin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

