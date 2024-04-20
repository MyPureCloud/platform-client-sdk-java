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
import com.mypurecloud.sdk.v2.model.SupportedLanguagesInfoDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * NluOrganization
 */

public class NluOrganization  implements Serializable {
  
  private Map<String, Integer> limits = null;
  private List<SupportedLanguagesInfoDefinition> supportedLanguagesInfo = new ArrayList<SupportedLanguagesInfoDefinition>();

  
  /**
   * The NLU limits defined for this Organization
   **/
  public NluOrganization limits(Map<String, Integer> limits) {
    this.limits = limits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The NLU limits defined for this Organization")
  @JsonProperty("limits")
  public Map<String, Integer> getLimits() {
    return limits;
  }
  public void setLimits(Map<String, Integer> limits) {
    this.limits = limits;
  }


  /**
   * The list of Supported features for each languages for this Organization
   **/
  public NluOrganization supportedLanguagesInfo(List<SupportedLanguagesInfoDefinition> supportedLanguagesInfo) {
    this.supportedLanguagesInfo = supportedLanguagesInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Supported features for each languages for this Organization")
  @JsonProperty("supportedLanguagesInfo")
  public List<SupportedLanguagesInfoDefinition> getSupportedLanguagesInfo() {
    return supportedLanguagesInfo;
  }
  public void setSupportedLanguagesInfo(List<SupportedLanguagesInfoDefinition> supportedLanguagesInfo) {
    this.supportedLanguagesInfo = supportedLanguagesInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluOrganization nluOrganization = (NluOrganization) o;

    return Objects.equals(this.limits, nluOrganization.limits) &&
            Objects.equals(this.supportedLanguagesInfo, nluOrganization.supportedLanguagesInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, supportedLanguagesInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluOrganization {\n");
    
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    supportedLanguagesInfo: ").append(toIndentedString(supportedLanguagesInfo)).append("\n");
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

