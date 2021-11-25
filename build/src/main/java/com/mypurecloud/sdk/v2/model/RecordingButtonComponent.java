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
import com.mypurecloud.sdk.v2.model.RecordingContentActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Structured template button object.
 */
@ApiModel(description = "Structured template button object.")

public class RecordingButtonComponent  implements Serializable {
  
  private String title = null;
  private RecordingContentActions actions = null;
  private Boolean isSelected = null;

  
  /**
   **/
  public RecordingButtonComponent title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  public RecordingButtonComponent actions(RecordingContentActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actions")
  public RecordingContentActions getActions() {
    return actions;
  }
  public void setActions(RecordingContentActions actions) {
    this.actions = actions;
  }

  
  /**
   **/
  public RecordingButtonComponent isSelected(Boolean isSelected) {
    this.isSelected = isSelected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isSelected")
  public Boolean getIsSelected() {
    return isSelected;
  }
  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingButtonComponent recordingButtonComponent = (RecordingButtonComponent) o;
    return Objects.equals(this.title, recordingButtonComponent.title) &&
        Objects.equals(this.actions, recordingButtonComponent.actions) &&
        Objects.equals(this.isSelected, recordingButtonComponent.isSelected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, actions, isSelected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingButtonComponent {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
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

