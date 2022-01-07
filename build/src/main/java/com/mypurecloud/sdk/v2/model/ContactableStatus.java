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
import com.mypurecloud.sdk.v2.model.ColumnStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ContactableStatus
 */

public class ContactableStatus  implements Serializable {
  
  private Boolean contactable = null;
  private Map<String, ColumnStatus> columnStatus = null;

  
  /**
   * Indicates whether or not the entire contact is contactable for the associated media type.
   **/
  public ContactableStatus contactable(Boolean contactable) {
    this.contactable = contactable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not the entire contact is contactable for the associated media type.")
  @JsonProperty("contactable")
  public Boolean getContactable() {
    return contactable;
  }
  public void setContactable(Boolean contactable) {
    this.contactable = contactable;
  }

  
  /**
   * A map of individual contact method columns to whether the individual column is contactable for the associated media type.
   **/
  public ContactableStatus columnStatus(Map<String, ColumnStatus> columnStatus) {
    this.columnStatus = columnStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map of individual contact method columns to whether the individual column is contactable for the associated media type.")
  @JsonProperty("columnStatus")
  public Map<String, ColumnStatus> getColumnStatus() {
    return columnStatus;
  }
  public void setColumnStatus(Map<String, ColumnStatus> columnStatus) {
    this.columnStatus = columnStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactableStatus contactableStatus = (ContactableStatus) o;
    return Objects.equals(this.contactable, contactableStatus.contactable) &&
        Objects.equals(this.columnStatus, contactableStatus.columnStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactable, columnStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactableStatus {\n");
    
    sb.append("    contactable: ").append(toIndentedString(contactable)).append("\n");
    sb.append("    columnStatus: ").append(toIndentedString(columnStatus)).append("\n");
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

