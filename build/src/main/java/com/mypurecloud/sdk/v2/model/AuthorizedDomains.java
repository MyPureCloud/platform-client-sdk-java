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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Domains authorized for email processing.
 */
@ApiModel(description = "Domains authorized for email processing.")

public class AuthorizedDomains  implements Serializable {
  
  private List<String> outbound = null;

  public AuthorizedDomains() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      outbound = new ArrayList<String>();
    }
  }

  
  /**
   * List of authorized domains for outbound send.
   **/
  public AuthorizedDomains outbound(List<String> outbound) {
    this.outbound = outbound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of authorized domains for outbound send.")
  @JsonProperty("outbound")
  public List<String> getOutbound() {
    return outbound;
  }
  public void setOutbound(List<String> outbound) {
    this.outbound = outbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedDomains authorizedDomains = (AuthorizedDomains) o;

    return Objects.equals(this.outbound, authorizedDomains.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedDomains {\n");
    
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

