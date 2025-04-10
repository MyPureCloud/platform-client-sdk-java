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
 * CustomerStartDetailEventTopicJourneyContext
 */

public class CustomerStartDetailEventTopicJourneyContext  implements Serializable {
  
  private String sessionId = null;
  private String sessionIdType = null;
  private String actionId = null;
  private String actionMapId = null;

  public CustomerStartDetailEventTopicJourneyContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public CustomerStartDetailEventTopicJourneyContext sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   **/
  public CustomerStartDetailEventTopicJourneyContext sessionIdType(String sessionIdType) {
    this.sessionIdType = sessionIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionIdType")
  public String getSessionIdType() {
    return sessionIdType;
  }
  public void setSessionIdType(String sessionIdType) {
    this.sessionIdType = sessionIdType;
  }


  /**
   **/
  public CustomerStartDetailEventTopicJourneyContext actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionId")
  public String getActionId() {
    return actionId;
  }
  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  /**
   **/
  public CustomerStartDetailEventTopicJourneyContext actionMapId(String actionMapId) {
    this.actionMapId = actionMapId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionMapId")
  public String getActionMapId() {
    return actionMapId;
  }
  public void setActionMapId(String actionMapId) {
    this.actionMapId = actionMapId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerStartDetailEventTopicJourneyContext customerStartDetailEventTopicJourneyContext = (CustomerStartDetailEventTopicJourneyContext) o;

    return Objects.equals(this.sessionId, customerStartDetailEventTopicJourneyContext.sessionId) &&
            Objects.equals(this.sessionIdType, customerStartDetailEventTopicJourneyContext.sessionIdType) &&
            Objects.equals(this.actionId, customerStartDetailEventTopicJourneyContext.actionId) &&
            Objects.equals(this.actionMapId, customerStartDetailEventTopicJourneyContext.actionMapId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, sessionIdType, actionId, actionMapId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerStartDetailEventTopicJourneyContext {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionIdType: ").append(toIndentedString(sessionIdType)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionMapId: ").append(toIndentedString(actionMapId)).append("\n");
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

