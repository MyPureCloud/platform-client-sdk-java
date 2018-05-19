package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Channel
 */

public class Channel  implements Serializable {
  
  private String connectUri = null;
  private String id = null;

  
  /**
   **/
  public Channel connectUri(String connectUri) {
    this.connectUri = connectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connectUri")
  public String getConnectUri() {
    return connectUri;
  }
  public void setConnectUri(String connectUri) {
    this.connectUri = connectUri;
  }

  
  /**
   **/
  public Channel id(String id) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Channel channel = (Channel) o;
    return Objects.equals(this.connectUri, channel.connectUri) &&
        Objects.equals(this.id, channel.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectUri, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Channel {\n");
    
    sb.append("    connectUri: ").append(toIndentedString(connectUri)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

