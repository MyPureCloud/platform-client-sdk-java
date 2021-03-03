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
import com.mypurecloud.sdk.v2.model.OutOfOfficeEventUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OutOfOfficeEventOutOfOffice
 */

public class OutOfOfficeEventOutOfOffice  implements Serializable {
  
  private OutOfOfficeEventUser user = null;
  private Boolean active = null;
  private Boolean indefinite = null;
  private Date startDate = null;
  private Date endDate = null;

  
  /**
   **/
  public OutOfOfficeEventOutOfOffice user(OutOfOfficeEventUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public OutOfOfficeEventUser getUser() {
    return user;
  }
  public void setUser(OutOfOfficeEventUser user) {
    this.user = user;
  }

  
  /**
   **/
  public OutOfOfficeEventOutOfOffice active(Boolean active) {
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
  public OutOfOfficeEventOutOfOffice indefinite(Boolean indefinite) {
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
  public OutOfOfficeEventOutOfOffice startDate(Date startDate) {
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
  public OutOfOfficeEventOutOfOffice endDate(Date endDate) {
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
    OutOfOfficeEventOutOfOffice outOfOfficeEventOutOfOffice = (OutOfOfficeEventOutOfOffice) o;
    return Objects.equals(this.user, outOfOfficeEventOutOfOffice.user) &&
        Objects.equals(this.active, outOfOfficeEventOutOfOffice.active) &&
        Objects.equals(this.indefinite, outOfOfficeEventOutOfOffice.indefinite) &&
        Objects.equals(this.startDate, outOfOfficeEventOutOfOffice.startDate) &&
        Objects.equals(this.endDate, outOfOfficeEventOutOfOffice.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, active, indefinite, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutOfOfficeEventOutOfOffice {\n");
    
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

