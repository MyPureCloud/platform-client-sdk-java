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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.MuRescheduleResultWrapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuRescheduleAgentScheduleResult
 */

public class BuRescheduleAgentScheduleResult  implements Serializable {
  
  private ManagementUnitReference managementUnit = null;
  private MuRescheduleResultWrapper downloadResult = null;
  private String downloadUrl = null;

  
  /**
   * The management unit to which this part of the result applies
   **/
  public BuRescheduleAgentScheduleResult managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management unit to which this part of the result applies")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }

  
  /**
   * The agent schedules.  Result will always come via the downloadUrl; however the schema is included for documentation
   **/
  public BuRescheduleAgentScheduleResult downloadResult(MuRescheduleResultWrapper downloadResult) {
    this.downloadResult = downloadResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent schedules.  Result will always come via the downloadUrl; however the schema is included for documentation")
  @JsonProperty("downloadResult")
  public MuRescheduleResultWrapper getDownloadResult() {
    return downloadResult;
  }
  public void setDownloadResult(MuRescheduleResultWrapper downloadResult) {
    this.downloadResult = downloadResult;
  }

  
  /**
   * The download URL from which to fetch the result
   **/
  public BuRescheduleAgentScheduleResult downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The download URL from which to fetch the result")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuRescheduleAgentScheduleResult buRescheduleAgentScheduleResult = (BuRescheduleAgentScheduleResult) o;
    return Objects.equals(this.managementUnit, buRescheduleAgentScheduleResult.managementUnit) &&
        Objects.equals(this.downloadResult, buRescheduleAgentScheduleResult.downloadResult) &&
        Objects.equals(this.downloadUrl, buRescheduleAgentScheduleResult.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnit, downloadResult, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuRescheduleAgentScheduleResult {\n");
    
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    downloadResult: ").append(toIndentedString(downloadResult)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

