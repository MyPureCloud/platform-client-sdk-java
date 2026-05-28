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
import com.mypurecloud.sdk.v2.model.ExternalEventChange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Response for getting changes in external event definitions
 */
@ApiModel(description = "Response for getting changes in external event definitions")

public class ExternalEventChangesResponse  implements Serializable {
  
  private List<ExternalEventChange> changes = null;

  public ExternalEventChangesResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      changes = new ArrayList<ExternalEventChange>();
    }
  }

  public ExternalEventChangesResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      changes = new ArrayList<ExternalEventChange>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The list of changes")
  @JsonProperty("changes")
  public List<ExternalEventChange> getChanges() {
    return changes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalEventChangesResponse externalEventChangesResponse = (ExternalEventChangesResponse) o;

    return Objects.equals(this.changes, externalEventChangesResponse.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalEventChangesResponse {\n");
    
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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

