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
 * UpdateNotificationResponse
 */

public class UpdateNotificationResponse  implements Serializable {
  
  private String mutableGroupId = null;
  private String id = null;

  
  /**
   * The mutableGroupId of the notification
   **/
  public UpdateNotificationResponse mutableGroupId(String mutableGroupId) {
    this.mutableGroupId = mutableGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The mutableGroupId of the notification")
  @JsonProperty("mutableGroupId")
  public String getMutableGroupId() {
    return mutableGroupId;
  }
  public void setMutableGroupId(String mutableGroupId) {
    this.mutableGroupId = mutableGroupId;
  }

  
  /**
   * The id of the notification for mapping the potentially new mutableGroupId
   **/
  public UpdateNotificationResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the notification for mapping the potentially new mutableGroupId")
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
    UpdateNotificationResponse updateNotificationResponse = (UpdateNotificationResponse) o;
    return Objects.equals(this.mutableGroupId, updateNotificationResponse.mutableGroupId) &&
        Objects.equals(this.id, updateNotificationResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mutableGroupId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNotificationResponse {\n");
    
    sb.append("    mutableGroupId: ").append(toIndentedString(mutableGroupId)).append("\n");
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

