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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Learning assignment SCO (Shareable Content Object)
 */
@ApiModel(description = "Learning assignment SCO (Shareable Content Object)")

public class LearningShareableContentObject  implements Serializable {
  
  private String id = null;

  private static class LessonStatusEnumDeserializer extends StdDeserializer<LessonStatusEnum> {
    public LessonStatusEnumDeserializer() {
      super(LessonStatusEnumDeserializer.class);
    }

    @Override
    public LessonStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LessonStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the SCO. Maps to the SCORM 1.2 cmi.core.lesson_status property.
   */
 @JsonDeserialize(using = LessonStatusEnumDeserializer.class)
  public enum LessonStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PASSED("Passed"),
    COMPLETED("Completed"),
    FAILED("Failed"),
    INCOMPLETE("Incomplete"),
    BROWSED("Browsed"),
    NOTATTEMPTED("NotAttempted");

    private String value;

    LessonStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LessonStatusEnum fromString(String key) {
      if (key == null) return null;

      for (LessonStatusEnum value : LessonStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LessonStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LessonStatusEnum lessonStatus = null;

  private static class ExitEnumDeserializer extends StdDeserializer<ExitEnum> {
    public ExitEnumDeserializer() {
      super(ExitEnumDeserializer.class);
    }

    @Override
    public ExitEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExitEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates how or why the learner left the SCO. Maps to the SCORM 1.2 cmi.core.exit property.
   */
 @JsonDeserialize(using = ExitEnumDeserializer.class)
  public enum ExitEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TIMEOUT("Timeout"),
    SUSPEND("Suspend"),
    LOGOUT("Logout"),
    EMPTY("Empty");

    private String value;

    ExitEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExitEnum fromString(String key) {
      if (key == null) return null;

      for (ExitEnum value : ExitEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExitEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExitEnum exit = null;
  private String location = null;
  private Float scoreRaw = null;
  private Float scoreMax = null;
  private Float scoreMin = null;
  private String suspendData = null;

  private static class CreditEnumDeserializer extends StdDeserializer<CreditEnum> {
    public CreditEnumDeserializer() {
      super(CreditEnumDeserializer.class);
    }

    @Override
    public CreditEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CreditEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Whether completing this course counts towards the overall assignment. Maps to the SCORM 1.2 cmi.core.credit property.
   */
 @JsonDeserialize(using = CreditEnumDeserializer.class)
  public enum CreditEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREDIT("Credit"),
    NOCREDIT("NoCredit");

    private String value;

    CreditEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CreditEnum fromString(String key) {
      if (key == null) return null;

      for (CreditEnum value : CreditEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CreditEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CreditEnum credit = null;

  private static class EntryEnumDeserializer extends StdDeserializer<EntryEnum> {
    public EntryEnumDeserializer() {
      super(EntryEnumDeserializer.class);
    }

    @Override
    public EntryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EntryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Whether the learner has previously accessed this SCO. Maps to the SCORM 1.2 cmi.core.entry property.
   */
 @JsonDeserialize(using = EntryEnumDeserializer.class)
  public enum EntryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ABINITIO("AbInitio"),
    RESUME("Resume"),
    EMPTY("Empty");

    private String value;

    EntryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EntryEnum fromString(String key) {
      if (key == null) return null;

      for (EntryEnum value : EntryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EntryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EntryEnum entry = null;

  private static class ModeEnumDeserializer extends StdDeserializer<ModeEnum> {
    public ModeEnumDeserializer() {
      super(ModeEnumDeserializer.class);
    }

    @Override
    public ModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Identifies the mode in which the SCO should be presented to the learner. Maps to the SCORM 1.2 cmi.core.lesson_mode property.
   */
 @JsonDeserialize(using = ModeEnumDeserializer.class)
  public enum ModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BROWSE("Browse"),
    NORMAL("Normal"),
    REVIEW("Review");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ModeEnum fromString(String key) {
      if (key == null) return null;

      for (ModeEnum value : ModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ModeEnum mode = null;
  private String totalTime = null;
  private String sessionTime = null;
  private String href = null;
  private String parameters = null;
  private String launchData = null;

  
  /**
   * The ID of the SCO from the course manifest.
   **/
  public LearningShareableContentObject id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the SCO from the course manifest.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The status of the SCO. Maps to the SCORM 1.2 cmi.core.lesson_status property.
   **/
  public LearningShareableContentObject lessonStatus(LessonStatusEnum lessonStatus) {
    this.lessonStatus = lessonStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the SCO. Maps to the SCORM 1.2 cmi.core.lesson_status property.")
  @JsonProperty("lessonStatus")
  public LessonStatusEnum getLessonStatus() {
    return lessonStatus;
  }
  public void setLessonStatus(LessonStatusEnum lessonStatus) {
    this.lessonStatus = lessonStatus;
  }


  /**
   * Indicates how or why the learner left the SCO. Maps to the SCORM 1.2 cmi.core.exit property.
   **/
  public LearningShareableContentObject exit(ExitEnum exit) {
    this.exit = exit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates how or why the learner left the SCO. Maps to the SCORM 1.2 cmi.core.exit property.")
  @JsonProperty("exit")
  public ExitEnum getExit() {
    return exit;
  }
  public void setExit(ExitEnum exit) {
    this.exit = exit;
  }


  /**
   * The learner’s current location in the SCO. Maps to the SCORM 1.2 cmi.core.lesson_location property.
   **/
  public LearningShareableContentObject location(String location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The learner’s current location in the SCO. Maps to the SCORM 1.2 cmi.core.lesson_location property.")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }


  /**
   * The score of the most recent attempt on the SCO. Maps to the SCORM 1.2 cmi.core.score.raw property.
   **/
  public LearningShareableContentObject scoreRaw(Float scoreRaw) {
    this.scoreRaw = scoreRaw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The score of the most recent attempt on the SCO. Maps to the SCORM 1.2 cmi.core.score.raw property.")
  @JsonProperty("scoreRaw")
  public Float getScoreRaw() {
    return scoreRaw;
  }
  public void setScoreRaw(Float scoreRaw) {
    this.scoreRaw = scoreRaw;
  }


  /**
   * The maximum score that could be achieved on the SCO. Maps to the SCORM 1.2 cmi.core.score.max property.
   **/
  public LearningShareableContentObject scoreMax(Float scoreMax) {
    this.scoreMax = scoreMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum score that could be achieved on the SCO. Maps to the SCORM 1.2 cmi.core.score.max property.")
  @JsonProperty("scoreMax")
  public Float getScoreMax() {
    return scoreMax;
  }
  public void setScoreMax(Float scoreMax) {
    this.scoreMax = scoreMax;
  }


  /**
   * The minimum score that could be achieved on the SCO. Maps to the SCORM 1.2 cmi.core.score.min property.
   **/
  public LearningShareableContentObject scoreMin(Float scoreMin) {
    this.scoreMin = scoreMin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum score that could be achieved on the SCO. Maps to the SCORM 1.2 cmi.core.score.min property.")
  @JsonProperty("scoreMin")
  public Float getScoreMin() {
    return scoreMin;
  }
  public void setScoreMin(Float scoreMin) {
    this.scoreMin = scoreMin;
  }


  /**
   * The unique information generated by the SCO from previous uses. Maps to the SCORM 1.2 cmi.suspend_data property.
   **/
  public LearningShareableContentObject suspendData(String suspendData) {
    this.suspendData = suspendData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique information generated by the SCO from previous uses. Maps to the SCORM 1.2 cmi.suspend_data property.")
  @JsonProperty("suspendData")
  public String getSuspendData() {
    return suspendData;
  }
  public void setSuspendData(String suspendData) {
    this.suspendData = suspendData;
  }


  @ApiModelProperty(example = "null", value = "Whether completing this course counts towards the overall assignment. Maps to the SCORM 1.2 cmi.core.credit property.")
  @JsonProperty("credit")
  public CreditEnum getCredit() {
    return credit;
  }


  @ApiModelProperty(example = "null", value = "Whether the learner has previously accessed this SCO. Maps to the SCORM 1.2 cmi.core.entry property.")
  @JsonProperty("entry")
  public EntryEnum getEntry() {
    return entry;
  }


  @ApiModelProperty(example = "null", value = "Identifies the mode in which the SCO should be presented to the learner. Maps to the SCORM 1.2 cmi.core.lesson_mode property.")
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }


  @ApiModelProperty(example = "null", value = "The total amount of time the learner has spent in the SCO expressed as an ISO 8601 Duration, for example PT2H10M3.5S. Maps to the SCORM 1.2 cmi.core.total_time property.")
  @JsonProperty("totalTime")
  public String getTotalTime() {
    return totalTime;
  }


  /**
   * The amount of time spent in the SCO in this session expressed as an ISO-8601 Duration, for example PT2H10M3.5S. Maps to the SCORM 1.2 cmi.core.session_time property.
   **/
  public LearningShareableContentObject sessionTime(String sessionTime) {
    this.sessionTime = sessionTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of time spent in the SCO in this session expressed as an ISO-8601 Duration, for example PT2H10M3.5S. Maps to the SCORM 1.2 cmi.core.session_time property.")
  @JsonProperty("sessionTime")
  public String getSessionTime() {
    return sessionTime;
  }
  public void setSessionTime(String sessionTime) {
    this.sessionTime = sessionTime;
  }


  @ApiModelProperty(example = "null", value = "The href from the course manifest for this SCO.")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }


  @ApiModelProperty(example = "null", value = "The parameters from the course manifest for this SCO.")
  @JsonProperty("parameters")
  public String getParameters() {
    return parameters;
  }


  @ApiModelProperty(example = "null", value = "The launch data from the course manifest for this SCO.")
  @JsonProperty("launchData")
  public String getLaunchData() {
    return launchData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningShareableContentObject learningShareableContentObject = (LearningShareableContentObject) o;

    return Objects.equals(this.id, learningShareableContentObject.id) &&
            Objects.equals(this.lessonStatus, learningShareableContentObject.lessonStatus) &&
            Objects.equals(this.exit, learningShareableContentObject.exit) &&
            Objects.equals(this.location, learningShareableContentObject.location) &&
            Objects.equals(this.scoreRaw, learningShareableContentObject.scoreRaw) &&
            Objects.equals(this.scoreMax, learningShareableContentObject.scoreMax) &&
            Objects.equals(this.scoreMin, learningShareableContentObject.scoreMin) &&
            Objects.equals(this.suspendData, learningShareableContentObject.suspendData) &&
            Objects.equals(this.credit, learningShareableContentObject.credit) &&
            Objects.equals(this.entry, learningShareableContentObject.entry) &&
            Objects.equals(this.mode, learningShareableContentObject.mode) &&
            Objects.equals(this.totalTime, learningShareableContentObject.totalTime) &&
            Objects.equals(this.sessionTime, learningShareableContentObject.sessionTime) &&
            Objects.equals(this.href, learningShareableContentObject.href) &&
            Objects.equals(this.parameters, learningShareableContentObject.parameters) &&
            Objects.equals(this.launchData, learningShareableContentObject.launchData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lessonStatus, exit, location, scoreRaw, scoreMax, scoreMin, suspendData, credit, entry, mode, totalTime, sessionTime, href, parameters, launchData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningShareableContentObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lessonStatus: ").append(toIndentedString(lessonStatus)).append("\n");
    sb.append("    exit: ").append(toIndentedString(exit)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    scoreRaw: ").append(toIndentedString(scoreRaw)).append("\n");
    sb.append("    scoreMax: ").append(toIndentedString(scoreMax)).append("\n");
    sb.append("    scoreMin: ").append(toIndentedString(scoreMin)).append("\n");
    sb.append("    suspendData: ").append(toIndentedString(suspendData)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    sessionTime: ").append(toIndentedString(sessionTime)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    launchData: ").append(toIndentedString(launchData)).append("\n");
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

