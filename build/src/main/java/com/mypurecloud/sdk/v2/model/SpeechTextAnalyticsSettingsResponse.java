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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SpeechTextAnalyticsSettingsResponse
 */

public class SpeechTextAnalyticsSettingsResponse  implements Serializable {
  
  private AddressableEntityRef defaultProgram = null;
  private List<String> expectedDialects = new ArrayList<String>();

  
  /**
   * Setting to choose name for the default program for topic detection
   **/
  public SpeechTextAnalyticsSettingsResponse defaultProgram(AddressableEntityRef defaultProgram) {
    this.defaultProgram = defaultProgram;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting to choose name for the default program for topic detection")
  @JsonProperty("defaultProgram")
  public AddressableEntityRef getDefaultProgram() {
    return defaultProgram;
  }
  public void setDefaultProgram(AddressableEntityRef defaultProgram) {
    this.defaultProgram = defaultProgram;
  }

  
  /**
   * Setting to choose expected dialects
   **/
  public SpeechTextAnalyticsSettingsResponse expectedDialects(List<String> expectedDialects) {
    this.expectedDialects = expectedDialects;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting to choose expected dialects")
  @JsonProperty("expectedDialects")
  public List<String> getExpectedDialects() {
    return expectedDialects;
  }
  public void setExpectedDialects(List<String> expectedDialects) {
    this.expectedDialects = expectedDialects;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeechTextAnalyticsSettingsResponse speechTextAnalyticsSettingsResponse = (SpeechTextAnalyticsSettingsResponse) o;
    return Objects.equals(this.defaultProgram, speechTextAnalyticsSettingsResponse.defaultProgram) &&
        Objects.equals(this.expectedDialects, speechTextAnalyticsSettingsResponse.expectedDialects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultProgram, expectedDialects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeechTextAnalyticsSettingsResponse {\n");
    
    sb.append("    defaultProgram: ").append(toIndentedString(defaultProgram)).append("\n");
    sb.append("    expectedDialects: ").append(toIndentedString(expectedDialects)).append("\n");
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

