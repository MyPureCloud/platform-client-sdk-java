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
import com.mypurecloud.sdk.v2.model.KnowledgeGroupStatistics;
import com.mypurecloud.sdk.v2.model.UnansweredGroupSuggestedDocument;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UnansweredGroup
 */

public class UnansweredGroup  implements Serializable {
  
  private String id = null;
  private String label = null;
  private List<UnansweredPhraseGroup> phraseGroups = null;
  private List<UnansweredGroupSuggestedDocument> suggestedDocuments = null;
  private KnowledgeGroupStatistics statistics = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Knowledge base unanswered group label
   **/
  public UnansweredGroup label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge base unanswered group label")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Represents a list of phrase groups inside an unanswered group
   **/
  public UnansweredGroup phraseGroups(List<UnansweredPhraseGroup> phraseGroups) {
    this.phraseGroups = phraseGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents a list of phrase groups inside an unanswered group")
  @JsonProperty("phraseGroups")
  public List<UnansweredPhraseGroup> getPhraseGroups() {
    return phraseGroups;
  }
  public void setPhraseGroups(List<UnansweredPhraseGroup> phraseGroups) {
    this.phraseGroups = phraseGroups;
  }


  /**
   * Represents a list of documents that may be linked to an unanswered group
   **/
  public UnansweredGroup suggestedDocuments(List<UnansweredGroupSuggestedDocument> suggestedDocuments) {
    this.suggestedDocuments = suggestedDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents a list of documents that may be linked to an unanswered group")
  @JsonProperty("suggestedDocuments")
  public List<UnansweredGroupSuggestedDocument> getSuggestedDocuments() {
    return suggestedDocuments;
  }
  public void setSuggestedDocuments(List<UnansweredGroupSuggestedDocument> suggestedDocuments) {
    this.suggestedDocuments = suggestedDocuments;
  }


  /**
   * Statistics object containing the various hit counts for an unanswered group
   **/
  public UnansweredGroup statistics(KnowledgeGroupStatistics statistics) {
    this.statistics = statistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Statistics object containing the various hit counts for an unanswered group")
  @JsonProperty("statistics")
  public KnowledgeGroupStatistics getStatistics() {
    return statistics;
  }
  public void setStatistics(KnowledgeGroupStatistics statistics) {
    this.statistics = statistics;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnansweredGroup unansweredGroup = (UnansweredGroup) o;

    return Objects.equals(this.id, unansweredGroup.id) &&
            Objects.equals(this.label, unansweredGroup.label) &&
            Objects.equals(this.phraseGroups, unansweredGroup.phraseGroups) &&
            Objects.equals(this.suggestedDocuments, unansweredGroup.suggestedDocuments) &&
            Objects.equals(this.statistics, unansweredGroup.statistics) &&
            Objects.equals(this.selfUri, unansweredGroup.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, phraseGroups, suggestedDocuments, statistics, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnansweredGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    phraseGroups: ").append(toIndentedString(phraseGroups)).append("\n");
    sb.append("    suggestedDocuments: ").append(toIndentedString(suggestedDocuments)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

