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
import com.mypurecloud.sdk.v2.model.FacebookScopedId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * User information for a Facebook user interacting with a page or app
 */
@ApiModel(description = "User information for a Facebook user interacting with a page or app")

public class FacebookId  implements Serializable {
  
  private List<FacebookScopedId> ids = new ArrayList<FacebookScopedId>();
  private String displayName = null;

  
  /**
   * The set of scopedIds that this person has. Each scopedId is specific to a page or app that the user interacts with.
   **/
  public FacebookId ids(List<FacebookScopedId> ids) {
    this.ids = ids;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of scopedIds that this person has. Each scopedId is specific to a page or app that the user interacts with.")
  @JsonProperty("ids")
  public List<FacebookScopedId> getIds() {
    return ids;
  }
  public void setIds(List<FacebookScopedId> ids) {
    this.ids = ids;
  }

  
  /**
   * The displayName of this person's Facebook account. Roughly translates to user.first_name + ' ' + user.last_name in the Facebook API.
   **/
  public FacebookId displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The displayName of this person's Facebook account. Roughly translates to user.first_name + ' ' + user.last_name in the Facebook API.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacebookId facebookId = (FacebookId) o;
    return Objects.equals(this.ids, facebookId.ids) &&
        Objects.equals(this.displayName, facebookId.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookId {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

