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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PhonesReboot
 */

public class PhonesReboot  implements Serializable {
  
  private List<String> phoneIds = new ArrayList<String>();
  private String siteId = null;

  
  /**
   * The list of phone Ids to reboot.
   **/
  public PhonesReboot phoneIds(List<String> phoneIds) {
    this.phoneIds = phoneIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of phone Ids to reboot.")
  @JsonProperty("phoneIds")
  public List<String> getPhoneIds() {
    return phoneIds;
  }
  public void setPhoneIds(List<String> phoneIds) {
    this.phoneIds = phoneIds;
  }

  
  /**
   * ID of the site for which to reboot all phones at that site. no.active.edge and phone.cannot.resolve errors are ignored.
   **/
  public PhonesReboot siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the site for which to reboot all phones at that site. no.active.edge and phone.cannot.resolve errors are ignored.")
  @JsonProperty("siteId")
  public String getSiteId() {
    return siteId;
  }
  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhonesReboot phonesReboot = (PhonesReboot) o;
    return Objects.equals(this.phoneIds, phonesReboot.phoneIds) &&
        Objects.equals(this.siteId, phonesReboot.siteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneIds, siteId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhonesReboot {\n");
    
    sb.append("    phoneIds: ").append(toIndentedString(phoneIds)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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

