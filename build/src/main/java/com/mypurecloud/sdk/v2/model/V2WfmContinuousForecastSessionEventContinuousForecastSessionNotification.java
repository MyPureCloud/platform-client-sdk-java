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
 * V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification
 */

public class V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification  implements Serializable {
  
  private String sessionId = null;
  private String lastSuccessfulSessionId = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETE("Complete"),
    PROCESSING("Processing"),
    ERROR("Error"),
    CANCELLED("Cancelled");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private String errorCode = null;

  private static class ForecastDataStateEnumDeserializer extends StdDeserializer<ForecastDataStateEnum> {
    public ForecastDataStateEnumDeserializer() {
      super(ForecastDataStateEnumDeserializer.class);
    }

    @Override
    public ForecastDataStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ForecastDataStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets forecastDataState
   */
 @JsonDeserialize(using = ForecastDataStateEnumDeserializer.class)
  public enum ForecastDataStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CURRENT("Current"),
    STALE("Stale"),
    PROCESSING("Processing");

    private String value;

    ForecastDataStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ForecastDataStateEnum fromString(String key) {
      if (key == null) return null;

      for (ForecastDataStateEnum value : ForecastDataStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ForecastDataStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ForecastDataStateEnum forecastDataState = null;

  public V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   **/
  public V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification lastSuccessfulSessionId(String lastSuccessfulSessionId) {
    this.lastSuccessfulSessionId = lastSuccessfulSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastSuccessfulSessionId")
  public String getLastSuccessfulSessionId() {
    return lastSuccessfulSessionId;
  }
  public void setLastSuccessfulSessionId(String lastSuccessfulSessionId) {
    this.lastSuccessfulSessionId = lastSuccessfulSessionId;
  }


  /**
   **/
  public V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   **/
  public V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   **/
  public V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification forecastDataState(ForecastDataStateEnum forecastDataState) {
    this.forecastDataState = forecastDataState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("forecastDataState")
  public ForecastDataStateEnum getForecastDataState() {
    return forecastDataState;
  }
  public void setForecastDataState(ForecastDataStateEnum forecastDataState) {
    this.forecastDataState = forecastDataState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification v2WfmContinuousForecastSessionEventContinuousForecastSessionNotification = (V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification) o;

    return Objects.equals(this.sessionId, v2WfmContinuousForecastSessionEventContinuousForecastSessionNotification.sessionId) &&
            Objects.equals(this.lastSuccessfulSessionId, v2WfmContinuousForecastSessionEventContinuousForecastSessionNotification.lastSuccessfulSessionId) &&
            Objects.equals(this.state, v2WfmContinuousForecastSessionEventContinuousForecastSessionNotification.state) &&
            Objects.equals(this.errorCode, v2WfmContinuousForecastSessionEventContinuousForecastSessionNotification.errorCode) &&
            Objects.equals(this.forecastDataState, v2WfmContinuousForecastSessionEventContinuousForecastSessionNotification.forecastDataState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, lastSuccessfulSessionId, state, errorCode, forecastDataState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WfmContinuousForecastSessionEventContinuousForecastSessionNotification {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    lastSuccessfulSessionId: ").append(toIndentedString(lastSuccessfulSessionId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    forecastDataState: ").append(toIndentedString(forecastDataState)).append("\n");
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

