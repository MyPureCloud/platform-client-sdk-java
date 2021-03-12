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
import com.mypurecloud.sdk.v2.model.BulkErrorExternalOrganization;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkResponseResultExternalOrganizationExternalOrganization
 */

public class BulkResponseResultExternalOrganizationExternalOrganization  implements Serializable {
  
  private String id = null;
  private Boolean success = null;
  private ExternalOrganization entity = null;
  private BulkErrorExternalOrganization error = null;

  
  /**
   **/
  public BulkResponseResultExternalOrganizationExternalOrganization id(String id) {
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
  public BulkResponseResultExternalOrganizationExternalOrganization success(Boolean success) {
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
  public BulkResponseResultExternalOrganizationExternalOrganization entity(ExternalOrganization entity) {
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
  public BulkResponseResultExternalOrganizationExternalOrganization error(BulkErrorExternalOrganization error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public BulkErrorExternalOrganization getError() {
    return error;
  }
  public void setError(BulkErrorExternalOrganization error) {
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
    BulkResponseResultExternalOrganizationExternalOrganization bulkResponseResultExternalOrganizationExternalOrganization = (BulkResponseResultExternalOrganizationExternalOrganization) o;
    return Objects.equals(this.id, bulkResponseResultExternalOrganizationExternalOrganization.id) &&
        Objects.equals(this.success, bulkResponseResultExternalOrganizationExternalOrganization.success) &&
        Objects.equals(this.entity, bulkResponseResultExternalOrganizationExternalOrganization.entity) &&
        Objects.equals(this.error, bulkResponseResultExternalOrganizationExternalOrganization.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, success, entity, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResponseResultExternalOrganizationExternalOrganization {\n");
    
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

