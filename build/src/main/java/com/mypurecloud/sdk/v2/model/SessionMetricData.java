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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ComputedData;
import com.mypurecloud.sdk.v2.model.HistoricalData;
import com.mypurecloud.sdk.v2.model.ModelData;
import com.mypurecloud.sdk.v2.model.ModelMetaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SessionMetricData
 */

public class SessionMetricData  implements Serializable {
  
  private ModelData model = null;
  private ComputedData computed = null;
  private HistoricalData historical = null;
  private ModelMetaData modelMetaData = null;

  
  /**
   * Model to be used for internal evaluation purposes
   **/
  public SessionMetricData model(ModelData model) {
    this.model = model;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Model to be used for internal evaluation purposes")
  @JsonProperty("model")
  public ModelData getModel() {
    return model;
  }
  public void setModel(ModelData model) {
    this.model = model;
  }


  /**
   * Forecasted data for the requested session
   **/
  public SessionMetricData computed(ComputedData computed) {
    this.computed = computed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecasted data for the requested session")
  @JsonProperty("computed")
  public ComputedData getComputed() {
    return computed;
  }
  public void setComputed(ComputedData computed) {
    this.computed = computed;
  }


  /**
   * Historical data for the requested session
   **/
  public SessionMetricData historical(HistoricalData historical) {
    this.historical = historical;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Historical data for the requested session")
  @JsonProperty("historical")
  public HistoricalData getHistorical() {
    return historical;
  }
  public void setHistorical(HistoricalData historical) {
    this.historical = historical;
  }


  /**
   * Contains forecast meta data
   **/
  public SessionMetricData modelMetaData(ModelMetaData modelMetaData) {
    this.modelMetaData = modelMetaData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains forecast meta data")
  @JsonProperty("modelMetaData")
  public ModelMetaData getModelMetaData() {
    return modelMetaData;
  }
  public void setModelMetaData(ModelMetaData modelMetaData) {
    this.modelMetaData = modelMetaData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionMetricData sessionMetricData = (SessionMetricData) o;

    return Objects.equals(this.model, sessionMetricData.model) &&
            Objects.equals(this.computed, sessionMetricData.computed) &&
            Objects.equals(this.historical, sessionMetricData.historical) &&
            Objects.equals(this.modelMetaData, sessionMetricData.modelMetaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, computed, historical, modelMetaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionMetricData {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    computed: ").append(toIndentedString(computed)).append("\n");
    sb.append("    historical: ").append(toIndentedString(historical)).append("\n");
    sb.append("    modelMetaData: ").append(toIndentedString(modelMetaData)).append("\n");
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

