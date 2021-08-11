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

import java.io.Serializable;
/**
 * Details about a forms tracking event trigger
 */
@ApiModel(description = "Details about a forms tracking event trigger")

public class FormsTrackTrigger  implements Serializable {
  
  private String selector = null;
  private String formName = null;
  private Boolean captureDataOnFormAbandon = null;
  private Boolean captureDataOnFormSubmit = null;

  
  /**
   * Form element that triggers the form submitted or abandoned event.
   **/
  public FormsTrackTrigger selector(String selector) {
    this.selector = selector;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Form element that triggers the form submitted or abandoned event.")
  @JsonProperty("selector")
  public String getSelector() {
    return selector;
  }
  public void setSelector(String selector) {
    this.selector = selector;
  }

  
  /**
   * Prefix for the form submitted or abandoned event name.
   **/
  public FormsTrackTrigger formName(String formName) {
    this.formName = formName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Prefix for the form submitted or abandoned event name.")
  @JsonProperty("formName")
  public String getFormName() {
    return formName;
  }
  public void setFormName(String formName) {
    this.formName = formName;
  }

  
  /**
   * Whether to capture the form data in the form abandoned event.
   **/
  public FormsTrackTrigger captureDataOnFormAbandon(Boolean captureDataOnFormAbandon) {
    this.captureDataOnFormAbandon = captureDataOnFormAbandon;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to capture the form data in the form abandoned event.")
  @JsonProperty("captureDataOnFormAbandon")
  public Boolean getCaptureDataOnFormAbandon() {
    return captureDataOnFormAbandon;
  }
  public void setCaptureDataOnFormAbandon(Boolean captureDataOnFormAbandon) {
    this.captureDataOnFormAbandon = captureDataOnFormAbandon;
  }

  
  /**
   * Whether to capture the form data in the form submitted event.
   **/
  public FormsTrackTrigger captureDataOnFormSubmit(Boolean captureDataOnFormSubmit) {
    this.captureDataOnFormSubmit = captureDataOnFormSubmit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to capture the form data in the form submitted event.")
  @JsonProperty("captureDataOnFormSubmit")
  public Boolean getCaptureDataOnFormSubmit() {
    return captureDataOnFormSubmit;
  }
  public void setCaptureDataOnFormSubmit(Boolean captureDataOnFormSubmit) {
    this.captureDataOnFormSubmit = captureDataOnFormSubmit;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormsTrackTrigger formsTrackTrigger = (FormsTrackTrigger) o;
    return Objects.equals(this.selector, formsTrackTrigger.selector) &&
        Objects.equals(this.formName, formsTrackTrigger.formName) &&
        Objects.equals(this.captureDataOnFormAbandon, formsTrackTrigger.captureDataOnFormAbandon) &&
        Objects.equals(this.captureDataOnFormSubmit, formsTrackTrigger.captureDataOnFormSubmit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selector, formName, captureDataOnFormAbandon, captureDataOnFormSubmit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormsTrackTrigger {\n");
    
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    captureDataOnFormAbandon: ").append(toIndentedString(captureDataOnFormAbandon)).append("\n");
    sb.append("    captureDataOnFormSubmit: ").append(toIndentedString(captureDataOnFormSubmit)).append("\n");
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

