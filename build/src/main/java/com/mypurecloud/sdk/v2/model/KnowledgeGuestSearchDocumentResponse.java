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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.GuestCategoryReference;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentAlternative;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentVariationAnswer;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeGuestSearchDocumentResponse
 */

public class KnowledgeGuestSearchDocumentResponse  implements Serializable {
  
  private String id = null;
  private String title = null;
  private Boolean visible = null;
  private List<KnowledgeDocumentAlternative> alternatives = null;

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
  private String sessionId = null;
  private GuestCategoryReference category = null;
  private List<KnowledgeGuestDocumentVariationAnswer> variations = null;
  private String answer = null;
  private String selfUri = null;

  public KnowledgeGuestSearchDocumentResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      alternatives = new ArrayList<KnowledgeDocumentAlternative>();
      variations = new ArrayList<KnowledgeGuestDocumentVariationAnswer>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Document title, having a limit of 500 words.
   **/
  public KnowledgeGuestSearchDocumentResponse title(String title) {
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
  public KnowledgeGuestSearchDocumentResponse visible(Boolean visible) {
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
  public KnowledgeGuestSearchDocumentResponse alternatives(List<KnowledgeDocumentAlternative> alternatives) {
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
  public KnowledgeGuestSearchDocumentResponse state(StateEnum state) {
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
  public KnowledgeGuestSearchDocumentResponse dateCreated(Date dateCreated) {
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
  public KnowledgeGuestSearchDocumentResponse dateModified(Date dateModified) {
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
  public KnowledgeGuestSearchDocumentResponse dateImported(Date dateImported) {
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
  public KnowledgeGuestSearchDocumentResponse lastPublishedVersionNumber(Integer lastPublishedVersionNumber) {
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
  public KnowledgeGuestSearchDocumentResponse datePublished(Date datePublished) {
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
  public KnowledgeGuestSearchDocumentResponse documentVersion(AddressableEntityRef documentVersion) {
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


  @ApiModelProperty(example = "null", value = "ID of the guest session.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }


  @ApiModelProperty(example = "null", value = "The reference to category associated with the document.")
  @JsonProperty("category")
  public GuestCategoryReference getCategory() {
    return category;
  }


  /**
   * Variations of the document.
   **/
  public KnowledgeGuestSearchDocumentResponse variations(List<KnowledgeGuestDocumentVariationAnswer> variations) {
    this.variations = variations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Variations of the document.")
  @JsonProperty("variations")
  public List<KnowledgeGuestDocumentVariationAnswer> getVariations() {
    return variations;
  }
  public void setVariations(List<KnowledgeGuestDocumentVariationAnswer> variations) {
    this.variations = variations;
  }


  /**
   * The answer to the query.
   **/
  public KnowledgeGuestSearchDocumentResponse answer(String answer) {
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
    KnowledgeGuestSearchDocumentResponse knowledgeGuestSearchDocumentResponse = (KnowledgeGuestSearchDocumentResponse) o;

    return Objects.equals(this.id, knowledgeGuestSearchDocumentResponse.id) &&
            Objects.equals(this.title, knowledgeGuestSearchDocumentResponse.title) &&
            Objects.equals(this.visible, knowledgeGuestSearchDocumentResponse.visible) &&
            Objects.equals(this.alternatives, knowledgeGuestSearchDocumentResponse.alternatives) &&
            Objects.equals(this.state, knowledgeGuestSearchDocumentResponse.state) &&
            Objects.equals(this.dateCreated, knowledgeGuestSearchDocumentResponse.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeGuestSearchDocumentResponse.dateModified) &&
            Objects.equals(this.dateImported, knowledgeGuestSearchDocumentResponse.dateImported) &&
            Objects.equals(this.lastPublishedVersionNumber, knowledgeGuestSearchDocumentResponse.lastPublishedVersionNumber) &&
            Objects.equals(this.datePublished, knowledgeGuestSearchDocumentResponse.datePublished) &&
            Objects.equals(this.createdBy, knowledgeGuestSearchDocumentResponse.createdBy) &&
            Objects.equals(this.modifiedBy, knowledgeGuestSearchDocumentResponse.modifiedBy) &&
            Objects.equals(this.documentVersion, knowledgeGuestSearchDocumentResponse.documentVersion) &&
            Objects.equals(this.sessionId, knowledgeGuestSearchDocumentResponse.sessionId) &&
            Objects.equals(this.category, knowledgeGuestSearchDocumentResponse.category) &&
            Objects.equals(this.variations, knowledgeGuestSearchDocumentResponse.variations) &&
            Objects.equals(this.answer, knowledgeGuestSearchDocumentResponse.answer) &&
            Objects.equals(this.selfUri, knowledgeGuestSearchDocumentResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, visible, alternatives, state, dateCreated, dateModified, dateImported, lastPublishedVersionNumber, datePublished, createdBy, modifiedBy, documentVersion, sessionId, category, variations, answer, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestSearchDocumentResponse {\n");
    
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
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

