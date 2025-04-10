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
import com.mypurecloud.sdk.v2.model.ConfusionIntentInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConfusionInfo
 */

public class ConfusionInfo  implements Serializable {
  
  private List<ConfusionIntentInfo> intents = null;

  public ConfusionInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intents = new ArrayList<ConfusionIntentInfo>();
    }
  }

  
  /**
   * Confusion details between this utterance and other intents.
   **/
  public ConfusionInfo intents(List<ConfusionIntentInfo> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Confusion details between this utterance and other intents.")
  @JsonProperty("intents")
  public List<ConfusionIntentInfo> getIntents() {
    return intents;
  }
  public void setIntents(List<ConfusionIntentInfo> intents) {
    this.intents = intents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfusionInfo confusionInfo = (ConfusionInfo) o;

    return Objects.equals(this.intents, confusionInfo.intents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfusionInfo {\n");
    
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
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

