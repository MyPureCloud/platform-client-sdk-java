package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationDetailsDatalakeAvailabilityTopicDateTime
 */

public class ConversationDetailsDatalakeAvailabilityTopicDateTime  implements Serializable {
  
  private Integer iMillis = null;
  private Boolean beforeNow = null;
  private Boolean afterNow = null;
  private Boolean equalNow = null;

  
  /**
   **/
  public ConversationDetailsDatalakeAvailabilityTopicDateTime iMillis(Integer iMillis) {
    this.iMillis = iMillis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("iMillis")
  public Integer getIMillis() {
    return iMillis;
  }
  public void setIMillis(Integer iMillis) {
    this.iMillis = iMillis;
  }

  
  /**
   **/
  public ConversationDetailsDatalakeAvailabilityTopicDateTime beforeNow(Boolean beforeNow) {
    this.beforeNow = beforeNow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("beforeNow")
  public Boolean getBeforeNow() {
    return beforeNow;
  }
  public void setBeforeNow(Boolean beforeNow) {
    this.beforeNow = beforeNow;
  }

  
  /**
   **/
  public ConversationDetailsDatalakeAvailabilityTopicDateTime afterNow(Boolean afterNow) {
    this.afterNow = afterNow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("afterNow")
  public Boolean getAfterNow() {
    return afterNow;
  }
  public void setAfterNow(Boolean afterNow) {
    this.afterNow = afterNow;
  }

  
  /**
   **/
  public ConversationDetailsDatalakeAvailabilityTopicDateTime equalNow(Boolean equalNow) {
    this.equalNow = equalNow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("equalNow")
  public Boolean getEqualNow() {
    return equalNow;
  }
  public void setEqualNow(Boolean equalNow) {
    this.equalNow = equalNow;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationDetailsDatalakeAvailabilityTopicDateTime conversationDetailsDatalakeAvailabilityTopicDateTime = (ConversationDetailsDatalakeAvailabilityTopicDateTime) o;
    return Objects.equals(this.iMillis, conversationDetailsDatalakeAvailabilityTopicDateTime.iMillis) &&
        Objects.equals(this.beforeNow, conversationDetailsDatalakeAvailabilityTopicDateTime.beforeNow) &&
        Objects.equals(this.afterNow, conversationDetailsDatalakeAvailabilityTopicDateTime.afterNow) &&
        Objects.equals(this.equalNow, conversationDetailsDatalakeAvailabilityTopicDateTime.equalNow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iMillis, beforeNow, afterNow, equalNow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationDetailsDatalakeAvailabilityTopicDateTime {\n");
    
    sb.append("    iMillis: ").append(toIndentedString(iMillis)).append("\n");
    sb.append("    beforeNow: ").append(toIndentedString(beforeNow)).append("\n");
    sb.append("    afterNow: ").append(toIndentedString(afterNow)).append("\n");
    sb.append("    equalNow: ").append(toIndentedString(equalNow)).append("\n");
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

