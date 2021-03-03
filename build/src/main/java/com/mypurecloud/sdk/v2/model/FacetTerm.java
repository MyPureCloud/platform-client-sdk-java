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
 * FacetTerm
 */

public class FacetTerm  implements Serializable {
  
  private String term = null;
  private Long key = null;
  private String id = null;
  private String name = null;
  private Long count = null;
  private Date time = null;

  
  /**
   **/
  public FacetTerm term(String term) {
    this.term = term;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }
  public void setTerm(String term) {
    this.term = term;
  }

  
  /**
   **/
  public FacetTerm key(Long key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("key")
  public Long getKey() {
    return key;
  }
  public void setKey(Long key) {
    this.key = key;
  }

  
  /**
   **/
  public FacetTerm id(String id) {
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
  public FacetTerm name(String name) {
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
  public FacetTerm count(Long count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FacetTerm time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetTerm facetTerm = (FacetTerm) o;
    return Objects.equals(this.term, facetTerm.term) &&
        Objects.equals(this.key, facetTerm.key) &&
        Objects.equals(this.id, facetTerm.id) &&
        Objects.equals(this.name, facetTerm.name) &&
        Objects.equals(this.count, facetTerm.count) &&
        Objects.equals(this.time, facetTerm.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, key, id, name, count, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetTerm {\n");
    
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

