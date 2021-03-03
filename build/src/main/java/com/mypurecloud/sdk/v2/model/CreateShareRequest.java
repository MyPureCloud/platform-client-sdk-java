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
import com.mypurecloud.sdk.v2.model.CreateShareRequestMember;
import com.mypurecloud.sdk.v2.model.SharedEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateShareRequest
 */

public class CreateShareRequest  implements Serializable {
  

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
   * The share entity type
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
  private SharedEntity sharedEntity = null;

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
  private SharedEntity member = null;
  private List<CreateShareRequestMember> members = new ArrayList<CreateShareRequestMember>();

  
  /**
   * The share entity type
   **/
  public CreateShareRequest sharedEntityType(SharedEntityTypeEnum sharedEntityType) {
    this.sharedEntityType = sharedEntityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The share entity type")
  @JsonProperty("sharedEntityType")
  public SharedEntityTypeEnum getSharedEntityType() {
    return sharedEntityType;
  }
  public void setSharedEntityType(SharedEntityTypeEnum sharedEntityType) {
    this.sharedEntityType = sharedEntityType;
  }

  
  /**
   * The entity that will be shared
   **/
  public CreateShareRequest sharedEntity(SharedEntity sharedEntity) {
    this.sharedEntity = sharedEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The entity that will be shared")
  @JsonProperty("sharedEntity")
  public SharedEntity getSharedEntity() {
    return sharedEntity;
  }
  public void setSharedEntity(SharedEntity sharedEntity) {
    this.sharedEntity = sharedEntity;
  }

  
  /**
   **/
  public CreateShareRequest memberType(MemberTypeEnum memberType) {
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
   * The member that will have access to this share. Only required if a list of members is not provided.
   **/
  public CreateShareRequest member(SharedEntity member) {
    this.member = member;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The member that will have access to this share. Only required if a list of members is not provided.")
  @JsonProperty("member")
  public SharedEntity getMember() {
    return member;
  }
  public void setMember(SharedEntity member) {
    this.member = member;
  }

  
  /**
   **/
  public CreateShareRequest members(List<CreateShareRequestMember> members) {
    this.members = members;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("members")
  public List<CreateShareRequestMember> getMembers() {
    return members;
  }
  public void setMembers(List<CreateShareRequestMember> members) {
    this.members = members;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShareRequest createShareRequest = (CreateShareRequest) o;
    return Objects.equals(this.sharedEntityType, createShareRequest.sharedEntityType) &&
        Objects.equals(this.sharedEntity, createShareRequest.sharedEntity) &&
        Objects.equals(this.memberType, createShareRequest.memberType) &&
        Objects.equals(this.member, createShareRequest.member) &&
        Objects.equals(this.members, createShareRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedEntityType, sharedEntity, memberType, member, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShareRequest {\n");
    
    sb.append("    sharedEntityType: ").append(toIndentedString(sharedEntityType)).append("\n");
    sb.append("    sharedEntity: ").append(toIndentedString(sharedEntity)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

