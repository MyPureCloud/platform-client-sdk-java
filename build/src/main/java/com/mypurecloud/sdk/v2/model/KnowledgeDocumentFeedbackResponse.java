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
import com.mypurecloud.sdk.v2.model.EntityReference;
import com.mypurecloud.sdk.v2.model.KnowledgeConversationContextResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersionReference;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchClientApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * KnowledgeDocumentFeedbackResponse
 */

public class KnowledgeDocumentFeedbackResponse  implements Serializable {
  
  private String id = null;
  private EntityReference documentVariation = null;

  private static class RatingEnumDeserializer extends StdDeserializer<RatingEnum> {
    public RatingEnumDeserializer() {
      super(RatingEnumDeserializer.class);
    }

    @Override
    public RatingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RatingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Feedback rating.
   */
 @JsonDeserialize(using = RatingEnumDeserializer.class)
  public enum RatingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NEGATIVE("Negative"),
    POSITIVE("Positive");

    private String value;

    RatingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RatingEnum fromString(String key) {
      if (key == null) return null;

      for (RatingEnum value : RatingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RatingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RatingEnum rating = null;

  private static class ReasonEnumDeserializer extends StdDeserializer<ReasonEnum> {
    public ReasonEnumDeserializer() {
      super(ReasonEnumDeserializer.class);
    }

    @Override
    public ReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Feedback reason.
   */
 @JsonDeserialize(using = ReasonEnumDeserializer.class)
  public enum ReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DOCUMENTCONTENT("DocumentContent"),
    SEARCHRESULTS("SearchResults");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReasonEnum fromString(String key) {
      if (key == null) return null;

      for (ReasonEnum value : ReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ReasonEnum reason = null;
  private String comment = null;
  private EntityReference search = null;
  private String sessionId = null;
  private Date dateCreated = null;

  private static class QueryTypeEnumDeserializer extends StdDeserializer<QueryTypeEnum> {
    public QueryTypeEnumDeserializer() {
      super(QueryTypeEnumDeserializer.class);
    }

    @Override
    public QueryTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return QueryTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the query that surfaced the document on which the feedback was given.
   */
 @JsonDeserialize(using = QueryTypeEnumDeserializer.class)
  public enum QueryTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ARTICLE("Article"),
    AUTOSEARCH("AutoSearch"),
    CATEGORY("Category"),
    MANUALSEARCH("ManualSearch"),
    RECOMMENDATION("Recommendation"),
    SUGGESTION("Suggestion");

    private String value;

    QueryTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static QueryTypeEnum fromString(String key) {
      if (key == null) return null;

      for (QueryTypeEnum value : QueryTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return QueryTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private QueryTypeEnum queryType = null;

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
   * The state of the feedback.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    FINAL("Final");

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
  private KnowledgeDocumentVersionReference document = null;
  private KnowledgeSearchClientApplication application = null;
  private KnowledgeConversationContextResponse conversationContext = null;
  private AddressableEntityRef user = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The variation of the document on which feedback was given.
   **/
  public KnowledgeDocumentFeedbackResponse documentVariation(EntityReference documentVariation) {
    this.documentVariation = documentVariation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variation of the document on which feedback was given.")
  @JsonProperty("documentVariation")
  public EntityReference getDocumentVariation() {
    return documentVariation;
  }
  public void setDocumentVariation(EntityReference documentVariation) {
    this.documentVariation = documentVariation;
  }


  /**
   * Feedback rating.
   **/
  public KnowledgeDocumentFeedbackResponse rating(RatingEnum rating) {
    this.rating = rating;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Feedback rating.")
  @JsonProperty("rating")
  public RatingEnum getRating() {
    return rating;
  }
  public void setRating(RatingEnum rating) {
    this.rating = rating;
  }


  /**
   * Feedback reason.
   **/
  public KnowledgeDocumentFeedbackResponse reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Feedback reason.")
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  /**
   * Free-text comment of the feedback. Maximum length: 2000 characters.
   **/
  public KnowledgeDocumentFeedbackResponse comment(String comment) {
    this.comment = comment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Free-text comment of the feedback. Maximum length: 2000 characters.")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }


  /**
   * The search that surfaced the document on which feedback was given.
   **/
  public KnowledgeDocumentFeedbackResponse search(EntityReference search) {
    this.search = search;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The search that surfaced the document on which feedback was given.")
  @JsonProperty("search")
  public EntityReference getSearch() {
    return search;
  }
  public void setSearch(EntityReference search) {
    this.search = search;
  }


  @ApiModelProperty(example = "null", value = "Knowledge guest session ID.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }


  @ApiModelProperty(example = "null", value = "The date and time of the feedback. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  /**
   * The type of the query that surfaced the document on which the feedback was given.
   **/
  public KnowledgeDocumentFeedbackResponse queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the query that surfaced the document on which the feedback was given.")
  @JsonProperty("queryType")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }
  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }


  /**
   * The state of the feedback.
   **/
  public KnowledgeDocumentFeedbackResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the feedback.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The document on which feedback was given.
   **/
  public KnowledgeDocumentFeedbackResponse document(KnowledgeDocumentVersionReference document) {
    this.document = document;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The document on which feedback was given.")
  @JsonProperty("document")
  public KnowledgeDocumentVersionReference getDocument() {
    return document;
  }
  public void setDocument(KnowledgeDocumentVersionReference document) {
    this.document = document;
  }


  /**
   * The client application from which feedback was given.
   **/
  public KnowledgeDocumentFeedbackResponse application(KnowledgeSearchClientApplication application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The client application from which feedback was given.")
  @JsonProperty("application")
  public KnowledgeSearchClientApplication getApplication() {
    return application;
  }
  public void setApplication(KnowledgeSearchClientApplication application) {
    this.application = application;
  }


  /**
   * Conversation context information if the feedback is given in the context of a conversation.
   **/
  public KnowledgeDocumentFeedbackResponse conversationContext(KnowledgeConversationContextResponse conversationContext) {
    this.conversationContext = conversationContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation context information if the feedback is given in the context of a conversation.")
  @JsonProperty("conversationContext")
  public KnowledgeConversationContextResponse getConversationContext() {
    return conversationContext;
  }
  public void setConversationContext(KnowledgeConversationContextResponse conversationContext) {
    this.conversationContext = conversationContext;
  }


  @ApiModelProperty(example = "null", value = "The user who created the feedback.")
  @JsonProperty("user")
  public AddressableEntityRef getUser() {
    return user;
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
    KnowledgeDocumentFeedbackResponse knowledgeDocumentFeedbackResponse = (KnowledgeDocumentFeedbackResponse) o;

    return Objects.equals(this.id, knowledgeDocumentFeedbackResponse.id) &&
            Objects.equals(this.documentVariation, knowledgeDocumentFeedbackResponse.documentVariation) &&
            Objects.equals(this.rating, knowledgeDocumentFeedbackResponse.rating) &&
            Objects.equals(this.reason, knowledgeDocumentFeedbackResponse.reason) &&
            Objects.equals(this.comment, knowledgeDocumentFeedbackResponse.comment) &&
            Objects.equals(this.search, knowledgeDocumentFeedbackResponse.search) &&
            Objects.equals(this.sessionId, knowledgeDocumentFeedbackResponse.sessionId) &&
            Objects.equals(this.dateCreated, knowledgeDocumentFeedbackResponse.dateCreated) &&
            Objects.equals(this.queryType, knowledgeDocumentFeedbackResponse.queryType) &&
            Objects.equals(this.state, knowledgeDocumentFeedbackResponse.state) &&
            Objects.equals(this.document, knowledgeDocumentFeedbackResponse.document) &&
            Objects.equals(this.application, knowledgeDocumentFeedbackResponse.application) &&
            Objects.equals(this.conversationContext, knowledgeDocumentFeedbackResponse.conversationContext) &&
            Objects.equals(this.user, knowledgeDocumentFeedbackResponse.user) &&
            Objects.equals(this.selfUri, knowledgeDocumentFeedbackResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentVariation, rating, reason, comment, search, sessionId, dateCreated, queryType, state, document, application, conversationContext, user, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentFeedbackResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentVariation: ").append(toIndentedString(documentVariation)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

