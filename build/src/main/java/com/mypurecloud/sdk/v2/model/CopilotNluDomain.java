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
import com.mypurecloud.sdk.v2.model.CopilotNluDomainVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CopilotNluDomain
 */

public class CopilotNluDomain  implements Serializable {
  
  private String id = null;
  private Boolean useLatestVersion = null;
  private CopilotNluDomainVersion version = null;
  private String selfUri = null;

  
  /**
   * Id of the NLU domain.
   **/
  public CopilotNluDomain id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id of the NLU domain.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Use the latest version of the NLU domain. If false, version is required.
   **/
  public CopilotNluDomain useLatestVersion(Boolean useLatestVersion) {
    this.useLatestVersion = useLatestVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Use the latest version of the NLU domain. If false, version is required.")
  @JsonProperty("useLatestVersion")
  public Boolean getUseLatestVersion() {
    return useLatestVersion;
  }
  public void setUseLatestVersion(Boolean useLatestVersion) {
    this.useLatestVersion = useLatestVersion;
  }


  /**
   * NLU domain version.
   **/
  public CopilotNluDomain version(CopilotNluDomainVersion version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NLU domain version.")
  @JsonProperty("version")
  public CopilotNluDomainVersion getVersion() {
    return version;
  }
  public void setVersion(CopilotNluDomainVersion version) {
    this.version = version;
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
    CopilotNluDomain copilotNluDomain = (CopilotNluDomain) o;

    return Objects.equals(this.id, copilotNluDomain.id) &&
            Objects.equals(this.useLatestVersion, copilotNluDomain.useLatestVersion) &&
            Objects.equals(this.version, copilotNluDomain.version) &&
            Objects.equals(this.selfUri, copilotNluDomain.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, useLatestVersion, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopilotNluDomain {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    useLatestVersion: ").append(toIndentedString(useLatestVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

