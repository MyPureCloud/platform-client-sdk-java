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
import com.mypurecloud.sdk.v2.model.SupportCenterDetailedCategoryModuleSidebar;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SupportCenterDetailedCategoryModuleTemplate
 */

public class SupportCenterDetailedCategoryModuleTemplate  implements Serializable {
  
  private Boolean active = null;
  private SupportCenterDetailedCategoryModuleSidebar sidebar = null;

  
  /**
   * Whether this template is active or not
   **/
  public SupportCenterDetailedCategoryModuleTemplate active(Boolean active) {
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


  /**
   * Sidebar settings for the template
   **/
  public SupportCenterDetailedCategoryModuleTemplate sidebar(SupportCenterDetailedCategoryModuleSidebar sidebar) {
    this.sidebar = sidebar;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sidebar settings for the template")
  @JsonProperty("sidebar")
  public SupportCenterDetailedCategoryModuleSidebar getSidebar() {
    return sidebar;
  }
  public void setSidebar(SupportCenterDetailedCategoryModuleSidebar sidebar) {
    this.sidebar = sidebar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterDetailedCategoryModuleTemplate supportCenterDetailedCategoryModuleTemplate = (SupportCenterDetailedCategoryModuleTemplate) o;

    return Objects.equals(this.active, supportCenterDetailedCategoryModuleTemplate.active) &&
            Objects.equals(this.sidebar, supportCenterDetailedCategoryModuleTemplate.sidebar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, sidebar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterDetailedCategoryModuleTemplate {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    sidebar: ").append(toIndentedString(sidebar)).append("\n");
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

