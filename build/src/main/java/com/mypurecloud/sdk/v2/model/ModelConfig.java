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
 * ModelConfig
 */

public class ModelConfig  implements Serializable {
  
  private Boolean useLatestModel = null;

  public ModelConfig() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ModelConfig(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Use the latest model for summarization.
   **/
  public ModelConfig useLatestModel(Boolean useLatestModel) {
    this.useLatestModel = useLatestModel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Use the latest model for summarization.")
  @JsonProperty("useLatestModel")
  public Boolean getUseLatestModel() {
    return useLatestModel;
  }
  public void setUseLatestModel(Boolean useLatestModel) {
    this.useLatestModel = useLatestModel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfig modelConfig = (ModelConfig) o;

    return Objects.equals(this.useLatestModel, modelConfig.useLatestModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useLatestModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfig {\n");
    
    sb.append("    useLatestModel: ").append(toIndentedString(useLatestModel)).append("\n");
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

