package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserConversationSummaryNotificationMediaSummaryDetail
 */

public class UserConversationSummaryNotificationMediaSummaryDetail  implements Serializable {
  
  private Integer active = null;
  private Integer acw = null;

  
  /**
   **/
  public UserConversationSummaryNotificationMediaSummaryDetail active(Integer active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Integer getActive() {
    return active;
  }
  public void setActive(Integer active) {
    this.active = active;
  }


  /**
   **/
  public UserConversationSummaryNotificationMediaSummaryDetail acw(Integer acw) {
    this.acw = acw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acw")
  public Integer getAcw() {
    return acw;
  }
  public void setAcw(Integer acw) {
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
    UserConversationSummaryNotificationMediaSummaryDetail userConversationSummaryNotificationMediaSummaryDetail = (UserConversationSummaryNotificationMediaSummaryDetail) o;
    return Objects.equals(this.active, userConversationSummaryNotificationMediaSummaryDetail.active) &&
        Objects.equals(this.acw, userConversationSummaryNotificationMediaSummaryDetail.acw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, acw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationSummaryNotificationMediaSummaryDetail {\n");
    
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

