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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SuggestionCannedResponse
 */

public class SuggestionCannedResponse  implements Serializable {
  
  private AddressableEntityRef response = null;
  private AddressableEntityRef library = null;

  
  @ApiModelProperty(example = "null", value = "The suggested response.")
  @JsonProperty("response")
  public AddressableEntityRef getResponse() {
    return response;
  }


  @ApiModelProperty(example = "null", value = "The library from which the canned response is suggested")
  @JsonProperty("library")
  public AddressableEntityRef getLibrary() {
    return library;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionCannedResponse suggestionCannedResponse = (SuggestionCannedResponse) o;

    return Objects.equals(this.response, suggestionCannedResponse.response) &&
            Objects.equals(this.library, suggestionCannedResponse.library);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, library);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionCannedResponse {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    library: ").append(toIndentedString(library)).append("\n");
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

