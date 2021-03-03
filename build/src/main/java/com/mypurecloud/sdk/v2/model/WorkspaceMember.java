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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.SecurityProfile;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkspaceMember
 */

public class WorkspaceMember  implements Serializable {
  
  private String id = null;
  private String name = null;
  private DomainEntityRef workspace = null;

  private static class MemberTypeEnumDeserializer extends StdDeserializer<MemberTypeEnum> {
    public MemberTypeEnumDeserializer() {
      super(MemberTypeEnumDeserializer.class);
    }

    @Override
    public MemberTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MemberTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The workspace member type.
   */
 @JsonDeserialize(using = MemberTypeEnumDeserializer.class)
  public enum MemberTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("USER"),
    GROUP("GROUP");

    private String value;

    MemberTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MemberTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MemberTypeEnum value : MemberTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MemberTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MemberTypeEnum memberType = null;
  private DomainEntityRef member = null;
  private User user = null;
  private Group group = null;
  private SecurityProfile securityProfile = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public WorkspaceMember name(String name) {
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
   **/
  public WorkspaceMember workspace(DomainEntityRef workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspace")
  public DomainEntityRef getWorkspace() {
    return workspace;
  }
  public void setWorkspace(DomainEntityRef workspace) {
    this.workspace = workspace;
  }

  
  /**
   * The workspace member type.
   **/
  public WorkspaceMember memberType(MemberTypeEnum memberType) {
    this.memberType = memberType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The workspace member type.")
  @JsonProperty("memberType")
  public MemberTypeEnum getMemberType() {
    return memberType;
  }
  public void setMemberType(MemberTypeEnum memberType) {
    this.memberType = memberType;
  }

  
  /**
   **/
  public WorkspaceMember member(DomainEntityRef member) {
    this.member = member;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("member")
  public DomainEntityRef getMember() {
    return member;
  }
  public void setMember(DomainEntityRef member) {
    this.member = member;
  }

  
  /**
   **/
  public WorkspaceMember user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   **/
  public WorkspaceMember group(Group group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("group")
  public Group getGroup() {
    return group;
  }
  public void setGroup(Group group) {
    this.group = group;
  }

  
  /**
   **/
  public WorkspaceMember securityProfile(SecurityProfile securityProfile) {
    this.securityProfile = securityProfile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("securityProfile")
  public SecurityProfile getSecurityProfile() {
    return securityProfile;
  }
  public void setSecurityProfile(SecurityProfile securityProfile) {
    this.securityProfile = securityProfile;
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
    WorkspaceMember workspaceMember = (WorkspaceMember) o;
    return Objects.equals(this.id, workspaceMember.id) &&
        Objects.equals(this.name, workspaceMember.name) &&
        Objects.equals(this.workspace, workspaceMember.workspace) &&
        Objects.equals(this.memberType, workspaceMember.memberType) &&
        Objects.equals(this.member, workspaceMember.member) &&
        Objects.equals(this.user, workspaceMember.user) &&
        Objects.equals(this.group, workspaceMember.group) &&
        Objects.equals(this.securityProfile, workspaceMember.securityProfile) &&
        Objects.equals(this.selfUri, workspaceMember.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, workspace, memberType, member, user, group, securityProfile, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceMember {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    securityProfile: ").append(toIndentedString(securityProfile)).append("\n");
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

