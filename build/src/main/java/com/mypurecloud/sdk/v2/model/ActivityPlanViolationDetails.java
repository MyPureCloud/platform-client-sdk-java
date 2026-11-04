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
 * ActivityPlanViolationDetails
 */

public class ActivityPlanViolationDetails  implements Serializable {
  
  private String expected = null;
  private String actual = null;

  public ActivityPlanViolationDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ActivityPlanViolationDetails(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The constraint value
   **/
  public ActivityPlanViolationDetails expected(String expected) {
    this.expected = expected;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The constraint value")
  @JsonProperty("expected")
  public String getExpected() {
    return expected;
  }
  public void setExpected(String expected) {
    this.expected = expected;
  }


  /**
   * The actual value
   **/
  public ActivityPlanViolationDetails actual(String actual) {
    this.actual = actual;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The actual value")
  @JsonProperty("actual")
  public String getActual() {
    return actual;
  }
  public void setActual(String actual) {
    this.actual = actual;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityPlanViolationDetails activityPlanViolationDetails = (ActivityPlanViolationDetails) o;

    return Objects.equals(this.expected, activityPlanViolationDetails.expected) &&
            Objects.equals(this.actual, activityPlanViolationDetails.actual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expected, actual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanViolationDetails {\n");
    
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
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

