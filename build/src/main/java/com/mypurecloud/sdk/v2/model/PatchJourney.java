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
import com.mypurecloud.sdk.v2.model.PatchJourneyPattern;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PatchJourney
 */

public class PatchJourney  implements Serializable {
  
  private List<PatchJourneyPattern> patterns = new ArrayList<PatchJourneyPattern>();

  
  /**
   * A list of zero or more patterns to match.
   **/
  public PatchJourney patterns(List<PatchJourneyPattern> patterns) {
    this.patterns = patterns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of zero or more patterns to match.")
  @JsonProperty("patterns")
  public List<PatchJourneyPattern> getPatterns() {
    return patterns;
  }
  public void setPatterns(List<PatchJourneyPattern> patterns) {
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
    PatchJourney patchJourney = (PatchJourney) o;

    return Objects.equals(this.patterns, patchJourney.patterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchJourney {\n");
    
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

