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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Metadata to associate with a given entity
 */
@ApiModel(description = "Metadata to associate with a given entity")

public class WfmVersionedEntityMetadata  implements Serializable {
  
  private Integer version = null;
  private UserReference modifiedBy = null;
  private Date dateModified = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;

  
  /**
   * The version of the associated entity.  Used to prevent conflicts on concurrent edits
   **/
  public WfmVersionedEntityMetadata version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version of the associated entity.  Used to prevent conflicts on concurrent edits")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  @ApiModelProperty(example = "null", value = "The user who last modified the associated entity")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  @ApiModelProperty(example = "null", value = "The date the associated entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The user who created the associated entity, if available")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "The date the associated entity was created, if available. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmVersionedEntityMetadata wfmVersionedEntityMetadata = (WfmVersionedEntityMetadata) o;

    return Objects.equals(this.version, wfmVersionedEntityMetadata.version) &&
            Objects.equals(this.modifiedBy, wfmVersionedEntityMetadata.modifiedBy) &&
            Objects.equals(this.dateModified, wfmVersionedEntityMetadata.dateModified) &&
            Objects.equals(this.createdBy, wfmVersionedEntityMetadata.createdBy) &&
            Objects.equals(this.dateCreated, wfmVersionedEntityMetadata.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, modifiedBy, dateModified, createdBy, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmVersionedEntityMetadata {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

