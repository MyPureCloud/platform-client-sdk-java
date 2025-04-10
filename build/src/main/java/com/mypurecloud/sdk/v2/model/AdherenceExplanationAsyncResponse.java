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
import com.mypurecloud.sdk.v2.model.AdherenceExplanationJobReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AdherenceExplanationAsyncResponse
 */

public class AdherenceExplanationAsyncResponse  implements Serializable {
  
  private AdherenceExplanationJobReference job = null;

  public AdherenceExplanationAsyncResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A reference to the job that was started by the request
   **/
  public AdherenceExplanationAsyncResponse job(AdherenceExplanationJobReference job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the job that was started by the request")
  @JsonProperty("job")
  public AdherenceExplanationJobReference getJob() {
    return job;
  }
  public void setJob(AdherenceExplanationJobReference job) {
    this.job = job;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdherenceExplanationAsyncResponse adherenceExplanationAsyncResponse = (AdherenceExplanationAsyncResponse) o;

    return Objects.equals(this.job, adherenceExplanationAsyncResponse.job);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdherenceExplanationAsyncResponse {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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

