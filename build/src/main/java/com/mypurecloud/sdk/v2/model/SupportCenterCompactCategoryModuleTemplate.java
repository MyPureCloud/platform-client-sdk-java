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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SupportCenterCompactCategoryModuleTemplate
 */

public class SupportCenterCompactCategoryModuleTemplate  implements Serializable {
  
  private Boolean active = null;

  public SupportCenterCompactCategoryModuleTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether this template is active or not
   **/
  public SupportCenterCompactCategoryModuleTemplate active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this template is active or not")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterCompactCategoryModuleTemplate supportCenterCompactCategoryModuleTemplate = (SupportCenterCompactCategoryModuleTemplate) o;

    return Objects.equals(this.active, supportCenterCompactCategoryModuleTemplate.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterCompactCategoryModuleTemplate {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

