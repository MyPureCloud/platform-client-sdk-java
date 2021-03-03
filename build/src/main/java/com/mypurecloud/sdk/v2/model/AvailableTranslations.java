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
 * AvailableTranslations
 */

public class AvailableTranslations  implements Serializable {
  
  private List<String> orgSpecific = new ArrayList<String>();
  private List<String> builtin = new ArrayList<String>();

  
  /**
   **/
  public AvailableTranslations orgSpecific(List<String> orgSpecific) {
    this.orgSpecific = orgSpecific;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orgSpecific")
  public List<String> getOrgSpecific() {
    return orgSpecific;
  }
  public void setOrgSpecific(List<String> orgSpecific) {
    this.orgSpecific = orgSpecific;
  }

  
  /**
   **/
  public AvailableTranslations builtin(List<String> builtin) {
    this.builtin = builtin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("builtin")
  public List<String> getBuiltin() {
    return builtin;
  }
  public void setBuiltin(List<String> builtin) {
    this.builtin = builtin;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableTranslations availableTranslations = (AvailableTranslations) o;
    return Objects.equals(this.orgSpecific, availableTranslations.orgSpecific) &&
        Objects.equals(this.builtin, availableTranslations.builtin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgSpecific, builtin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTranslations {\n");
    
    sb.append("    orgSpecific: ").append(toIndentedString(orgSpecific)).append("\n");
    sb.append("    builtin: ").append(toIndentedString(builtin)).append("\n");
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

