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
 * QueueConversationCallEventTopicFaxStatus
 */

public class QueueConversationCallEventTopicFaxStatus  implements Serializable {
  
  private String direction = null;
  private Integer expectedPages = null;
  private Integer activePage = null;
  private Integer linesTransmitted = null;
  private Integer bytesTransmitted = null;
  private Integer dataRate = null;
  private Integer pageErrors = null;
  private Integer lineErrors = null;

  
  /**
   **/
  public QueueConversationCallEventTopicFaxStatus direction(String direction) {
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
  public QueueConversationCallEventTopicFaxStatus expectedPages(Integer expectedPages) {
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
  public QueueConversationCallEventTopicFaxStatus activePage(Integer activePage) {
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
  public QueueConversationCallEventTopicFaxStatus linesTransmitted(Integer linesTransmitted) {
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
  public QueueConversationCallEventTopicFaxStatus bytesTransmitted(Integer bytesTransmitted) {
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
  public QueueConversationCallEventTopicFaxStatus dataRate(Integer dataRate) {
    this.dataRate = dataRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataRate")
  public Integer getDataRate() {
    return dataRate;
  }
  public void setDataRate(Integer dataRate) {
    this.dataRate = dataRate;
  }

  
  /**
   **/
  public QueueConversationCallEventTopicFaxStatus pageErrors(Integer pageErrors) {
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
  public QueueConversationCallEventTopicFaxStatus lineErrors(Integer lineErrors) {
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
    QueueConversationCallEventTopicFaxStatus queueConversationCallEventTopicFaxStatus = (QueueConversationCallEventTopicFaxStatus) o;
    return Objects.equals(this.direction, queueConversationCallEventTopicFaxStatus.direction) &&
        Objects.equals(this.expectedPages, queueConversationCallEventTopicFaxStatus.expectedPages) &&
        Objects.equals(this.activePage, queueConversationCallEventTopicFaxStatus.activePage) &&
        Objects.equals(this.linesTransmitted, queueConversationCallEventTopicFaxStatus.linesTransmitted) &&
        Objects.equals(this.bytesTransmitted, queueConversationCallEventTopicFaxStatus.bytesTransmitted) &&
        Objects.equals(this.dataRate, queueConversationCallEventTopicFaxStatus.dataRate) &&
        Objects.equals(this.pageErrors, queueConversationCallEventTopicFaxStatus.pageErrors) &&
        Objects.equals(this.lineErrors, queueConversationCallEventTopicFaxStatus.lineErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, expectedPages, activePage, linesTransmitted, bytesTransmitted, dataRate, pageErrors, lineErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicFaxStatus {\n");
    
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

