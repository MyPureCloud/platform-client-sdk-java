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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UnansweredPhraseGroupPatchRequestBody
 */

public class UnansweredPhraseGroupPatchRequestBody  implements Serializable {
  
  private List<PhraseAssociations> phraseAssociations = new ArrayList<PhraseAssociations>();
  private LocalDate dateStart = null;
  private LocalDate dateEnd = null;

  
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


  /**
   * The start date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public UnansweredPhraseGroupPatchRequestBody dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStart")
  public LocalDate getDateStart() {
    return dateStart;
  }
  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * The end date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public UnansweredPhraseGroupPatchRequestBody dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEnd")
  public LocalDate getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
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

    return Objects.equals(this.phraseAssociations, unansweredPhraseGroupPatchRequestBody.phraseAssociations) &&
            Objects.equals(this.dateStart, unansweredPhraseGroupPatchRequestBody.dateStart) &&
            Objects.equals(this.dateEnd, unansweredPhraseGroupPatchRequestBody.dateEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phraseAssociations, dateStart, dateEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnansweredPhraseGroupPatchRequestBody {\n");
    
    sb.append("    phraseAssociations: ").append(toIndentedString(phraseAssociations)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
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

