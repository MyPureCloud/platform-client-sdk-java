package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * KnowledgeTraining
 */

public class KnowledgeTraining  implements Serializable {
  
  private String id = null;
  private Date dateTriggered = null;
  private Date dateCompleted = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Training status.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUED("Queued"),
    INPROGRESS("InProgress"),
    SUCCEEDED("Succeeded"),
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String languageCode = null;
  private KnowledgeBase knowledgeBase = null;
  private String errorMessage = null;

  private static class KnowledgeDocumentsStateEnumDeserializer extends StdDeserializer<KnowledgeDocumentsStateEnum> {
    public KnowledgeDocumentsStateEnumDeserializer() {
      super(KnowledgeDocumentsStateEnumDeserializer.class);
    }

    @Override
    public KnowledgeDocumentsStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KnowledgeDocumentsStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * State of the Trained Documents, which can be one of these Draft, Active, Discarded, Archived.
   */
 @JsonDeserialize(using = KnowledgeDocumentsStateEnumDeserializer.class)
  public enum KnowledgeDocumentsStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    ACTIVE("Active"),
    DISCARDED("Discarded"),
    ARCHIVED("Archived");

    private String value;

    KnowledgeDocumentsStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KnowledgeDocumentsStateEnum fromString(String key) {
      if (key == null) return null;

      for (KnowledgeDocumentsStateEnum value : KnowledgeDocumentsStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KnowledgeDocumentsStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KnowledgeDocumentsStateEnum knowledgeDocumentsState = null;
  private Date datePromoted = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "Trigger date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateTriggered")
  public Date getDateTriggered() {
    return dateTriggered;
  }

  
  @ApiModelProperty(example = "null", value = "Training completed date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }

  
  @ApiModelProperty(example = "null", value = "Training status.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "Language of the documents that are trained.")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }

  
  @ApiModelProperty(example = "null", value = "Knowledge Base that the training belongs to.")
  @JsonProperty("knowledgeBase")
  public KnowledgeBase getKnowledgeBase() {
    return knowledgeBase;
  }

  
  @ApiModelProperty(example = "null", value = "Any error message during the Training or Promote action.")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  
  @ApiModelProperty(example = "null", value = "State of the Trained Documents, which can be one of these Draft, Active, Discarded, Archived.")
  @JsonProperty("knowledgeDocumentsState")
  public KnowledgeDocumentsStateEnum getKnowledgeDocumentsState() {
    return knowledgeDocumentsState;
  }

  
  @ApiModelProperty(example = "null", value = "Trained Documents Promoted date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("datePromoted")
  public Date getDatePromoted() {
    return datePromoted;
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
    KnowledgeTraining knowledgeTraining = (KnowledgeTraining) o;
    return Objects.equals(this.id, knowledgeTraining.id) &&
        Objects.equals(this.dateTriggered, knowledgeTraining.dateTriggered) &&
        Objects.equals(this.dateCompleted, knowledgeTraining.dateCompleted) &&
        Objects.equals(this.status, knowledgeTraining.status) &&
        Objects.equals(this.languageCode, knowledgeTraining.languageCode) &&
        Objects.equals(this.knowledgeBase, knowledgeTraining.knowledgeBase) &&
        Objects.equals(this.errorMessage, knowledgeTraining.errorMessage) &&
        Objects.equals(this.knowledgeDocumentsState, knowledgeTraining.knowledgeDocumentsState) &&
        Objects.equals(this.datePromoted, knowledgeTraining.datePromoted) &&
        Objects.equals(this.selfUri, knowledgeTraining.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateTriggered, dateCompleted, status, languageCode, knowledgeBase, errorMessage, knowledgeDocumentsState, datePromoted, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeTraining {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateTriggered: ").append(toIndentedString(dateTriggered)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    knowledgeDocumentsState: ").append(toIndentedString(knowledgeDocumentsState)).append("\n");
    sb.append("    datePromoted: ").append(toIndentedString(datePromoted)).append("\n");
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

