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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Settings
 */

public class Settings  implements Serializable {
  
  private Boolean communicationBasedACW = null;
  private Boolean includeNonAgentConversationSummary = null;

  
  /**
   * Communication Based ACW
   **/
  public Settings communicationBasedACW(Boolean communicationBasedACW) {
    this.communicationBasedACW = communicationBasedACW;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Communication Based ACW")
  @JsonProperty("communicationBasedACW")
  public Boolean getCommunicationBasedACW() {
    return communicationBasedACW;
  }
  public void setCommunicationBasedACW(Boolean communicationBasedACW) {
    this.communicationBasedACW = communicationBasedACW;
  }


  /**
   * Display communication summary
   **/
  public Settings includeNonAgentConversationSummary(Boolean includeNonAgentConversationSummary) {
    this.includeNonAgentConversationSummary = includeNonAgentConversationSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Display communication summary")
  @JsonProperty("includeNonAgentConversationSummary")
  public Boolean getIncludeNonAgentConversationSummary() {
    return includeNonAgentConversationSummary;
  }
  public void setIncludeNonAgentConversationSummary(Boolean includeNonAgentConversationSummary) {
    this.includeNonAgentConversationSummary = includeNonAgentConversationSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;

    return Objects.equals(this.communicationBasedACW, settings.communicationBasedACW) &&
            Objects.equals(this.includeNonAgentConversationSummary, settings.includeNonAgentConversationSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationBasedACW, includeNonAgentConversationSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    
    sb.append("    communicationBasedACW: ").append(toIndentedString(communicationBasedACW)).append("\n");
    sb.append("    includeNonAgentConversationSummary: ").append(toIndentedString(includeNonAgentConversationSummary)).append("\n");
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

