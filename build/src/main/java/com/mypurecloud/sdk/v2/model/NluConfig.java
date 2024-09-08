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
import com.mypurecloud.sdk.v2.model.CopilotNluDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * NluConfig
 */

public class NluConfig  implements Serializable {
  
  private CopilotNluDomain domain = null;
  private Float intentConfidenceThreshold = null;

  
  /**
   * NLU domain.
   **/
  public NluConfig domain(CopilotNluDomain domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "NLU domain.")
  @JsonProperty("domain")
  public CopilotNluDomain getDomain() {
    return domain;
  }
  public void setDomain(CopilotNluDomain domain) {
    this.domain = domain;
  }


  /**
   * Minimum confidence value of accepting NLU intents, must be greater than 0 and less than 1.
   **/
  public NluConfig intentConfidenceThreshold(Float intentConfidenceThreshold) {
    this.intentConfidenceThreshold = intentConfidenceThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Minimum confidence value of accepting NLU intents, must be greater than 0 and less than 1.")
  @JsonProperty("intentConfidenceThreshold")
  public Float getIntentConfidenceThreshold() {
    return intentConfidenceThreshold;
  }
  public void setIntentConfidenceThreshold(Float intentConfidenceThreshold) {
    this.intentConfidenceThreshold = intentConfidenceThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluConfig nluConfig = (NluConfig) o;

    return Objects.equals(this.domain, nluConfig.domain) &&
            Objects.equals(this.intentConfidenceThreshold, nluConfig.intentConfidenceThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, intentConfidenceThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluConfig {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    intentConfidenceThreshold: ").append(toIndentedString(intentConfidenceThreshold)).append("\n");
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

