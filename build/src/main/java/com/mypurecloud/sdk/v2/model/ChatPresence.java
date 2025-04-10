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
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ChatPresence
 */

public class ChatPresence  implements Serializable {
  
  private String source = null;
  private OrganizationPresence organizationPresence = null;

  private static class SystemPresenceEnumDeserializer extends StdDeserializer<SystemPresenceEnum> {
    public SystemPresenceEnumDeserializer() {
      super(SystemPresenceEnumDeserializer.class);
    }

    @Override
    public SystemPresenceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SystemPresenceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets systemPresence
   */
 @JsonDeserialize(using = SystemPresenceEnumDeserializer.class)
  public enum SystemPresenceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AVAILABLE("Available"),
    AWAY("Away"),
    BUSY("Busy"),
    OFFLINE("Offline"),
    IDLE("Idle"),
    ONQUEUE("OnQueue"),
    MEAL("Meal"),
    TRAINING("Training"),
    MEETING("Meeting"),
    BREAK("Break");

    private String value;

    SystemPresenceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SystemPresenceEnum fromString(String key) {
      if (key == null) return null;

      for (SystemPresenceEnum value : SystemPresenceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SystemPresenceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SystemPresenceEnum systemPresence = null;
  private String message = null;
  private Date dateModified = null;
  private OutOfOffice outOfOffice = null;

  public ChatPresence() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ChatPresence source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   **/
  public ChatPresence organizationPresence(OrganizationPresence organizationPresence) {
    this.organizationPresence = organizationPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("organizationPresence")
  public OrganizationPresence getOrganizationPresence() {
    return organizationPresence;
  }
  public void setOrganizationPresence(OrganizationPresence organizationPresence) {
    this.organizationPresence = organizationPresence;
  }


  /**
   **/
  public ChatPresence systemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("systemPresence")
  public SystemPresenceEnum getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
  }


  /**
   **/
  public ChatPresence message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ChatPresence dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   **/
  public ChatPresence outOfOffice(OutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outOfOffice")
  public OutOfOffice getOutOfOffice() {
    return outOfOffice;
  }
  public void setOutOfOffice(OutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatPresence chatPresence = (ChatPresence) o;

    return Objects.equals(this.source, chatPresence.source) &&
            Objects.equals(this.organizationPresence, chatPresence.organizationPresence) &&
            Objects.equals(this.systemPresence, chatPresence.systemPresence) &&
            Objects.equals(this.message, chatPresence.message) &&
            Objects.equals(this.dateModified, chatPresence.dateModified) &&
            Objects.equals(this.outOfOffice, chatPresence.outOfOffice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, organizationPresence, systemPresence, message, dateModified, outOfOffice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatPresence {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    organizationPresence: ").append(toIndentedString(organizationPresence)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    outOfOffice: ").append(toIndentedString(outOfOffice)).append("\n");
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

