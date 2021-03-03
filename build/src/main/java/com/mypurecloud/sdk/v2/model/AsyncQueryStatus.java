package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AsyncQueryStatus
 */

public class AsyncQueryStatus  implements Serializable {
  

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
   * The current state of the asynchronous query
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUED("QUEUED"),
    PENDING("PENDING"),
    FAILED("FAILED"),
    CANCELLED("CANCELLED"),
    FULFILLED("FULFILLED"),
    EXPIRED("EXPIRED");

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
  private String errorMessage = null;
  private Date expirationDate = null;
  private Date submissionDate = null;
  private Date completionDate = null;

  
  /**
   * The current state of the asynchronous query
   **/
  public AsyncQueryStatus state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current state of the asynchronous query")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The error associated with the current query, if the state is FAILED
   **/
  public AsyncQueryStatus errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error associated with the current query, if the state is FAILED")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   * The time at which results for this query will expire. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AsyncQueryStatus expirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time at which results for this query will expire. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  
  /**
   * The time at which the query was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AsyncQueryStatus submissionDate(Date submissionDate) {
    this.submissionDate = submissionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time at which the query was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("submissionDate")
  public Date getSubmissionDate() {
    return submissionDate;
  }
  public void setSubmissionDate(Date submissionDate) {
    this.submissionDate = submissionDate;
  }

  
  /**
   * The time at which the query completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AsyncQueryStatus completionDate(Date completionDate) {
    this.completionDate = completionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time at which the query completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("completionDate")
  public Date getCompletionDate() {
    return completionDate;
  }
  public void setCompletionDate(Date completionDate) {
    this.completionDate = completionDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncQueryStatus asyncQueryStatus = (AsyncQueryStatus) o;
    return Objects.equals(this.state, asyncQueryStatus.state) &&
        Objects.equals(this.errorMessage, asyncQueryStatus.errorMessage) &&
        Objects.equals(this.expirationDate, asyncQueryStatus.expirationDate) &&
        Objects.equals(this.submissionDate, asyncQueryStatus.submissionDate) &&
        Objects.equals(this.completionDate, asyncQueryStatus.completionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, errorMessage, expirationDate, submissionDate, completionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncQueryStatus {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    submissionDate: ").append(toIndentedString(submissionDate)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
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

