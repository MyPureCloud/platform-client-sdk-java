package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Meta;
import com.mypurecloud.sdk.v2.model.PatchOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PatchRequest
 */

public class PatchRequest  implements Serializable {
  
  private List<String> schemas = new ArrayList<String>();
  private String id = null;
  private String externalId = null;
  private List<PatchOperation> operations = new ArrayList<PatchOperation>();
  private Meta meta = null;

  
  /**
   **/
  public PatchRequest schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  
  /**
   **/
  public PatchRequest id(String id) {
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
   **/
  public PatchRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  /**
   **/
  public PatchRequest operations(List<PatchOperation> operations) {
    this.operations = operations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Operations")
  public List<PatchOperation> getOperations() {
    return operations;
  }
  public void setOperations(List<PatchOperation> operations) {
    this.operations = operations;
  }

  
  /**
   **/
  public PatchRequest meta(Meta meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("meta")
  public Meta getMeta() {
    return meta;
  }
  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchRequest patchRequest = (PatchRequest) o;
    return Objects.equals(this.schemas, patchRequest.schemas) &&
        Objects.equals(this.id, patchRequest.id) &&
        Objects.equals(this.externalId, patchRequest.externalId) &&
        Objects.equals(this.operations, patchRequest.operations) &&
        Objects.equals(this.meta, patchRequest.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, externalId, operations, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchRequest {\n");
    
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

