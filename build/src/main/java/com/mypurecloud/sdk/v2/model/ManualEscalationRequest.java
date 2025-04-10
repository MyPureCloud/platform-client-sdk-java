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
import com.mypurecloud.sdk.v2.model.EscalationTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ManualEscalationRequest
 */

public class ManualEscalationRequest  implements Serializable {
  
  private String socialMediaNormalizedMessageId = null;
  private EscalationTarget escalationTarget = null;

  public ManualEscalationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The social media normalized message ID to be escalated.
   **/
  public ManualEscalationRequest socialMediaNormalizedMessageId(String socialMediaNormalizedMessageId) {
    this.socialMediaNormalizedMessageId = socialMediaNormalizedMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The social media normalized message ID to be escalated.")
  @JsonProperty("socialMediaNormalizedMessageId")
  public String getSocialMediaNormalizedMessageId() {
    return socialMediaNormalizedMessageId;
  }
  public void setSocialMediaNormalizedMessageId(String socialMediaNormalizedMessageId) {
    this.socialMediaNormalizedMessageId = socialMediaNormalizedMessageId;
  }


  /**
   * The escalation target to which the specified social media normalized message should be routed.
   **/
  public ManualEscalationRequest escalationTarget(EscalationTarget escalationTarget) {
    this.escalationTarget = escalationTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The escalation target to which the specified social media normalized message should be routed.")
  @JsonProperty("escalationTarget")
  public EscalationTarget getEscalationTarget() {
    return escalationTarget;
  }
  public void setEscalationTarget(EscalationTarget escalationTarget) {
    this.escalationTarget = escalationTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualEscalationRequest manualEscalationRequest = (ManualEscalationRequest) o;

    return Objects.equals(this.socialMediaNormalizedMessageId, manualEscalationRequest.socialMediaNormalizedMessageId) &&
            Objects.equals(this.escalationTarget, manualEscalationRequest.escalationTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialMediaNormalizedMessageId, escalationTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualEscalationRequest {\n");
    
    sb.append("    socialMediaNormalizedMessageId: ").append(toIndentedString(socialMediaNormalizedMessageId)).append("\n");
    sb.append("    escalationTarget: ").append(toIndentedString(escalationTarget)).append("\n");
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

