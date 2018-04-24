package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.LocalizedField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Represents a suggested use case for an AppFoundry listing
 */
@ApiModel(description = "Represents a suggested use case for an AppFoundry listing")

public class SmartCase  implements Serializable {
  
  private LocalizedField title = null;
  private LocalizedField description = null;

  
  /**
   * Title of the use case
   **/
  public SmartCase title(LocalizedField title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title of the use case")
  @JsonProperty("title")
  public LocalizedField getTitle() {
    return title;
  }
  public void setTitle(LocalizedField title) {
    this.title = title;
  }

  
  /**
   * Description of how the listing meets the use case
   **/
  public SmartCase description(LocalizedField description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of how the listing meets the use case")
  @JsonProperty("description")
  public LocalizedField getDescription() {
    return description;
  }
  public void setDescription(LocalizedField description) {
    this.description = description;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartCase smartCase = (SmartCase) o;
    return Objects.equals(this.title, smartCase.title) &&
        Objects.equals(this.description, smartCase.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartCase {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

