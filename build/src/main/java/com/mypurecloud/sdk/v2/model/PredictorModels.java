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
import com.mypurecloud.sdk.v2.model.PredictorModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PredictorModels
 */

public class PredictorModels  implements Serializable {
  
  private List<PredictorModel> entities = null;
  private List<PredictorModel> predictorModels = null;

  public PredictorModels() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<PredictorModel>();
      predictorModels = new ArrayList<PredictorModel>();
    }
  }

  
  /**
   **/
  public PredictorModels entities(List<PredictorModel> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<PredictorModel> getEntities() {
    return entities;
  }
  public void setEntities(List<PredictorModel> entities) {
    this.entities = entities;
  }


  /**
   **/
  public PredictorModels predictorModels(List<PredictorModel> predictorModels) {
    this.predictorModels = predictorModels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("predictorModels")
  public List<PredictorModel> getPredictorModels() {
    return predictorModels;
  }
  public void setPredictorModels(List<PredictorModel> predictorModels) {
    this.predictorModels = predictorModels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictorModels predictorModels = (PredictorModels) o;

    return Objects.equals(this.entities, predictorModels.entities) &&
            Objects.equals(this.predictorModels, predictorModels.predictorModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, predictorModels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictorModels {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    predictorModels: ").append(toIndentedString(predictorModels)).append("\n");
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

