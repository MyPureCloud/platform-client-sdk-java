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
 * Extra information on fax transmission.
 */
@ApiModel(description = "Extra information on fax transmission.")

public class QueueConversationVideoEventTopicFaxStatus  implements Serializable {
  
  private String direction = null;
  private Long expectedPages = null;
  private Long activePage = null;
  private Long linesTransmitted = null;
  private Long bytesTransmitted = null;
  private Long baudRate = null;
  private Long pageErrors = null;
  private Long lineErrors = null;

  public QueueConversationVideoEventTopicFaxStatus() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The fax direction, either \"send\" or \"receive\".
   **/
  public QueueConversationVideoEventTopicFaxStatus direction(String direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The fax direction, either \"send\" or \"receive\".")
  @JsonProperty("direction")
  public String getDirection() {
    return direction;
  }
  public void setDirection(String direction) {
    this.direction = direction;
  }


  /**
   * Total number of expected pages, if known.
   **/
  public QueueConversationVideoEventTopicFaxStatus expectedPages(Long expectedPages) {
    this.expectedPages = expectedPages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of expected pages, if known.")
  @JsonProperty("expectedPages")
  public Long getExpectedPages() {
    return expectedPages;
  }
  public void setExpectedPages(Long expectedPages) {
    this.expectedPages = expectedPages;
  }


  /**
   * Active page of the transmission.
   **/
  public QueueConversationVideoEventTopicFaxStatus activePage(Long activePage) {
    this.activePage = activePage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Active page of the transmission.")
  @JsonProperty("activePage")
  public Long getActivePage() {
    return activePage;
  }
  public void setActivePage(Long activePage) {
    this.activePage = activePage;
  }


  /**
   * Number of lines that have completed transmission.
   **/
  public QueueConversationVideoEventTopicFaxStatus linesTransmitted(Long linesTransmitted) {
    this.linesTransmitted = linesTransmitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of lines that have completed transmission.")
  @JsonProperty("linesTransmitted")
  public Long getLinesTransmitted() {
    return linesTransmitted;
  }
  public void setLinesTransmitted(Long linesTransmitted) {
    this.linesTransmitted = linesTransmitted;
  }


  /**
   * Number of bytes that have competed transmission.
   **/
  public QueueConversationVideoEventTopicFaxStatus bytesTransmitted(Long bytesTransmitted) {
    this.bytesTransmitted = bytesTransmitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of bytes that have competed transmission.")
  @JsonProperty("bytesTransmitted")
  public Long getBytesTransmitted() {
    return bytesTransmitted;
  }
  public void setBytesTransmitted(Long bytesTransmitted) {
    this.bytesTransmitted = bytesTransmitted;
  }


  /**
   * Current signaling rate of transmission, baud rate.
   **/
  public QueueConversationVideoEventTopicFaxStatus baudRate(Long baudRate) {
    this.baudRate = baudRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current signaling rate of transmission, baud rate.")
  @JsonProperty("baudRate")
  public Long getBaudRate() {
    return baudRate;
  }
  public void setBaudRate(Long baudRate) {
    this.baudRate = baudRate;
  }


  /**
   * Number of page errors.
   **/
  public QueueConversationVideoEventTopicFaxStatus pageErrors(Long pageErrors) {
    this.pageErrors = pageErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of page errors.")
  @JsonProperty("pageErrors")
  public Long getPageErrors() {
    return pageErrors;
  }
  public void setPageErrors(Long pageErrors) {
    this.pageErrors = pageErrors;
  }


  /**
   * Number of line errors.
   **/
  public QueueConversationVideoEventTopicFaxStatus lineErrors(Long lineErrors) {
    this.lineErrors = lineErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of line errors.")
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
    QueueConversationVideoEventTopicFaxStatus queueConversationVideoEventTopicFaxStatus = (QueueConversationVideoEventTopicFaxStatus) o;

    return Objects.equals(this.direction, queueConversationVideoEventTopicFaxStatus.direction) &&
            Objects.equals(this.expectedPages, queueConversationVideoEventTopicFaxStatus.expectedPages) &&
            Objects.equals(this.activePage, queueConversationVideoEventTopicFaxStatus.activePage) &&
            Objects.equals(this.linesTransmitted, queueConversationVideoEventTopicFaxStatus.linesTransmitted) &&
            Objects.equals(this.bytesTransmitted, queueConversationVideoEventTopicFaxStatus.bytesTransmitted) &&
            Objects.equals(this.baudRate, queueConversationVideoEventTopicFaxStatus.baudRate) &&
            Objects.equals(this.pageErrors, queueConversationVideoEventTopicFaxStatus.pageErrors) &&
            Objects.equals(this.lineErrors, queueConversationVideoEventTopicFaxStatus.lineErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, expectedPages, activePage, linesTransmitted, bytesTransmitted, baudRate, pageErrors, lineErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicFaxStatus {\n");
    
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

