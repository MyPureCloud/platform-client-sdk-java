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
 * Specifies the requirements for a credential that can be provided for configuring an integration
 */
@ApiModel(description = "Specifies the requirements for a credential that can be provided for configuring an integration")

public class CredentialSpecification  implements Serializable {
  
  private Boolean required = null;
  private String title = null;
  private List<String> credentialTypes = new ArrayList<String>();

  
  @ApiModelProperty(example = "null", value = "Indicates if the credential must be provided in order for the integration configuration to be valid.")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  
  @ApiModelProperty(example = "null", value = "Title describing the usage for this credential.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  
  @ApiModelProperty(example = "null", value = "List of acceptable credential types that can be provided for this credential.")
  @JsonProperty("credentialTypes")
  public List<String> getCredentialTypes() {
    return credentialTypes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialSpecification credentialSpecification = (CredentialSpecification) o;
    return Objects.equals(this.required, credentialSpecification.required) &&
        Objects.equals(this.title, credentialSpecification.title) &&
        Objects.equals(this.credentialTypes, credentialSpecification.credentialTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, title, credentialTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialSpecification {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    credentialTypes: ").append(toIndentedString(credentialTypes)).append("\n");
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

