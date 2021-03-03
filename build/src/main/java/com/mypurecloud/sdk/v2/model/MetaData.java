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
 * MetaData
 */

public class MetaData  implements Serializable {
  
  private String pairingToken = null;
  private List<String> pairingTrust = new ArrayList<String>();
  private String pairingUrl = null;

  
  /**
   **/
  public MetaData pairingToken(String pairingToken) {
    this.pairingToken = pairingToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pairing-token")
  public String getPairingToken() {
    return pairingToken;
  }
  public void setPairingToken(String pairingToken) {
    this.pairingToken = pairingToken;
  }

  
  /**
   **/
  public MetaData pairingTrust(List<String> pairingTrust) {
    this.pairingTrust = pairingTrust;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pairing-trust")
  public List<String> getPairingTrust() {
    return pairingTrust;
  }
  public void setPairingTrust(List<String> pairingTrust) {
    this.pairingTrust = pairingTrust;
  }

  
  /**
   **/
  public MetaData pairingUrl(String pairingUrl) {
    this.pairingUrl = pairingUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pairing-url")
  public String getPairingUrl() {
    return pairingUrl;
  }
  public void setPairingUrl(String pairingUrl) {
    this.pairingUrl = pairingUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaData metaData = (MetaData) o;
    return Objects.equals(this.pairingToken, metaData.pairingToken) &&
        Objects.equals(this.pairingTrust, metaData.pairingTrust) &&
        Objects.equals(this.pairingUrl, metaData.pairingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairingToken, pairingTrust, pairingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaData {\n");
    
    sb.append("    pairingToken: ").append(toIndentedString(pairingToken)).append("\n");
    sb.append("    pairingTrust: ").append(toIndentedString(pairingTrust)).append("\n");
    sb.append("    pairingUrl: ").append(toIndentedString(pairingUrl)).append("\n");
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

