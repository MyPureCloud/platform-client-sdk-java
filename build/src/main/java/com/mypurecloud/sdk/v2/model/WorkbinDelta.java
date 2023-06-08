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
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeInstant;
import com.mypurecloud.sdk.v2.model.WorkitemsAttributeChangeString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkbinDelta
 */

public class WorkbinDelta  implements Serializable {
  
  private WorkitemsAttributeChangeString name = null;
  private WorkitemsAttributeChangeString description = null;
  private WorkitemsAttributeChangeInstant dateModified = null;
  private WorkitemsAttributeChangeString modifiedBy = null;

  
  /**
   **/
  public WorkbinDelta name(WorkitemsAttributeChangeString name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public WorkitemsAttributeChangeString getName() {
    return name;
  }
  public void setName(WorkitemsAttributeChangeString name) {
    this.name = name;
  }


  /**
   **/
  public WorkbinDelta description(WorkitemsAttributeChangeString description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public WorkitemsAttributeChangeString getDescription() {
    return description;
  }
  public void setDescription(WorkitemsAttributeChangeString description) {
    this.description = description;
  }


  /**
   **/
  public WorkbinDelta dateModified(WorkitemsAttributeChangeInstant dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public WorkitemsAttributeChangeInstant getDateModified() {
    return dateModified;
  }
  public void setDateModified(WorkitemsAttributeChangeInstant dateModified) {
    this.dateModified = dateModified;
  }


  /**
   **/
  public WorkbinDelta modifiedBy(WorkitemsAttributeChangeString modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public WorkitemsAttributeChangeString getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(WorkitemsAttributeChangeString modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkbinDelta workbinDelta = (WorkbinDelta) o;

    return Objects.equals(this.name, workbinDelta.name) &&
            Objects.equals(this.description, workbinDelta.description) &&
            Objects.equals(this.dateModified, workbinDelta.dateModified) &&
            Objects.equals(this.modifiedBy, workbinDelta.modifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, dateModified, modifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkbinDelta {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

