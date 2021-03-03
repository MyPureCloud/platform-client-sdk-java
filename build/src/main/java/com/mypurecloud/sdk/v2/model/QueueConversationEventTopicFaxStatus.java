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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationEventTopicFaxStatus
 */

public class QueueConversationEventTopicFaxStatus  implements Serializable {
  
  private String direction = null;
  private Integer expectedPages = null;
  private Integer activePage = null;
  private Integer linesTransmitted = null;
  private Integer bytesTransmitted = null;
  private Integer baudRate = null;
  private Integer pageErrors = null;
  private Integer lineErrors = null;

  
  /**
   **/
  public QueueConversationEventTopicFaxStatus direction(String direction) {
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
  public QueueConversationEventTopicFaxStatus expectedPages(Integer expectedPages) {
    this.expectedPages = expectedPages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expectedPages")
  public Integer getExpectedPages() {
    return expectedPages;
  }
  public void setExpectedPages(Integer expectedPages) {
    this.expectedPages = expectedPages;
  }

  
  /**
   **/
  public QueueConversationEventTopicFaxStatus activePage(Integer activePage) {
    this.activePage = activePage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activePage")
  public Integer getActivePage() {
    return activePage;
  }
  public void setActivePage(Integer activePage) {
    this.activePage = activePage;
  }

  
  /**
   **/
  public QueueConversationEventTopicFaxStatus linesTransmitted(Integer linesTransmitted) {
    this.linesTransmitted = linesTransmitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("linesTransmitted")
  public Integer getLinesTransmitted() {
    return linesTransmitted;
  }
  public void setLinesTransmitted(Integer linesTransmitted) {
    this.linesTransmitted = linesTransmitted;
  }

  
  /**
   **/
  public QueueConversationEventTopicFaxStatus bytesTransmitted(Integer bytesTransmitted) {
    this.bytesTransmitted = bytesTransmitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bytesTransmitted")
  public Integer getBytesTransmitted() {
    return bytesTransmitted;
  }
  public void setBytesTransmitted(Integer bytesTransmitted) {
    this.bytesTransmitted = bytesTransmitted;
  }

  
  /**
   **/
  public QueueConversationEventTopicFaxStatus baudRate(Integer baudRate) {
    this.baudRate = baudRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("baudRate")
  public Integer getBaudRate() {
    return baudRate;
  }
  public void setBaudRate(Integer baudRate) {
    this.baudRate = baudRate;
  }

  
  /**
   **/
  public QueueConversationEventTopicFaxStatus pageErrors(Integer pageErrors) {
    this.pageErrors = pageErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageErrors")
  public Integer getPageErrors() {
    return pageErrors;
  }
  public void setPageErrors(Integer pageErrors) {
    this.pageErrors = pageErrors;
  }

  
  /**
   **/
  public QueueConversationEventTopicFaxStatus lineErrors(Integer lineErrors) {
    this.lineErrors = lineErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineErrors")
  public Integer getLineErrors() {
    return lineErrors;
  }
  public void setLineErrors(Integer lineErrors) {
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
    QueueConversationEventTopicFaxStatus queueConversationEventTopicFaxStatus = (QueueConversationEventTopicFaxStatus) o;
    return Objects.equals(this.direction, queueConversationEventTopicFaxStatus.direction) &&
        Objects.equals(this.expectedPages, queueConversationEventTopicFaxStatus.expectedPages) &&
        Objects.equals(this.activePage, queueConversationEventTopicFaxStatus.activePage) &&
        Objects.equals(this.linesTransmitted, queueConversationEventTopicFaxStatus.linesTransmitted) &&
        Objects.equals(this.bytesTransmitted, queueConversationEventTopicFaxStatus.bytesTransmitted) &&
        Objects.equals(this.baudRate, queueConversationEventTopicFaxStatus.baudRate) &&
        Objects.equals(this.pageErrors, queueConversationEventTopicFaxStatus.pageErrors) &&
        Objects.equals(this.lineErrors, queueConversationEventTopicFaxStatus.lineErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, expectedPages, activePage, linesTransmitted, bytesTransmitted, baudRate, pageErrors, lineErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicFaxStatus {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    expectedPages: ").append(toIndentedString(expectedPages)).append("\n");
    sb.append("    activePage: ").append(toIndentedString(activePage)).append("\n");
    sb.append("    linesTransmitted: ").append(toIndentedString(linesTransmitted)).append("\n");
    sb.append("    bytesTransmitted: ").append(toIndentedString(bytesTransmitted)).append("\n");
    sb.append("    baudRate: ").append(toIndentedString(baudRate)).append("\n");
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

