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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Settings concerning support center
 */
@ApiModel(description = "Settings concerning support center")

public class SupportCenterSettings  implements Serializable {
  
  private Boolean enabled = null;
  private AddressableEntityRef knowledgeBase = null;

  
  /**
   * Whether or not support center is enabled
   **/
  public SupportCenterSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not support center is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The knowledge base for support center
   **/
  public SupportCenterSettings knowledgeBase(AddressableEntityRef knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge base for support center")
  @JsonProperty("knowledgeBase")
  public AddressableEntityRef getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(AddressableEntityRef knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterSettings supportCenterSettings = (SupportCenterSettings) o;
    return Objects.equals(this.enabled, supportCenterSettings.enabled) &&
        Objects.equals(this.knowledgeBase, supportCenterSettings.knowledgeBase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, knowledgeBase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
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

