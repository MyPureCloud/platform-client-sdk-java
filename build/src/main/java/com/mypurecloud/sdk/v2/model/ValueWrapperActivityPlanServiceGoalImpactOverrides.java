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
import com.mypurecloud.sdk.v2.model.ActivityPlanServiceGoalImpactOverrides;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ValueWrapperActivityPlanServiceGoalImpactOverrides
 */

public class ValueWrapperActivityPlanServiceGoalImpactOverrides  implements Serializable {
  
  private ActivityPlanServiceGoalImpactOverrides value = null;

  public ValueWrapperActivityPlanServiceGoalImpactOverrides() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The value for the associated field
   **/
  public ValueWrapperActivityPlanServiceGoalImpactOverrides value(ActivityPlanServiceGoalImpactOverrides value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value for the associated field")
  @JsonProperty("value")
  public ActivityPlanServiceGoalImpactOverrides getValue() {
    return value;
  }
  public void setValue(ActivityPlanServiceGoalImpactOverrides value) {
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
    ValueWrapperActivityPlanServiceGoalImpactOverrides valueWrapperActivityPlanServiceGoalImpactOverrides = (ValueWrapperActivityPlanServiceGoalImpactOverrides) o;

    return Objects.equals(this.value, valueWrapperActivityPlanServiceGoalImpactOverrides.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueWrapperActivityPlanServiceGoalImpactOverrides {\n");
    
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

