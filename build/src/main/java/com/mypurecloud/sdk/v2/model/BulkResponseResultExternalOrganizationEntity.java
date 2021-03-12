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
import com.mypurecloud.sdk.v2.model.BulkErrorEntity;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkResponseResultExternalOrganizationEntity
 */

public class BulkResponseResultExternalOrganizationEntity  implements Serializable {
  
  private String id = null;
  private Boolean success = null;
  private ExternalOrganization entity = null;
  private BulkErrorEntity error = null;

  
  /**
   **/
  public BulkResponseResultExternalOrganizationEntity id(String id) {
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
  public BulkResponseResultExternalOrganizationEntity success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  /**
   **/
  public BulkResponseResultExternalOrganizationEntity entity(ExternalOrganization entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entity")
  public ExternalOrganization getEntity() {
    return entity;
  }
  public void setEntity(ExternalOrganization entity) {
    this.entity = entity;
  }

  
  /**
   **/
  public BulkResponseResultExternalOrganizationEntity error(BulkErrorEntity error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public BulkErrorEntity getError() {
    return error;
  }
  public void setError(BulkErrorEntity error) {
    this.error = error;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkResponseResultExternalOrganizationEntity bulkResponseResultExternalOrganizationEntity = (BulkResponseResultExternalOrganizationEntity) o;
    return Objects.equals(this.id, bulkResponseResultExternalOrganizationEntity.id) &&
        Objects.equals(this.success, bulkResponseResultExternalOrganizationEntity.success) &&
        Objects.equals(this.entity, bulkResponseResultExternalOrganizationEntity.entity) &&
        Objects.equals(this.error, bulkResponseResultExternalOrganizationEntity.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, success, entity, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResponseResultExternalOrganizationEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

