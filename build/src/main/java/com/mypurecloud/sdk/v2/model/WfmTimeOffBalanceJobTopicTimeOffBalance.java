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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmTimeOffBalanceJobTopicTimeOffBalance
 */

public class WfmTimeOffBalanceJobTopicTimeOffBalance  implements Serializable {
  
  private String activityCodeId = null;
  private String hrisTimeOffTypeId = null;
  private String hrisTimeOffTypeSecondaryId = null;
  private Date startDate = null;
  private List<Integer> balanceMinutesPerDay = new ArrayList<Integer>();

  
  /**
   **/
  public WfmTimeOffBalanceJobTopicTimeOffBalance activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   **/
  public WfmTimeOffBalanceJobTopicTimeOffBalance hrisTimeOffTypeId(String hrisTimeOffTypeId) {
    this.hrisTimeOffTypeId = hrisTimeOffTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hrisTimeOffTypeId")
  public String getHrisTimeOffTypeId() {
    return hrisTimeOffTypeId;
  }
  public void setHrisTimeOffTypeId(String hrisTimeOffTypeId) {
    this.hrisTimeOffTypeId = hrisTimeOffTypeId;
  }


  /**
   **/
  public WfmTimeOffBalanceJobTopicTimeOffBalance hrisTimeOffTypeSecondaryId(String hrisTimeOffTypeSecondaryId) {
    this.hrisTimeOffTypeSecondaryId = hrisTimeOffTypeSecondaryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hrisTimeOffTypeSecondaryId")
  public String getHrisTimeOffTypeSecondaryId() {
    return hrisTimeOffTypeSecondaryId;
  }
  public void setHrisTimeOffTypeSecondaryId(String hrisTimeOffTypeSecondaryId) {
    this.hrisTimeOffTypeSecondaryId = hrisTimeOffTypeSecondaryId;
  }


  /**
   **/
  public WfmTimeOffBalanceJobTopicTimeOffBalance startDate(Date startDate) {
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
  public WfmTimeOffBalanceJobTopicTimeOffBalance balanceMinutesPerDay(List<Integer> balanceMinutesPerDay) {
    this.balanceMinutesPerDay = balanceMinutesPerDay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("balanceMinutesPerDay")
  public List<Integer> getBalanceMinutesPerDay() {
    return balanceMinutesPerDay;
  }
  public void setBalanceMinutesPerDay(List<Integer> balanceMinutesPerDay) {
    this.balanceMinutesPerDay = balanceMinutesPerDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmTimeOffBalanceJobTopicTimeOffBalance wfmTimeOffBalanceJobTopicTimeOffBalance = (WfmTimeOffBalanceJobTopicTimeOffBalance) o;

    return Objects.equals(this.activityCodeId, wfmTimeOffBalanceJobTopicTimeOffBalance.activityCodeId) &&
            Objects.equals(this.hrisTimeOffTypeId, wfmTimeOffBalanceJobTopicTimeOffBalance.hrisTimeOffTypeId) &&
            Objects.equals(this.hrisTimeOffTypeSecondaryId, wfmTimeOffBalanceJobTopicTimeOffBalance.hrisTimeOffTypeSecondaryId) &&
            Objects.equals(this.startDate, wfmTimeOffBalanceJobTopicTimeOffBalance.startDate) &&
            Objects.equals(this.balanceMinutesPerDay, wfmTimeOffBalanceJobTopicTimeOffBalance.balanceMinutesPerDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, hrisTimeOffTypeId, hrisTimeOffTypeSecondaryId, startDate, balanceMinutesPerDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmTimeOffBalanceJobTopicTimeOffBalance {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    hrisTimeOffTypeId: ").append(toIndentedString(hrisTimeOffTypeId)).append("\n");
    sb.append("    hrisTimeOffTypeSecondaryId: ").append(toIndentedString(hrisTimeOffTypeSecondaryId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    balanceMinutesPerDay: ").append(toIndentedString(balanceMinutesPerDay)).append("\n");
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

