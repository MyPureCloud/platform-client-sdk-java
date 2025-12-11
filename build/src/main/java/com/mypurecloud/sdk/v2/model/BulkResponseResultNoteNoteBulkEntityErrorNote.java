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
import com.mypurecloud.sdk.v2.model.BulkEntityErrorNote;
import com.mypurecloud.sdk.v2.model.Note;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkResponseResultNoteNoteBulkEntityErrorNote
 */

public class BulkResponseResultNoteNoteBulkEntityErrorNote  implements Serializable {
  
  private String id = null;
  private Boolean success = null;
  private Note entity = null;
  private BulkEntityErrorNote error = null;
  private Integer status = null;

  public BulkResponseResultNoteNoteBulkEntityErrorNote() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The id associated with this operation. For Bulk Enrich, this id is specified in the request; for all other Bulk endpoints, this id is the id of the affected entity.
   **/
  public BulkResponseResultNoteNoteBulkEntityErrorNote id(String id) {
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
  public BulkResponseResultNoteNoteBulkEntityErrorNote success(Boolean success) {
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
  public BulkResponseResultNoteNoteBulkEntityErrorNote entity(Note entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entity which was affected by this Bulk operation. Only returned on success.")
  @JsonProperty("entity")
  public Note getEntity() {
    return entity;
  }
  public void setEntity(Note entity) {
    this.entity = entity;
  }


  /**
   * An error describing why this Bulk operation failed. Only returned on failure.
   **/
  public BulkResponseResultNoteNoteBulkEntityErrorNote error(BulkEntityErrorNote error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An error describing why this Bulk operation failed. Only returned on failure.")
  @JsonProperty("error")
  public BulkEntityErrorNote getError() {
    return error;
  }
  public void setError(BulkEntityErrorNote error) {
    this.error = error;
  }


  /**
   * Status Code for the requested operation.
   **/
  public BulkResponseResultNoteNoteBulkEntityErrorNote status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status Code for the requested operation.")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkResponseResultNoteNoteBulkEntityErrorNote bulkResponseResultNoteNoteBulkEntityErrorNote = (BulkResponseResultNoteNoteBulkEntityErrorNote) o;

    return Objects.equals(this.id, bulkResponseResultNoteNoteBulkEntityErrorNote.id) &&
            Objects.equals(this.success, bulkResponseResultNoteNoteBulkEntityErrorNote.success) &&
            Objects.equals(this.entity, bulkResponseResultNoteNoteBulkEntityErrorNote.entity) &&
            Objects.equals(this.error, bulkResponseResultNoteNoteBulkEntityErrorNote.error) &&
            Objects.equals(this.status, bulkResponseResultNoteNoteBulkEntityErrorNote.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, success, entity, error, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResponseResultNoteNoteBulkEntityErrorNote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

