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
import com.mypurecloud.sdk.v2.model.WfmShiftTradingJobCompleteEventErrorBody;
import com.mypurecloud.sdk.v2.model.WfmShiftTradingJobCompleteEventTradeEntity;
import com.mypurecloud.sdk.v2.model.WfmShiftTradingJobCompleteEventWeekSummaryList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification
 */

public class WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification  implements Serializable {
  
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
  private WfmShiftTradingJobCompleteEventTradeEntity trade = null;
  private WfmShiftTradingJobCompleteEventWeekSummaryList weekSummaries = null;
  private String downloadUrl = null;
  private WfmShiftTradingJobCompleteEventErrorBody error = null;

  public WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification id(String id) {
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
  public WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification type(TypeEnum type) {
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
  public WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification status(StatusEnum status) {
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
  public WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification trade(WfmShiftTradingJobCompleteEventTradeEntity trade) {
    this.trade = trade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trade")
  public WfmShiftTradingJobCompleteEventTradeEntity getTrade() {
    return trade;
  }
  public void setTrade(WfmShiftTradingJobCompleteEventTradeEntity trade) {
    this.trade = trade;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification weekSummaries(WfmShiftTradingJobCompleteEventWeekSummaryList weekSummaries) {
    this.weekSummaries = weekSummaries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekSummaries")
  public WfmShiftTradingJobCompleteEventWeekSummaryList getWeekSummaries() {
    return weekSummaries;
  }
  public void setWeekSummaries(WfmShiftTradingJobCompleteEventWeekSummaryList weekSummaries) {
    this.weekSummaries = weekSummaries;
  }


  /**
   **/
  public WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification downloadUrl(String downloadUrl) {
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
  public WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification error(WfmShiftTradingJobCompleteEventErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public WfmShiftTradingJobCompleteEventErrorBody getError() {
    return error;
  }
  public void setError(WfmShiftTradingJobCompleteEventErrorBody error) {
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
    WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification wfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification = (WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification) o;

    return Objects.equals(this.id, wfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification.id) &&
            Objects.equals(this.type, wfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification.type) &&
            Objects.equals(this.status, wfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification.status) &&
            Objects.equals(this.trade, wfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification.trade) &&
            Objects.equals(this.weekSummaries, wfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification.weekSummaries) &&
            Objects.equals(this.downloadUrl, wfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification.downloadUrl) &&
            Objects.equals(this.error, wfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, trade, weekSummaries, downloadUrl, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
    sb.append("    weekSummaries: ").append(toIndentedString(weekSummaries)).append("\n");
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

