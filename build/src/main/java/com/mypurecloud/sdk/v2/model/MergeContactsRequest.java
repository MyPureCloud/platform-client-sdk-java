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
import com.mypurecloud.sdk.v2.model.ExternalContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MergeContactsRequest
 */

public class MergeContactsRequest  implements Serializable {
  
  private List<String> contactIds = null;
  private ExternalContact valueOverride = null;

  public MergeContactsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      contactIds = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of all contacts involved in the merge operation (must be between 2 and 25).
   **/
  public MergeContactsRequest contactIds(List<String> contactIds) {
    this.contactIds = contactIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of all contacts involved in the merge operation (must be between 2 and 25).")
  @JsonProperty("contactIds")
  public List<String> getContactIds() {
    return contactIds;
  }
  public void setContactIds(List<String> contactIds) {
    this.contactIds = contactIds;
  }


  /**
   * Override data to set for specific Contact fields after a merge. Any null fields in `valueOverride` will not replace existing data.
   **/
  public MergeContactsRequest valueOverride(ExternalContact valueOverride) {
    this.valueOverride = valueOverride;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Override data to set for specific Contact fields after a merge. Any null fields in `valueOverride` will not replace existing data.")
  @JsonProperty("valueOverride")
  public ExternalContact getValueOverride() {
    return valueOverride;
  }
  public void setValueOverride(ExternalContact valueOverride) {
    this.valueOverride = valueOverride;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeContactsRequest mergeContactsRequest = (MergeContactsRequest) o;

    return Objects.equals(this.contactIds, mergeContactsRequest.contactIds) &&
            Objects.equals(this.valueOverride, mergeContactsRequest.valueOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactIds, valueOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeContactsRequest {\n");
    
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
    sb.append("    valueOverride: ").append(toIndentedString(valueOverride)).append("\n");
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

