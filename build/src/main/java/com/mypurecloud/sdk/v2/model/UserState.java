package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * UserState
 */

public class UserState  implements Serializable {
  

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
   * User's current state.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

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
  private Integer version = null;

  private static class StateChangeReasonEnumDeserializer extends StdDeserializer<StateChangeReasonEnum> {
    public StateChangeReasonEnumDeserializer() {
      super(StateChangeReasonEnumDeserializer.class);
    }

    @Override
    public StateChangeReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateChangeReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Reason for a change in the user's state.
   */
 @JsonDeserialize(using = StateChangeReasonEnumDeserializer.class)
  public enum StateChangeReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOLUNTARY("Voluntary"),
    SEASONAL("Seasonal"),
    LEAVE("Leave"),
    PERFORMANCE("Performance"),
    CONDUCT("Conduct"),
    UNKNOWN("Unknown");

    private String value;

    StateChangeReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateChangeReasonEnum fromString(String key) {
      if (key == null) return null;

      for (StateChangeReasonEnum value : StateChangeReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateChangeReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateChangeReasonEnum stateChangeReason = null;
  private Date stateChangeDate = null;

  
  /**
   * User's current state.
   **/
  public UserState state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User's current state.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * Version of this user.
   **/
  public UserState version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version of this user.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * Reason for a change in the user's state.
   **/
  public UserState stateChangeReason(StateChangeReasonEnum stateChangeReason) {
    this.stateChangeReason = stateChangeReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reason for a change in the user's state.")
  @JsonProperty("stateChangeReason")
  public StateChangeReasonEnum getStateChangeReason() {
    return stateChangeReason;
  }
  public void setStateChangeReason(StateChangeReasonEnum stateChangeReason) {
    this.stateChangeReason = stateChangeReason;
  }

  
  @ApiModelProperty(example = "null", value = "Date that the state was last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("stateChangeDate")
  public Date getStateChangeDate() {
    return stateChangeDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserState userState = (UserState) o;
    return Objects.equals(this.state, userState.state) &&
        Objects.equals(this.version, userState.version) &&
        Objects.equals(this.stateChangeReason, userState.stateChangeReason) &&
        Objects.equals(this.stateChangeDate, userState.stateChangeDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, version, stateChangeReason, stateChangeDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserState {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    stateChangeReason: ").append(toIndentedString(stateChangeReason)).append("\n");
    sb.append("    stateChangeDate: ").append(toIndentedString(stateChangeDate)).append("\n");
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

