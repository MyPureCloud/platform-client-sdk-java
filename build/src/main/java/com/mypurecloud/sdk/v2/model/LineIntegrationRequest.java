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

import java.io.Serializable;
/**
 * LineIntegrationRequest
 */

public class LineIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String channelId = null;
  private String channelSecret = null;
  private String switcherSecret = null;
  private String serviceCode = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the LINE Integration
   **/
  public LineIntegrationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the LINE Integration")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The Channel Id from LINE messenger. New Official LINE account: To create a new official account, LINE requires a Webhook URL. It can be created without specifying Channel Id & Channel Secret. Once the Official account is created by LINE, use the update LINE Integration API to update Channel Id and Channel Secret.  All other accounts: Channel Id is mandatory. (NOTE: ChannelId can only be updated if the integration is set to inactive)
   **/
  public LineIntegrationRequest channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Channel Id from LINE messenger. New Official LINE account: To create a new official account, LINE requires a Webhook URL. It can be created without specifying Channel Id & Channel Secret. Once the Official account is created by LINE, use the update LINE Integration API to update Channel Id and Channel Secret.  All other accounts: Channel Id is mandatory. (NOTE: ChannelId can only be updated if the integration is set to inactive)")
  @JsonProperty("channelId")
  public String getChannelId() {
    return channelId;
  }
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  
  /**
   * The Channel Secret from LINE messenger. New Official LINE account: To create a new official account, LINE requires a Webhook URL. It can be created without specifying Channel Id & Channel Secret. Once the Official account is created by LINE, use the update LINE Integration API to update Channel Id and Channel Secret.  All other accounts: Channel Secret is mandatory. (NOTE: ChannelSecret can only be updated if the integration is set to inactive)
   **/
  public LineIntegrationRequest channelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Channel Secret from LINE messenger. New Official LINE account: To create a new official account, LINE requires a Webhook URL. It can be created without specifying Channel Id & Channel Secret. Once the Official account is created by LINE, use the update LINE Integration API to update Channel Id and Channel Secret.  All other accounts: Channel Secret is mandatory. (NOTE: ChannelSecret can only be updated if the integration is set to inactive)")
  @JsonProperty("channelSecret")
  public String getChannelSecret() {
    return channelSecret;
  }
  public void setChannelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
  }

  
  /**
   * The Switcher Secret from LINE messenger. Some line official accounts are switcher functionality enabled. If the LINE account used for this integration is switcher enabled, then switcher secret is a required field. This secret can be found in your create documentation provided by LINE
   **/
  public LineIntegrationRequest switcherSecret(String switcherSecret) {
    this.switcherSecret = switcherSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Switcher Secret from LINE messenger. Some line official accounts are switcher functionality enabled. If the LINE account used for this integration is switcher enabled, then switcher secret is a required field. This secret can be found in your create documentation provided by LINE")
  @JsonProperty("switcherSecret")
  public String getSwitcherSecret() {
    return switcherSecret;
  }
  public void setSwitcherSecret(String switcherSecret) {
    this.switcherSecret = switcherSecret;
  }

  
  /**
   * The Service Code from LINE messenger. Only applicable to LINE Enterprise accounts. This service code can be found in your create documentation provided by LINE
   **/
  public LineIntegrationRequest serviceCode(String serviceCode) {
    this.serviceCode = serviceCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Service Code from LINE messenger. Only applicable to LINE Enterprise accounts. This service code can be found in your create documentation provided by LINE")
  @JsonProperty("serviceCode")
  public String getServiceCode() {
    return serviceCode;
  }
  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
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
    LineIntegrationRequest lineIntegrationRequest = (LineIntegrationRequest) o;
    return Objects.equals(this.id, lineIntegrationRequest.id) &&
        Objects.equals(this.name, lineIntegrationRequest.name) &&
        Objects.equals(this.channelId, lineIntegrationRequest.channelId) &&
        Objects.equals(this.channelSecret, lineIntegrationRequest.channelSecret) &&
        Objects.equals(this.switcherSecret, lineIntegrationRequest.switcherSecret) &&
        Objects.equals(this.serviceCode, lineIntegrationRequest.serviceCode) &&
        Objects.equals(this.selfUri, lineIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, channelId, channelSecret, switcherSecret, serviceCode, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelSecret: ").append(toIndentedString(channelSecret)).append("\n");
    sb.append("    switcherSecret: ").append(toIndentedString(switcherSecret)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
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

