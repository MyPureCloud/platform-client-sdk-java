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
import com.mypurecloud.sdk.v2.model.ConversationProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GoogleDialogflowConfig
 */

public class GoogleDialogflowConfig  implements Serializable {
  
  private String integrationId = null;
  private List<ConversationProfile> conversationProfiles = new ArrayList<ConversationProfile>();

  
  /**
   * The integration identifier with which the assistant will fetch transcriptions and knowledge suggestions.
   **/
  public GoogleDialogflowConfig integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The integration identifier with which the assistant will fetch transcriptions and knowledge suggestions.")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  /**
   * The conversation profiles for which the assistant will fetch transcription and knowledge suggestions.
   **/
  public GoogleDialogflowConfig conversationProfiles(List<ConversationProfile> conversationProfiles) {
    this.conversationProfiles = conversationProfiles;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The conversation profiles for which the assistant will fetch transcription and knowledge suggestions.")
  @JsonProperty("conversationProfiles")
  public List<ConversationProfile> getConversationProfiles() {
    return conversationProfiles;
  }
  public void setConversationProfiles(List<ConversationProfile> conversationProfiles) {
    this.conversationProfiles = conversationProfiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleDialogflowConfig googleDialogflowConfig = (GoogleDialogflowConfig) o;

    return Objects.equals(this.integrationId, googleDialogflowConfig.integrationId) &&
            Objects.equals(this.conversationProfiles, googleDialogflowConfig.conversationProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, conversationProfiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleDialogflowConfig {\n");
    
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    conversationProfiles: ").append(toIndentedString(conversationProfiles)).append("\n");
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

