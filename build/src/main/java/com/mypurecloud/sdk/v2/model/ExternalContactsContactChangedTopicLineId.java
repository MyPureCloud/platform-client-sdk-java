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
import com.mypurecloud.sdk.v2.model.ExternalContactsContactChangedTopicLineUserId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ExternalContactsContactChangedTopicLineId
 */

public class ExternalContactsContactChangedTopicLineId  implements Serializable {
  
  private List<ExternalContactsContactChangedTopicLineUserId> ids = null;
  private String displayName = null;

  public ExternalContactsContactChangedTopicLineId() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      ids = new ArrayList<ExternalContactsContactChangedTopicLineUserId>();
    }
  }

  
  /**
   **/
  public ExternalContactsContactChangedTopicLineId ids(List<ExternalContactsContactChangedTopicLineUserId> ids) {
    this.ids = ids;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ids")
  public List<ExternalContactsContactChangedTopicLineUserId> getIds() {
    return ids;
  }
  public void setIds(List<ExternalContactsContactChangedTopicLineUserId> ids) {
    this.ids = ids;
  }


  /**
   **/
  public ExternalContactsContactChangedTopicLineId displayName(String displayName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsContactChangedTopicLineId externalContactsContactChangedTopicLineId = (ExternalContactsContactChangedTopicLineId) o;

    return Objects.equals(this.ids, externalContactsContactChangedTopicLineId.ids) &&
            Objects.equals(this.displayName, externalContactsContactChangedTopicLineId.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsContactChangedTopicLineId {\n");
    
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

