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
import com.mypurecloud.sdk.v2.model.WfmShifttradingSearchUnmatchedTradesJobEventErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2
 */

public class WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2  implements Serializable {
  
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
   * Gets or Sets type
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
    UPDATETRADESTATE("UpdateTradeState"),
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
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
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
  private String downloadUrl = null;
  private WfmShifttradingSearchUnmatchedTradesJobEventErrorBody error = null;

  public WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2 id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2 type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2 status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2 downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   **/
  public WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2 error(WfmShifttradingSearchUnmatchedTradesJobEventErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public WfmShifttradingSearchUnmatchedTradesJobEventErrorBody getError() {
    return error;
  }
  public void setError(WfmShifttradingSearchUnmatchedTradesJobEventErrorBody error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2 wfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2 = (WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2) o;

    return Objects.equals(this.id, wfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2.id) &&
            Objects.equals(this.type, wfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2.type) &&
            Objects.equals(this.status, wfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2.status) &&
            Objects.equals(this.downloadUrl, wfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2.downloadUrl) &&
            Objects.equals(this.error, wfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, downloadUrl, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingSearchUnmatchedTradesJobEventShiftTradingJobCompleteNotificationV2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

