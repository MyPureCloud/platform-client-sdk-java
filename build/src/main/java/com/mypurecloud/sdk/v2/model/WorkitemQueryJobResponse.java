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
import com.mypurecloud.sdk.v2.model.WorkitemQueryJobError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WorkitemQueryJobResponse
 */

public class WorkitemQueryJobResponse  implements Serializable {
  
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
   * The state of the query job
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUED("Queued"),
    RUNNING("Running"),
    SUCCEEDED("Succeeded"),
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
  private Date dateStarted = null;
  private Date dateFinished = null;
  private WorkitemQueryJobError error = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The state of the query job
   **/
  public WorkitemQueryJobResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the query job")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The date the job was started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemQueryJobResponse dateStarted(Date dateStarted) {
    this.dateStarted = dateStarted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the job was started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStarted")
  public Date getDateStarted() {
    return dateStarted;
  }
  public void setDateStarted(Date dateStarted) {
    this.dateStarted = dateStarted;
  }


  /**
   * The date the job finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemQueryJobResponse dateFinished(Date dateFinished) {
    this.dateFinished = dateFinished;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the job finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateFinished")
  public Date getDateFinished() {
    return dateFinished;
  }
  public void setDateFinished(Date dateFinished) {
    this.dateFinished = dateFinished;
  }


  /**
   * The error associated with the query job, if the state is Failed
   **/
  public WorkitemQueryJobResponse error(WorkitemQueryJobError error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error associated with the query job, if the state is Failed")
  @JsonProperty("error")
  public WorkitemQueryJobError getError() {
    return error;
  }
  public void setError(WorkitemQueryJobError error) {
    this.error = error;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemQueryJobResponse workitemQueryJobResponse = (WorkitemQueryJobResponse) o;

    return Objects.equals(this.id, workitemQueryJobResponse.id) &&
            Objects.equals(this.state, workitemQueryJobResponse.state) &&
            Objects.equals(this.dateStarted, workitemQueryJobResponse.dateStarted) &&
            Objects.equals(this.dateFinished, workitemQueryJobResponse.dateFinished) &&
            Objects.equals(this.error, workitemQueryJobResponse.error) &&
            Objects.equals(this.selfUri, workitemQueryJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, dateStarted, dateFinished, error, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemQueryJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateStarted: ").append(toIndentedString(dateStarted)).append("\n");
    sb.append("    dateFinished: ").append(toIndentedString(dateFinished)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

