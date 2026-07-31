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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WfmEntityMetadata
 */

public class WfmEntityMetadata  implements Serializable {
  
  private UserReference modifiedBy = null;
  private Date dateModified = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;

  public WfmEntityMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmEntityMetadata(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The user who last modified the associated entity. The id may be 'System' if it was an automated process")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  @ApiModelProperty(example = "null", value = "The date the associated entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The user who created the associated entity, if available. The id may be 'System' if it was an automated process")
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
    WfmEntityMetadata wfmEntityMetadata = (WfmEntityMetadata) o;

    return Objects.equals(this.modifiedBy, wfmEntityMetadata.modifiedBy) &&
            Objects.equals(this.dateModified, wfmEntityMetadata.dateModified) &&
            Objects.equals(this.createdBy, wfmEntityMetadata.createdBy) &&
            Objects.equals(this.dateCreated, wfmEntityMetadata.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedBy, dateModified, createdBy, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmEntityMetadata {\n");
    
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

