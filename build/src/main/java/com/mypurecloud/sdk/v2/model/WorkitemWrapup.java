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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WorkitemReference;
import com.mypurecloud.sdk.v2.model.WrapupIdReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WorkitemWrapup
 */

public class WorkitemWrapup  implements Serializable {
  
  private WorkitemReference workitem = null;
  private WrapupIdReference wrapupCode = null;
  private UserReference modifiedBy = null;
  private UserReference user = null;
  private Date dateModified = null;

  
  /**
   * Workitem that the wrapup code has been added to.
   **/
  public WorkitemWrapup workitem(WorkitemReference workitem) {
    this.workitem = workitem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Workitem that the wrapup code has been added to.")
  @JsonProperty("workitem")
  public WorkitemReference getWorkitem() {
    return workitem;
  }
  public void setWorkitem(WorkitemReference workitem) {
    this.workitem = workitem;
  }


  /**
   * The wrapup code used in the workitem.
   **/
  public WorkitemWrapup wrapupCode(WrapupIdReference wrapupCode) {
    this.wrapupCode = wrapupCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The wrapup code used in the workitem.")
  @JsonProperty("wrapupCode")
  public WrapupIdReference getWrapupCode() {
    return wrapupCode;
  }
  public void setWrapupCode(WrapupIdReference wrapupCode) {
    this.wrapupCode = wrapupCode;
  }


  /**
   * The user who added the wrapup code to the workitem.
   **/
  public WorkitemWrapup modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who added the wrapup code to the workitem.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The user for whom wrapup code was added. This may be the same as modifiedBy.
   **/
  public WorkitemWrapup user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user for whom wrapup code was added. This may be the same as modifiedBy.")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The modified date of the Workitem when the wrapup code was added. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WorkitemWrapup dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The modified date of the Workitem when the wrapup code was added. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemWrapup workitemWrapup = (WorkitemWrapup) o;

    return Objects.equals(this.workitem, workitemWrapup.workitem) &&
            Objects.equals(this.wrapupCode, workitemWrapup.wrapupCode) &&
            Objects.equals(this.modifiedBy, workitemWrapup.modifiedBy) &&
            Objects.equals(this.user, workitemWrapup.user) &&
            Objects.equals(this.dateModified, workitemWrapup.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workitem, wrapupCode, modifiedBy, user, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemWrapup {\n");
    
    sb.append("    workitem: ").append(toIndentedString(workitem)).append("\n");
    sb.append("    wrapupCode: ").append(toIndentedString(wrapupCode)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

