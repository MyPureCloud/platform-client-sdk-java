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
import com.mypurecloud.sdk.v2.model.DocumentVariationAnswer;
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
 * KnowledgeSearchDocumentResponse
 */

public class KnowledgeSearchDocumentResponse  implements Serializable {
  
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
  private String externalId = null;
  private String externalUrl = null;
  private AddressableEntityRef source = null;
  private Boolean readonly = null;
  private List<DocumentVariationAnswer> variations = new ArrayList<DocumentVariationAnswer>();
  private String answer = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Document title, having a limit of 500 words.
   **/
  public KnowledgeSearchDocumentResponse title(String title) {
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
  public KnowledgeSearchDocumentResponse visible(Boolean visible) {
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
  public KnowledgeSearchDocumentResponse alternatives(List<KnowledgeDocumentAlternative> alternatives) {
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
  public KnowledgeSearchDocumentResponse state(StateEnum state) {
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
  public KnowledgeSearchDocumentResponse dateCreated(Date dateCreated) {
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
  public KnowledgeSearchDocumentResponse dateModified(Date dateModified) {
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
  public KnowledgeSearchDocumentResponse dateImported(Date dateImported) {
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
  public KnowledgeSearchDocumentResponse lastPublishedVersionNumber(Integer lastPublishedVersionNumber) {
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
  public KnowledgeSearchDocumentResponse datePublished(Date datePublished) {
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
  public KnowledgeSearchDocumentResponse documentVersion(AddressableEntityRef documentVersion) {
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
  public KnowledgeSearchDocumentResponse category(CategoryResponse category) {
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
  public KnowledgeSearchDocumentResponse labels(List<LabelResponse> labels) {
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
  public KnowledgeSearchDocumentResponse knowledgeBase(KnowledgeBaseReference knowledgeBase) {
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
   * The reference to external id associated with the document.
   **/
  public KnowledgeSearchDocumentResponse externalId(String externalId) {
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


  /**
   * The URL to external document.
   **/
  public KnowledgeSearchDocumentResponse externalUrl(String externalUrl) {
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


  /**
   * The reference to source associated with the document.
   **/
  public KnowledgeSearchDocumentResponse source(AddressableEntityRef source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference to source associated with the document.")
  @JsonProperty("source")
  public AddressableEntityRef getSource() {
    return source;
  }
  public void setSource(AddressableEntityRef source) {
    this.source = source;
  }


  /**
   * Whether the document is read-only.
   **/
  public KnowledgeSearchDocumentResponse readonly(Boolean readonly) {
    this.readonly = readonly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the document is read-only.")
  @JsonProperty("readonly")
  public Boolean getReadonly() {
    return readonly;
  }
  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }


  /**
   * Variations of the document.
   **/
  public KnowledgeSearchDocumentResponse variations(List<DocumentVariationAnswer> variations) {
    this.variations = variations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Variations of the document.")
  @JsonProperty("variations")
  public List<DocumentVariationAnswer> getVariations() {
    return variations;
  }
  public void setVariations(List<DocumentVariationAnswer> variations) {
    this.variations = variations;
  }


  /**
   * The answer to the query.
   **/
  public KnowledgeSearchDocumentResponse answer(String answer) {
    this.answer = answer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The answer to the query.")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }
  public void setAnswer(String answer) {
    this.answer = answer;
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
    KnowledgeSearchDocumentResponse knowledgeSearchDocumentResponse = (KnowledgeSearchDocumentResponse) o;

    return Objects.equals(this.id, knowledgeSearchDocumentResponse.id) &&
            Objects.equals(this.title, knowledgeSearchDocumentResponse.title) &&
            Objects.equals(this.visible, knowledgeSearchDocumentResponse.visible) &&
            Objects.equals(this.alternatives, knowledgeSearchDocumentResponse.alternatives) &&
            Objects.equals(this.state, knowledgeSearchDocumentResponse.state) &&
            Objects.equals(this.dateCreated, knowledgeSearchDocumentResponse.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeSearchDocumentResponse.dateModified) &&
            Objects.equals(this.dateImported, knowledgeSearchDocumentResponse.dateImported) &&
            Objects.equals(this.lastPublishedVersionNumber, knowledgeSearchDocumentResponse.lastPublishedVersionNumber) &&
            Objects.equals(this.datePublished, knowledgeSearchDocumentResponse.datePublished) &&
            Objects.equals(this.createdBy, knowledgeSearchDocumentResponse.createdBy) &&
            Objects.equals(this.modifiedBy, knowledgeSearchDocumentResponse.modifiedBy) &&
            Objects.equals(this.documentVersion, knowledgeSearchDocumentResponse.documentVersion) &&
            Objects.equals(this.category, knowledgeSearchDocumentResponse.category) &&
            Objects.equals(this.labels, knowledgeSearchDocumentResponse.labels) &&
            Objects.equals(this.knowledgeBase, knowledgeSearchDocumentResponse.knowledgeBase) &&
            Objects.equals(this.externalId, knowledgeSearchDocumentResponse.externalId) &&
            Objects.equals(this.externalUrl, knowledgeSearchDocumentResponse.externalUrl) &&
            Objects.equals(this.source, knowledgeSearchDocumentResponse.source) &&
            Objects.equals(this.readonly, knowledgeSearchDocumentResponse.readonly) &&
            Objects.equals(this.variations, knowledgeSearchDocumentResponse.variations) &&
            Objects.equals(this.answer, knowledgeSearchDocumentResponse.answer) &&
            Objects.equals(this.selfUri, knowledgeSearchDocumentResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, visible, alternatives, state, dateCreated, dateModified, dateImported, lastPublishedVersionNumber, datePublished, createdBy, modifiedBy, documentVersion, category, labels, knowledgeBase, externalId, externalUrl, source, readonly, variations, answer, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSearchDocumentResponse {\n");
    
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
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

