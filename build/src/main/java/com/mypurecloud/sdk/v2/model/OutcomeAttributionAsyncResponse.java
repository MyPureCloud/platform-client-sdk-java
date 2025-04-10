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
 * OutcomeAttributionAsyncResponse
 */

public class OutcomeAttributionAsyncResponse  implements Serializable {
  
  private String id = null;
  private Integer percentFailedThreshold = null;
  private String selfUri = null;

  public OutcomeAttributionAsyncResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Optional percent failed threshold for validation errors; if reached will halt the job. Default is 5 percent, allowed values 0 to 100.
   **/
  public OutcomeAttributionAsyncResponse percentFailedThreshold(Integer percentFailedThreshold) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeAttributionAsyncResponse outcomeAttributionAsyncResponse = (OutcomeAttributionAsyncResponse) o;

    return Objects.equals(this.id, outcomeAttributionAsyncResponse.id) &&
            Objects.equals(this.percentFailedThreshold, outcomeAttributionAsyncResponse.percentFailedThreshold) &&
            Objects.equals(this.selfUri, outcomeAttributionAsyncResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, percentFailedThreshold, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeAttributionAsyncResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    percentFailedThreshold: ").append(toIndentedString(percentFailedThreshold)).append("\n");
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

