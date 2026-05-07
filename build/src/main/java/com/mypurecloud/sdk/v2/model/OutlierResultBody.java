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
import com.mypurecloud.sdk.v2.model.Outlier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OutlierResultBody
 */

public class OutlierResultBody  implements Serializable {
  
  private String planningGroupId = null;
  private List<Outlier> outliers = null;

  public OutlierResultBody() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      outliers = new ArrayList<Outlier>();
    }
  }

  
  /**
   * The ID of the planning group for which outliers are present
   **/
  public OutlierResultBody planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the planning group for which outliers are present")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }


  /**
   * Outliers detected in the forecast data
   **/
  public OutlierResultBody outliers(List<Outlier> outliers) {
    this.outliers = outliers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Outliers detected in the forecast data")
  @JsonProperty("outliers")
  public List<Outlier> getOutliers() {
    return outliers;
  }
  public void setOutliers(List<Outlier> outliers) {
    this.outliers = outliers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlierResultBody outlierResultBody = (OutlierResultBody) o;

    return Objects.equals(this.planningGroupId, outlierResultBody.planningGroupId) &&
            Objects.equals(this.outliers, outlierResultBody.outliers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, outliers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlierResultBody {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
    sb.append("    outliers: ").append(toIndentedString(outliers)).append("\n");
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

