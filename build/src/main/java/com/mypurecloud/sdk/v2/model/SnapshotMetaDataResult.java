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
import com.mypurecloud.sdk.v2.model.SnapshotInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SnapshotMetaDataResult
 */

public class SnapshotMetaDataResult  implements Serializable {
  
  private SnapshotInfo snapshotInfo = null;
  private Date dateForecastStart = null;

  
  /**
   * Information about the snapshot
   **/
  public SnapshotMetaDataResult snapshotInfo(SnapshotInfo snapshotInfo) {
    this.snapshotInfo = snapshotInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the snapshot")
  @JsonProperty("snapshotInfo")
  public SnapshotInfo getSnapshotInfo() {
    return snapshotInfo;
  }
  public void setSnapshotInfo(SnapshotInfo snapshotInfo) {
    this.snapshotInfo = snapshotInfo;
  }


  /**
   * Start date of the forecast. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SnapshotMetaDataResult dateForecastStart(Date dateForecastStart) {
    this.dateForecastStart = dateForecastStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start date of the forecast. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateForecastStart")
  public Date getDateForecastStart() {
    return dateForecastStart;
  }
  public void setDateForecastStart(Date dateForecastStart) {
    this.dateForecastStart = dateForecastStart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotMetaDataResult snapshotMetaDataResult = (SnapshotMetaDataResult) o;

    return Objects.equals(this.snapshotInfo, snapshotMetaDataResult.snapshotInfo) &&
            Objects.equals(this.dateForecastStart, snapshotMetaDataResult.dateForecastStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotInfo, dateForecastStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotMetaDataResult {\n");
    
    sb.append("    snapshotInfo: ").append(toIndentedString(snapshotInfo)).append("\n");
    sb.append("    dateForecastStart: ").append(toIndentedString(dateForecastStart)).append("\n");
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

