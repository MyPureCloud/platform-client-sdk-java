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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Intent;
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NluInfo
 */

public class NluInfo  implements Serializable {
  
  private AddressableEntityRef domain = null;
  private NluDomainVersion version = null;
  private List<Intent> intents = null;
  private String engineVersion = null;
  private NluDomainVersion nluData = null;

  public NluInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intents = new ArrayList<Intent>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domain")
  public AddressableEntityRef getDomain() {
    return domain;
  }


  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public NluDomainVersion getVersion() {
    return version;
  }


  /**
   **/
  public NluInfo intents(List<Intent> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intents")
  public List<Intent> getIntents() {
    return intents;
  }
  public void setIntents(List<Intent> intents) {
    this.intents = intents;
  }


  /**
   **/
  public NluInfo engineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("engineVersion")
  public String getEngineVersion() {
    return engineVersion;
  }
  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }


  /**
   **/
  public NluInfo nluData(NluDomainVersion nluData) {
    this.nluData = nluData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nluData")
  public NluDomainVersion getNluData() {
    return nluData;
  }
  public void setNluData(NluDomainVersion nluData) {
    this.nluData = nluData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluInfo nluInfo = (NluInfo) o;

    return Objects.equals(this.domain, nluInfo.domain) &&
            Objects.equals(this.version, nluInfo.version) &&
            Objects.equals(this.intents, nluInfo.intents) &&
            Objects.equals(this.engineVersion, nluInfo.engineVersion) &&
            Objects.equals(this.nluData, nluInfo.nluData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, version, intents, engineVersion, nluData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluInfo {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    nluData: ").append(toIndentedString(nluData)).append("\n");
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

