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
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentAlternative;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeDocumentReq
 */

public class KnowledgeDocumentReq  implements Serializable {
  
  private String id = null;
  private String title = null;
  private Boolean visible = null;
  private List<KnowledgeDocumentAlternative> alternatives = null;
  private String categoryId = null;
  private List<String> labelIds = null;
  private String externalId = null;
  private String externalUrl = null;
  private String selfUri = null;

  public KnowledgeDocumentReq() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      alternatives = new ArrayList<KnowledgeDocumentAlternative>();
      labelIds = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Document title.
   **/
  public KnowledgeDocumentReq title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Document title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Indicates if the knowledge document should be included in search results.
   **/
  public KnowledgeDocumentReq visible(Boolean visible) {
    this.visible = visible;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the knowledge document should be included in search results.")
  @JsonProperty("visible")
  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  /**
   * List of alternate phrases related to the title which improves search results.
   **/
  public KnowledgeDocumentReq alternatives(List<KnowledgeDocumentAlternative> alternatives) {
    this.alternatives = alternatives;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of alternate phrases related to the title which improves search results.")
  @JsonProperty("alternatives")
  public List<KnowledgeDocumentAlternative> getAlternatives() {
    return alternatives;
  }
  public void setAlternatives(List<KnowledgeDocumentAlternative> alternatives) {
    this.alternatives = alternatives;
  }


  /**
   * The category associated with the document.
   **/
  public KnowledgeDocumentReq categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category associated with the document.")
  @JsonProperty("categoryId")
  public String getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  /**
   * The ids of labels associated with the document.
   **/
  public KnowledgeDocumentReq labelIds(List<String> labelIds) {
    this.labelIds = labelIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ids of labels associated with the document.")
  @JsonProperty("labelIds")
  public List<String> getLabelIds() {
    return labelIds;
  }
  public void setLabelIds(List<String> labelIds) {
    this.labelIds = labelIds;
  }


  /**
   * The external id associated with the document.
   **/
  public KnowledgeDocumentReq externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external id associated with the document.")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  /**
   * The URL to external document.
   **/
  public KnowledgeDocumentReq externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL to external document.")
  @JsonProperty("externalUrl")
  public String getExternalUrl() {
    return externalUrl;
  }
  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
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
    KnowledgeDocumentReq knowledgeDocumentReq = (KnowledgeDocumentReq) o;

    return Objects.equals(this.id, knowledgeDocumentReq.id) &&
            Objects.equals(this.title, knowledgeDocumentReq.title) &&
            Objects.equals(this.visible, knowledgeDocumentReq.visible) &&
            Objects.equals(this.alternatives, knowledgeDocumentReq.alternatives) &&
            Objects.equals(this.categoryId, knowledgeDocumentReq.categoryId) &&
            Objects.equals(this.labelIds, knowledgeDocumentReq.labelIds) &&
            Objects.equals(this.externalId, knowledgeDocumentReq.externalId) &&
            Objects.equals(this.externalUrl, knowledgeDocumentReq.externalUrl) &&
            Objects.equals(this.selfUri, knowledgeDocumentReq.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, visible, alternatives, categoryId, labelIds, externalId, externalUrl, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentReq {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    alternatives: ").append(toIndentedString(alternatives)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
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

