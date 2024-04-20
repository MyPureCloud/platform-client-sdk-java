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

import java.io.Serializable;
/**
 * The settings for User Video
 */
@ApiModel(description = "The settings for User Video")

public class UserVideoSettings  implements Serializable {
  
  private Boolean allowCamera = null;
  private Boolean allowScreenShare = null;

  
  /**
   * whether or not user camera is allowed
   **/
  public UserVideoSettings allowCamera(Boolean allowCamera) {
    this.allowCamera = allowCamera;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "whether or not user camera is allowed")
  @JsonProperty("allowCamera")
  public Boolean getAllowCamera() {
    return allowCamera;
  }
  public void setAllowCamera(Boolean allowCamera) {
    this.allowCamera = allowCamera;
  }


  /**
   * whether or not user screen share is allowed
   **/
  public UserVideoSettings allowScreenShare(Boolean allowScreenShare) {
    this.allowScreenShare = allowScreenShare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "whether or not user screen share is allowed")
  @JsonProperty("allowScreenShare")
  public Boolean getAllowScreenShare() {
    return allowScreenShare;
  }
  public void setAllowScreenShare(Boolean allowScreenShare) {
    this.allowScreenShare = allowScreenShare;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserVideoSettings userVideoSettings = (UserVideoSettings) o;

    return Objects.equals(this.allowCamera, userVideoSettings.allowCamera) &&
            Objects.equals(this.allowScreenShare, userVideoSettings.allowScreenShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCamera, allowScreenShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVideoSettings {\n");
    
    sb.append("    allowCamera: ").append(toIndentedString(allowCamera)).append("\n");
    sb.append("    allowScreenShare: ").append(toIndentedString(allowScreenShare)).append("\n");
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

