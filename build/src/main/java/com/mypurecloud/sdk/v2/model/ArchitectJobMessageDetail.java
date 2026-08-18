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

import java.io.Serializable;
/**
 * ArchitectJobMessageDetail
 */

public class ArchitectJobMessageDetail  implements Serializable {
  

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
   * The kind of information carried by this entry, which determines which of the other properties are set.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NETWORKDIAGNOSTIC("NetworkDiagnostic"),
    UNKNOWN("Unknown");

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
  private String url = null;
  private String method = null;
  private String requestBody = null;
  private Integer statusCode = null;
  private String statusMessage = null;
  private String correlationId = null;
  private String responseBody = null;
  private String errorCode = null;
  private String errorMessage = null;

  public ArchitectJobMessageDetail() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ArchitectJobMessageDetail(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The kind of information carried by this entry, which determines which of the other properties are set.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }


  @ApiModelProperty(example = "null", value = "The URL of the request.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }


  @ApiModelProperty(example = "null", value = "The HTTP method of the request.")
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }


  @ApiModelProperty(example = "null", value = "The body of the request, reported as sent and without redaction. Omitted when the request had no body, so it is absent for ordinary GET lookups and present for calls such as POST searches. Truncated to 4096 characters with a `...<truncated N chars>` suffix when longer.")
  @JsonProperty("requestBody")
  public String getRequestBody() {
    return requestBody;
  }


  @ApiModelProperty(example = "null", value = "The HTTP status code of the response. Set only when a response was received, and never alongside errorCode.")
  @JsonProperty("statusCode")
  public Integer getStatusCode() {
    return statusCode;
  }


  @ApiModelProperty(example = "null", value = "The HTTP status message of the response. Set only when a response was received, and never alongside errorMessage.")
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }


  @ApiModelProperty(example = "null", value = "The Genesys Cloud correlation id of the response, to quote when escalating to Genesys Cloud support. Set only when a response was received.")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }


  @ApiModelProperty(example = "null", value = "The body of the response, reported as received and without redaction. Because entries are captured for requests that succeeded as well, this can carry data returned by a lookup that was unrelated to the failure. Omitted when the response had no body. Truncated to 4096 characters with a `...<truncated N chars>` suffix when longer.")
  @JsonProperty("responseBody")
  public String getResponseBody() {
    return responseBody;
  }


  @ApiModelProperty(example = "null", value = "The transport error code, such as ECONNRESET. Set only when the request failed before any HTTP response was received, and never alongside statusCode.")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }


  @ApiModelProperty(example = "null", value = "The transport error message. Set only when the request failed before any HTTP response was received, and never alongside statusMessage.")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectJobMessageDetail architectJobMessageDetail = (ArchitectJobMessageDetail) o;

    return Objects.equals(this.type, architectJobMessageDetail.type) &&
            Objects.equals(this.url, architectJobMessageDetail.url) &&
            Objects.equals(this.method, architectJobMessageDetail.method) &&
            Objects.equals(this.requestBody, architectJobMessageDetail.requestBody) &&
            Objects.equals(this.statusCode, architectJobMessageDetail.statusCode) &&
            Objects.equals(this.statusMessage, architectJobMessageDetail.statusMessage) &&
            Objects.equals(this.correlationId, architectJobMessageDetail.correlationId) &&
            Objects.equals(this.responseBody, architectJobMessageDetail.responseBody) &&
            Objects.equals(this.errorCode, architectJobMessageDetail.errorCode) &&
            Objects.equals(this.errorMessage, architectJobMessageDetail.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url, method, requestBody, statusCode, statusMessage, correlationId, responseBody, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectJobMessageDetail {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

