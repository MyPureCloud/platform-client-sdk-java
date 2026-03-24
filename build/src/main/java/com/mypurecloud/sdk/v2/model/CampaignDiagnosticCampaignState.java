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
 * CampaignDiagnosticCampaignState
 */

public class CampaignDiagnosticCampaignState  implements Serializable {
  

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
   * Campaign status
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("on"),
    STOPPING("stopping"),
    OFF("off"),
    COMPLETE("complete"),
    INVALID("invalid"),
    FORCED_OFF("forced_off"),
    FORCED_STOPPING("forced_stopping");

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
  private Date dateStart = null;
  private Date dateEnd = null;

  private static class DialingModeEnumDeserializer extends StdDeserializer<DialingModeEnum> {
    public DialingModeEnumDeserializer() {
      super(DialingModeEnumDeserializer.class);
    }

    @Override
    public DialingModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DialingModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Dialing mode for the campaign state (e.g., \"power\", \"preview\", \"predictive\")
   */
 @JsonDeserialize(using = DialingModeEnumDeserializer.class)
  public enum DialingModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTLESS("agentless"),
    PREVIEW("preview"),
    POWER("power"),
    PREDICTIVE("predictive"),
    PROGRESSIVE("progressive"),
    EXTERNAL("external");

    private String value;

    DialingModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DialingModeEnum fromString(String key) {
      if (key == null) return null;

      for (DialingModeEnum value : DialingModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DialingModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DialingModeEnum dialingMode = null;

  public CampaignDiagnosticCampaignState() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Campaign status
   **/
  public CampaignDiagnosticCampaignState state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Campaign status")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Start datetime of the state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignDiagnosticCampaignState dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start datetime of the state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * End datetime of the state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignDiagnosticCampaignState dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End datetime of the state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * Dialing mode for the campaign state (e.g., \"power\", \"preview\", \"predictive\")
   **/
  public CampaignDiagnosticCampaignState dialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dialing mode for the campaign state (e.g., \"power\", \"preview\", \"predictive\")")
  @JsonProperty("dialingMode")
  public DialingModeEnum getDialingMode() {
    return dialingMode;
  }
  public void setDialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignDiagnosticCampaignState campaignDiagnosticCampaignState = (CampaignDiagnosticCampaignState) o;

    return Objects.equals(this.state, campaignDiagnosticCampaignState.state) &&
            Objects.equals(this.dateStart, campaignDiagnosticCampaignState.dateStart) &&
            Objects.equals(this.dateEnd, campaignDiagnosticCampaignState.dateEnd) &&
            Objects.equals(this.dialingMode, campaignDiagnosticCampaignState.dialingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, dateStart, dateEnd, dialingMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDiagnosticCampaignState {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    dialingMode: ").append(toIndentedString(dialingMode)).append("\n");
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

