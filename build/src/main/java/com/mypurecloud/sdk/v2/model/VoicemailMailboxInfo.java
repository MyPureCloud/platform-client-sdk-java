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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * VoicemailMailboxInfo
 */

public class VoicemailMailboxInfo  implements Serializable {
  
  private String id = null;

  private static class OwnerTypeEnumDeserializer extends StdDeserializer<OwnerTypeEnum> {
    public OwnerTypeEnumDeserializer() {
      super(OwnerTypeEnumDeserializer.class);
    }

    @Override
    public OwnerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OwnerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The owner type of the voicemail mailbox
   */
 @JsonDeserialize(using = OwnerTypeEnumDeserializer.class)
  public enum OwnerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("User"),
    GROUP("Group"),
    QUEUE("Queue");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OwnerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (OwnerTypeEnum value : OwnerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OwnerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OwnerTypeEnum ownerType = null;
  private Long usageSizeBytes = null;
  private Integer totalCount = null;
  private Integer unreadCount = null;
  private Integer deletedCount = null;
  private Date createdDate = null;
  private Date modifiedDate = null;
  private Date newestUnreadDate = null;
  private Date oldestUnreadDate = null;
  private Date newestReadDate = null;
  private Date oldestReadDate = null;
  private String selfUri = null;

  public VoicemailMailboxInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The owner type of the voicemail mailbox")
  @JsonProperty("ownerType")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }


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


  @ApiModelProperty(example = "null", value = "The date of the most recent unread voicemail message. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("newestUnreadDate")
  public Date getNewestUnreadDate() {
    return newestUnreadDate;
  }


  @ApiModelProperty(example = "null", value = "The date of the most oldest unread voicemail message. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("oldestUnreadDate")
  public Date getOldestUnreadDate() {
    return oldestUnreadDate;
  }


  @ApiModelProperty(example = "null", value = "The date of the most recent read voicemail message. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("newestReadDate")
  public Date getNewestReadDate() {
    return newestReadDate;
  }


  @ApiModelProperty(example = "null", value = "The date of the most oldest read voicemail message. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("oldestReadDate")
  public Date getOldestReadDate() {
    return oldestReadDate;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
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

    return Objects.equals(this.id, voicemailMailboxInfo.id) &&
            Objects.equals(this.ownerType, voicemailMailboxInfo.ownerType) &&
            Objects.equals(this.usageSizeBytes, voicemailMailboxInfo.usageSizeBytes) &&
            Objects.equals(this.totalCount, voicemailMailboxInfo.totalCount) &&
            Objects.equals(this.unreadCount, voicemailMailboxInfo.unreadCount) &&
            Objects.equals(this.deletedCount, voicemailMailboxInfo.deletedCount) &&
            Objects.equals(this.createdDate, voicemailMailboxInfo.createdDate) &&
            Objects.equals(this.modifiedDate, voicemailMailboxInfo.modifiedDate) &&
            Objects.equals(this.newestUnreadDate, voicemailMailboxInfo.newestUnreadDate) &&
            Objects.equals(this.oldestUnreadDate, voicemailMailboxInfo.oldestUnreadDate) &&
            Objects.equals(this.newestReadDate, voicemailMailboxInfo.newestReadDate) &&
            Objects.equals(this.oldestReadDate, voicemailMailboxInfo.oldestReadDate) &&
            Objects.equals(this.selfUri, voicemailMailboxInfo.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerType, usageSizeBytes, totalCount, unreadCount, deletedCount, createdDate, modifiedDate, newestUnreadDate, oldestUnreadDate, newestReadDate, oldestReadDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailMailboxInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    usageSizeBytes: ").append(toIndentedString(usageSizeBytes)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
    sb.append("    deletedCount: ").append(toIndentedString(deletedCount)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    newestUnreadDate: ").append(toIndentedString(newestUnreadDate)).append("\n");
    sb.append("    oldestUnreadDate: ").append(toIndentedString(oldestUnreadDate)).append("\n");
    sb.append("    newestReadDate: ").append(toIndentedString(newestReadDate)).append("\n");
    sb.append("    oldestReadDate: ").append(toIndentedString(oldestReadDate)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

