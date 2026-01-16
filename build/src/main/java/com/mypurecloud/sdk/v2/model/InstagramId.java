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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.InstagramScopedId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * User information for an Instagram account
 */
@ApiModel(description = "User information for an Instagram account")

public class InstagramId  implements Serializable {
  
  private List<InstagramScopedId> ids = null;
  private String displayName = null;
  private String handle = null;

  public InstagramId() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      ids = new ArrayList<InstagramScopedId>();
    }
  }

  
  /**
   * The set of scopedIds that this person has. Each scopedId is specific to an Instagram page or app that the user interacts with. Max 1 id.
   **/
  public InstagramId ids(List<InstagramScopedId> ids) {
    this.ids = ids;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The set of scopedIds that this person has. Each scopedId is specific to an Instagram page or app that the user interacts with. Max 1 id.")
  @JsonProperty("ids")
  public List<InstagramScopedId> getIds() {
    return ids;
  }
  public void setIds(List<InstagramScopedId> ids) {
    this.ids = ids;
  }


  /**
   * The displayName of the person who owns this Instagram account. Max: 100 characters.
   **/
  public InstagramId displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The displayName of the person who owns this Instagram account. Max: 100 characters.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * The handle of the person who owns this Instagram account. Max: 100 characters.
   **/
  public InstagramId handle(String handle) {
    this.handle = handle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The handle of the person who owns this Instagram account. Max: 100 characters.")
  @JsonProperty("handle")
  public String getHandle() {
    return handle;
  }
  public void setHandle(String handle) {
    this.handle = handle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstagramId instagramId = (InstagramId) o;

    return Objects.equals(this.ids, instagramId.ids) &&
            Objects.equals(this.displayName, instagramId.displayName) &&
            Objects.equals(this.handle, instagramId.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, displayName, handle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstagramId {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
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

