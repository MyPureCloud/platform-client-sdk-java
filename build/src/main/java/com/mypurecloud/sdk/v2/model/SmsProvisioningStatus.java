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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SmsProvisioningStatus
 */

public class SmsProvisioningStatus  implements Serializable {
  

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Provisioning action
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    CREATE("Create"),
    UPDATE("Update"),
    DELETE("Delete");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;

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
   * Provisioning state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RUNNING("Running"),
    COMPLETED("Completed"),
    FAILED("Failed");

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
  private ErrorBody error = null;
  private Long version = null;

  
  /**
   * Provisioning action
   **/
  public SmsProvisioningStatus action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provisioning action")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * Provisioning state
   **/
  public SmsProvisioningStatus state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provisioning state")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * Any error associated with a Failed state
   **/
  public SmsProvisioningStatus error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any error associated with a Failed state")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }

  
  /**
   * The phone number version associated with the provisioning action
   **/
  public SmsProvisioningStatus version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number version associated with the provisioning action")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsProvisioningStatus smsProvisioningStatus = (SmsProvisioningStatus) o;
    return Objects.equals(this.action, smsProvisioningStatus.action) &&
        Objects.equals(this.state, smsProvisioningStatus.state) &&
        Objects.equals(this.error, smsProvisioningStatus.error) &&
        Objects.equals(this.version, smsProvisioningStatus.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, state, error, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsProvisioningStatus {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

