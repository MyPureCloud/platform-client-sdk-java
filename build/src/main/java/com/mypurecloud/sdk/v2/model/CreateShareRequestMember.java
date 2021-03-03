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
import com.mypurecloud.sdk.v2.model.MemberEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateShareRequestMember
 */

public class CreateShareRequestMember  implements Serializable {
  

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
  private MemberEntity member = null;

  
  /**
   **/
  public CreateShareRequestMember memberType(MemberTypeEnum memberType) {
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
  public CreateShareRequestMember member(MemberEntity member) {
    this.member = member;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("member")
  public MemberEntity getMember() {
    return member;
  }
  public void setMember(MemberEntity member) {
    this.member = member;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShareRequestMember createShareRequestMember = (CreateShareRequestMember) o;
    return Objects.equals(this.memberType, createShareRequestMember.memberType) &&
        Objects.equals(this.member, createShareRequestMember.member);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberType, member);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShareRequestMember {\n");
    
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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

