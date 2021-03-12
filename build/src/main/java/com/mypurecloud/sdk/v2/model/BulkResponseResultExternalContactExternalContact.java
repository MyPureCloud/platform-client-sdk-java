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
import com.mypurecloud.sdk.v2.model.BulkErrorExternalContact;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkResponseResultExternalContactExternalContact
 */

public class BulkResponseResultExternalContactExternalContact  implements Serializable {
  
  private String id = null;
  private Boolean success = null;
  private ExternalContact entity = null;
  private BulkErrorExternalContact error = null;

  
  /**
   **/
  public BulkResponseResultExternalContactExternalContact id(String id) {
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
  public BulkResponseResultExternalContactExternalContact success(Boolean success) {
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
  public BulkResponseResultExternalContactExternalContact entity(ExternalContact entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entity")
  public ExternalContact getEntity() {
    return entity;
  }
  public void setEntity(ExternalContact entity) {
    this.entity = entity;
  }

  
  /**
   **/
  public BulkResponseResultExternalContactExternalContact error(BulkErrorExternalContact error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public BulkErrorExternalContact getError() {
    return error;
  }
  public void setError(BulkErrorExternalContact error) {
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
    BulkResponseResultExternalContactExternalContact bulkResponseResultExternalContactExternalContact = (BulkResponseResultExternalContactExternalContact) o;
    return Objects.equals(this.id, bulkResponseResultExternalContactExternalContact.id) &&
        Objects.equals(this.success, bulkResponseResultExternalContactExternalContact.success) &&
        Objects.equals(this.entity, bulkResponseResultExternalContactExternalContact.entity) &&
        Objects.equals(this.error, bulkResponseResultExternalContactExternalContact.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, success, entity, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResponseResultExternalContactExternalContact {\n");
    
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

