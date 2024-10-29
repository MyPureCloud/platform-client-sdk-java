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
import com.mypurecloud.sdk.v2.model.ChatPresence;
import com.mypurecloud.sdk.v2.model.Contact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ChatUserRef
 */

public class ChatUserRef  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String selfUri = null;
  private String jid = null;
  private Boolean inactive = null;
  private List<Contact> integrations = new ArrayList<Contact>();
  private ChatPresence presence = null;

  
  /**
   **/
  public ChatUserRef id(String id) {
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
  public ChatUserRef name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public ChatUserRef selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   **/
  public ChatUserRef jid(String jid) {
    this.jid = jid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("jid")
  public String getJid() {
    return jid;
  }
  public void setJid(String jid) {
    this.jid = jid;
  }


  /**
   **/
  public ChatUserRef inactive(Boolean inactive) {
    this.inactive = inactive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inactive")
  public Boolean getInactive() {
    return inactive;
  }
  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }


  /**
   **/
  public ChatUserRef integrations(List<Contact> integrations) {
    this.integrations = integrations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("integrations")
  public List<Contact> getIntegrations() {
    return integrations;
  }
  public void setIntegrations(List<Contact> integrations) {
    this.integrations = integrations;
  }


  /**
   **/
  public ChatUserRef presence(ChatPresence presence) {
    this.presence = presence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presence")
  public ChatPresence getPresence() {
    return presence;
  }
  public void setPresence(ChatPresence presence) {
    this.presence = presence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatUserRef chatUserRef = (ChatUserRef) o;

    return Objects.equals(this.id, chatUserRef.id) &&
            Objects.equals(this.name, chatUserRef.name) &&
            Objects.equals(this.selfUri, chatUserRef.selfUri) &&
            Objects.equals(this.jid, chatUserRef.jid) &&
            Objects.equals(this.inactive, chatUserRef.inactive) &&
            Objects.equals(this.integrations, chatUserRef.integrations) &&
            Objects.equals(this.presence, chatUserRef.presence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, selfUri, jid, inactive, integrations, presence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatUserRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    jid: ").append(toIndentedString(jid)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
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

