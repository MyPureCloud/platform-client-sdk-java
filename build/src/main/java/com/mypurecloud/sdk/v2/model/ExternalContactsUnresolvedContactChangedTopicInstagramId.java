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
import com.mypurecloud.sdk.v2.model.ExternalContactsUnresolvedContactChangedTopicInstagramScopedId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ExternalContactsUnresolvedContactChangedTopicInstagramId
 */

public class ExternalContactsUnresolvedContactChangedTopicInstagramId  implements Serializable {
  
  private List<ExternalContactsUnresolvedContactChangedTopicInstagramScopedId> ids = null;
  private String displayName = null;
  private String handle = null;

  public ExternalContactsUnresolvedContactChangedTopicInstagramId() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      ids = new ArrayList<ExternalContactsUnresolvedContactChangedTopicInstagramScopedId>();
    }
  }

  
  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicInstagramId ids(List<ExternalContactsUnresolvedContactChangedTopicInstagramScopedId> ids) {
    this.ids = ids;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ids")
  public List<ExternalContactsUnresolvedContactChangedTopicInstagramScopedId> getIds() {
    return ids;
  }
  public void setIds(List<ExternalContactsUnresolvedContactChangedTopicInstagramScopedId> ids) {
    this.ids = ids;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicInstagramId displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicInstagramId handle(String handle) {
    this.handle = handle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    ExternalContactsUnresolvedContactChangedTopicInstagramId externalContactsUnresolvedContactChangedTopicInstagramId = (ExternalContactsUnresolvedContactChangedTopicInstagramId) o;

    return Objects.equals(this.ids, externalContactsUnresolvedContactChangedTopicInstagramId.ids) &&
            Objects.equals(this.displayName, externalContactsUnresolvedContactChangedTopicInstagramId.displayName) &&
            Objects.equals(this.handle, externalContactsUnresolvedContactChangedTopicInstagramId.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, displayName, handle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsUnresolvedContactChangedTopicInstagramId {\n");
    
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

