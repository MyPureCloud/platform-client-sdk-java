package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import com.mypurecloud.sdk.v2.model.GreetingNotificationGreetingAudioFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GreetingNotification
 */

public class GreetingNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String type = null;
  private String ownerType = null;
  private DocumentDataV2NotificationWorkspace owner = null;
  private GreetingNotificationGreetingAudioFile greetingAudioFile = null;
  private String audioTTS = null;

  
  /**
   **/
  public GreetingNotification id(String id) {
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
  public GreetingNotification name(String name) {
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
  public GreetingNotification type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   **/
  public GreetingNotification ownerType(String ownerType) {
    this.ownerType = ownerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ownerType")
  public String getOwnerType() {
    return ownerType;
  }
  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }


  /**
   **/
  public GreetingNotification owner(DocumentDataV2NotificationWorkspace owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("owner")
  public DocumentDataV2NotificationWorkspace getOwner() {
    return owner;
  }
  public void setOwner(DocumentDataV2NotificationWorkspace owner) {
    this.owner = owner;
  }


  /**
   **/
  public GreetingNotification greetingAudioFile(GreetingNotificationGreetingAudioFile greetingAudioFile) {
    this.greetingAudioFile = greetingAudioFile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("greetingAudioFile")
  public GreetingNotificationGreetingAudioFile getGreetingAudioFile() {
    return greetingAudioFile;
  }
  public void setGreetingAudioFile(GreetingNotificationGreetingAudioFile greetingAudioFile) {
    this.greetingAudioFile = greetingAudioFile;
  }


  /**
   **/
  public GreetingNotification audioTTS(String audioTTS) {
    this.audioTTS = audioTTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("audioTTS")
  public String getAudioTTS() {
    return audioTTS;
  }
  public void setAudioTTS(String audioTTS) {
    this.audioTTS = audioTTS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GreetingNotification greetingNotification = (GreetingNotification) o;
    return Objects.equals(this.id, greetingNotification.id) &&
        Objects.equals(this.name, greetingNotification.name) &&
        Objects.equals(this.type, greetingNotification.type) &&
        Objects.equals(this.ownerType, greetingNotification.ownerType) &&
        Objects.equals(this.owner, greetingNotification.owner) &&
        Objects.equals(this.greetingAudioFile, greetingNotification.greetingAudioFile) &&
        Objects.equals(this.audioTTS, greetingNotification.audioTTS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, ownerType, owner, greetingAudioFile, audioTTS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GreetingNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    greetingAudioFile: ").append(toIndentedString(greetingAudioFile)).append("\n");
    sb.append("    audioTTS: ").append(toIndentedString(audioTTS)).append("\n");
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

