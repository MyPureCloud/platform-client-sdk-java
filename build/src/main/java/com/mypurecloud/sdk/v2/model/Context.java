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
import com.mypurecloud.sdk.v2.model.ContextPattern;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Context
 */

public class Context  implements Serializable {
  
  private List<ContextPattern> patterns = new ArrayList<ContextPattern>();

  
  /**
   * A list of one or more patterns to match.
   **/
  public Context patterns(List<ContextPattern> patterns) {
    this.patterns = patterns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of one or more patterns to match.")
  @JsonProperty("patterns")
  public List<ContextPattern> getPatterns() {
    return patterns;
  }
  public void setPatterns(List<ContextPattern> patterns) {
    this.patterns = patterns;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(this.patterns, context.patterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    
    sb.append("    patterns: ").append(toIndentedString(patterns)).append("\n");
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

