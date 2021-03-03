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
 * Marker to indicate an approved full day time off request
 */
@ApiModel(description = "Marker to indicate an approved full day time off request")

public class UserScheduleFullDayTimeOffMarker  implements Serializable {
  
  private String managementUnitDate = null;
  private String activityCodeId = null;
  private Boolean isPaid = null;
  private Integer lengthInMinutes = null;
  private String description = null;
  private Boolean delete = null;

  
  /**
   * The date associated with the time off request that this marker corresponds to.  Date only, in ISO-8601 format.
   **/
  public UserScheduleFullDayTimeOffMarker managementUnitDate(String managementUnitDate) {
    this.managementUnitDate = managementUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date associated with the time off request that this marker corresponds to.  Date only, in ISO-8601 format.")
  @JsonProperty("managementUnitDate")
  public String getManagementUnitDate() {
    return managementUnitDate;
  }
  public void setManagementUnitDate(String managementUnitDate) {
    this.managementUnitDate = managementUnitDate;
  }

  
  /**
   * The id for the activity code.  Look up a map of activity codes with the activities route
   **/
  public UserScheduleFullDayTimeOffMarker activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id for the activity code.  Look up a map of activity codes with the activities route")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   * Whether this is paid time off
   **/
  public UserScheduleFullDayTimeOffMarker isPaid(Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this is paid time off")
  @JsonProperty("isPaid")
  public Boolean getIsPaid() {
    return isPaid;
  }
  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }

  
  /**
   * The length in minutes of this time off marker
   **/
  public UserScheduleFullDayTimeOffMarker lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length in minutes of this time off marker")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }

  
  /**
   * The description associated with the time off request that this marker corresponds to
   **/
  public UserScheduleFullDayTimeOffMarker description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description associated with the time off request that this marker corresponds to")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * If marked true for updating an existing full day time off marker, it will be deleted
   **/
  public UserScheduleFullDayTimeOffMarker delete(Boolean delete) {
    this.delete = delete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If marked true for updating an existing full day time off marker, it will be deleted")
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }
  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserScheduleFullDayTimeOffMarker userScheduleFullDayTimeOffMarker = (UserScheduleFullDayTimeOffMarker) o;
    return Objects.equals(this.managementUnitDate, userScheduleFullDayTimeOffMarker.managementUnitDate) &&
        Objects.equals(this.activityCodeId, userScheduleFullDayTimeOffMarker.activityCodeId) &&
        Objects.equals(this.isPaid, userScheduleFullDayTimeOffMarker.isPaid) &&
        Objects.equals(this.lengthInMinutes, userScheduleFullDayTimeOffMarker.lengthInMinutes) &&
        Objects.equals(this.description, userScheduleFullDayTimeOffMarker.description) &&
        Objects.equals(this.delete, userScheduleFullDayTimeOffMarker.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitDate, activityCodeId, isPaid, lengthInMinutes, description, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserScheduleFullDayTimeOffMarker {\n");
    
    sb.append("    managementUnitDate: ").append(toIndentedString(managementUnitDate)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

