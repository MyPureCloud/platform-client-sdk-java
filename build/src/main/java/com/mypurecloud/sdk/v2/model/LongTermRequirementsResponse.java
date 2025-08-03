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
import com.mypurecloud.sdk.v2.model.LongTermRequirements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LongTermRequirementsResponse
 */

public class LongTermRequirementsResponse  implements Serializable {
  

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
   * Status of the long term forecast
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    CANCELED("Canceled"),
    ERROR("Error");

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
   * Error code when status is Failed
   */
 @JsonDeserialize(using = ErrorCodeEnumDeserializer.class)
  public enum ErrorCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TIMEDOUT("TimedOut"),
    NODATA("NoData"),
    CLIENTDATAINVALID("ClientDataInvalid"),
    CONFIGURATIONINVALID("ConfigurationInvalid"),
    REQUIREMENTSFAILED("RequirementsFailed");

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
  private LongTermRequirements longTermRequirements = null;
  private String downloadUrl = null;

  public LongTermRequirementsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Status of the long term forecast
   **/
  public LongTermRequirementsResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Status of the long term forecast")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Error code when status is Failed
   **/
  public LongTermRequirementsResponse errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error code when status is Failed")
  @JsonProperty("errorCode")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * For schema documentation only, always null, schema for staffing forecast result at downloadUrl
   **/
  public LongTermRequirementsResponse longTermRequirements(LongTermRequirements longTermRequirements) {
    this.longTermRequirements = longTermRequirements;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For schema documentation only, always null, schema for staffing forecast result at downloadUrl")
  @JsonProperty("longTermRequirements")
  public LongTermRequirements getLongTermRequirements() {
    return longTermRequirements;
  }
  public void setLongTermRequirements(LongTermRequirements longTermRequirements) {
    this.longTermRequirements = longTermRequirements;
  }


  /**
   * Download URL for the staffing forecast result
   **/
  public LongTermRequirementsResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Download URL for the staffing forecast result")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongTermRequirementsResponse longTermRequirementsResponse = (LongTermRequirementsResponse) o;

    return Objects.equals(this.status, longTermRequirementsResponse.status) &&
            Objects.equals(this.errorCode, longTermRequirementsResponse.errorCode) &&
            Objects.equals(this.longTermRequirements, longTermRequirementsResponse.longTermRequirements) &&
            Objects.equals(this.downloadUrl, longTermRequirementsResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errorCode, longTermRequirements, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTermRequirementsResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    longTermRequirements: ").append(toIndentedString(longTermRequirements)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

