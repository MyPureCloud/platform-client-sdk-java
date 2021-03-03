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
 * Scoped ID for a Facebook user interacting with a page or app
 */
@ApiModel(description = "Scoped ID for a Facebook user interacting with a page or app")

public class FacebookScopedId  implements Serializable {
  
  private String scopedId = null;

  
  /**
   * The unique page/app-specific scopedId for the user
   **/
  public FacebookScopedId scopedId(String scopedId) {
    this.scopedId = scopedId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique page/app-specific scopedId for the user")
  @JsonProperty("scopedId")
  public String getScopedId() {
    return scopedId;
  }
  public void setScopedId(String scopedId) {
    this.scopedId = scopedId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacebookScopedId facebookScopedId = (FacebookScopedId) o;
    return Objects.equals(this.scopedId, facebookScopedId.scopedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookScopedId {\n");
    
    sb.append("    scopedId: ").append(toIndentedString(scopedId)).append("\n");
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

