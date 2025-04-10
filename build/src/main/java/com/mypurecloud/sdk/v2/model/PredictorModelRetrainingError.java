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
 * PredictorModelRetrainingError
 */

public class PredictorModelRetrainingError  implements Serializable {
  
  private String id = null;

  private static class ErrorCodeEnumDeserializer extends StdDeserializer<ErrorCodeEnum> {
    public ErrorCodeEnumDeserializer() {
      super(ErrorCodeEnumDeserializer.class);
    }

    @Override
    public ErrorCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ErrorCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Error code describing model training failure.
   */
 @JsonDeserialize(using = ErrorCodeEnumDeserializer.class)
  public enum ErrorCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOTENOUGHDATA("NotEnoughData"),
    SERVICEERROR("ServiceError"),
    UNKNOWNERROR("UnknownError");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ErrorCodeEnum fromString(String key) {
      if (key == null) return null;

      for (ErrorCodeEnum value : ErrorCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ErrorCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ErrorCodeEnum errorCode = null;
  private Date dateOfFirstOccurrence = null;

  public PredictorModelRetrainingError() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", required = true, value = "Error code describing model training failure.")
  @JsonProperty("errorCode")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }


  @ApiModelProperty(example = "null", required = true, value = "Date when the first retraining failure happened. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateOfFirstOccurrence")
  public Date getDateOfFirstOccurrence() {
    return dateOfFirstOccurrence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictorModelRetrainingError predictorModelRetrainingError = (PredictorModelRetrainingError) o;

    return Objects.equals(this.id, predictorModelRetrainingError.id) &&
            Objects.equals(this.errorCode, predictorModelRetrainingError.errorCode) &&
            Objects.equals(this.dateOfFirstOccurrence, predictorModelRetrainingError.dateOfFirstOccurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, errorCode, dateOfFirstOccurrence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictorModelRetrainingError {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    dateOfFirstOccurrence: ").append(toIndentedString(dateOfFirstOccurrence)).append("\n");
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

