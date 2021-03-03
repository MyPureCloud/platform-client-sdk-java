package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.GuestMemberInfo;
import com.mypurecloud.sdk.v2.model.JourneyContext;
import com.mypurecloud.sdk.v2.model.WebChatRoutingTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateWebChatConversationRequest
 */

public class CreateWebChatConversationRequest  implements Serializable {
  
  private String organizationId = null;
  private String deploymentId = null;
  private WebChatRoutingTarget routingTarget = null;
  private GuestMemberInfo memberInfo = null;
  private String memberAuthToken = null;
  private JourneyContext journeyContext = null;

  
  /**
   * The organization identifier.
   **/
  public CreateWebChatConversationRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The organization identifier.")
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  
  /**
   * The web chat Deployment ID which contains the appropriate settings for this chat conversation.
   **/
  public CreateWebChatConversationRequest deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The web chat Deployment ID which contains the appropriate settings for this chat conversation.")
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }
  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  
  /**
   * The routing information to use for the new chat conversation.
   **/
  public CreateWebChatConversationRequest routingTarget(WebChatRoutingTarget routingTarget) {
    this.routingTarget = routingTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The routing information to use for the new chat conversation.")
  @JsonProperty("routingTarget")
  public WebChatRoutingTarget getRoutingTarget() {
    return routingTarget;
  }
  public void setRoutingTarget(WebChatRoutingTarget routingTarget) {
    this.routingTarget = routingTarget;
  }

  
  /**
   * The guest member info to use for the new chat conversation.
   **/
  public CreateWebChatConversationRequest memberInfo(GuestMemberInfo memberInfo) {
    this.memberInfo = memberInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The guest member info to use for the new chat conversation.")
  @JsonProperty("memberInfo")
  public GuestMemberInfo getMemberInfo() {
    return memberInfo;
  }
  public void setMemberInfo(GuestMemberInfo memberInfo) {
    this.memberInfo = memberInfo;
  }

  
  /**
   * If the guest member is an authenticated member (ie, not anonymous) his JWT is provided here. The token will have been previously generated with the \"POST /api/v2/signeddata\" resource.
   **/
  public CreateWebChatConversationRequest memberAuthToken(String memberAuthToken) {
    this.memberAuthToken = memberAuthToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the guest member is an authenticated member (ie, not anonymous) his JWT is provided here. The token will have been previously generated with the \"POST /api/v2/signeddata\" resource.")
  @JsonProperty("memberAuthToken")
  public String getMemberAuthToken() {
    return memberAuthToken;
  }
  public void setMemberAuthToken(String memberAuthToken) {
    this.memberAuthToken = memberAuthToken;
  }

  
  /**
   * A subset of the Journey System's data relevant to this conversation/session request (for external linkage and internal usage/context).
   **/
  public CreateWebChatConversationRequest journeyContext(JourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A subset of the Journey System's data relevant to this conversation/session request (for external linkage and internal usage/context).")
  @JsonProperty("journeyContext")
  public JourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(JourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebChatConversationRequest createWebChatConversationRequest = (CreateWebChatConversationRequest) o;
    return Objects.equals(this.organizationId, createWebChatConversationRequest.organizationId) &&
        Objects.equals(this.deploymentId, createWebChatConversationRequest.deploymentId) &&
        Objects.equals(this.routingTarget, createWebChatConversationRequest.routingTarget) &&
        Objects.equals(this.memberInfo, createWebChatConversationRequest.memberInfo) &&
        Objects.equals(this.memberAuthToken, createWebChatConversationRequest.memberAuthToken) &&
        Objects.equals(this.journeyContext, createWebChatConversationRequest.journeyContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, deploymentId, routingTarget, memberInfo, memberAuthToken, journeyContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebChatConversationRequest {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    routingTarget: ").append(toIndentedString(routingTarget)).append("\n");
    sb.append("    memberInfo: ").append(toIndentedString(memberInfo)).append("\n");
    sb.append("    memberAuthToken: ").append(toIndentedString(memberAuthToken)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
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

