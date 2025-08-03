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
import com.mypurecloud.sdk.v2.model.Prompt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SelfAgentGreeting
 */

public class SelfAgentGreeting  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Prompt inboundPrompt = null;
  private Prompt outboundPrompt = null;
  private String selfUri = null;

  public SelfAgentGreeting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public SelfAgentGreeting name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The agent greeting prompt to use when the call is connected
   **/
  public SelfAgentGreeting inboundPrompt(Prompt inboundPrompt) {
    this.inboundPrompt = inboundPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent greeting prompt to use when the call is connected")
  @JsonProperty("inboundPrompt")
  public Prompt getInboundPrompt() {
    return inboundPrompt;
  }
  public void setInboundPrompt(Prompt inboundPrompt) {
    this.inboundPrompt = inboundPrompt;
  }


  /**
   * The agent greeting prompt to use when the call is about to be disconnected
   **/
  public SelfAgentGreeting outboundPrompt(Prompt outboundPrompt) {
    this.outboundPrompt = outboundPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent greeting prompt to use when the call is about to be disconnected")
  @JsonProperty("outboundPrompt")
  public Prompt getOutboundPrompt() {
    return outboundPrompt;
  }
  public void setOutboundPrompt(Prompt outboundPrompt) {
    this.outboundPrompt = outboundPrompt;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfAgentGreeting selfAgentGreeting = (SelfAgentGreeting) o;

    return Objects.equals(this.id, selfAgentGreeting.id) &&
            Objects.equals(this.name, selfAgentGreeting.name) &&
            Objects.equals(this.inboundPrompt, selfAgentGreeting.inboundPrompt) &&
            Objects.equals(this.outboundPrompt, selfAgentGreeting.outboundPrompt) &&
            Objects.equals(this.selfUri, selfAgentGreeting.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, inboundPrompt, outboundPrompt, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfAgentGreeting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inboundPrompt: ").append(toIndentedString(inboundPrompt)).append("\n");
    sb.append("    outboundPrompt: ").append(toIndentedString(outboundPrompt)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

