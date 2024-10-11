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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DivisionEntityRef
 */

public class DivisionEntityRef  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String selfUri = null;
  private Date dateDivisionUpdated = null;

  
  /**
   **/
  public DivisionEntityRef id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public DivisionEntityRef name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public DivisionEntityRef selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   * The time the entity division was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DivisionEntityRef dateDivisionUpdated(Date dateDivisionUpdated) {
    this.dateDivisionUpdated = dateDivisionUpdated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the entity division was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDivisionUpdated")
  public Date getDateDivisionUpdated() {
    return dateDivisionUpdated;
  }
  public void setDateDivisionUpdated(Date dateDivisionUpdated) {
    this.dateDivisionUpdated = dateDivisionUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DivisionEntityRef divisionEntityRef = (DivisionEntityRef) o;

    return Objects.equals(this.id, divisionEntityRef.id) &&
            Objects.equals(this.name, divisionEntityRef.name) &&
            Objects.equals(this.selfUri, divisionEntityRef.selfUri) &&
            Objects.equals(this.dateDivisionUpdated, divisionEntityRef.dateDivisionUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, selfUri, dateDivisionUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DivisionEntityRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    dateDivisionUpdated: ").append(toIndentedString(dateDivisionUpdated)).append("\n");
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

