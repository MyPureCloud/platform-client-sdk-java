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
import com.mypurecloud.sdk.v2.model.DetectedDialogAct;
import com.mypurecloud.sdk.v2.model.DetectedIntent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NluDetectionOutput
 */

public class NluDetectionOutput  implements Serializable {
  
  private List<DetectedIntent> intents = new ArrayList<DetectedIntent>();
  private List<DetectedDialogAct> dialogActs = new ArrayList<DetectedDialogAct>();

  
  @ApiModelProperty(example = "null", value = "The detected intents.")
  @JsonProperty("intents")
  public List<DetectedIntent> getIntents() {
    return intents;
  }

  
  @ApiModelProperty(example = "null", value = "The detected dialog acts.")
  @JsonProperty("dialogActs")
  public List<DetectedDialogAct> getDialogActs() {
    return dialogActs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluDetectionOutput nluDetectionOutput = (NluDetectionOutput) o;
    return Objects.equals(this.intents, nluDetectionOutput.intents) &&
        Objects.equals(this.dialogActs, nluDetectionOutput.dialogActs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intents, dialogActs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluDetectionOutput {\n");
    
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    dialogActs: ").append(toIndentedString(dialogActs)).append("\n");
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

