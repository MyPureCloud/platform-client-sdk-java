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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FlowHealthIntentVersionInfo
 */

public class FlowHealthIntentVersionInfo  implements Serializable {
  
  private AddressableEntityRef nluVersion = null;
  private AddressableEntityRef flowVersion = null;
  private AddressableEntityRef nluDomain = null;

  
  @ApiModelProperty(example = "null", value = "NLU Version Info for this flow version.")
  @JsonProperty("nluVersion")
  public AddressableEntityRef getNluVersion() {
    return nluVersion;
  }


  @ApiModelProperty(example = "null", value = "Given flow's Version Info.")
  @JsonProperty("flowVersion")
  public AddressableEntityRef getFlowVersion() {
    return flowVersion;
  }


  @ApiModelProperty(example = "null", value = "NLU Domain Info for this flow version.")
  @JsonProperty("nluDomain")
  public AddressableEntityRef getNluDomain() {
    return nluDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowHealthIntentVersionInfo flowHealthIntentVersionInfo = (FlowHealthIntentVersionInfo) o;

    return Objects.equals(this.nluVersion, flowHealthIntentVersionInfo.nluVersion) &&
            Objects.equals(this.flowVersion, flowHealthIntentVersionInfo.flowVersion) &&
            Objects.equals(this.nluDomain, flowHealthIntentVersionInfo.nluDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nluVersion, flowVersion, nluDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowHealthIntentVersionInfo {\n");
    
    sb.append("    nluVersion: ").append(toIndentedString(nluVersion)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    nluDomain: ").append(toIndentedString(nluDomain)).append("\n");
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

