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
import com.mypurecloud.sdk.v2.model.TimeOffBalanceJobReference;
import com.mypurecloud.sdk.v2.model.TimeOffBalanceResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffBalancesResponse
 */

public class TimeOffBalancesResponse  implements Serializable {
  
  private TimeOffBalanceJobReference job = null;
  private List<TimeOffBalanceResponse> entities = new ArrayList<TimeOffBalanceResponse>();

  
  /**
   * The asynchronous job handling the query
   **/
  public TimeOffBalancesResponse job(TimeOffBalanceJobReference job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The asynchronous job handling the query")
  @JsonProperty("job")
  public TimeOffBalanceJobReference getJob() {
    return job;
  }
  public void setJob(TimeOffBalanceJobReference job) {
    this.job = job;
  }


  /**
   * The list of time off balances. May come via notification
   **/
  public TimeOffBalancesResponse entities(List<TimeOffBalanceResponse> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of time off balances. May come via notification")
  @JsonProperty("entities")
  public List<TimeOffBalanceResponse> getEntities() {
    return entities;
  }
  public void setEntities(List<TimeOffBalanceResponse> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffBalancesResponse timeOffBalancesResponse = (TimeOffBalancesResponse) o;

    return Objects.equals(this.job, timeOffBalancesResponse.job) &&
            Objects.equals(this.entities, timeOffBalancesResponse.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffBalancesResponse {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

