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
 * ConversationCallEventTopicFaxStatus
 */

public class ConversationCallEventTopicFaxStatus  implements Serializable {
  
  private String direction = null;
  private Long expectedPages = null;
  private Long activePage = null;
  private Long linesTransmitted = null;
  private Long bytesTransmitted = null;
  private Long dataRate = null;
  private Long pageErrors = null;
  private Long lineErrors = null;

  public ConversationCallEventTopicFaxStatus() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationCallEventTopicFaxStatus direction(String direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("direction")
  public String getDirection() {
    return direction;
  }
  public void setDirection(String direction) {
    this.direction = direction;
  }


  /**
   **/
  public ConversationCallEventTopicFaxStatus expectedPages(Long expectedPages) {
    this.expectedPages = expectedPages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expectedPages")
  public Long getExpectedPages() {
    return expectedPages;
  }
  public void setExpectedPages(Long expectedPages) {
    this.expectedPages = expectedPages;
  }


  /**
   **/
  public ConversationCallEventTopicFaxStatus activePage(Long activePage) {
    this.activePage = activePage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activePage")
  public Long getActivePage() {
    return activePage;
  }
  public void setActivePage(Long activePage) {
    this.activePage = activePage;
  }


  /**
   **/
  public ConversationCallEventTopicFaxStatus linesTransmitted(Long linesTransmitted) {
    this.linesTransmitted = linesTransmitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("linesTransmitted")
  public Long getLinesTransmitted() {
    return linesTransmitted;
  }
  public void setLinesTransmitted(Long linesTransmitted) {
    this.linesTransmitted = linesTransmitted;
  }


  /**
   **/
  public ConversationCallEventTopicFaxStatus bytesTransmitted(Long bytesTransmitted) {
    this.bytesTransmitted = bytesTransmitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bytesTransmitted")
  public Long getBytesTransmitted() {
    return bytesTransmitted;
  }
  public void setBytesTransmitted(Long bytesTransmitted) {
    this.bytesTransmitted = bytesTransmitted;
  }


  /**
   **/
  public ConversationCallEventTopicFaxStatus dataRate(Long dataRate) {
    this.dataRate = dataRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataRate")
  public Long getDataRate() {
    return dataRate;
  }
  public void setDataRate(Long dataRate) {
    this.dataRate = dataRate;
  }


  /**
   **/
  public ConversationCallEventTopicFaxStatus pageErrors(Long pageErrors) {
    this.pageErrors = pageErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageErrors")
  public Long getPageErrors() {
    return pageErrors;
  }
  public void setPageErrors(Long pageErrors) {
    this.pageErrors = pageErrors;
  }


  /**
   **/
  public ConversationCallEventTopicFaxStatus lineErrors(Long lineErrors) {
    this.lineErrors = lineErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineErrors")
  public Long getLineErrors() {
    return lineErrors;
  }
  public void setLineErrors(Long lineErrors) {
    this.lineErrors = lineErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationCallEventTopicFaxStatus conversationCallEventTopicFaxStatus = (ConversationCallEventTopicFaxStatus) o;

    return Objects.equals(this.direction, conversationCallEventTopicFaxStatus.direction) &&
            Objects.equals(this.expectedPages, conversationCallEventTopicFaxStatus.expectedPages) &&
            Objects.equals(this.activePage, conversationCallEventTopicFaxStatus.activePage) &&
            Objects.equals(this.linesTransmitted, conversationCallEventTopicFaxStatus.linesTransmitted) &&
            Objects.equals(this.bytesTransmitted, conversationCallEventTopicFaxStatus.bytesTransmitted) &&
            Objects.equals(this.dataRate, conversationCallEventTopicFaxStatus.dataRate) &&
            Objects.equals(this.pageErrors, conversationCallEventTopicFaxStatus.pageErrors) &&
            Objects.equals(this.lineErrors, conversationCallEventTopicFaxStatus.lineErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, expectedPages, activePage, linesTransmitted, bytesTransmitted, dataRate, pageErrors, lineErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCallEventTopicFaxStatus {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    expectedPages: ").append(toIndentedString(expectedPages)).append("\n");
    sb.append("    activePage: ").append(toIndentedString(activePage)).append("\n");
    sb.append("    linesTransmitted: ").append(toIndentedString(linesTransmitted)).append("\n");
    sb.append("    bytesTransmitted: ").append(toIndentedString(bytesTransmitted)).append("\n");
    sb.append("    dataRate: ").append(toIndentedString(dataRate)).append("\n");
    sb.append("    pageErrors: ").append(toIndentedString(pageErrors)).append("\n");
    sb.append("    lineErrors: ").append(toIndentedString(lineErrors)).append("\n");
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

