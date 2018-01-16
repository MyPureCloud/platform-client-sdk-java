package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationWorkspace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OutOfOfficeNotification
 */

public class OutOfOfficeNotification  implements Serializable {
  
  private DocumentDataV2NotificationWorkspace user = null;
  private Boolean active = null;
  private Boolean indefinite = null;
  private Date startDate = null;
  private Date endDate = null;

  
  /**
   **/
  public OutOfOfficeNotification user(DocumentDataV2NotificationWorkspace user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DocumentDataV2NotificationWorkspace getUser() {
    return user;
  }
  public void setUser(DocumentDataV2NotificationWorkspace user) {
    this.user = user;
  }

  
  /**
   **/
  public OutOfOfficeNotification active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   **/
  public OutOfOfficeNotification indefinite(Boolean indefinite) {
    this.indefinite = indefinite;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("indefinite")
  public Boolean getIndefinite() {
    return indefinite;
  }
  public void setIndefinite(Boolean indefinite) {
    this.indefinite = indefinite;
  }

  
  /**
   **/
  public OutOfOfficeNotification startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  public OutOfOfficeNotification endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutOfOfficeNotification outOfOfficeNotification = (OutOfOfficeNotification) o;
    return Objects.equals(this.user, outOfOfficeNotification.user) &&
        Objects.equals(this.active, outOfOfficeNotification.active) &&
        Objects.equals(this.indefinite, outOfOfficeNotification.indefinite) &&
        Objects.equals(this.startDate, outOfOfficeNotification.startDate) &&
        Objects.equals(this.endDate, outOfOfficeNotification.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, active, indefinite, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutOfOfficeNotification {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    indefinite: ").append(toIndentedString(indefinite)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

