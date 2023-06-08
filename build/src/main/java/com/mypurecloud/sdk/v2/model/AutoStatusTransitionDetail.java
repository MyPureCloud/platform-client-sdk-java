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
import com.mypurecloud.sdk.v2.model.WorkitemStatusReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AutoStatusTransitionDetail
 */

public class AutoStatusTransitionDetail  implements Serializable {
  
  private WorkitemStatusReference nextStatus = null;
  private Date dateOfTransition = null;

  
  /**
   * Next status of auto status transition.
   **/
  public AutoStatusTransitionDetail nextStatus(WorkitemStatusReference nextStatus) {
    this.nextStatus = nextStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Next status of auto status transition.")
  @JsonProperty("nextStatus")
  public WorkitemStatusReference getNextStatus() {
    return nextStatus;
  }
  public void setNextStatus(WorkitemStatusReference nextStatus) {
    this.nextStatus = nextStatus;
  }


  /**
   * Date at which auto status transition occurs. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AutoStatusTransitionDetail dateOfTransition(Date dateOfTransition) {
    this.dateOfTransition = dateOfTransition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date at which auto status transition occurs. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateOfTransition")
  public Date getDateOfTransition() {
    return dateOfTransition;
  }
  public void setDateOfTransition(Date dateOfTransition) {
    this.dateOfTransition = dateOfTransition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoStatusTransitionDetail autoStatusTransitionDetail = (AutoStatusTransitionDetail) o;

    return Objects.equals(this.nextStatus, autoStatusTransitionDetail.nextStatus) &&
            Objects.equals(this.dateOfTransition, autoStatusTransitionDetail.dateOfTransition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextStatus, dateOfTransition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoStatusTransitionDetail {\n");
    
    sb.append("    nextStatus: ").append(toIndentedString(nextStatus)).append("\n");
    sb.append("    dateOfTransition: ").append(toIndentedString(dateOfTransition)).append("\n");
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

