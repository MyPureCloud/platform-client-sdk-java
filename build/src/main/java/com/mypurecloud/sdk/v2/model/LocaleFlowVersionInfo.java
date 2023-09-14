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
 * LocaleFlowVersionInfo
 */

public class LocaleFlowVersionInfo  implements Serializable {
  
  private AddressableEntityRef nluVersion = null;

  
  /**
   * NLU Version Info for this flow version.
   **/
  public LocaleFlowVersionInfo nluVersion(AddressableEntityRef nluVersion) {
    this.nluVersion = nluVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NLU Version Info for this flow version.")
  @JsonProperty("nluVersion")
  public AddressableEntityRef getNluVersion() {
    return nluVersion;
  }
  public void setNluVersion(AddressableEntityRef nluVersion) {
    this.nluVersion = nluVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocaleFlowVersionInfo localeFlowVersionInfo = (LocaleFlowVersionInfo) o;

    return Objects.equals(this.nluVersion, localeFlowVersionInfo.nluVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nluVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocaleFlowVersionInfo {\n");
    
    sb.append("    nluVersion: ").append(toIndentedString(nluVersion)).append("\n");
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

