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
 * SummarySettingParticipantLabels
 */

public class SummarySettingParticipantLabels  implements Serializable {
  
  private String internal = null;
  private String external = null;

  public SummarySettingParticipantLabels() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Specify how to refer the internal participant of the interaction.
   **/
  public SummarySettingParticipantLabels internal(String internal) {
    this.internal = internal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify how to refer the internal participant of the interaction.")
  @JsonProperty("internal")
  public String getInternal() {
    return internal;
  }
  public void setInternal(String internal) {
    this.internal = internal;
  }


  /**
   * Specify how to refer the external participant of the interaction.
   **/
  public SummarySettingParticipantLabels external(String external) {
    this.external = external;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify how to refer the external participant of the interaction.")
  @JsonProperty("external")
  public String getExternal() {
    return external;
  }
  public void setExternal(String external) {
    this.external = external;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarySettingParticipantLabels summarySettingParticipantLabels = (SummarySettingParticipantLabels) o;

    return Objects.equals(this.internal, summarySettingParticipantLabels.internal) &&
            Objects.equals(this.external, summarySettingParticipantLabels.external);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internal, external);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarySettingParticipantLabels {\n");
    
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
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

