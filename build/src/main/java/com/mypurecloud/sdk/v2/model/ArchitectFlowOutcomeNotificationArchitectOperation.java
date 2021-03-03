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
import com.mypurecloud.sdk.v2.model.ArchitectFlowOutcomeNotificationClient;
import com.mypurecloud.sdk.v2.model.ArchitectFlowOutcomeNotificationErrorDetail;
import com.mypurecloud.sdk.v2.model.ArchitectFlowOutcomeNotificationErrorMessageParams;
import com.mypurecloud.sdk.v2.model.ArchitectFlowOutcomeNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ArchitectFlowOutcomeNotificationArchitectOperation
 */

public class ArchitectFlowOutcomeNotificationArchitectOperation  implements Serializable {
  
  private String id = null;
  private Boolean complete = null;
  private ArchitectFlowOutcomeNotificationUser user = null;
  private ArchitectFlowOutcomeNotificationClient client = null;

  private static class ActionNameEnumDeserializer extends StdDeserializer<ActionNameEnum> {
    public ActionNameEnumDeserializer() {
      super(ActionNameEnumDeserializer.class);
    }

    @Override
    public ActionNameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionNameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets actionName
   */
 @JsonDeserialize(using = ActionNameEnumDeserializer.class)
  public enum ActionNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATE("CREATE"),
    CHECKIN("CHECKIN"),
    DEBUG("DEBUG"),
    DELETE("DELETE"),
    HISTORY("HISTORY"),
    PUBLISH("PUBLISH"),
    STATE_CHANGE("STATE_CHANGE"),
    UPDATE("UPDATE"),
    VALIDATE("VALIDATE");

    private String value;

    ActionNameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionNameEnum fromString(String key) {
      if (key == null) return null;

      for (ActionNameEnum value : ActionNameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionNameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionNameEnum actionName = null;

  private static class ActionStatusEnumDeserializer extends StdDeserializer<ActionStatusEnum> {
    public ActionStatusEnumDeserializer() {
      super(ActionStatusEnumDeserializer.class);
    }

    @Override
    public ActionStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets actionStatus
   */
 @JsonDeserialize(using = ActionStatusEnumDeserializer.class)
  public enum ActionStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOCKED("LOCKED"),
    UNLOCKED("UNLOCKED"),
    STARTED("STARTED"),
    PENDING_GENERATION("PENDING_GENERATION"),
    PENDING_BACKEND_NOTIFICATION("PENDING_BACKEND_NOTIFICATION"),
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE");

    private String value;

    ActionStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionStatusEnum fromString(String key) {
      if (key == null) return null;

      for (ActionStatusEnum value : ActionStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionStatusEnum actionStatus = null;
  private String errorMessage = null;
  private String errorCode = null;
  private ArchitectFlowOutcomeNotificationErrorMessageParams errorMessageParams = null;
  private List<ArchitectFlowOutcomeNotificationErrorDetail> errorDetails = new ArrayList<ArchitectFlowOutcomeNotificationErrorDetail>();

  
  /**
   **/
  public ArchitectFlowOutcomeNotificationArchitectOperation id(String id) {
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
  public ArchitectFlowOutcomeNotificationArchitectOperation complete(Boolean complete) {
    this.complete = complete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("complete")
  public Boolean getComplete() {
    return complete;
  }
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  
  /**
   **/
  public ArchitectFlowOutcomeNotificationArchitectOperation user(ArchitectFlowOutcomeNotificationUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public ArchitectFlowOutcomeNotificationUser getUser() {
    return user;
  }
  public void setUser(ArchitectFlowOutcomeNotificationUser user) {
    this.user = user;
  }

  
  /**
   **/
  public ArchitectFlowOutcomeNotificationArchitectOperation client(ArchitectFlowOutcomeNotificationClient client) {
    this.client = client;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("client")
  public ArchitectFlowOutcomeNotificationClient getClient() {
    return client;
  }
  public void setClient(ArchitectFlowOutcomeNotificationClient client) {
    this.client = client;
  }

  
  /**
   **/
  public ArchitectFlowOutcomeNotificationArchitectOperation actionName(ActionNameEnum actionName) {
    this.actionName = actionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionName")
  public ActionNameEnum getActionName() {
    return actionName;
  }
  public void setActionName(ActionNameEnum actionName) {
    this.actionName = actionName;
  }

  
  /**
   **/
  public ArchitectFlowOutcomeNotificationArchitectOperation actionStatus(ActionStatusEnum actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionStatus")
  public ActionStatusEnum getActionStatus() {
    return actionStatus;
  }
  public void setActionStatus(ActionStatusEnum actionStatus) {
    this.actionStatus = actionStatus;
  }

  
  /**
   **/
  public ArchitectFlowOutcomeNotificationArchitectOperation errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   **/
  public ArchitectFlowOutcomeNotificationArchitectOperation errorCode(String errorCode) {
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
  public ArchitectFlowOutcomeNotificationArchitectOperation errorMessageParams(ArchitectFlowOutcomeNotificationErrorMessageParams errorMessageParams) {
    this.errorMessageParams = errorMessageParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorMessageParams")
  public ArchitectFlowOutcomeNotificationErrorMessageParams getErrorMessageParams() {
    return errorMessageParams;
  }
  public void setErrorMessageParams(ArchitectFlowOutcomeNotificationErrorMessageParams errorMessageParams) {
    this.errorMessageParams = errorMessageParams;
  }

  
  /**
   **/
  public ArchitectFlowOutcomeNotificationArchitectOperation errorDetails(List<ArchitectFlowOutcomeNotificationErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public List<ArchitectFlowOutcomeNotificationErrorDetail> getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(List<ArchitectFlowOutcomeNotificationErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectFlowOutcomeNotificationArchitectOperation architectFlowOutcomeNotificationArchitectOperation = (ArchitectFlowOutcomeNotificationArchitectOperation) o;
    return Objects.equals(this.id, architectFlowOutcomeNotificationArchitectOperation.id) &&
        Objects.equals(this.complete, architectFlowOutcomeNotificationArchitectOperation.complete) &&
        Objects.equals(this.user, architectFlowOutcomeNotificationArchitectOperation.user) &&
        Objects.equals(this.client, architectFlowOutcomeNotificationArchitectOperation.client) &&
        Objects.equals(this.actionName, architectFlowOutcomeNotificationArchitectOperation.actionName) &&
        Objects.equals(this.actionStatus, architectFlowOutcomeNotificationArchitectOperation.actionStatus) &&
        Objects.equals(this.errorMessage, architectFlowOutcomeNotificationArchitectOperation.errorMessage) &&
        Objects.equals(this.errorCode, architectFlowOutcomeNotificationArchitectOperation.errorCode) &&
        Objects.equals(this.errorMessageParams, architectFlowOutcomeNotificationArchitectOperation.errorMessageParams) &&
        Objects.equals(this.errorDetails, architectFlowOutcomeNotificationArchitectOperation.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, complete, user, client, actionName, actionStatus, errorMessage, errorCode, errorMessageParams, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectFlowOutcomeNotificationArchitectOperation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessageParams: ").append(toIndentedString(errorMessageParams)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

