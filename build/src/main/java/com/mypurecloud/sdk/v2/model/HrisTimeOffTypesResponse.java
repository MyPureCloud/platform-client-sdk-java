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
import com.mypurecloud.sdk.v2.model.HrisTimeOffTypeResponse;
import com.mypurecloud.sdk.v2.model.HrisTimeOffTypesJobReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * HrisTimeOffTypesResponse
 */

public class HrisTimeOffTypesResponse  implements Serializable {
  
  private HrisTimeOffTypesJobReference job = null;
  private List<HrisTimeOffTypeResponse> entities = null;

  public HrisTimeOffTypesResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<HrisTimeOffTypeResponse>();
    }
  }

  
  /**
   * The asynchronous job handling the query
   **/
  public HrisTimeOffTypesResponse job(HrisTimeOffTypesJobReference job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The asynchronous job handling the query")
  @JsonProperty("job")
  public HrisTimeOffTypesJobReference getJob() {
    return job;
  }
  public void setJob(HrisTimeOffTypesJobReference job) {
    this.job = job;
  }


  /**
   * List of time off types. It is available only via notification
   **/
  public HrisTimeOffTypesResponse entities(List<HrisTimeOffTypeResponse> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of time off types. It is available only via notification")
  @JsonProperty("entities")
  public List<HrisTimeOffTypeResponse> getEntities() {
    return entities;
  }
  public void setEntities(List<HrisTimeOffTypeResponse> entities) {
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
    HrisTimeOffTypesResponse hrisTimeOffTypesResponse = (HrisTimeOffTypesResponse) o;

    return Objects.equals(this.job, hrisTimeOffTypesResponse.job) &&
            Objects.equals(this.entities, hrisTimeOffTypesResponse.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HrisTimeOffTypesResponse {\n");
    
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

