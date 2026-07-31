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
import com.mypurecloud.sdk.v2.model.ThirdPartySuggestion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SuggestionPatchRequest
 */

public class SuggestionPatchRequest  implements Serializable {
  
  private ThirdPartySuggestion thirdPartySuggestion = null;

  public SuggestionPatchRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SuggestionPatchRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The third-party suggestion to associate with the suggestion.
   **/
  public SuggestionPatchRequest thirdPartySuggestion(ThirdPartySuggestion thirdPartySuggestion) {
    this.thirdPartySuggestion = thirdPartySuggestion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The third-party suggestion to associate with the suggestion.")
  @JsonProperty("thirdPartySuggestion")
  public ThirdPartySuggestion getThirdPartySuggestion() {
    return thirdPartySuggestion;
  }
  public void setThirdPartySuggestion(ThirdPartySuggestion thirdPartySuggestion) {
    this.thirdPartySuggestion = thirdPartySuggestion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionPatchRequest suggestionPatchRequest = (SuggestionPatchRequest) o;

    return Objects.equals(this.thirdPartySuggestion, suggestionPatchRequest.thirdPartySuggestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdPartySuggestion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionPatchRequest {\n");
    
    sb.append("    thirdPartySuggestion: ").append(toIndentedString(thirdPartySuggestion)).append("\n");
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

