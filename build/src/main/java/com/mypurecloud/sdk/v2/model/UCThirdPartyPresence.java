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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Update a Genesys Cloud user&#39;s presence from a given 3rd-party integration
 */
@ApiModel(description = "Update a Genesys Cloud user's presence from a given 3rd-party integration")

public class UCThirdPartyPresence  implements Serializable {
  
  private String email = null;
  private String presence = null;
  private String message = null;
  private Date dateModified = null;

  public UCThirdPartyPresence() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Primary Email address of the associated Genesys Cloud user.
   **/
  public UCThirdPartyPresence email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Primary Email address of the associated Genesys Cloud user.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * Integration presence value.
   **/
  public UCThirdPartyPresence presence(String presence) {
    this.presence = presence;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Integration presence value.")
  @JsonProperty("presence")
  public String getPresence() {
    return presence;
  }
  public void setPresence(String presence) {
    this.presence = presence;
  }


  /**
   * Integration presence message.
   **/
  public UCThirdPartyPresence message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Integration presence message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * ISO 8601 timestamp of presence value change.
   **/
  public UCThirdPartyPresence dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 8601 timestamp of presence value change.")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UCThirdPartyPresence uCThirdPartyPresence = (UCThirdPartyPresence) o;

    return Objects.equals(this.email, uCThirdPartyPresence.email) &&
            Objects.equals(this.presence, uCThirdPartyPresence.presence) &&
            Objects.equals(this.message, uCThirdPartyPresence.message) &&
            Objects.equals(this.dateModified, uCThirdPartyPresence.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, presence, message, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UCThirdPartyPresence {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

