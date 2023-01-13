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
import com.mypurecloud.sdk.v2.model.WebDeploymentsJourneyContext;
import com.mypurecloud.sdk.v2.model.WebDeploymentsOAuthRequestParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WebDeploymentsOAuthExchangeRequest
 */

public class WebDeploymentsOAuthExchangeRequest  implements Serializable {
  
  private String deploymentId = null;
  private WebDeploymentsJourneyContext journeyContext = null;
  private WebDeploymentsOAuthRequestParameters oauth = null;

  
  /**
   * The WebDeployment ID
   **/
  public WebDeploymentsOAuthExchangeRequest deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WebDeployment ID")
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }
  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


  /**
   * A Customer journey context.
   **/
  public WebDeploymentsOAuthExchangeRequest journeyContext(WebDeploymentsJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A Customer journey context.")
  @JsonProperty("journeyContext")
  public WebDeploymentsJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(WebDeploymentsJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }


  /**
   **/
  public WebDeploymentsOAuthExchangeRequest oauth(WebDeploymentsOAuthRequestParameters oauth) {
    this.oauth = oauth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oauth")
  public WebDeploymentsOAuthRequestParameters getOauth() {
    return oauth;
  }
  public void setOauth(WebDeploymentsOAuthRequestParameters oauth) {
    this.oauth = oauth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDeploymentsOAuthExchangeRequest webDeploymentsOAuthExchangeRequest = (WebDeploymentsOAuthExchangeRequest) o;

    return Objects.equals(this.deploymentId, webDeploymentsOAuthExchangeRequest.deploymentId) &&
            Objects.equals(this.journeyContext, webDeploymentsOAuthExchangeRequest.journeyContext) &&
            Objects.equals(this.oauth, webDeploymentsOAuthExchangeRequest.oauth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentId, journeyContext, oauth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentsOAuthExchangeRequest {\n");
    
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
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

