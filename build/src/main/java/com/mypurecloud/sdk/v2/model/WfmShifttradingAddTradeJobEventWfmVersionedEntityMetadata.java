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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WfmShifttradingAddTradeJobEventUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata
 */

public class WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata  implements Serializable {
  
  private Long version = null;
  private WfmShifttradingAddTradeJobEventUserReference modifiedBy = null;
  private Date dateModified = null;

  public WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata modifiedBy(WfmShifttradingAddTradeJobEventUserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public WfmShifttradingAddTradeJobEventUserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(WfmShifttradingAddTradeJobEventUserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   **/
  public WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata dateModified(Date dateModified) {
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
    WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata wfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata = (WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata) o;

    return Objects.equals(this.version, wfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata.version) &&
            Objects.equals(this.modifiedBy, wfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata.modifiedBy) &&
            Objects.equals(this.dateModified, wfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, modifiedBy, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata {\n");
    
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

