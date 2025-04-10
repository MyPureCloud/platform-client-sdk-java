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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InitiatingAction
 */

public class InitiatingAction  implements Serializable {
  
  private String transactionId = null;
  private String actionContext = null;

  public InitiatingAction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Id of the audit initiating the transaction
   **/
  public InitiatingAction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the audit initiating the transaction")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  /**
   * Action of the audit initiating the transaction
   **/
  public InitiatingAction actionContext(String actionContext) {
    this.actionContext = actionContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action of the audit initiating the transaction")
  @JsonProperty("actionContext")
  public String getActionContext() {
    return actionContext;
  }
  public void setActionContext(String actionContext) {
    this.actionContext = actionContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatingAction initiatingAction = (InitiatingAction) o;

    return Objects.equals(this.transactionId, initiatingAction.transactionId) &&
            Objects.equals(this.actionContext, initiatingAction.actionContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, actionContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatingAction {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    actionContext: ").append(toIndentedString(actionContext)).append("\n");
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

