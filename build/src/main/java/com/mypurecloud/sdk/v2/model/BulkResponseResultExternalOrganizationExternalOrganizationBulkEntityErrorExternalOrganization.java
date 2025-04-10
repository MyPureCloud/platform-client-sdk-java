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
import com.mypurecloud.sdk.v2.model.BulkEntityErrorExternalOrganization;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization
 */

public class BulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization  implements Serializable {
  
  private String id = null;
  private Boolean success = null;
  private ExternalOrganization entity = null;
  private BulkEntityErrorExternalOrganization error = null;

  public BulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The id associated with this operation. For Bulk Enrich, this id is specified in the request; for all other Bulk endpoints, this id is the id of the affected entity.
   **/
  public BulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id associated with this operation. For Bulk Enrich, this id is specified in the request; for all other Bulk endpoints, this id is the id of the affected entity.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Whether the requested operation completed successfully.
   **/
  public BulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the requested operation completed successfully.")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  /**
   * The entity which was affected by this Bulk operation. Only returned on success.
   **/
  public BulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization entity(ExternalOrganization entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entity which was affected by this Bulk operation. Only returned on success.")
  @JsonProperty("entity")
  public ExternalOrganization getEntity() {
    return entity;
  }
  public void setEntity(ExternalOrganization entity) {
    this.entity = entity;
  }


  /**
   * An error describing why this Bulk operation failed. Only returned on failure.
   **/
  public BulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization error(BulkEntityErrorExternalOrganization error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An error describing why this Bulk operation failed. Only returned on failure.")
  @JsonProperty("error")
  public BulkEntityErrorExternalOrganization getError() {
    return error;
  }
  public void setError(BulkEntityErrorExternalOrganization error) {
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
    BulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization bulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization = (BulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization) o;

    return Objects.equals(this.id, bulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization.id) &&
            Objects.equals(this.success, bulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization.success) &&
            Objects.equals(this.entity, bulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization.entity) &&
            Objects.equals(this.error, bulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, success, entity, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResponseResultExternalOrganizationExternalOrganizationBulkEntityErrorExternalOrganization {\n");
    
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

