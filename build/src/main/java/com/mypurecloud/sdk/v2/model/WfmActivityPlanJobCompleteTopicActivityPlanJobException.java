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
import com.mypurecloud.sdk.v2.model.WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmActivityPlanJobCompleteTopicActivityPlanJobException
 */

public class WfmActivityPlanJobCompleteTopicActivityPlanJobException  implements Serializable {
  

  private static class ExceptionTypeEnumDeserializer extends StdDeserializer<ExceptionTypeEnum> {
    public ExceptionTypeEnumDeserializer() {
      super(ExceptionTypeEnumDeserializer.class);
    }

    @Override
    public ExceptionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExceptionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets exceptionType
   */
 @JsonDeserialize(using = ExceptionTypeEnumDeserializer.class)
  public enum ExceptionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNSCHEDULEDATTENDEES("UnscheduledAttendees"),
    SESSIONSNOTDELETED("SessionsNotDeleted");

    private String value;

    ExceptionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExceptionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ExceptionTypeEnum value : ExceptionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExceptionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExceptionTypeEnum exceptionType = null;
  private List<WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference> occurrences = null;

  public WfmActivityPlanJobCompleteTopicActivityPlanJobException() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      occurrences = new ArrayList<WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference>();
    }
  }

  
  /**
   **/
  public WfmActivityPlanJobCompleteTopicActivityPlanJobException exceptionType(ExceptionTypeEnum exceptionType) {
    this.exceptionType = exceptionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exceptionType")
  public ExceptionTypeEnum getExceptionType() {
    return exceptionType;
  }
  public void setExceptionType(ExceptionTypeEnum exceptionType) {
    this.exceptionType = exceptionType;
  }


  /**
   **/
  public WfmActivityPlanJobCompleteTopicActivityPlanJobException occurrences(List<WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference> occurrences) {
    this.occurrences = occurrences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("occurrences")
  public List<WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference> getOccurrences() {
    return occurrences;
  }
  public void setOccurrences(List<WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference> occurrences) {
    this.occurrences = occurrences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmActivityPlanJobCompleteTopicActivityPlanJobException wfmActivityPlanJobCompleteTopicActivityPlanJobException = (WfmActivityPlanJobCompleteTopicActivityPlanJobException) o;

    return Objects.equals(this.exceptionType, wfmActivityPlanJobCompleteTopicActivityPlanJobException.exceptionType) &&
            Objects.equals(this.occurrences, wfmActivityPlanJobCompleteTopicActivityPlanJobException.occurrences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptionType, occurrences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmActivityPlanJobCompleteTopicActivityPlanJobException {\n");
    
    sb.append("    exceptionType: ").append(toIndentedString(exceptionType)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
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

