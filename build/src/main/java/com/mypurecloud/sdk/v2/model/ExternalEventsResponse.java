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
import com.mypurecloud.sdk.v2.model.UnprocessedExternalEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ExternalEventsResponse
 */

public class ExternalEventsResponse  implements Serializable {
  
  private List<UnprocessedExternalEvent> unprocessedEntities = null;

  public ExternalEventsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      unprocessedEntities = new ArrayList<UnprocessedExternalEvent>();
    }
  }

  
  /**
   * List of events that failed processing.
   **/
  public ExternalEventsResponse unprocessedEntities(List<UnprocessedExternalEvent> unprocessedEntities) {
    this.unprocessedEntities = unprocessedEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of events that failed processing.")
  @JsonProperty("unprocessedEntities")
  public List<UnprocessedExternalEvent> getUnprocessedEntities() {
    return unprocessedEntities;
  }
  public void setUnprocessedEntities(List<UnprocessedExternalEvent> unprocessedEntities) {
    this.unprocessedEntities = unprocessedEntities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalEventsResponse externalEventsResponse = (ExternalEventsResponse) o;

    return Objects.equals(this.unprocessedEntities, externalEventsResponse.unprocessedEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unprocessedEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalEventsResponse {\n");
    
    sb.append("    unprocessedEntities: ").append(toIndentedString(unprocessedEntities)).append("\n");
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

