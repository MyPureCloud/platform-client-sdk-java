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

import java.io.Serializable;
/**
 * Used to copy a VoicemailMessage to either a User or a Group
 */
@ApiModel(description = "Used to copy a VoicemailMessage to either a User or a Group")

public class CopyVoicemailMessage  implements Serializable {
  
  private String voicemailMessageId = null;
  private String userId = null;
  private String groupId = null;

  
  /**
   * The id of the VoicemailMessage to copy
   **/
  public CopyVoicemailMessage voicemailMessageId(String voicemailMessageId) {
    this.voicemailMessageId = voicemailMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the VoicemailMessage to copy")
  @JsonProperty("voicemailMessageId")
  public String getVoicemailMessageId() {
    return voicemailMessageId;
  }
  public void setVoicemailMessageId(String voicemailMessageId) {
    this.voicemailMessageId = voicemailMessageId;
  }

  
  /**
   * The id of the User to copy the VoicemailMessage to
   **/
  public CopyVoicemailMessage userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the User to copy the VoicemailMessage to")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The id of the Group to copy the VoicemailMessage to
   **/
  public CopyVoicemailMessage groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the Group to copy the VoicemailMessage to")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyVoicemailMessage copyVoicemailMessage = (CopyVoicemailMessage) o;
    return Objects.equals(this.voicemailMessageId, copyVoicemailMessage.voicemailMessageId) &&
        Objects.equals(this.userId, copyVoicemailMessage.userId) &&
        Objects.equals(this.groupId, copyVoicemailMessage.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voicemailMessageId, userId, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyVoicemailMessage {\n");
    
    sb.append("    voicemailMessageId: ").append(toIndentedString(voicemailMessageId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

