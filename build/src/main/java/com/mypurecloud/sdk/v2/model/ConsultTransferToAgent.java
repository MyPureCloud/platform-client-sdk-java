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

import java.io.Serializable;
/**
 * ConsultTransferToAgent
 */

public class ConsultTransferToAgent  implements Serializable {
  

  private static class SpeakToEnumDeserializer extends StdDeserializer<SpeakToEnum> {
    public SpeakToEnumDeserializer() {
      super(SpeakToEnumDeserializer.class);
    }

    @Override
    public SpeakToEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SpeakToEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Determines to whom the initiating participant is requesting to speak. Defaults to DESTINATION
   */
 @JsonDeserialize(using = SpeakToEnumDeserializer.class)
  public enum SpeakToEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DESTINATION("DESTINATION"),
    OBJECT("OBJECT"),
    BOTH("BOTH"),
    CONFERENCE("CONFERENCE");

    private String value;

    SpeakToEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SpeakToEnum fromString(String key) {
      if (key == null) return null;

      for (SpeakToEnum value : SpeakToEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SpeakToEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SpeakToEnum speakTo = null;
  private String consultingUserId = null;
  private String userId = null;
  private String userDisplayName = null;

  public ConsultTransferToAgent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Determines to whom the initiating participant is requesting to speak. Defaults to DESTINATION
   **/
  public ConsultTransferToAgent speakTo(SpeakToEnum speakTo) {
    this.speakTo = speakTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Determines to whom the initiating participant is requesting to speak. Defaults to DESTINATION")
  @JsonProperty("speakTo")
  public SpeakToEnum getSpeakTo() {
    return speakTo;
  }
  public void setSpeakTo(SpeakToEnum speakTo) {
    this.speakTo = speakTo;
  }


  /**
   * The user ID of the person who wants to talk before completing the transfer. Could be the same of the context user ID
   **/
  public ConsultTransferToAgent consultingUserId(String consultingUserId) {
    this.consultingUserId = consultingUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ID of the person who wants to talk before completing the transfer. Could be the same of the context user ID")
  @JsonProperty("consultingUserId")
  public String getConsultingUserId() {
    return consultingUserId;
  }
  public void setConsultingUserId(String consultingUserId) {
    this.consultingUserId = consultingUserId;
  }


  /**
   * The id of the internal user.
   **/
  public ConsultTransferToAgent userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the internal user.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * The name of the internal user.
   **/
  public ConsultTransferToAgent userDisplayName(String userDisplayName) {
    this.userDisplayName = userDisplayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the internal user.")
  @JsonProperty("userDisplayName")
  public String getUserDisplayName() {
    return userDisplayName;
  }
  public void setUserDisplayName(String userDisplayName) {
    this.userDisplayName = userDisplayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultTransferToAgent consultTransferToAgent = (ConsultTransferToAgent) o;

    return Objects.equals(this.speakTo, consultTransferToAgent.speakTo) &&
            Objects.equals(this.consultingUserId, consultTransferToAgent.consultingUserId) &&
            Objects.equals(this.userId, consultTransferToAgent.userId) &&
            Objects.equals(this.userDisplayName, consultTransferToAgent.userDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speakTo, consultingUserId, userId, userDisplayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultTransferToAgent {\n");
    
    sb.append("    speakTo: ").append(toIndentedString(speakTo)).append("\n");
    sb.append("    consultingUserId: ").append(toIndentedString(consultingUserId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userDisplayName: ").append(toIndentedString(userDisplayName)).append("\n");
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

