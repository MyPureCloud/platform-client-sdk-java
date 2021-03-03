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
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.UserPresence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PresenceExpand
 */

public class PresenceExpand  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<UserPresence> presences = new ArrayList<UserPresence>();
  private List<OutOfOffice> outOfOffices = new ArrayList<OutOfOffice>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public PresenceExpand name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * An array of user presences
   **/
  public PresenceExpand presences(List<UserPresence> presences) {
    this.presences = presences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of user presences")
  @JsonProperty("presences")
  public List<UserPresence> getPresences() {
    return presences;
  }
  public void setPresences(List<UserPresence> presences) {
    this.presences = presences;
  }

  
  /**
   * An array of out of office statuses
   **/
  public PresenceExpand outOfOffices(List<OutOfOffice> outOfOffices) {
    this.outOfOffices = outOfOffices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of out of office statuses")
  @JsonProperty("outOfOffices")
  public List<OutOfOffice> getOutOfOffices() {
    return outOfOffices;
  }
  public void setOutOfOffices(List<OutOfOffice> outOfOffices) {
    this.outOfOffices = outOfOffices;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresenceExpand presenceExpand = (PresenceExpand) o;
    return Objects.equals(this.id, presenceExpand.id) &&
        Objects.equals(this.name, presenceExpand.name) &&
        Objects.equals(this.presences, presenceExpand.presences) &&
        Objects.equals(this.outOfOffices, presenceExpand.outOfOffices) &&
        Objects.equals(this.selfUri, presenceExpand.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, presences, outOfOffices, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenceExpand {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    presences: ").append(toIndentedString(presences)).append("\n");
    sb.append("    outOfOffices: ").append(toIndentedString(outOfOffices)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

