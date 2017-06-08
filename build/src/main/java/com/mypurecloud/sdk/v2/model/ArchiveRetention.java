package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ArchiveRetention
 */

public class ArchiveRetention  implements Serializable {
  
  private Integer days = null;

  /**
   * Gets or Sets storageMedium
   */
  public enum StorageMediumEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CLOUDARCHIVE("CLOUDARCHIVE");

    private String value;

    StorageMediumEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StorageMediumEnum fromString(String key) {
      if (key == null) return null;

      for (StorageMediumEnum value : StorageMediumEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StorageMediumEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StorageMediumEnum storageMedium = null;

  
  /**
   **/
  public ArchiveRetention days(Integer days) {
    this.days = days;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }
  public void setDays(Integer days) {
    this.days = days;
  }

  
  /**
   **/
  public ArchiveRetention storageMedium(StorageMediumEnum storageMedium) {
    this.storageMedium = storageMedium;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("storageMedium")
  public StorageMediumEnum getStorageMedium() {
    return storageMedium;
  }
  public void setStorageMedium(StorageMediumEnum storageMedium) {
    this.storageMedium = storageMedium;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveRetention archiveRetention = (ArchiveRetention) o;
    return Objects.equals(this.days, archiveRetention.days) &&
        Objects.equals(this.storageMedium, archiveRetention.storageMedium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, storageMedium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveRetention {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    storageMedium: ").append(toIndentedString(storageMedium)).append("\n");
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

