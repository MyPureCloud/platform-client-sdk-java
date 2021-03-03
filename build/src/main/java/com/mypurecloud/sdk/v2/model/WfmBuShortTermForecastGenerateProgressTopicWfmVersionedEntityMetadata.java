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
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastGenerateProgressTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata
 */

public class WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata  implements Serializable {
  
  private Integer version = null;
  private WfmBuShortTermForecastGenerateProgressTopicUserReference modifiedBy = null;
  private Date dateModified = null;

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata modifiedBy(WfmBuShortTermForecastGenerateProgressTopicUserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public WfmBuShortTermForecastGenerateProgressTopicUserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(WfmBuShortTermForecastGenerateProgressTopicUserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata wfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata = (WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata) o;
    return Objects.equals(this.version, wfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata.version) &&
        Objects.equals(this.modifiedBy, wfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata.modifiedBy) &&
        Objects.equals(this.dateModified, wfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, modifiedBy, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

