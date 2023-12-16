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
import com.mypurecloud.sdk.v2.model.MuAgentQueueTimeRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * PerformancePredictionUploadSchema
 */

public class PerformancePredictionUploadSchema  implements Serializable {
  
  private Date calculationStartDate = null;
  private List<MuAgentQueueTimeRequest> onQueueTimes = new ArrayList<MuAgentQueueTimeRequest>();

  
  /**
   * Date as an ISO-8601 string, corresponding to the beginning of the performance prediction results
   **/
  public PerformancePredictionUploadSchema calculationStartDate(Date calculationStartDate) {
    this.calculationStartDate = calculationStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date as an ISO-8601 string, corresponding to the beginning of the performance prediction results")
  @JsonProperty("calculationStartDate")
  public Date getCalculationStartDate() {
    return calculationStartDate;
  }
  public void setCalculationStartDate(Date calculationStartDate) {
    this.calculationStartDate = calculationStartDate;
  }


  /**
   * List of agent on queue times by management unit
   **/
  public PerformancePredictionUploadSchema onQueueTimes(List<MuAgentQueueTimeRequest> onQueueTimes) {
    this.onQueueTimes = onQueueTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of agent on queue times by management unit")
  @JsonProperty("onQueueTimes")
  public List<MuAgentQueueTimeRequest> getOnQueueTimes() {
    return onQueueTimes;
  }
  public void setOnQueueTimes(List<MuAgentQueueTimeRequest> onQueueTimes) {
    this.onQueueTimes = onQueueTimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformancePredictionUploadSchema performancePredictionUploadSchema = (PerformancePredictionUploadSchema) o;

    return Objects.equals(this.calculationStartDate, performancePredictionUploadSchema.calculationStartDate) &&
            Objects.equals(this.onQueueTimes, performancePredictionUploadSchema.onQueueTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationStartDate, onQueueTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformancePredictionUploadSchema {\n");
    
    sb.append("    calculationStartDate: ").append(toIndentedString(calculationStartDate)).append("\n");
    sb.append("    onQueueTimes: ").append(toIndentedString(onQueueTimes)).append("\n");
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

