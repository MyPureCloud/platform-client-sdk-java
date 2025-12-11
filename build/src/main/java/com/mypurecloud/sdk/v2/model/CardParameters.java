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
import com.mypurecloud.sdk.v2.model.TemplateParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Template parameters for a single carousel card
 */
@ApiModel(description = "Template parameters for a single carousel card")

public class CardParameters  implements Serializable {
  
  private List<TemplateParameter> bodyParameters = null;
  private List<TemplateParameter> buttonUrlParameters = null;

  public CardParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      bodyParameters = new ArrayList<TemplateParameter>();
      buttonUrlParameters = new ArrayList<TemplateParameter>();
    }
  }

  
  /**
   * A list of Response Management carousel card body parameter substitutions for the response's messaging template
   **/
  public CardParameters bodyParameters(List<TemplateParameter> bodyParameters) {
    this.bodyParameters = bodyParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of Response Management carousel card body parameter substitutions for the response's messaging template")
  @JsonProperty("bodyParameters")
  public List<TemplateParameter> getBodyParameters() {
    return bodyParameters;
  }
  public void setBodyParameters(List<TemplateParameter> bodyParameters) {
    this.bodyParameters = bodyParameters;
  }


  /**
   * A list of Response Management carousel card button URL parameter substitutions for the response's messaging template
   **/
  public CardParameters buttonUrlParameters(List<TemplateParameter> buttonUrlParameters) {
    this.buttonUrlParameters = buttonUrlParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of Response Management carousel card button URL parameter substitutions for the response's messaging template")
  @JsonProperty("buttonUrlParameters")
  public List<TemplateParameter> getButtonUrlParameters() {
    return buttonUrlParameters;
  }
  public void setButtonUrlParameters(List<TemplateParameter> buttonUrlParameters) {
    this.buttonUrlParameters = buttonUrlParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardParameters cardParameters = (CardParameters) o;

    return Objects.equals(this.bodyParameters, cardParameters.bodyParameters) &&
            Objects.equals(this.buttonUrlParameters, cardParameters.buttonUrlParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bodyParameters, buttonUrlParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardParameters {\n");
    
    sb.append("    bodyParameters: ").append(toIndentedString(bodyParameters)).append("\n");
    sb.append("    buttonUrlParameters: ").append(toIndentedString(buttonUrlParameters)).append("\n");
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

