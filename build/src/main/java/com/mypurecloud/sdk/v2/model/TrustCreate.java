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
import com.mypurecloud.sdk.v2.model.TrustMemberCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TrustCreate
 */

public class TrustCreate  implements Serializable {
  
  private String pairingId = null;
  private Boolean enabled = null;
  private List<TrustMemberCreate> users = new ArrayList<TrustMemberCreate>();
  private List<TrustMemberCreate> groups = new ArrayList<TrustMemberCreate>();

  
  /**
   * The pairing Id created by the trustee. This is required to prove that the trustee agrees to the relationship.
   **/
  public TrustCreate pairingId(String pairingId) {
    this.pairingId = pairingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The pairing Id created by the trustee. This is required to prove that the trustee agrees to the relationship.")
  @JsonProperty("pairingId")
  public String getPairingId() {
    return pairingId;
  }
  public void setPairingId(String pairingId) {
    this.pairingId = pairingId;
  }

  
  /**
   * If disabled no trustee user will have access, even if they were previously added.
   **/
  public TrustCreate enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If disabled no trustee user will have access, even if they were previously added.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The list of users and their roles to which access will be granted. The users are from the trustee and the roles are from the trustor. If no users are specified, at least one group is required.
   **/
  public TrustCreate users(List<TrustMemberCreate> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of users and their roles to which access will be granted. The users are from the trustee and the roles are from the trustor. If no users are specified, at least one group is required.")
  @JsonProperty("users")
  public List<TrustMemberCreate> getUsers() {
    return users;
  }
  public void setUsers(List<TrustMemberCreate> users) {
    this.users = users;
  }

  
  /**
   * The list of groups and their roles to which access will be granted. The groups are from the trustee and the roles are from the trustor. If no groups are specified, at least one user is required.
   **/
  public TrustCreate groups(List<TrustMemberCreate> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of groups and their roles to which access will be granted. The groups are from the trustee and the roles are from the trustor. If no groups are specified, at least one user is required.")
  @JsonProperty("groups")
  public List<TrustMemberCreate> getGroups() {
    return groups;
  }
  public void setGroups(List<TrustMemberCreate> groups) {
    this.groups = groups;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustCreate trustCreate = (TrustCreate) o;
    return Objects.equals(this.pairingId, trustCreate.pairingId) &&
        Objects.equals(this.enabled, trustCreate.enabled) &&
        Objects.equals(this.users, trustCreate.users) &&
        Objects.equals(this.groups, trustCreate.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairingId, enabled, users, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustCreate {\n");
    
    sb.append("    pairingId: ").append(toIndentedString(pairingId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

