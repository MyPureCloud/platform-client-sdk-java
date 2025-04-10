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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AiScoring
 */

public class AiScoring  implements Serializable {
  

  private static class FailureTypeEnumDeserializer extends StdDeserializer<FailureTypeEnum> {
    public FailureTypeEnumDeserializer() {
      super(FailureTypeEnumDeserializer.class);
    }

    @Override
    public FailureTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FailureTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of error that occurred while processing AI scores. It is null where there is no error.
   */
 @JsonDeserialize(using = FailureTypeEnumDeserializer.class)
  public enum FailureTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUOTAREACHED("QuotaReached"),
    PARSINGERROR("ParsingError"),
    SERVICEERROR("ServiceError"),
    INVALIDREQUEST("InvalidRequest"),
    DUPLICATEFORMSAMEAGENT("DuplicateFormSameAgent"),
    UNAUTHORIZED("Unauthorized");

    private String value;

    FailureTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FailureTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FailureTypeEnum value : FailureTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FailureTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FailureTypeEnum failureType = null;
  private Boolean pending = null;
  private Date dateLastChanged = null;

  public AiScoring() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The type of error that occurred while processing AI scores. It is null where there is no error.")
  @JsonProperty("failureType")
  public FailureTypeEnum getFailureType() {
    return failureType;
  }


  @ApiModelProperty(example = "null", value = "Indicates whether AI scoring is currently processing the evaluation.")
  @JsonProperty("pending")
  public Boolean getPending() {
    return pending;
  }


  @ApiModelProperty(example = "null", value = "The date when the AI scores were last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLastChanged")
  public Date getDateLastChanged() {
    return dateLastChanged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiScoring aiScoring = (AiScoring) o;

    return Objects.equals(this.failureType, aiScoring.failureType) &&
            Objects.equals(this.pending, aiScoring.pending) &&
            Objects.equals(this.dateLastChanged, aiScoring.dateLastChanged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureType, pending, dateLastChanged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiScoring {\n");
    
    sb.append("    failureType: ").append(toIndentedString(failureType)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    dateLastChanged: ").append(toIndentedString(dateLastChanged)).append("\n");
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

