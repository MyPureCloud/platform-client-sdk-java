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
import com.mypurecloud.sdk.v2.model.UpdateAdherenceAdjustmentsReasonCodesBulkItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UpdateAdherenceAdjustmentsReasonCodesBulkRequest
 */

public class UpdateAdherenceAdjustmentsReasonCodesBulkRequest  implements Serializable {
  
  private List<UpdateAdherenceAdjustmentsReasonCodesBulkItem> reasonCodes = null;

  public UpdateAdherenceAdjustmentsReasonCodesBulkRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      reasonCodes = new ArrayList<UpdateAdherenceAdjustmentsReasonCodesBulkItem>();
    }
  }

  public UpdateAdherenceAdjustmentsReasonCodesBulkRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      reasonCodes = new ArrayList<UpdateAdherenceAdjustmentsReasonCodesBulkItem>();
    }
  }

  
  /**
   * The reason codes to update
   **/
  public UpdateAdherenceAdjustmentsReasonCodesBulkRequest reasonCodes(List<UpdateAdherenceAdjustmentsReasonCodesBulkItem> reasonCodes) {
    this.reasonCodes = reasonCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reason codes to update")
  @JsonProperty("reasonCodes")
  public List<UpdateAdherenceAdjustmentsReasonCodesBulkItem> getReasonCodes() {
    return reasonCodes;
  }
  public void setReasonCodes(List<UpdateAdherenceAdjustmentsReasonCodesBulkItem> reasonCodes) {
    this.reasonCodes = reasonCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAdherenceAdjustmentsReasonCodesBulkRequest updateAdherenceAdjustmentsReasonCodesBulkRequest = (UpdateAdherenceAdjustmentsReasonCodesBulkRequest) o;

    return Objects.equals(this.reasonCodes, updateAdherenceAdjustmentsReasonCodesBulkRequest.reasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAdherenceAdjustmentsReasonCodesBulkRequest {\n");
    
    sb.append("    reasonCodes: ").append(toIndentedString(reasonCodes)).append("\n");
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

