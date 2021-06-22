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
import java.util.Date;

import java.io.Serializable;
/**
 * TrustUpdate
 */

public class TrustUpdate  implements Serializable {
  
  private Boolean enabled = null;
  private Date dateExpired = null;

  
  /**
   * If disabled no trustee user will have access, even if they were previously added.
   **/
  public TrustUpdate enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If disabled no trustee user will have access, even if they were previously added.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The expiration date of the trust. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TrustUpdate dateExpired(Date dateExpired) {
    this.dateExpired = dateExpired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The expiration date of the trust. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateExpired")
  public Date getDateExpired() {
    return dateExpired;
  }
  public void setDateExpired(Date dateExpired) {
    this.dateExpired = dateExpired;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustUpdate trustUpdate = (TrustUpdate) o;
    return Objects.equals(this.enabled, trustUpdate.enabled) &&
        Objects.equals(this.dateExpired, trustUpdate.dateExpired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, dateExpired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustUpdate {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    dateExpired: ").append(toIndentedString(dateExpired)).append("\n");
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

