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
import com.mypurecloud.sdk.v2.model.FabricTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V3SynchronizationUploadMetadata
 */

public class V3SynchronizationUploadMetadata  implements Serializable {
  
  private String originUri = null;
  private List<FabricTag> tags = null;

  public V3SynchronizationUploadMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      tags = new ArrayList<FabricTag>();
    }
  }

  public V3SynchronizationUploadMetadata(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      tags = new ArrayList<FabricTag>();
    }
  }

  
  /**
   * The origin URI of the file to upload
   **/
  public V3SynchronizationUploadMetadata originUri(String originUri) {
    this.originUri = originUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The origin URI of the file to upload")
  @JsonProperty("originUri")
  public String getOriginUri() {
    return originUri;
  }
  public void setOriginUri(String originUri) {
    this.originUri = originUri;
  }


  /**
   * List of tags that is used for filtering
   **/
  public V3SynchronizationUploadMetadata tags(List<FabricTag> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of tags that is used for filtering")
  @JsonProperty("tags")
  public List<FabricTag> getTags() {
    return tags;
  }
  public void setTags(List<FabricTag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SynchronizationUploadMetadata v3SynchronizationUploadMetadata = (V3SynchronizationUploadMetadata) o;

    return Objects.equals(this.originUri, v3SynchronizationUploadMetadata.originUri) &&
            Objects.equals(this.tags, v3SynchronizationUploadMetadata.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originUri, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SynchronizationUploadMetadata {\n");
    
    sb.append("    originUri: ").append(toIndentedString(originUri)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

