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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.TouchpointResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OutcomeAttributionResultsResponse
 */

public class OutcomeAttributionResultsResponse  implements Serializable {
  
  private String outcomeId = null;
  private Integer index = null;
  private String externalContactId = null;
  private BigDecimal associatedValue = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * State of the Outcome Attribution entity.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETED("Completed"),
    VALID("Valid"),
    INVALID("Invalid"),
    FAILED("Failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private String message = null;
  private List<TouchpointResponse> touchpoints = null;
  private Date createdDate = null;

  public OutcomeAttributionResultsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      touchpoints = new ArrayList<TouchpointResponse>();
    }
  }

  
  /**
   * ID of Outcome.
   **/
  public OutcomeAttributionResultsResponse outcomeId(String outcomeId) {
    this.outcomeId = outcomeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of Outcome.")
  @JsonProperty("outcomeId")
  public String getOutcomeId() {
    return outcomeId;
  }
  public void setOutcomeId(String outcomeId) {
    this.outcomeId = outcomeId;
  }


  /**
   * The index/position of the OutcomeAttribution in the original POST request.
   **/
  public OutcomeAttributionResultsResponse index(Integer index) {
    this.index = index;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The index/position of the OutcomeAttribution in the original POST request.")
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }


  /**
   * The external contact ID of the customer who achieved the outcome.
   **/
  public OutcomeAttributionResultsResponse externalContactId(String externalContactId) {
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
  public OutcomeAttributionResultsResponse associatedValue(BigDecimal associatedValue) {
    this.associatedValue = associatedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total value associated with the customer's outcome.")
  @JsonProperty("associatedValue")
  public BigDecimal getAssociatedValue() {
    return associatedValue;
  }
  public void setAssociatedValue(BigDecimal associatedValue) {
    this.associatedValue = associatedValue;
  }


  /**
   * State of the Outcome Attribution entity.
   **/
  public OutcomeAttributionResultsResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "State of the Outcome Attribution entity.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Additional information on the state of the Outcome Attribution entity.
   **/
  public OutcomeAttributionResultsResponse message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Additional information on the state of the Outcome Attribution entity.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * List of interactions that led to this outcome being achieved.
   **/
  public OutcomeAttributionResultsResponse touchpoints(List<TouchpointResponse> touchpoints) {
    this.touchpoints = touchpoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of interactions that led to this outcome being achieved.")
  @JsonProperty("touchpoints")
  public List<TouchpointResponse> getTouchpoints() {
    return touchpoints;
  }
  public void setTouchpoints(List<TouchpointResponse> touchpoints) {
    this.touchpoints = touchpoints;
  }


  /**
   * Date outcome was achieved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OutcomeAttributionResultsResponse createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date outcome was achieved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
    OutcomeAttributionResultsResponse outcomeAttributionResultsResponse = (OutcomeAttributionResultsResponse) o;

    return Objects.equals(this.outcomeId, outcomeAttributionResultsResponse.outcomeId) &&
            Objects.equals(this.index, outcomeAttributionResultsResponse.index) &&
            Objects.equals(this.externalContactId, outcomeAttributionResultsResponse.externalContactId) &&
            Objects.equals(this.associatedValue, outcomeAttributionResultsResponse.associatedValue) &&
            Objects.equals(this.state, outcomeAttributionResultsResponse.state) &&
            Objects.equals(this.message, outcomeAttributionResultsResponse.message) &&
            Objects.equals(this.touchpoints, outcomeAttributionResultsResponse.touchpoints) &&
            Objects.equals(this.createdDate, outcomeAttributionResultsResponse.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeId, index, externalContactId, associatedValue, state, message, touchpoints, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeAttributionResultsResponse {\n");
    
    sb.append("    outcomeId: ").append(toIndentedString(outcomeId)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    associatedValue: ").append(toIndentedString(associatedValue)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

