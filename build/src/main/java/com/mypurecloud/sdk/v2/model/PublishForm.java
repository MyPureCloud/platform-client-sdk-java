package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PublishForm
 */

public class PublishForm  implements Serializable {
  
  private Boolean published = null;
  private String contextId = null;

  
  /**
   * Is this form published
   **/
  public PublishForm published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Is this form published")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   * Unique Id for all versions of this form
   **/
  public PublishForm contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Id for all versions of this form")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishForm publishForm = (PublishForm) o;
    return Objects.equals(this.published, publishForm.published) &&
        Objects.equals(this.contextId, publishForm.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(published, contextId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishForm {\n");
    
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
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

