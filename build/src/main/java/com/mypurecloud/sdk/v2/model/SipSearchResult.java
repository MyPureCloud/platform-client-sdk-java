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
import com.mypurecloud.sdk.v2.model.HomerRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SipSearchResult
 */

public class SipSearchResult  implements Serializable {
  
  private String id = null;
  private Integer status = null;
  private String sid = null;
  private String auth = null;
  private String message = null;
  private List<HomerRecord> data = new ArrayList<HomerRecord>();
  private Integer count = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Status of the search request
   **/
  public SipSearchResult status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of the search request")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Session id associated to the search request
   **/
  public SipSearchResult sid(String sid) {
    this.sid = sid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session id associated to the search request")
  @JsonProperty("sid")
  public String getSid() {
    return sid;
  }
  public void setSid(String sid) {
    this.sid = sid;
  }

  
  /**
   * Auth token used for this search request
   **/
  public SipSearchResult auth(String auth) {
    this.auth = auth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Auth token used for this search request")
  @JsonProperty("auth")
  public String getAuth() {
    return auth;
  }
  public void setAuth(String auth) {
    this.auth = auth;
  }

  
  /**
   * Any messages returned from homer as part of the response
   **/
  public SipSearchResult message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any messages returned from homer as part of the response")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Homer search data that is returned
   **/
  public SipSearchResult data(List<HomerRecord> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Homer search data that is returned")
  @JsonProperty("data")
  public List<HomerRecord> getData() {
    return data;
  }
  public void setData(List<HomerRecord> data) {
    this.data = data;
  }

  
  /**
   * Number of records returned
   **/
  public SipSearchResult count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of records returned")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipSearchResult sipSearchResult = (SipSearchResult) o;
    return Objects.equals(this.id, sipSearchResult.id) &&
        Objects.equals(this.status, sipSearchResult.status) &&
        Objects.equals(this.sid, sipSearchResult.sid) &&
        Objects.equals(this.auth, sipSearchResult.auth) &&
        Objects.equals(this.message, sipSearchResult.message) &&
        Objects.equals(this.data, sipSearchResult.data) &&
        Objects.equals(this.count, sipSearchResult.count) &&
        Objects.equals(this.selfUri, sipSearchResult.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, sid, auth, message, data, count, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipSearchResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

