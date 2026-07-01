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
 * ExternalContactsContactChangedTopicWhatsAppBusinessScopedId
 */

public class ExternalContactsContactChangedTopicWhatsAppBusinessScopedId  implements Serializable {
  
  private String bsuid = null;
  private Boolean parent = null;
  private String portfolioId = null;

  public ExternalContactsContactChangedTopicWhatsAppBusinessScopedId() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ExternalContactsContactChangedTopicWhatsAppBusinessScopedId(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public ExternalContactsContactChangedTopicWhatsAppBusinessScopedId bsuid(String bsuid) {
    this.bsuid = bsuid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bsuid")
  public String getBsuid() {
    return bsuid;
  }
  public void setBsuid(String bsuid) {
    this.bsuid = bsuid;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicWhatsAppBusinessScopedId parent(Boolean parent) {
    this.parent = parent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parent")
  public Boolean getParent() {
    return parent;
  }
  public void setParent(Boolean parent) {
    this.parent = parent;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicWhatsAppBusinessScopedId portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("portfolioId")
  public String getPortfolioId() {
    return portfolioId;
  }
  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsContactChangedTopicWhatsAppBusinessScopedId externalContactsContactChangedTopicWhatsAppBusinessScopedId = (ExternalContactsContactChangedTopicWhatsAppBusinessScopedId) o;

    return Objects.equals(this.bsuid, externalContactsContactChangedTopicWhatsAppBusinessScopedId.bsuid) &&
            Objects.equals(this.parent, externalContactsContactChangedTopicWhatsAppBusinessScopedId.parent) &&
            Objects.equals(this.portfolioId, externalContactsContactChangedTopicWhatsAppBusinessScopedId.portfolioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bsuid, parent, portfolioId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsContactChangedTopicWhatsAppBusinessScopedId {\n");
    
    sb.append("    bsuid: ").append(toIndentedString(bsuid)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
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

