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
import com.mypurecloud.sdk.v2.model.UserGreetingEventGreetingAudioFile;
import com.mypurecloud.sdk.v2.model.UserGreetingEventGreetingOwner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserGreetingEventGreeting
 */

public class UserGreetingEventGreeting  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String type = null;
  private String ownerType = null;
  private UserGreetingEventGreetingOwner owner = null;
  private UserGreetingEventGreetingAudioFile greetingAudioFile = null;
  private String audioTTS = null;

  
  /**
   **/
  public UserGreetingEventGreeting id(String id) {
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
  public UserGreetingEventGreeting name(String name) {
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
  public UserGreetingEventGreeting type(String type) {
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
  public UserGreetingEventGreeting ownerType(String ownerType) {
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
  public UserGreetingEventGreeting owner(UserGreetingEventGreetingOwner owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("owner")
  public UserGreetingEventGreetingOwner getOwner() {
    return owner;
  }
  public void setOwner(UserGreetingEventGreetingOwner owner) {
    this.owner = owner;
  }

  
  /**
   **/
  public UserGreetingEventGreeting greetingAudioFile(UserGreetingEventGreetingAudioFile greetingAudioFile) {
    this.greetingAudioFile = greetingAudioFile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("greetingAudioFile")
  public UserGreetingEventGreetingAudioFile getGreetingAudioFile() {
    return greetingAudioFile;
  }
  public void setGreetingAudioFile(UserGreetingEventGreetingAudioFile greetingAudioFile) {
    this.greetingAudioFile = greetingAudioFile;
  }

  
  /**
   **/
  public UserGreetingEventGreeting audioTTS(String audioTTS) {
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
    UserGreetingEventGreeting userGreetingEventGreeting = (UserGreetingEventGreeting) o;
    return Objects.equals(this.id, userGreetingEventGreeting.id) &&
        Objects.equals(this.name, userGreetingEventGreeting.name) &&
        Objects.equals(this.type, userGreetingEventGreeting.type) &&
        Objects.equals(this.ownerType, userGreetingEventGreeting.ownerType) &&
        Objects.equals(this.owner, userGreetingEventGreeting.owner) &&
        Objects.equals(this.greetingAudioFile, userGreetingEventGreeting.greetingAudioFile) &&
        Objects.equals(this.audioTTS, userGreetingEventGreeting.audioTTS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, ownerType, owner, greetingAudioFile, audioTTS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGreetingEventGreeting {\n");
    
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

