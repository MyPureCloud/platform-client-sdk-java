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
import com.mypurecloud.sdk.v2.model.DictionaryFeedbackExamplePhrase;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DictionaryFeedback
 */

public class DictionaryFeedback  implements Serializable {
  
  private String id = null;
  private String term = null;
  private String dialect = null;
  private Float boostValue = null;

  private static class SourceEnumDeserializer extends StdDeserializer<SourceEnum> {
    public SourceEnumDeserializer() {
      super(SourceEnumDeserializer.class);
    }

    @Override
    public SourceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The source of the given dictionary feedback
   */
 @JsonDeserialize(using = SourceEnumDeserializer.class)
  public enum SourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MANUAL("Manual");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourceEnum fromString(String key) {
      if (key == null) return null;

      for (SourceEnum value : SourceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SourceEnum source = null;
  private Date dateCreated = null;
  private UserReference createdBy = null;
  private Date dateModified = null;
  private UserReference modifiedBy = null;

  private static class TranscriptionEngineEnumDeserializer extends StdDeserializer<TranscriptionEngineEnum> {
    public TranscriptionEngineEnumDeserializer() {
      super(TranscriptionEngineEnumDeserializer.class);
    }

    @Override
    public TranscriptionEngineEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TranscriptionEngineEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The transcription engine for the dictionary feedback. Only returned when GenesysExtended feature is enabled.
   */
 @JsonDeserialize(using = TranscriptionEngineEnumDeserializer.class)
  public enum TranscriptionEngineEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GENESYS("Genesys"),
    GENESYSEXTENDED("GenesysExtended");

    private String value;

    TranscriptionEngineEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TranscriptionEngineEnum fromString(String key) {
      if (key == null) return null;

      for (TranscriptionEngineEnum value : TranscriptionEngineEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TranscriptionEngineEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TranscriptionEngineEnum transcriptionEngine = null;

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
   * The status of the dictionary feedback. Only returned when GenesysExtended feature is enabled.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("Active"),
    PENDING("Pending"),
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
  private String displayAs = null;
  private List<DictionaryFeedbackExamplePhrase> examplePhrases = null;
  private List<String> soundsLike = null;
  private String selfUri = null;

  public DictionaryFeedback() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      examplePhrases = new ArrayList<DictionaryFeedbackExamplePhrase>();
      soundsLike = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The dictionary term which needs to be added to dictionary feedback system
   **/
  public DictionaryFeedback term(String term) {
    this.term = term;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The dictionary term which needs to be added to dictionary feedback system")
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }
  public void setTerm(String term) {
    this.term = term;
  }


  /**
   * The dialect for the given term, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard
   **/
  public DictionaryFeedback dialect(String dialect) {
    this.dialect = dialect;
    return this;
  }
  
  @ApiModelProperty(example = "en-US", required = true, value = "The dialect for the given term, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard")
  @JsonProperty("dialect")
  public String getDialect() {
    return dialect;
  }
  public void setDialect(String dialect) {
    this.dialect = dialect;
  }


  /**
   * A weighted value assigned to a phrase. The higher the value, the higher the likelihood that the system will choose the word or phrase from the possible alternatives. Boost range is from 1.0 to 10.0. Default is 2.0
   **/
  public DictionaryFeedback boostValue(Float boostValue) {
    this.boostValue = boostValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A weighted value assigned to a phrase. The higher the value, the higher the likelihood that the system will choose the word or phrase from the possible alternatives. Boost range is from 1.0 to 10.0. Default is 2.0")
  @JsonProperty("boostValue")
  public Float getBoostValue() {
    return boostValue;
  }
  public void setBoostValue(Float boostValue) {
    this.boostValue = boostValue;
  }


  @ApiModelProperty(example = "null", value = "The source of the given dictionary feedback")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }


  @ApiModelProperty(example = "null", value = "The Timestamp when dictionary feedback created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The Id of the user who created the dictionary feedback")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "The Timestamp when dictionary feedback modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The Id of the user who modified the dictionary feedback")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  /**
   * The transcription engine for the dictionary feedback. Only returned when GenesysExtended feature is enabled.
   **/
  public DictionaryFeedback transcriptionEngine(TranscriptionEngineEnum transcriptionEngine) {
    this.transcriptionEngine = transcriptionEngine;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The transcription engine for the dictionary feedback. Only returned when GenesysExtended feature is enabled.")
  @JsonProperty("transcriptionEngine")
  public TranscriptionEngineEnum getTranscriptionEngine() {
    return transcriptionEngine;
  }
  public void setTranscriptionEngine(TranscriptionEngineEnum transcriptionEngine) {
    this.transcriptionEngine = transcriptionEngine;
  }


  @ApiModelProperty(example = "null", value = "The status of the dictionary feedback. Only returned when GenesysExtended feature is enabled.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  /**
   * The display name for the dictionary feedback. Only returned when GenesysExtended feature is enabled. This field is only valid for Extended Services transcription engine.
   **/
  public DictionaryFeedback displayAs(String displayAs) {
    this.displayAs = displayAs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display name for the dictionary feedback. Only returned when GenesysExtended feature is enabled. This field is only valid for Extended Services transcription engine.")
  @JsonProperty("displayAs")
  public String getDisplayAs() {
    return displayAs;
  }
  public void setDisplayAs(String displayAs) {
    this.displayAs = displayAs;
  }


  /**
   * A list of at least 3 and up to 20 unique phrases that are example usage of the term. This field is only valid and required for Genesys transcription engine.
   **/
  public DictionaryFeedback examplePhrases(List<DictionaryFeedbackExamplePhrase> examplePhrases) {
    this.examplePhrases = examplePhrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of at least 3 and up to 20 unique phrases that are example usage of the term. This field is only valid and required for Genesys transcription engine.")
  @JsonProperty("examplePhrases")
  public List<DictionaryFeedbackExamplePhrase> getExamplePhrases() {
    return examplePhrases;
  }
  public void setExamplePhrases(List<DictionaryFeedbackExamplePhrase> examplePhrases) {
    this.examplePhrases = examplePhrases;
  }


  /**
   * A list of up to 10 terms that give examples of how the term sounds. This field is only valid for Genesys transcription engine.
   **/
  public DictionaryFeedback soundsLike(List<String> soundsLike) {
    this.soundsLike = soundsLike;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of up to 10 terms that give examples of how the term sounds. This field is only valid for Genesys transcription engine.")
  @JsonProperty("soundsLike")
  public List<String> getSoundsLike() {
    return soundsLike;
  }
  public void setSoundsLike(List<String> soundsLike) {
    this.soundsLike = soundsLike;
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
    DictionaryFeedback dictionaryFeedback = (DictionaryFeedback) o;

    return Objects.equals(this.id, dictionaryFeedback.id) &&
            Objects.equals(this.term, dictionaryFeedback.term) &&
            Objects.equals(this.dialect, dictionaryFeedback.dialect) &&
            Objects.equals(this.boostValue, dictionaryFeedback.boostValue) &&
            Objects.equals(this.source, dictionaryFeedback.source) &&
            Objects.equals(this.dateCreated, dictionaryFeedback.dateCreated) &&
            Objects.equals(this.createdBy, dictionaryFeedback.createdBy) &&
            Objects.equals(this.dateModified, dictionaryFeedback.dateModified) &&
            Objects.equals(this.modifiedBy, dictionaryFeedback.modifiedBy) &&
            Objects.equals(this.transcriptionEngine, dictionaryFeedback.transcriptionEngine) &&
            Objects.equals(this.status, dictionaryFeedback.status) &&
            Objects.equals(this.displayAs, dictionaryFeedback.displayAs) &&
            Objects.equals(this.examplePhrases, dictionaryFeedback.examplePhrases) &&
            Objects.equals(this.soundsLike, dictionaryFeedback.soundsLike) &&
            Objects.equals(this.selfUri, dictionaryFeedback.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, term, dialect, boostValue, source, dateCreated, createdBy, dateModified, modifiedBy, transcriptionEngine, status, displayAs, examplePhrases, soundsLike, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryFeedback {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
    sb.append("    boostValue: ").append(toIndentedString(boostValue)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    transcriptionEngine: ").append(toIndentedString(transcriptionEngine)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    displayAs: ").append(toIndentedString(displayAs)).append("\n");
    sb.append("    examplePhrases: ").append(toIndentedString(examplePhrases)).append("\n");
    sb.append("    soundsLike: ").append(toIndentedString(soundsLike)).append("\n");
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

