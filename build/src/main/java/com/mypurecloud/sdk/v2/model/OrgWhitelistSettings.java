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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OrgWhitelistSettings
 */

public class OrgWhitelistSettings  implements Serializable {
  
  private Boolean enableWhitelist = null;
  private List<String> domainWhitelist = new ArrayList<String>();

  
  /**
   **/
  public OrgWhitelistSettings enableWhitelist(Boolean enableWhitelist) {
    this.enableWhitelist = enableWhitelist;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enableWhitelist")
  public Boolean getEnableWhitelist() {
    return enableWhitelist;
  }
  public void setEnableWhitelist(Boolean enableWhitelist) {
    this.enableWhitelist = enableWhitelist;
  }

  
  /**
   **/
  public OrgWhitelistSettings domainWhitelist(List<String> domainWhitelist) {
    this.domainWhitelist = domainWhitelist;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domainWhitelist")
  public List<String> getDomainWhitelist() {
    return domainWhitelist;
  }
  public void setDomainWhitelist(List<String> domainWhitelist) {
    this.domainWhitelist = domainWhitelist;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgWhitelistSettings orgWhitelistSettings = (OrgWhitelistSettings) o;
    return Objects.equals(this.enableWhitelist, orgWhitelistSettings.enableWhitelist) &&
        Objects.equals(this.domainWhitelist, orgWhitelistSettings.domainWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableWhitelist, domainWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgWhitelistSettings {\n");
    
    sb.append("    enableWhitelist: ").append(toIndentedString(enableWhitelist)).append("\n");
    sb.append("    domainWhitelist: ").append(toIndentedString(domainWhitelist)).append("\n");
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

