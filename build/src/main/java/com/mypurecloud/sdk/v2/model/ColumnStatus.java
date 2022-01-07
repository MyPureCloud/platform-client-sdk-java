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
 * ColumnStatus
 */

public class ColumnStatus  implements Serializable {
  
  private Boolean contactable = null;

  
  /**
   * Indicates whether or not an individual contact method column is contactable.
   **/
  public ColumnStatus contactable(Boolean contactable) {
    this.contactable = contactable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not an individual contact method column is contactable.")
  @JsonProperty("contactable")
  public Boolean getContactable() {
    return contactable;
  }
  public void setContactable(Boolean contactable) {
    this.contactable = contactable;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnStatus columnStatus = (ColumnStatus) o;
    return Objects.equals(this.contactable, columnStatus.contactable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnStatus {\n");
    
    sb.append("    contactable: ").append(toIndentedString(contactable)).append("\n");
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

