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
import com.mypurecloud.sdk.v2.model.WidgetClientConfigThirdParty;
import com.mypurecloud.sdk.v2.model.WidgetClientConfigV1;
import com.mypurecloud.sdk.v2.model.WidgetClientConfigV1Http;
import com.mypurecloud.sdk.v2.model.WidgetClientConfigV2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WidgetClientConfig
 */

public class WidgetClientConfig  implements Serializable {
  
  private WidgetClientConfigV1 v1 = null;
  private WidgetClientConfigV2 v2 = null;
  private WidgetClientConfigV1Http v1Http = null;
  private WidgetClientConfigThirdParty thirdParty = null;

  
  /**
   **/
  public WidgetClientConfig v1(WidgetClientConfigV1 v1) {
    this.v1 = v1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("v1")
  public WidgetClientConfigV1 getV1() {
    return v1;
  }
  public void setV1(WidgetClientConfigV1 v1) {
    this.v1 = v1;
  }

  
  /**
   **/
  public WidgetClientConfig v2(WidgetClientConfigV2 v2) {
    this.v2 = v2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("v2")
  public WidgetClientConfigV2 getV2() {
    return v2;
  }
  public void setV2(WidgetClientConfigV2 v2) {
    this.v2 = v2;
  }

  
  /**
   **/
  public WidgetClientConfig v1Http(WidgetClientConfigV1Http v1Http) {
    this.v1Http = v1Http;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("v1-http")
  public WidgetClientConfigV1Http getV1Http() {
    return v1Http;
  }
  public void setV1Http(WidgetClientConfigV1Http v1Http) {
    this.v1Http = v1Http;
  }

  
  /**
   **/
  public WidgetClientConfig thirdParty(WidgetClientConfigThirdParty thirdParty) {
    this.thirdParty = thirdParty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("third-party")
  public WidgetClientConfigThirdParty getThirdParty() {
    return thirdParty;
  }
  public void setThirdParty(WidgetClientConfigThirdParty thirdParty) {
    this.thirdParty = thirdParty;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetClientConfig widgetClientConfig = (WidgetClientConfig) o;
    return Objects.equals(this.v1, widgetClientConfig.v1) &&
        Objects.equals(this.v2, widgetClientConfig.v2) &&
        Objects.equals(this.v1Http, widgetClientConfig.v1Http) &&
        Objects.equals(this.thirdParty, widgetClientConfig.thirdParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(v1, v2, v1Http, thirdParty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetClientConfig {\n");
    
    sb.append("    v1: ").append(toIndentedString(v1)).append("\n");
    sb.append("    v2: ").append(toIndentedString(v2)).append("\n");
    sb.append("    v1Http: ").append(toIndentedString(v1Http)).append("\n");
    sb.append("    thirdParty: ").append(toIndentedString(thirdParty)).append("\n");
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

