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
 * FaxStatus
 */

public class FaxStatus  implements Serializable {
  
  private String direction = null;
  private Long expectedPages = null;
  private Long activePage = null;
  private Long linesTransmitted = null;
  private Long bytesTransmitted = null;
  private Long baudRate = null;
  private Long pageErrors = null;
  private Long lineErrors = null;

  
  /**
   * The fax direction, either \"send\" or \"receive\".
   **/
  public FaxStatus direction(String direction) {
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
  public FaxStatus expectedPages(Long expectedPages) {
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
  public FaxStatus activePage(Long activePage) {
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
  public FaxStatus linesTransmitted(Long linesTransmitted) {
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
  public FaxStatus bytesTransmitted(Long bytesTransmitted) {
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
  public FaxStatus baudRate(Long baudRate) {
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
  public FaxStatus pageErrors(Long pageErrors) {
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
  public FaxStatus lineErrors(Long lineErrors) {
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
    FaxStatus faxStatus = (FaxStatus) o;
    return Objects.equals(this.direction, faxStatus.direction) &&
        Objects.equals(this.expectedPages, faxStatus.expectedPages) &&
        Objects.equals(this.activePage, faxStatus.activePage) &&
        Objects.equals(this.linesTransmitted, faxStatus.linesTransmitted) &&
        Objects.equals(this.bytesTransmitted, faxStatus.bytesTransmitted) &&
        Objects.equals(this.baudRate, faxStatus.baudRate) &&
        Objects.equals(this.pageErrors, faxStatus.pageErrors) &&
        Objects.equals(this.lineErrors, faxStatus.lineErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, expectedPages, activePage, linesTransmitted, bytesTransmitted, baudRate, pageErrors, lineErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxStatus {\n");
    
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

