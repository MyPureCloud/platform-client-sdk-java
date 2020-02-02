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
 * OAuthLastTokenIssued
 */

public class OAuthLastTokenIssued  implements Serializable {
  
  private Date dateIssued = null;

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public OAuthLastTokenIssued dateIssued(Date dateIssued) {
    this.dateIssued = dateIssued;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateIssued")
  public Date getDateIssued() {
    return dateIssued;
  }
  public void setDateIssued(Date dateIssued) {
    this.dateIssued = dateIssued;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthLastTokenIssued oAuthLastTokenIssued = (OAuthLastTokenIssued) o;
    return Objects.equals(this.dateIssued, oAuthLastTokenIssued.dateIssued);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateIssued);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthLastTokenIssued {\n");
    
    sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
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

