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

import java.io.Serializable;
/**
 * Notification parameters for Apple Invitation
 */
@ApiModel(description = "Notification parameters for Apple Invitation")

public class AppleInvitationNotificationParameters  implements Serializable {
  
  private String referenceId = null;

  public AppleInvitationNotificationParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AppleInvitationNotificationParameters(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Provides context for the notification message, such as an order number or case ID.
   **/
  public AppleInvitationNotificationParameters referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides context for the notification message, such as an order number or case ID.")
  @JsonProperty("referenceId")
  public String getReferenceId() {
    return referenceId;
  }
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppleInvitationNotificationParameters appleInvitationNotificationParameters = (AppleInvitationNotificationParameters) o;

    return Objects.equals(this.referenceId, appleInvitationNotificationParameters.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleInvitationNotificationParameters {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

