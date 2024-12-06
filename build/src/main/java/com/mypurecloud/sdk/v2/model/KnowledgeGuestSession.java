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
import com.mypurecloud.sdk.v2.model.KnowledgeGuestSessionApp;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestSessionContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeGuestSession
 */

public class KnowledgeGuestSession  implements Serializable {
  
  private String id = null;
  private KnowledgeGuestSessionApp app = null;
  private String customerId = null;
  private String pageUrl = null;
  private List<KnowledgeGuestSessionContext> contexts = new ArrayList<KnowledgeGuestSessionContext>();
  private String journeySessionId = null;

  
  @ApiModelProperty(example = "null", value = "Session ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The app where the session is started.
   **/
  public KnowledgeGuestSession app(KnowledgeGuestSessionApp app) {
    this.app = app;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The app where the session is started.")
  @JsonProperty("app")
  public KnowledgeGuestSessionApp getApp() {
    return app;
  }
  public void setApp(KnowledgeGuestSessionApp app) {
    this.app = app;
  }


  /**
   * An arbitrary ID for the customer starting the session. Used to track multiple sessions started by the same customer.
   **/
  public KnowledgeGuestSession customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An arbitrary ID for the customer starting the session. Used to track multiple sessions started by the same customer.")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  /**
   * URL of the page where the session is started.
   **/
  public KnowledgeGuestSession pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of the page where the session is started.")
  @JsonProperty("pageUrl")
  public String getPageUrl() {
    return pageUrl;
  }
  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }


  /**
   * The session contexts.
   **/
  public KnowledgeGuestSession contexts(List<KnowledgeGuestSessionContext> contexts) {
    this.contexts = contexts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The session contexts.")
  @JsonProperty("contexts")
  public List<KnowledgeGuestSessionContext> getContexts() {
    return contexts;
  }
  public void setContexts(List<KnowledgeGuestSessionContext> contexts) {
    this.contexts = contexts;
  }


  /**
   * Journey session ID. Used to get the segments of the customer to filter search results.
   **/
  public KnowledgeGuestSession journeySessionId(String journeySessionId) {
    this.journeySessionId = journeySessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Journey session ID. Used to get the segments of the customer to filter search results.")
  @JsonProperty("journeySessionId")
  public String getJourneySessionId() {
    return journeySessionId;
  }
  public void setJourneySessionId(String journeySessionId) {
    this.journeySessionId = journeySessionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGuestSession knowledgeGuestSession = (KnowledgeGuestSession) o;

    return Objects.equals(this.id, knowledgeGuestSession.id) &&
            Objects.equals(this.app, knowledgeGuestSession.app) &&
            Objects.equals(this.customerId, knowledgeGuestSession.customerId) &&
            Objects.equals(this.pageUrl, knowledgeGuestSession.pageUrl) &&
            Objects.equals(this.contexts, knowledgeGuestSession.contexts) &&
            Objects.equals(this.journeySessionId, knowledgeGuestSession.journeySessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, app, customerId, pageUrl, contexts, journeySessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    journeySessionId: ").append(toIndentedString(journeySessionId)).append("\n");
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

