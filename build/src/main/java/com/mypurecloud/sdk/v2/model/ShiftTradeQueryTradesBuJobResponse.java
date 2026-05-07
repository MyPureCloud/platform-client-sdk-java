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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ShiftTradeListJobResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ShiftTradeQueryTradesBuJobResponse
 */

public class ShiftTradeQueryTradesBuJobResponse  implements Serializable {
  
  private String id = null;

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
   * The status of the job
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
   * The type of the job
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADDTRADE("AddTrade"),
    BULKUPDATETRADESTATES("BulkUpdateTradeStates"),
    EVALUATETRADES("EvaluateTrades"),
    MATCHTRADE("MatchTrade"),
    QUERYAGENTTRADES("QueryAgentTrades"),
    QUERYTRADES("QueryTrades"),
    QUERYWEEKSUMMARIES("QueryWeekSummaries"),
    SEARCHUNMATCHEDTRADES("SearchUnmatchedTrades"),
    UPDATETRADE("UpdateTrade"),
    UPDATETRADESTATE("UpdateTradeState");

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
  private String downloadUrl = null;
  private ErrorBody error = null;
  private ShiftTradeListJobResponse queryTradesResult = null;
  private String selfUri = null;

  public ShiftTradeQueryTradesBuJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ShiftTradeQueryTradesBuJobResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The status of the job
   **/
  public ShiftTradeQueryTradesBuJobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The type of the job
   **/
  public ShiftTradeQueryTradesBuJobResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the job")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The URL where completed results might be available for download in case the result body for that job type is too large
   **/
  public ShiftTradeQueryTradesBuJobResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL where completed results might be available for download in case the result body for that job type is too large")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Any error information, only set if the status == 'Error'
   **/
  public ShiftTradeQueryTradesBuJobResponse error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any error information, only set if the status == 'Error'")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }


  /**
   * Results for QueryTrades job type
   **/
  public ShiftTradeQueryTradesBuJobResponse queryTradesResult(ShiftTradeListJobResponse queryTradesResult) {
    this.queryTradesResult = queryTradesResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Results for QueryTrades job type")
  @JsonProperty("queryTradesResult")
  public ShiftTradeListJobResponse getQueryTradesResult() {
    return queryTradesResult;
  }
  public void setQueryTradesResult(ShiftTradeListJobResponse queryTradesResult) {
    this.queryTradesResult = queryTradesResult;
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
    ShiftTradeQueryTradesBuJobResponse shiftTradeQueryTradesBuJobResponse = (ShiftTradeQueryTradesBuJobResponse) o;

    return Objects.equals(this.id, shiftTradeQueryTradesBuJobResponse.id) &&
            Objects.equals(this.status, shiftTradeQueryTradesBuJobResponse.status) &&
            Objects.equals(this.type, shiftTradeQueryTradesBuJobResponse.type) &&
            Objects.equals(this.downloadUrl, shiftTradeQueryTradesBuJobResponse.downloadUrl) &&
            Objects.equals(this.error, shiftTradeQueryTradesBuJobResponse.error) &&
            Objects.equals(this.queryTradesResult, shiftTradeQueryTradesBuJobResponse.queryTradesResult) &&
            Objects.equals(this.selfUri, shiftTradeQueryTradesBuJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, type, downloadUrl, error, queryTradesResult, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeQueryTradesBuJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    queryTradesResult: ").append(toIndentedString(queryTradesResult)).append("\n");
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

