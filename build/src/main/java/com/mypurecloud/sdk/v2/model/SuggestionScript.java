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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * SuggestionScript
 */

public class SuggestionScript  implements Serializable {
  
  private AddressableEntityRef script = null;
  private AddressableEntityRef page = null;
  private Map<String, String> data = null;

  public SuggestionScript() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The suggested script.")
  @JsonProperty("script")
  public AddressableEntityRef getScript() {
    return script;
  }


  @ApiModelProperty(example = "null", value = "The page of the script.")
  @JsonProperty("page")
  public AddressableEntityRef getPage() {
    return page;
  }


  @ApiModelProperty(example = "null", value = "The payload for the script.")
  @JsonProperty("data")
  public Map<String, String> getData() {
    return data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionScript suggestionScript = (SuggestionScript) o;

    return Objects.equals(this.script, suggestionScript.script) &&
            Objects.equals(this.page, suggestionScript.page) &&
            Objects.equals(this.data, suggestionScript.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, page, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionScript {\n");
    
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

