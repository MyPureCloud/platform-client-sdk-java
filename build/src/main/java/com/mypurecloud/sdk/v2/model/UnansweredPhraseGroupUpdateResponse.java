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
import com.mypurecloud.sdk.v2.model.PhraseAssociations;
import com.mypurecloud.sdk.v2.model.UnansweredGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UnansweredPhraseGroupUpdateResponse
 */

public class UnansweredPhraseGroupUpdateResponse  implements Serializable {
  
  private List<PhraseAssociations> phraseAssociations = null;
  private UnansweredGroup group = null;

  public UnansweredPhraseGroupUpdateResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      phraseAssociations = new ArrayList<PhraseAssociations>();
    }
  }

  
  /**
   * List of phrases and documents linked in the patch request
   **/
  public UnansweredPhraseGroupUpdateResponse phraseAssociations(List<PhraseAssociations> phraseAssociations) {
    this.phraseAssociations = phraseAssociations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of phrases and documents linked in the patch request")
  @JsonProperty("phraseAssociations")
  public List<PhraseAssociations> getPhraseAssociations() {
    return phraseAssociations;
  }
  public void setPhraseAssociations(List<PhraseAssociations> phraseAssociations) {
    this.phraseAssociations = phraseAssociations;
  }


  /**
   * Knowledge base unanswered group response
   **/
  public UnansweredPhraseGroupUpdateResponse group(UnansweredGroup group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge base unanswered group response")
  @JsonProperty("group")
  public UnansweredGroup getGroup() {
    return group;
  }
  public void setGroup(UnansweredGroup group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnansweredPhraseGroupUpdateResponse unansweredPhraseGroupUpdateResponse = (UnansweredPhraseGroupUpdateResponse) o;

    return Objects.equals(this.phraseAssociations, unansweredPhraseGroupUpdateResponse.phraseAssociations) &&
            Objects.equals(this.group, unansweredPhraseGroupUpdateResponse.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phraseAssociations, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnansweredPhraseGroupUpdateResponse {\n");
    
    sb.append("    phraseAssociations: ").append(toIndentedString(phraseAssociations)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

