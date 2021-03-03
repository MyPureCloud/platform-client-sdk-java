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
 * VoicemailMailboxInfo
 */

public class VoicemailMailboxInfo  implements Serializable {
  
  private Long usageSizeBytes = null;
  private Integer totalCount = null;
  private Integer unreadCount = null;
  private Integer deletedCount = null;
  private Date createdDate = null;
  private Date modifiedDate = null;

  
  @ApiModelProperty(example = "null", value = "The total number of bytes for all voicemail message audio recordings")
  @JsonProperty("usageSizeBytes")
  public Long getUsageSizeBytes() {
    return usageSizeBytes;
  }

  
  @ApiModelProperty(example = "null", value = "The total number of voicemail messages")
  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }

  
  @ApiModelProperty(example = "null", value = "The total number of voicemail messages marked as unread")
  @JsonProperty("unreadCount")
  public Integer getUnreadCount() {
    return unreadCount;
  }

  
  @ApiModelProperty(example = "null", value = "The total number of voicemail messages marked as deleted")
  @JsonProperty("deletedCount")
  public Integer getDeletedCount() {
    return deletedCount;
  }

  
  @ApiModelProperty(example = "null", value = "The date of the oldest voicemail message. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }

  
  @ApiModelProperty(example = "null", value = "The date of the most recent voicemail message. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailMailboxInfo voicemailMailboxInfo = (VoicemailMailboxInfo) o;
    return Objects.equals(this.usageSizeBytes, voicemailMailboxInfo.usageSizeBytes) &&
        Objects.equals(this.totalCount, voicemailMailboxInfo.totalCount) &&
        Objects.equals(this.unreadCount, voicemailMailboxInfo.unreadCount) &&
        Objects.equals(this.deletedCount, voicemailMailboxInfo.deletedCount) &&
        Objects.equals(this.createdDate, voicemailMailboxInfo.createdDate) &&
        Objects.equals(this.modifiedDate, voicemailMailboxInfo.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageSizeBytes, totalCount, unreadCount, deletedCount, createdDate, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailMailboxInfo {\n");
    
    sb.append("    usageSizeBytes: ").append(toIndentedString(usageSizeBytes)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
    sb.append("    deletedCount: ").append(toIndentedString(deletedCount)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

