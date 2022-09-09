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
 * AppendToDncActionSettings
 */

public class AppendToDncActionSettings  implements Serializable {
  
  private Boolean expire = null;
  private String expirationDuration = null;

  
  /**
   * Whether to expire the record appended to the DNC list.
   **/
  public AppendToDncActionSettings expire(Boolean expire) {
    this.expire = expire;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to expire the record appended to the DNC list.")
  @JsonProperty("expire")
  public Boolean getExpire() {
    return expire;
  }
  public void setExpire(Boolean expire) {
    this.expire = expire;
  }


  /**
   * If 'expire' is set to true, how long to keep the record.
   **/
  public AppendToDncActionSettings expirationDuration(String expirationDuration) {
    this.expirationDuration = expirationDuration;
    return this;
  }
  
  @ApiModelProperty(example = "P19DT15H13M", value = "If 'expire' is set to true, how long to keep the record.")
  @JsonProperty("expirationDuration")
  public String getExpirationDuration() {
    return expirationDuration;
  }
  public void setExpirationDuration(String expirationDuration) {
    this.expirationDuration = expirationDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendToDncActionSettings appendToDncActionSettings = (AppendToDncActionSettings) o;

    return Objects.equals(this.expire, appendToDncActionSettings.expire) &&
            Objects.equals(this.expirationDuration, appendToDncActionSettings.expirationDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expire, expirationDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendToDncActionSettings {\n");
    
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
    sb.append("    expirationDuration: ").append(toIndentedString(expirationDuration)).append("\n");
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

