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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.CategoryResponse;
import com.mypurecloud.sdk.v2.model.DocumentVariation;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseReference;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentAlternative;
import com.mypurecloud.sdk.v2.model.LabelResponse;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeDocumentResponse
 */

public class KnowledgeDocumentResponse  implements Serializable {
  
  private String id = null;
  private String title = null;
  private Boolean visible = null;
  private List<KnowledgeDocumentAlternative> alternatives = new ArrayList<KnowledgeDocumentAlternative>();

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * State of the document.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    PUBLISHED("Published"),
    ARCHIVED("Archived");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Date dateImported = null;
  private Integer lastPublishedVersionNumber = null;
  private Date datePublished = null;
  private UserReference createdBy = null;
  private UserReference modifiedBy = null;
  private AddressableEntityRef documentVersion = null;
  private CategoryResponse category = null;
  private List<LabelResponse> labels = new ArrayList<LabelResponse>();
  private KnowledgeBaseReference knowledgeBase = null;
  private List<DocumentVariation> variations = new ArrayList<DocumentVariation>();
  private String externalId = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Document title, having a limit of 500 words.
   **/
  public KnowledgeDocumentResponse title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document title, having a limit of 500 words.")
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
  public KnowledgeDocumentResponse visible(Boolean visible) {
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
  public KnowledgeDocumentResponse alternatives(List<KnowledgeDocumentAlternative> alternatives) {
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
   * State of the document.
   **/
  public KnowledgeDocumentResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State of the document.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Document creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeDocumentResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Document last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeDocumentResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Document import date-time, or null if was not imported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeDocumentResponse dateImported(Date dateImported) {
    this.dateImported = dateImported;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document import date-time, or null if was not imported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateImported")
  public Date getDateImported() {
    return dateImported;
  }
  public void setDateImported(Date dateImported) {
    this.dateImported = dateImported;
  }


  /**
   * The last published version number of the document.
   **/
  public KnowledgeDocumentResponse lastPublishedVersionNumber(Integer lastPublishedVersionNumber) {
    this.lastPublishedVersionNumber = lastPublishedVersionNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last published version number of the document.")
  @JsonProperty("lastPublishedVersionNumber")
  public Integer getLastPublishedVersionNumber() {
    return lastPublishedVersionNumber;
  }
  public void setLastPublishedVersionNumber(Integer lastPublishedVersionNumber) {
    this.lastPublishedVersionNumber = lastPublishedVersionNumber;
  }


  /**
   * The date on which the document was last published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeDocumentResponse datePublished(Date datePublished) {
    this.datePublished = datePublished;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date on which the document was last published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("datePublished")
  public Date getDatePublished() {
    return datePublished;
  }
  public void setDatePublished(Date datePublished) {
    this.datePublished = datePublished;
  }


  @ApiModelProperty(example = "null", value = "The user who created the document.")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "The user who modified the document.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  /**
   * The version of the document.
   **/
  public KnowledgeDocumentResponse documentVersion(AddressableEntityRef documentVersion) {
    this.documentVersion = documentVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the document.")
  @JsonProperty("documentVersion")
  public AddressableEntityRef getDocumentVersion() {
    return documentVersion;
  }
  public void setDocumentVersion(AddressableEntityRef documentVersion) {
    this.documentVersion = documentVersion;
  }


  /**
   * The reference to category associated with the document.
   **/
  public KnowledgeDocumentResponse category(CategoryResponse category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference to category associated with the document.")
  @JsonProperty("category")
  public CategoryResponse getCategory() {
    return category;
  }
  public void setCategory(CategoryResponse category) {
    this.category = category;
  }


  /**
   * The references to labels associated with the document.
   **/
  public KnowledgeDocumentResponse labels(List<LabelResponse> labels) {
    this.labels = labels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The references to labels associated with the document.")
  @JsonProperty("labels")
  public List<LabelResponse> getLabels() {
    return labels;
  }
  public void setLabels(List<LabelResponse> labels) {
    this.labels = labels;
  }


  /**
   * Knowledge base to which the document belongs to.
   **/
  public KnowledgeDocumentResponse knowledgeBase(KnowledgeBaseReference knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge base to which the document belongs to.")
  @JsonProperty("knowledgeBase")
  public KnowledgeBaseReference getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(KnowledgeBaseReference knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }


  /**
   * Variations of the document.
   **/
  public KnowledgeDocumentResponse variations(List<DocumentVariation> variations) {
    this.variations = variations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Variations of the document.")
  @JsonProperty("variations")
  public List<DocumentVariation> getVariations() {
    return variations;
  }
  public void setVariations(List<DocumentVariation> variations) {
    this.variations = variations;
  }


  /**
   * The reference to external id associated with the document.
   **/
  public KnowledgeDocumentResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference to external id associated with the document.")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
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
    KnowledgeDocumentResponse knowledgeDocumentResponse = (KnowledgeDocumentResponse) o;

    return Objects.equals(this.id, knowledgeDocumentResponse.id) &&
            Objects.equals(this.title, knowledgeDocumentResponse.title) &&
            Objects.equals(this.visible, knowledgeDocumentResponse.visible) &&
            Objects.equals(this.alternatives, knowledgeDocumentResponse.alternatives) &&
            Objects.equals(this.state, knowledgeDocumentResponse.state) &&
            Objects.equals(this.dateCreated, knowledgeDocumentResponse.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeDocumentResponse.dateModified) &&
            Objects.equals(this.dateImported, knowledgeDocumentResponse.dateImported) &&
            Objects.equals(this.lastPublishedVersionNumber, knowledgeDocumentResponse.lastPublishedVersionNumber) &&
            Objects.equals(this.datePublished, knowledgeDocumentResponse.datePublished) &&
            Objects.equals(this.createdBy, knowledgeDocumentResponse.createdBy) &&
            Objects.equals(this.modifiedBy, knowledgeDocumentResponse.modifiedBy) &&
            Objects.equals(this.documentVersion, knowledgeDocumentResponse.documentVersion) &&
            Objects.equals(this.category, knowledgeDocumentResponse.category) &&
            Objects.equals(this.labels, knowledgeDocumentResponse.labels) &&
            Objects.equals(this.knowledgeBase, knowledgeDocumentResponse.knowledgeBase) &&
            Objects.equals(this.variations, knowledgeDocumentResponse.variations) &&
            Objects.equals(this.externalId, knowledgeDocumentResponse.externalId) &&
            Objects.equals(this.selfUri, knowledgeDocumentResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, visible, alternatives, state, dateCreated, dateModified, dateImported, lastPublishedVersionNumber, datePublished, createdBy, modifiedBy, documentVersion, category, labels, knowledgeBase, variations, externalId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    alternatives: ").append(toIndentedString(alternatives)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateImported: ").append(toIndentedString(dateImported)).append("\n");
    sb.append("    lastPublishedVersionNumber: ").append(toIndentedString(lastPublishedVersionNumber)).append("\n");
    sb.append("    datePublished: ").append(toIndentedString(datePublished)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

