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
import com.mypurecloud.sdk.v2.model.AdminAgentScheduleSetPreferences;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AdminAgentScheduleBidPreferenceResponse
 */

public class AdminAgentScheduleBidPreferenceResponse  implements Serializable {
  
  private AdminAgentScheduleSetPreferences result = null;
  private String downloadUrl = null;

  public AdminAgentScheduleBidPreferenceResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AdminAgentScheduleBidPreferenceResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The agents' schedule set preferences
   **/
  public AdminAgentScheduleBidPreferenceResponse result(AdminAgentScheduleSetPreferences result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agents' schedule set preferences")
  @JsonProperty("result")
  public AdminAgentScheduleSetPreferences getResult() {
    return result;
  }
  public void setResult(AdminAgentScheduleSetPreferences result) {
    this.result = result;
  }


  /**
   * URL to retrieve results when the response contains a large dataset. If provided, the downloaded data will follow the same schema as the result.
   **/
  public AdminAgentScheduleBidPreferenceResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL to retrieve results when the response contains a large dataset. If provided, the downloaded data will follow the same schema as the result.")
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
    AdminAgentScheduleBidPreferenceResponse adminAgentScheduleBidPreferenceResponse = (AdminAgentScheduleBidPreferenceResponse) o;

    return Objects.equals(this.result, adminAgentScheduleBidPreferenceResponse.result) &&
            Objects.equals(this.downloadUrl, adminAgentScheduleBidPreferenceResponse.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminAgentScheduleBidPreferenceResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

