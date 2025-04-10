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
 * ContinuousForecastGetSessionResponse
 */

public class ContinuousForecastGetSessionResponse  implements Serializable {
  
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
   * State of the latest session
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETE("Complete"),
    PROCESSING("Processing"),
    ERROR("Error");

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

  public ContinuousForecastGetSessionResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Latest session ID of the business unit
   **/
  public ContinuousForecastGetSessionResponse sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latest session ID of the business unit")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Last successful session ID of the business unit
   **/
  public ContinuousForecastGetSessionResponse lastSuccessfulSessionId(String lastSuccessfulSessionId) {
    this.lastSuccessfulSessionId = lastSuccessfulSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last successful session ID of the business unit")
  @JsonProperty("lastSuccessfulSessionId")
  public String getLastSuccessfulSessionId() {
    return lastSuccessfulSessionId;
  }
  public void setLastSuccessfulSessionId(String lastSuccessfulSessionId) {
    this.lastSuccessfulSessionId = lastSuccessfulSessionId;
  }


  /**
   * State of the latest session
   **/
  public ContinuousForecastGetSessionResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State of the latest session")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Failed session error code
   **/
  public ContinuousForecastGetSessionResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Failed session error code")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContinuousForecastGetSessionResponse continuousForecastGetSessionResponse = (ContinuousForecastGetSessionResponse) o;

    return Objects.equals(this.sessionId, continuousForecastGetSessionResponse.sessionId) &&
            Objects.equals(this.lastSuccessfulSessionId, continuousForecastGetSessionResponse.lastSuccessfulSessionId) &&
            Objects.equals(this.state, continuousForecastGetSessionResponse.state) &&
            Objects.equals(this.errorCode, continuousForecastGetSessionResponse.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, lastSuccessfulSessionId, state, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContinuousForecastGetSessionResponse {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    lastSuccessfulSessionId: ").append(toIndentedString(lastSuccessfulSessionId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

