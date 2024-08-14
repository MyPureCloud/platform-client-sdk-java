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
import com.mypurecloud.sdk.v2.model.Article;
import com.mypurecloud.sdk.v2.model.Faq;
import com.mypurecloud.sdk.v2.model.SuggestionCannedResponse;
import com.mypurecloud.sdk.v2.model.SuggestionContext;
import com.mypurecloud.sdk.v2.model.SuggestionKnowledgeArticle;
import com.mypurecloud.sdk.v2.model.SuggestionKnowledgeSearch;
import com.mypurecloud.sdk.v2.model.SuggestionScript;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Suggestion
 */

public class Suggestion  implements Serializable {
  
  private String id = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the documents for which the suggestion is.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FAQ("Faq"),
    ARTICLE("Article"),
    KNOWLEDGEARTICLE("KnowledgeArticle"),
    KNOWLEDGESEARCH("KnowledgeSearch"),
    CANNEDRESPONSE("CannedResponse"),
    SCRIPT("Script");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private Faq faq = null;
  private Article article = null;
  private Date dateCreated = null;
  private String answerRecordId = null;

  private static class TriggerTypeEnumDeserializer extends StdDeserializer<TriggerTypeEnum> {
    public TriggerTypeEnumDeserializer() {
      super(TriggerTypeEnumDeserializer.class);
    }

    @Override
    public TriggerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TriggerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The trigger type of the suggestion.
   */
 @JsonDeserialize(using = TriggerTypeEnumDeserializer.class)
  public enum TriggerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    FALLBACK("Fallback"),
    CONVERSATIONSTART("ConversationStart"),
    CONVERSATIONTRANSFER("ConversationTransfer"),
    CONVERSATIONEND("ConversationEnd"),
    INTENT("Intent");

    private String value;

    TriggerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TriggerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TriggerTypeEnum value : TriggerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TriggerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TriggerTypeEnum triggerType = null;
  private SuggestionContext context = null;

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
   * The state of the suggestion.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUGGESTED("Suggested"),
    ACCEPTED("Accepted"),
    DISMISSED("Dismissed"),
    FAILED("Failed"),
    RATED("Rated");

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
  private SuggestionKnowledgeSearch knowledgeSearch = null;
  private SuggestionKnowledgeArticle knowledgeArticle = null;
  private SuggestionCannedResponse cannedResponse = null;
  private SuggestionScript script = null;
  private String selfUri = null;
  private AddressableEntityRef conversation = null;
  private AddressableEntityRef assistant = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The type of the documents for which the suggestion is.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }


  @ApiModelProperty(example = "null", value = "The Faq from the knowledgebase that was provided as the suggestion.")
  @JsonProperty("faq")
  public Faq getFaq() {
    return faq;
  }


  @ApiModelProperty(example = "null", value = "The article from the knowledgebase that was provided as the suggestion.")
  @JsonProperty("article")
  public Article getArticle() {
    return article;
  }


  @ApiModelProperty(example = "2020-09-25T11:57:02Z", value = "Date when the suggestion was created. For example: yyyy-MM-ddTHH:mm:ss.SSZ. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The ID of the knowledge search that provided the suggestion.")
  @JsonProperty("answerRecordId")
  public String getAnswerRecordId() {
    return answerRecordId;
  }


  @ApiModelProperty(example = "null", value = "The trigger type of the suggestion.")
  @JsonProperty("triggerType")
  public TriggerTypeEnum getTriggerType() {
    return triggerType;
  }


  @ApiModelProperty(example = "null", value = "The conversation context in which the suggestion was raised.")
  @JsonProperty("context")
  public SuggestionContext getContext() {
    return context;
  }


  @ApiModelProperty(example = "null", value = "The state of the suggestion.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }


  @ApiModelProperty(example = "null", value = "The suggested knowledge search result that was provided as the suggestion.")
  @JsonProperty("knowledgeSearch")
  public SuggestionKnowledgeSearch getKnowledgeSearch() {
    return knowledgeSearch;
  }


  @ApiModelProperty(example = "null", value = "The suggested knowledge article that was provided as the suggestion.")
  @JsonProperty("knowledgeArticle")
  public SuggestionKnowledgeArticle getKnowledgeArticle() {
    return knowledgeArticle;
  }


  @ApiModelProperty(example = "null", value = "The suggested canned response that was provided as the suggestion.")
  @JsonProperty("cannedResponse")
  public SuggestionCannedResponse getCannedResponse() {
    return cannedResponse;
  }


  @ApiModelProperty(example = "null", value = "The suggested script that was provided as the suggestion.")
  @JsonProperty("script")
  public SuggestionScript getScript() {
    return script;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @ApiModelProperty(example = "null", value = "The conversation that the suggestions correspond to.")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }


  @ApiModelProperty(example = "null", value = "The assistant that was used to provide the suggestions.")
  @JsonProperty("assistant")
  public AddressableEntityRef getAssistant() {
    return assistant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Suggestion suggestion = (Suggestion) o;

    return Objects.equals(this.id, suggestion.id) &&
            Objects.equals(this.type, suggestion.type) &&
            Objects.equals(this.faq, suggestion.faq) &&
            Objects.equals(this.article, suggestion.article) &&
            Objects.equals(this.dateCreated, suggestion.dateCreated) &&
            Objects.equals(this.answerRecordId, suggestion.answerRecordId) &&
            Objects.equals(this.triggerType, suggestion.triggerType) &&
            Objects.equals(this.context, suggestion.context) &&
            Objects.equals(this.state, suggestion.state) &&
            Objects.equals(this.knowledgeSearch, suggestion.knowledgeSearch) &&
            Objects.equals(this.knowledgeArticle, suggestion.knowledgeArticle) &&
            Objects.equals(this.cannedResponse, suggestion.cannedResponse) &&
            Objects.equals(this.script, suggestion.script) &&
            Objects.equals(this.selfUri, suggestion.selfUri) &&
            Objects.equals(this.conversation, suggestion.conversation) &&
            Objects.equals(this.assistant, suggestion.assistant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, faq, article, dateCreated, answerRecordId, triggerType, context, state, knowledgeSearch, knowledgeArticle, cannedResponse, script, selfUri, conversation, assistant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Suggestion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    faq: ").append(toIndentedString(faq)).append("\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    answerRecordId: ").append(toIndentedString(answerRecordId)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    knowledgeSearch: ").append(toIndentedString(knowledgeSearch)).append("\n");
    sb.append("    knowledgeArticle: ").append(toIndentedString(knowledgeArticle)).append("\n");
    sb.append("    cannedResponse: ").append(toIndentedString(cannedResponse)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    assistant: ").append(toIndentedString(assistant)).append("\n");
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

