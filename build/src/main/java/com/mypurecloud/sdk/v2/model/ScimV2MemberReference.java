package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ScimMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SCIM Members of Group Resource
 */
@ApiModel(description = "SCIM Members of Group Resource")

public class ScimV2MemberReference  implements Serializable {
  

  /**
   * SCIM Resource Type of member
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("User"),
    GROUP("Group"),
    SERVICEPROVIDERCONFIG("ServiceProviderConfig");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String displayName = null;
  private ScimMetadata meta = null;
  private String value = null;
  private String ref = null;

  
  @ApiModelProperty(example = "null", value = "SCIM Resource Type of member")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  
  /**
   * Display Name
   **/
  public ScimV2MemberReference displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Display Name")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  public ScimV2MemberReference meta(ScimMetadata meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("meta")
  public ScimMetadata getMeta() {
    return meta;
  }
  public void setMeta(ScimMetadata meta) {
    this.meta = meta;
  }

  
  @ApiModelProperty(example = "null", value = "Value of ID of group member. May be User or Group id")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  
  @ApiModelProperty(example = "null", value = "Ref to entity")
  @JsonProperty("$ref")
  public String getRef() {
    return ref;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimV2MemberReference scimV2MemberReference = (ScimV2MemberReference) o;
    return Objects.equals(this.type, scimV2MemberReference.type) &&
        Objects.equals(this.displayName, scimV2MemberReference.displayName) &&
        Objects.equals(this.meta, scimV2MemberReference.meta) &&
        Objects.equals(this.value, scimV2MemberReference.value) &&
        Objects.equals(this.ref, scimV2MemberReference.ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, displayName, meta, value, ref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2MemberReference {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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

