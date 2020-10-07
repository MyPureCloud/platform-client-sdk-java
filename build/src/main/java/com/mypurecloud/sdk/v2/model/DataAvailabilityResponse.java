package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DataAvailabilityResponse
 */

public class DataAvailabilityResponse  implements Serializable {
  
  private Date dataAvailabilityDate = null;

  
  /**
   * Date and time before which data is guaranteed to be available in the datalake. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public DataAvailabilityResponse dataAvailabilityDate(Date dataAvailabilityDate) {
    this.dataAvailabilityDate = dataAvailabilityDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time before which data is guaranteed to be available in the datalake. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dataAvailabilityDate")
  public Date getDataAvailabilityDate() {
    return dataAvailabilityDate;
  }
  public void setDataAvailabilityDate(Date dataAvailabilityDate) {
    this.dataAvailabilityDate = dataAvailabilityDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataAvailabilityResponse dataAvailabilityResponse = (DataAvailabilityResponse) o;
    return Objects.equals(this.dataAvailabilityDate, dataAvailabilityResponse.dataAvailabilityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAvailabilityDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataAvailabilityResponse {\n");
    
    sb.append("    dataAvailabilityDate: ").append(toIndentedString(dataAvailabilityDate)).append("\n");
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

