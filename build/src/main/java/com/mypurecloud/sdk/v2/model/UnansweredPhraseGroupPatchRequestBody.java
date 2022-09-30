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
import com.mypurecloud.sdk.v2.model.PhraseAssociations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UnansweredPhraseGroupPatchRequestBody
 */

public class UnansweredPhraseGroupPatchRequestBody  implements Serializable {
  
  private List<PhraseAssociations> phraseAssociations = new ArrayList<PhraseAssociations>();

  
  /**
   * List of phrases and documents to be linked
   **/
  public UnansweredPhraseGroupPatchRequestBody phraseAssociations(List<PhraseAssociations> phraseAssociations) {
    this.phraseAssociations = phraseAssociations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of phrases and documents to be linked")
  @JsonProperty("phraseAssociations")
  public List<PhraseAssociations> getPhraseAssociations() {
    return phraseAssociations;
  }
  public void setPhraseAssociations(List<PhraseAssociations> phraseAssociations) {
    this.phraseAssociations = phraseAssociations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnansweredPhraseGroupPatchRequestBody unansweredPhraseGroupPatchRequestBody = (UnansweredPhraseGroupPatchRequestBody) o;

    return Objects.equals(this.phraseAssociations, unansweredPhraseGroupPatchRequestBody.phraseAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phraseAssociations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnansweredPhraseGroupPatchRequestBody {\n");
    
    sb.append("    phraseAssociations: ").append(toIndentedString(phraseAssociations)).append("\n");
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

