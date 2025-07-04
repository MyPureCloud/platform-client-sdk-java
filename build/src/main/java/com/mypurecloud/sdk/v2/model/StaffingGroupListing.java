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
import com.mypurecloud.sdk.v2.model.StaffingGroupResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * StaffingGroupListing
 */

public class StaffingGroupListing  implements Serializable {
  
  private List<StaffingGroupResponse> entities = null;
  private String downloadUrl = null;

  public StaffingGroupListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<StaffingGroupResponse>();
    }
  }

  
  /**
   **/
  public StaffingGroupListing entities(List<StaffingGroupResponse> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<StaffingGroupResponse> getEntities() {
    return entities;
  }
  public void setEntities(List<StaffingGroupResponse> entities) {
    this.entities = entities;
  }


  /**
   * URL from which to fetch results for requests with a large result set. If populated, the downloaded data will conform to the same schema as would normally be returned, excepting downloaded data will never itself contain a downloadUrl
   **/
  public StaffingGroupListing downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL from which to fetch results for requests with a large result set. If populated, the downloaded data will conform to the same schema as would normally be returned, excepting downloaded data will never itself contain a downloadUrl")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffingGroupListing staffingGroupListing = (StaffingGroupListing) o;

    return Objects.equals(this.entities, staffingGroupListing.entities) &&
            Objects.equals(this.downloadUrl, staffingGroupListing.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffingGroupListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

