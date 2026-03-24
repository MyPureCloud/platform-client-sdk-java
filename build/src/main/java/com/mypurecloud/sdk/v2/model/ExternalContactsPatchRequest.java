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
import com.mypurecloud.sdk.v2.model.ContactsPatchChange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ExternalContactsPatchRequest
 */

public class ExternalContactsPatchRequest  implements Serializable {
  
  private List<ContactsPatchChange> changes = null;

  public ExternalContactsPatchRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      changes = new ArrayList<ContactsPatchChange>();
    }
  }

  
  /**
   * A list of changes to apply to the provided contact entity
   **/
  public ExternalContactsPatchRequest changes(List<ContactsPatchChange> changes) {
    this.changes = changes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of changes to apply to the provided contact entity")
  @JsonProperty("changes")
  public List<ContactsPatchChange> getChanges() {
    return changes;
  }
  public void setChanges(List<ContactsPatchChange> changes) {
    this.changes = changes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsPatchRequest externalContactsPatchRequest = (ExternalContactsPatchRequest) o;

    return Objects.equals(this.changes, externalContactsPatchRequest.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsPatchRequest {\n");
    
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

