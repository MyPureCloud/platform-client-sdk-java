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
 * V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity
 */

public class V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity  implements Serializable {
  
  private String label = null;
  private String value = null;

  public V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   **/
  public V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity v2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity = (V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity) o;

    return Objects.equals(this.label, v2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity.label) &&
            Objects.equals(this.value, v2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2SessionConversationsSummarySettingsPreviewEventConversationSummaryExtractedEntity {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

