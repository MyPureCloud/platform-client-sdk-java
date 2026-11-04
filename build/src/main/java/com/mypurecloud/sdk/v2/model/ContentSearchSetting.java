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
 * ContentSearchSetting
 */

public class ContentSearchSetting  implements Serializable {
  
  private Boolean contentSearchEnabled = null;

  public ContentSearchSetting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ContentSearchSetting(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * If true, enables full-text search of interaction transcripts
   **/
  public ContentSearchSetting contentSearchEnabled(Boolean contentSearchEnabled) {
    this.contentSearchEnabled = contentSearchEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, enables full-text search of interaction transcripts")
  @JsonProperty("contentSearchEnabled")
  public Boolean getContentSearchEnabled() {
    return contentSearchEnabled;
  }
  public void setContentSearchEnabled(Boolean contentSearchEnabled) {
    this.contentSearchEnabled = contentSearchEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentSearchSetting contentSearchSetting = (ContentSearchSetting) o;

    return Objects.equals(this.contentSearchEnabled, contentSearchSetting.contentSearchEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentSearchEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentSearchSetting {\n");
    
    sb.append("    contentSearchEnabled: ").append(toIndentedString(contentSearchEnabled)).append("\n");
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

