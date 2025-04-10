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
 * UserConversationsEventMediaSummaryDetail
 */

public class UserConversationsEventMediaSummaryDetail  implements Serializable {
  
  private Long active = null;
  private Long acw = null;

  public UserConversationsEventMediaSummaryDetail() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public UserConversationsEventMediaSummaryDetail active(Long active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Long getActive() {
    return active;
  }
  public void setActive(Long active) {
    this.active = active;
  }


  /**
   **/
  public UserConversationsEventMediaSummaryDetail acw(Long acw) {
    this.acw = acw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acw")
  public Long getAcw() {
    return acw;
  }
  public void setAcw(Long acw) {
    this.acw = acw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConversationsEventMediaSummaryDetail userConversationsEventMediaSummaryDetail = (UserConversationsEventMediaSummaryDetail) o;

    return Objects.equals(this.active, userConversationsEventMediaSummaryDetail.active) &&
            Objects.equals(this.acw, userConversationsEventMediaSummaryDetail.acw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, acw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationsEventMediaSummaryDetail {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    acw: ").append(toIndentedString(acw)).append("\n");
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

