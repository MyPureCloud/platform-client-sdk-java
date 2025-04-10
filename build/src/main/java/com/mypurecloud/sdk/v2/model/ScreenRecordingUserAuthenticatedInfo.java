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
 * ScreenRecordingUserAuthenticatedInfo
 */

public class ScreenRecordingUserAuthenticatedInfo  implements Serializable {
  
  private String backgroundAssistantId = null;

  public ScreenRecordingUserAuthenticatedInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Id of Genesys Cloud Background Assistant
   **/
  public ScreenRecordingUserAuthenticatedInfo backgroundAssistantId(String backgroundAssistantId) {
    this.backgroundAssistantId = backgroundAssistantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id of Genesys Cloud Background Assistant")
  @JsonProperty("backgroundAssistantId")
  public String getBackgroundAssistantId() {
    return backgroundAssistantId;
  }
  public void setBackgroundAssistantId(String backgroundAssistantId) {
    this.backgroundAssistantId = backgroundAssistantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenRecordingUserAuthenticatedInfo screenRecordingUserAuthenticatedInfo = (ScreenRecordingUserAuthenticatedInfo) o;

    return Objects.equals(this.backgroundAssistantId, screenRecordingUserAuthenticatedInfo.backgroundAssistantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundAssistantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenRecordingUserAuthenticatedInfo {\n");
    
    sb.append("    backgroundAssistantId: ").append(toIndentedString(backgroundAssistantId)).append("\n");
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

