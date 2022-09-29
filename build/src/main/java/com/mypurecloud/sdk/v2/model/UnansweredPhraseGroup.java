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
import com.mypurecloud.sdk.v2.model.UnansweredPhrase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UnansweredPhraseGroup
 */

public class UnansweredPhraseGroup  implements Serializable {
  
  private String id = null;
  private String label = null;
  private List<UnansweredPhrase> phrases = null;
  private Integer unlinkedPhraseHitCount = null;
  private Integer unlinkedPhraseCount = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Knowledge base phrase group label
   **/
  public UnansweredPhraseGroup label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge base phrase group label")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * List of unanswered phrases in a phrase group
   **/
  public UnansweredPhraseGroup phrases(List<UnansweredPhrase> phrases) {
    this.phrases = phrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of unanswered phrases in a phrase group")
  @JsonProperty("phrases")
  public List<UnansweredPhrase> getPhrases() {
    return phrases;
  }
  public void setPhrases(List<UnansweredPhrase> phrases) {
    this.phrases = phrases;
  }


  /**
   * Hit count of the unlinked phrase group
   **/
  public UnansweredPhraseGroup unlinkedPhraseHitCount(Integer unlinkedPhraseHitCount) {
    this.unlinkedPhraseHitCount = unlinkedPhraseHitCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hit count of the unlinked phrase group")
  @JsonProperty("unlinkedPhraseHitCount")
  public Integer getUnlinkedPhraseHitCount() {
    return unlinkedPhraseHitCount;
  }
  public void setUnlinkedPhraseHitCount(Integer unlinkedPhraseHitCount) {
    this.unlinkedPhraseHitCount = unlinkedPhraseHitCount;
  }


  /**
   * Unique phrase count of the unlinked phrase group
   **/
  public UnansweredPhraseGroup unlinkedPhraseCount(Integer unlinkedPhraseCount) {
    this.unlinkedPhraseCount = unlinkedPhraseCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique phrase count of the unlinked phrase group")
  @JsonProperty("unlinkedPhraseCount")
  public Integer getUnlinkedPhraseCount() {
    return unlinkedPhraseCount;
  }
  public void setUnlinkedPhraseCount(Integer unlinkedPhraseCount) {
    this.unlinkedPhraseCount = unlinkedPhraseCount;
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
    UnansweredPhraseGroup unansweredPhraseGroup = (UnansweredPhraseGroup) o;

    return Objects.equals(this.id, unansweredPhraseGroup.id) &&
            Objects.equals(this.label, unansweredPhraseGroup.label) &&
            Objects.equals(this.phrases, unansweredPhraseGroup.phrases) &&
            Objects.equals(this.unlinkedPhraseHitCount, unansweredPhraseGroup.unlinkedPhraseHitCount) &&
            Objects.equals(this.unlinkedPhraseCount, unansweredPhraseGroup.unlinkedPhraseCount) &&
            Objects.equals(this.selfUri, unansweredPhraseGroup.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, phrases, unlinkedPhraseHitCount, unlinkedPhraseCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnansweredPhraseGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    phrases: ").append(toIndentedString(phrases)).append("\n");
    sb.append("    unlinkedPhraseHitCount: ").append(toIndentedString(unlinkedPhraseHitCount)).append("\n");
    sb.append("    unlinkedPhraseCount: ").append(toIndentedString(unlinkedPhraseCount)).append("\n");
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

