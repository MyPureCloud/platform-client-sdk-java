package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListFilterNotificationRange
 */

public class ContactListFilterNotificationRange  implements Serializable {
  
  private String gt = null;
  private String gte = null;
  private String lt = null;
  private String lte = null;
  private List<String> inSet = new ArrayList<String>();
  private Object additionalProperties = null;

  
  /**
   **/
  public ContactListFilterNotificationRange gt(String gt) {
    this.gt = gt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("gt")
  public String getGt() {
    return gt;
  }
  public void setGt(String gt) {
    this.gt = gt;
  }


  /**
   **/
  public ContactListFilterNotificationRange gte(String gte) {
    this.gte = gte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("gte")
  public String getGte() {
    return gte;
  }
  public void setGte(String gte) {
    this.gte = gte;
  }


  /**
   **/
  public ContactListFilterNotificationRange lt(String lt) {
    this.lt = lt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lt")
  public String getLt() {
    return lt;
  }
  public void setLt(String lt) {
    this.lt = lt;
  }


  /**
   **/
  public ContactListFilterNotificationRange lte(String lte) {
    this.lte = lte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lte")
  public String getLte() {
    return lte;
  }
  public void setLte(String lte) {
    this.lte = lte;
  }


  /**
   **/
  public ContactListFilterNotificationRange inSet(List<String> inSet) {
    this.inSet = inSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inSet")
  public List<String> getInSet() {
    return inSet;
  }
  public void setInSet(List<String> inSet) {
    this.inSet = inSet;
  }


  /**
   **/
  public ContactListFilterNotificationRange additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListFilterNotificationRange contactListFilterNotificationRange = (ContactListFilterNotificationRange) o;
    return Objects.equals(this.gt, contactListFilterNotificationRange.gt) &&
        Objects.equals(this.gte, contactListFilterNotificationRange.gte) &&
        Objects.equals(this.lt, contactListFilterNotificationRange.lt) &&
        Objects.equals(this.lte, contactListFilterNotificationRange.lte) &&
        Objects.equals(this.inSet, contactListFilterNotificationRange.inSet) &&
        Objects.equals(this.additionalProperties, contactListFilterNotificationRange.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gt, gte, lt, lte, inSet, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListFilterNotificationRange {\n");
    
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    inSet: ").append(toIndentedString(inSet)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

