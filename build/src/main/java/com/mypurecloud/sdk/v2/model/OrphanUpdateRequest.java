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
import java.util.Date;

import java.io.Serializable;
/**
 * OrphanUpdateRequest
 */

public class OrphanUpdateRequest  implements Serializable {
  
  private Date archiveDate = null;
  private Date deleteDate = null;
  private String conversationId = null;

  
  /**
   * The orphan recording's archive date. Must be greater than 1 day from now if set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OrphanUpdateRequest archiveDate(Date archiveDate) {
    this.archiveDate = archiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The orphan recording's archive date. Must be greater than 1 day from now if set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("archiveDate")
  public Date getArchiveDate() {
    return archiveDate;
  }
  public void setArchiveDate(Date archiveDate) {
    this.archiveDate = archiveDate;
  }

  
  /**
   * The orphan recording's delete date. Must be greater than archiveDate if set, otherwise one day from now. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OrphanUpdateRequest deleteDate(Date deleteDate) {
    this.deleteDate = deleteDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The orphan recording's delete date. Must be greater than archiveDate if set, otherwise one day from now. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("deleteDate")
  public Date getDeleteDate() {
    return deleteDate;
  }
  public void setDeleteDate(Date deleteDate) {
    this.deleteDate = deleteDate;
  }

  
  /**
   * A conversation Id that this orphan's recording is to be attached to. If not present, the conversationId will be deduced from the recording media.
   **/
  public OrphanUpdateRequest conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A conversation Id that this orphan's recording is to be attached to. If not present, the conversationId will be deduced from the recording media.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrphanUpdateRequest orphanUpdateRequest = (OrphanUpdateRequest) o;
    return Objects.equals(this.archiveDate, orphanUpdateRequest.archiveDate) &&
        Objects.equals(this.deleteDate, orphanUpdateRequest.deleteDate) &&
        Objects.equals(this.conversationId, orphanUpdateRequest.conversationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveDate, deleteDate, conversationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrphanUpdateRequest {\n");
    
    sb.append("    archiveDate: ").append(toIndentedString(archiveDate)).append("\n");
    sb.append("    deleteDate: ").append(toIndentedString(deleteDate)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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

