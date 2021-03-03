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
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Share
 */

public class Share  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class SharedEntityTypeEnumDeserializer extends StdDeserializer<SharedEntityTypeEnum> {
    public SharedEntityTypeEnumDeserializer() {
      super(SharedEntityTypeEnumDeserializer.class);
    }

    @Override
    public SharedEntityTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SharedEntityTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets sharedEntityType
   */
 @JsonDeserialize(using = SharedEntityTypeEnumDeserializer.class)
  public enum SharedEntityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DOCUMENT("DOCUMENT");

    private String value;

    SharedEntityTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SharedEntityTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SharedEntityTypeEnum value : SharedEntityTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SharedEntityTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SharedEntityTypeEnum sharedEntityType = null;
  private DomainEntityRef sharedEntity = null;

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
   * Gets or Sets memberType
   */
 @JsonDeserialize(using = MemberTypeEnumDeserializer.class)
  public enum MemberTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("USER"),
    GROUP("GROUP"),
    PUBLIC("PUBLIC");

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
  private DomainEntityRef sharedBy = null;
  private DomainEntityRef workspace = null;
  private User user = null;
  private Group group = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Share name(String name) {
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
  public Share sharedEntityType(SharedEntityTypeEnum sharedEntityType) {
    this.sharedEntityType = sharedEntityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharedEntityType")
  public SharedEntityTypeEnum getSharedEntityType() {
    return sharedEntityType;
  }
  public void setSharedEntityType(SharedEntityTypeEnum sharedEntityType) {
    this.sharedEntityType = sharedEntityType;
  }

  
  /**
   **/
  public Share sharedEntity(DomainEntityRef sharedEntity) {
    this.sharedEntity = sharedEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharedEntity")
  public DomainEntityRef getSharedEntity() {
    return sharedEntity;
  }
  public void setSharedEntity(DomainEntityRef sharedEntity) {
    this.sharedEntity = sharedEntity;
  }

  
  /**
   **/
  public Share memberType(MemberTypeEnum memberType) {
    this.memberType = memberType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("memberType")
  public MemberTypeEnum getMemberType() {
    return memberType;
  }
  public void setMemberType(MemberTypeEnum memberType) {
    this.memberType = memberType;
  }

  
  /**
   **/
  public Share member(DomainEntityRef member) {
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
  public Share sharedBy(DomainEntityRef sharedBy) {
    this.sharedBy = sharedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharedBy")
  public DomainEntityRef getSharedBy() {
    return sharedBy;
  }
  public void setSharedBy(DomainEntityRef sharedBy) {
    this.sharedBy = sharedBy;
  }

  
  /**
   **/
  public Share workspace(DomainEntityRef workspace) {
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
   **/
  public Share user(User user) {
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
  public Share group(Group group) {
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
    Share share = (Share) o;
    return Objects.equals(this.id, share.id) &&
        Objects.equals(this.name, share.name) &&
        Objects.equals(this.sharedEntityType, share.sharedEntityType) &&
        Objects.equals(this.sharedEntity, share.sharedEntity) &&
        Objects.equals(this.memberType, share.memberType) &&
        Objects.equals(this.member, share.member) &&
        Objects.equals(this.sharedBy, share.sharedBy) &&
        Objects.equals(this.workspace, share.workspace) &&
        Objects.equals(this.user, share.user) &&
        Objects.equals(this.group, share.group) &&
        Objects.equals(this.selfUri, share.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sharedEntityType, sharedEntity, memberType, member, sharedBy, workspace, user, group, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Share {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sharedEntityType: ").append(toIndentedString(sharedEntityType)).append("\n");
    sb.append("    sharedEntity: ").append(toIndentedString(sharedEntity)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

