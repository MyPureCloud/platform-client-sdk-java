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
import com.mypurecloud.sdk.v2.model.VoicemailMessagesTopicOwner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * VoicemailMessagesTopicVoicemailCopyRecord
 */

public class VoicemailMessagesTopicVoicemailCopyRecord  implements Serializable {
  
  private VoicemailMessagesTopicOwner user = null;
  private VoicemailMessagesTopicOwner group = null;

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailCopyRecord user(VoicemailMessagesTopicOwner user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public VoicemailMessagesTopicOwner getUser() {
    return user;
  }
  public void setUser(VoicemailMessagesTopicOwner user) {
    this.user = user;
  }

  
  /**
   **/
  public VoicemailMessagesTopicVoicemailCopyRecord group(VoicemailMessagesTopicOwner group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("group")
  public VoicemailMessagesTopicOwner getGroup() {
    return group;
  }
  public void setGroup(VoicemailMessagesTopicOwner group) {
    this.group = group;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailMessagesTopicVoicemailCopyRecord voicemailMessagesTopicVoicemailCopyRecord = (VoicemailMessagesTopicVoicemailCopyRecord) o;
    return Objects.equals(this.user, voicemailMessagesTopicVoicemailCopyRecord.user) &&
        Objects.equals(this.group, voicemailMessagesTopicVoicemailCopyRecord.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailMessagesTopicVoicemailCopyRecord {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

