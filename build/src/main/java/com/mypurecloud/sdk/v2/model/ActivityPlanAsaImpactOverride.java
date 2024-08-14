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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ActivityPlanAsaImpactOverride
 */

public class ActivityPlanAsaImpactOverride  implements Serializable {
  
  private Double increaseByPercent = null;

  
  /**
   * Allowed average speed of answer increase percent, from 0.0 to 100.0
   **/
  public ActivityPlanAsaImpactOverride increaseByPercent(Double increaseByPercent) {
    this.increaseByPercent = increaseByPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Allowed average speed of answer increase percent, from 0.0 to 100.0")
  @JsonProperty("increaseByPercent")
  public Double getIncreaseByPercent() {
    return increaseByPercent;
  }
  public void setIncreaseByPercent(Double increaseByPercent) {
    this.increaseByPercent = increaseByPercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityPlanAsaImpactOverride activityPlanAsaImpactOverride = (ActivityPlanAsaImpactOverride) o;

    return Objects.equals(this.increaseByPercent, activityPlanAsaImpactOverride.increaseByPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increaseByPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanAsaImpactOverride {\n");
    
    sb.append("    increaseByPercent: ").append(toIndentedString(increaseByPercent)).append("\n");
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

