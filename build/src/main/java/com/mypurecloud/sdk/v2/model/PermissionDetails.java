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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PermissionDetails
 */

public class PermissionDetails  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of permission requirement
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REQUIRESCURRENTUSER("requiresCurrentUser"),
    REQUIRESPERMISSIONS("requiresPermissions"),
    REQUIRESDIVISIONPERMISSIONS("requiresDivisionPermissions"),
    REQUIRESANYDIVISIONPERMISSIONS("requiresAnyDivisionPermissions"),
    REQUIRESUSERBECONVERSATIONPARTICIPANT("requiresUserBeConversationParticipant");

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
  private List<String> permissions = new ArrayList<String>();
  private Boolean allowsCurrentUser = null;
  private Boolean enforced = null;

  
  /**
   * The type of permission requirement
   **/
  public PermissionDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of permission requirement")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * List of required permissions
   **/
  public PermissionDetails permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of required permissions")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  
  /**
   * Whether the current user can subscribe, when division permissions are otherwise required
   **/
  public PermissionDetails allowsCurrentUser(Boolean allowsCurrentUser) {
    this.allowsCurrentUser = allowsCurrentUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the current user can subscribe, when division permissions are otherwise required")
  @JsonProperty("allowsCurrentUser")
  public Boolean getAllowsCurrentUser() {
    return allowsCurrentUser;
  }
  public void setAllowsCurrentUser(Boolean allowsCurrentUser) {
    this.allowsCurrentUser = allowsCurrentUser;
  }

  
  /**
   * Whether or not this permission requirement is enforced
   **/
  public PermissionDetails enforced(Boolean enforced) {
    this.enforced = enforced;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not this permission requirement is enforced")
  @JsonProperty("enforced")
  public Boolean getEnforced() {
    return enforced;
  }
  public void setEnforced(Boolean enforced) {
    this.enforced = enforced;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionDetails permissionDetails = (PermissionDetails) o;
    return Objects.equals(this.type, permissionDetails.type) &&
        Objects.equals(this.permissions, permissionDetails.permissions) &&
        Objects.equals(this.allowsCurrentUser, permissionDetails.allowsCurrentUser) &&
        Objects.equals(this.enforced, permissionDetails.enforced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, permissions, allowsCurrentUser, enforced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    allowsCurrentUser: ").append(toIndentedString(allowsCurrentUser)).append("\n");
    sb.append("    enforced: ").append(toIndentedString(enforced)).append("\n");
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

