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
import com.mypurecloud.sdk.v2.model.Touchpoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OutcomeAttributionRequest
 */

public class OutcomeAttributionRequest  implements Serializable {
  
  private String outcomeId = null;
  private String externalContactId = null;
  private BigDecimal associatedValue = null;
  private List<Touchpoint> touchpoints = new ArrayList<Touchpoint>();
  private Date createdDate = null;

  
  /**
   * ID of Outcome.
   **/
  public OutcomeAttributionRequest outcomeId(String outcomeId) {
    this.outcomeId = outcomeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of Outcome.")
  @JsonProperty("outcomeId")
  public String getOutcomeId() {
    return outcomeId;
  }
  public void setOutcomeId(String outcomeId) {
    this.outcomeId = outcomeId;
  }


  /**
   * The external contact ID of the customer who achieved the outcome.
   **/
  public OutcomeAttributionRequest externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external contact ID of the customer who achieved the outcome.")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   * The total value associated with the customer's outcome.
   **/
  public OutcomeAttributionRequest associatedValue(BigDecimal associatedValue) {
    this.associatedValue = associatedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total value associated with the customer's outcome.")
  @JsonProperty("associatedValue")
  public BigDecimal getAssociatedValue() {
    return associatedValue;
  }
  public void setAssociatedValue(BigDecimal associatedValue) {
    this.associatedValue = associatedValue;
  }


  /**
   * List of interactions that led to this outcome being achieved.
   **/
  public OutcomeAttributionRequest touchpoints(List<Touchpoint> touchpoints) {
    this.touchpoints = touchpoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of interactions that led to this outcome being achieved.")
  @JsonProperty("touchpoints")
  public List<Touchpoint> getTouchpoints() {
    return touchpoints;
  }
  public void setTouchpoints(List<Touchpoint> touchpoints) {
    this.touchpoints = touchpoints;
  }


  /**
   * Date outcome was achieved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OutcomeAttributionRequest createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date outcome was achieved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeAttributionRequest outcomeAttributionRequest = (OutcomeAttributionRequest) o;

    return Objects.equals(this.outcomeId, outcomeAttributionRequest.outcomeId) &&
            Objects.equals(this.externalContactId, outcomeAttributionRequest.externalContactId) &&
            Objects.equals(this.associatedValue, outcomeAttributionRequest.associatedValue) &&
            Objects.equals(this.touchpoints, outcomeAttributionRequest.touchpoints) &&
            Objects.equals(this.createdDate, outcomeAttributionRequest.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeId, externalContactId, associatedValue, touchpoints, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeAttributionRequest {\n");
    
    sb.append("    outcomeId: ").append(toIndentedString(outcomeId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    associatedValue: ").append(toIndentedString(associatedValue)).append("\n");
    sb.append("    touchpoints: ").append(toIndentedString(touchpoints)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

