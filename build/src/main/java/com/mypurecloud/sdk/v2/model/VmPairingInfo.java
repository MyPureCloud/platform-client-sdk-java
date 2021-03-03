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
import com.mypurecloud.sdk.v2.model.MetaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * VmPairingInfo
 */

public class VmPairingInfo  implements Serializable {
  
  private MetaData metaData = null;
  private String edgeId = null;
  private String authToken = null;
  private String orgId = null;

  
  /**
   * This is to be used to complete the setup process of a locally deployed virtual edge device.
   **/
  public VmPairingInfo metaData(MetaData metaData) {
    this.metaData = metaData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is to be used to complete the setup process of a locally deployed virtual edge device.")
  @JsonProperty("meta-data")
  public MetaData getMetaData() {
    return metaData;
  }
  public void setMetaData(MetaData metaData) {
    this.metaData = metaData;
  }

  
  /**
   **/
  public VmPairingInfo edgeId(String edgeId) {
    this.edgeId = edgeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edge-id")
  public String getEdgeId() {
    return edgeId;
  }
  public void setEdgeId(String edgeId) {
    this.edgeId = edgeId;
  }

  
  /**
   **/
  public VmPairingInfo authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("auth-token")
  public String getAuthToken() {
    return authToken;
  }
  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  
  /**
   **/
  public VmPairingInfo orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("org-id")
  public String getOrgId() {
    return orgId;
  }
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmPairingInfo vmPairingInfo = (VmPairingInfo) o;
    return Objects.equals(this.metaData, vmPairingInfo.metaData) &&
        Objects.equals(this.edgeId, vmPairingInfo.edgeId) &&
        Objects.equals(this.authToken, vmPairingInfo.authToken) &&
        Objects.equals(this.orgId, vmPairingInfo.orgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, edgeId, authToken, orgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmPairingInfo {\n");
    
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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

