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
import com.mypurecloud.sdk.v2.model.PatchCallbackRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkCallbackPatchRequest
 */

public class BulkCallbackPatchRequest  implements Serializable {
  
  private List<PatchCallbackRequest> patchCallbackRequests = new ArrayList<PatchCallbackRequest>();

  
  /**
   * The list of requests to update callbacks in bulk
   **/
  public BulkCallbackPatchRequest patchCallbackRequests(List<PatchCallbackRequest> patchCallbackRequests) {
    this.patchCallbackRequests = patchCallbackRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of requests to update callbacks in bulk")
  @JsonProperty("patchCallbackRequests")
  public List<PatchCallbackRequest> getPatchCallbackRequests() {
    return patchCallbackRequests;
  }
  public void setPatchCallbackRequests(List<PatchCallbackRequest> patchCallbackRequests) {
    this.patchCallbackRequests = patchCallbackRequests;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCallbackPatchRequest bulkCallbackPatchRequest = (BulkCallbackPatchRequest) o;
    return Objects.equals(this.patchCallbackRequests, bulkCallbackPatchRequest.patchCallbackRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patchCallbackRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCallbackPatchRequest {\n");
    
    sb.append("    patchCallbackRequests: ").append(toIndentedString(patchCallbackRequests)).append("\n");
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

