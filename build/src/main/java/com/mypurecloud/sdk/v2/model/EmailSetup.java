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
 * EmailSetup
 */

public class EmailSetup  implements Serializable {
  
  private String rootDomain = null;

  public EmailSetup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The root PureCloud domain that all sub-domains are created from.
   **/
  public EmailSetup rootDomain(String rootDomain) {
    this.rootDomain = rootDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The root PureCloud domain that all sub-domains are created from.")
  @JsonProperty("rootDomain")
  public String getRootDomain() {
    return rootDomain;
  }
  public void setRootDomain(String rootDomain) {
    this.rootDomain = rootDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSetup emailSetup = (EmailSetup) o;

    return Objects.equals(this.rootDomain, emailSetup.rootDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSetup {\n");
    
    sb.append("    rootDomain: ").append(toIndentedString(rootDomain)).append("\n");
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

