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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OutcomeAttributionJobStateResponse
 */

public class OutcomeAttributionJobStateResponse  implements Serializable {
  
  private String id = null;

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
   * State of job.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RUNNING("Running"),
    COMPLETED("Completed"),
    COMPLETEDWITHERRORS("CompletedWithErrors"),
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
  private String resultsUri = null;
  private Integer percentFailedThreshold = null;
  private String selfUri = null;
  private Date createdDate = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * State of job.
   **/
  public OutcomeAttributionJobStateResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State of job.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * URI where the query results can be retrieved.  Populated when job has reached a terminal state, i.e. no longer Running.
   **/
  public OutcomeAttributionJobStateResponse resultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URI where the query results can be retrieved.  Populated when job has reached a terminal state, i.e. no longer Running.")
  @JsonProperty("resultsUri")
  public String getResultsUri() {
    return resultsUri;
  }
  public void setResultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
  }


  /**
   * Optional percent failed threshold for validation errors; if reached will halt the job. Default is 5 percent, allowed values 0 to 100.
   **/
  public OutcomeAttributionJobStateResponse percentFailedThreshold(Integer percentFailedThreshold) {
    this.percentFailedThreshold = percentFailedThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional percent failed threshold for validation errors; if reached will halt the job. Default is 5 percent, allowed values 0 to 100.")
  @JsonProperty("percentFailedThreshold")
  public Integer getPercentFailedThreshold() {
    return percentFailedThreshold;
  }
  public void setPercentFailedThreshold(Integer percentFailedThreshold) {
    this.percentFailedThreshold = percentFailedThreshold;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  /**
   * Date when the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OutcomeAttributionJobStateResponse createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date when the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
    OutcomeAttributionJobStateResponse outcomeAttributionJobStateResponse = (OutcomeAttributionJobStateResponse) o;

    return Objects.equals(this.id, outcomeAttributionJobStateResponse.id) &&
            Objects.equals(this.state, outcomeAttributionJobStateResponse.state) &&
            Objects.equals(this.resultsUri, outcomeAttributionJobStateResponse.resultsUri) &&
            Objects.equals(this.percentFailedThreshold, outcomeAttributionJobStateResponse.percentFailedThreshold) &&
            Objects.equals(this.selfUri, outcomeAttributionJobStateResponse.selfUri) &&
            Objects.equals(this.createdDate, outcomeAttributionJobStateResponse.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, resultsUri, percentFailedThreshold, selfUri, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeAttributionJobStateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    resultsUri: ").append(toIndentedString(resultsUri)).append("\n");
    sb.append("    percentFailedThreshold: ").append(toIndentedString(percentFailedThreshold)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

