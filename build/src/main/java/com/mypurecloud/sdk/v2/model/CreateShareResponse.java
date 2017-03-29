package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Share;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateShareResponse
 */

public class CreateShareResponse  implements Serializable {
  
  private String id = null;
  private String name = null;

  /**
   * Gets or Sets sharedEntityType
   */
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
  private UriReference sharedEntity = null;

  /**
   * Gets or Sets memberType
   */
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
  private UriReference member = null;
  private UriReference sharedBy = null;
  private UriReference workspace = null;
  private List<Share> succeeded = new ArrayList<Share>();
  private List<Share> failed = new ArrayList<Share>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public CreateShareResponse name(String name) {
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
  public CreateShareResponse sharedEntityType(SharedEntityTypeEnum sharedEntityType) {
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
  public CreateShareResponse sharedEntity(UriReference sharedEntity) {
    this.sharedEntity = sharedEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharedEntity")
  public UriReference getSharedEntity() {
    return sharedEntity;
  }
  public void setSharedEntity(UriReference sharedEntity) {
    this.sharedEntity = sharedEntity;
  }


  /**
   **/
  public CreateShareResponse memberType(MemberTypeEnum memberType) {
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
  public CreateShareResponse member(UriReference member) {
    this.member = member;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("member")
  public UriReference getMember() {
    return member;
  }
  public void setMember(UriReference member) {
    this.member = member;
  }


  /**
   **/
  public CreateShareResponse sharedBy(UriReference sharedBy) {
    this.sharedBy = sharedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharedBy")
  public UriReference getSharedBy() {
    return sharedBy;
  }
  public void setSharedBy(UriReference sharedBy) {
    this.sharedBy = sharedBy;
  }


  /**
   **/
  public CreateShareResponse workspace(UriReference workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspace")
  public UriReference getWorkspace() {
    return workspace;
  }
  public void setWorkspace(UriReference workspace) {
    this.workspace = workspace;
  }


  /**
   **/
  public CreateShareResponse succeeded(List<Share> succeeded) {
    this.succeeded = succeeded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("succeeded")
  public List<Share> getSucceeded() {
    return succeeded;
  }
  public void setSucceeded(List<Share> succeeded) {
    this.succeeded = succeeded;
  }


  /**
   **/
  public CreateShareResponse failed(List<Share> failed) {
    this.failed = failed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("failed")
  public List<Share> getFailed() {
    return failed;
  }
  public void setFailed(List<Share> failed) {
    this.failed = failed;
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
    CreateShareResponse createShareResponse = (CreateShareResponse) o;
    return Objects.equals(this.id, createShareResponse.id) &&
        Objects.equals(this.name, createShareResponse.name) &&
        Objects.equals(this.sharedEntityType, createShareResponse.sharedEntityType) &&
        Objects.equals(this.sharedEntity, createShareResponse.sharedEntity) &&
        Objects.equals(this.memberType, createShareResponse.memberType) &&
        Objects.equals(this.member, createShareResponse.member) &&
        Objects.equals(this.sharedBy, createShareResponse.sharedBy) &&
        Objects.equals(this.workspace, createShareResponse.workspace) &&
        Objects.equals(this.succeeded, createShareResponse.succeeded) &&
        Objects.equals(this.failed, createShareResponse.failed) &&
        Objects.equals(this.selfUri, createShareResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sharedEntityType, sharedEntity, memberType, member, sharedBy, workspace, succeeded, failed, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShareResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sharedEntityType: ").append(toIndentedString(sharedEntityType)).append("\n");
    sb.append("    sharedEntity: ").append(toIndentedString(sharedEntity)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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

