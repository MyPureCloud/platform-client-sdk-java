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
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * NluDomainVersionTrainingResponse
 */

public class NluDomainVersionTrainingResponse  implements Serializable {
  
  private String message = null;
  private NluDomainVersion version = null;

  
  @ApiModelProperty(example = "null", value = "A message indicating result of the action.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  
  /**
   **/
  public NluDomainVersionTrainingResponse version(NluDomainVersion version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public NluDomainVersion getVersion() {
    return version;
  }
  public void setVersion(NluDomainVersion version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluDomainVersionTrainingResponse nluDomainVersionTrainingResponse = (NluDomainVersionTrainingResponse) o;
    return Objects.equals(this.message, nluDomainVersionTrainingResponse.message) &&
        Objects.equals(this.version, nluDomainVersionTrainingResponse.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluDomainVersionTrainingResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

