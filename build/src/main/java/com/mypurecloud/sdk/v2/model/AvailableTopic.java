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
import com.mypurecloud.sdk.v2.model.PermissionDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AvailableTopic
 */

public class AvailableTopic  implements Serializable {
  
  private String description = null;
  private String id = null;
  private List<PermissionDetails> permissionDetails = new ArrayList<PermissionDetails>();
  private List<String> requiresPermissions = new ArrayList<String>();
  private Boolean requiresDivisionPermissions = null;
  private Boolean requiresAnyValidator = null;
  private Boolean enforced = null;

  private static class VisibilityEnumDeserializer extends StdDeserializer<VisibilityEnum> {
    public VisibilityEnumDeserializer() {
      super(VisibilityEnumDeserializer.class);
    }

    @Override
    public VisibilityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VisibilityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Visibility of this topic (Public or Preview)
   */
 @JsonDeserialize(using = VisibilityEnumDeserializer.class)
  public enum VisibilityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PUBLIC("Public"),
    PREVIEW("Preview");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VisibilityEnum fromString(String key) {
      if (key == null) return null;

      for (VisibilityEnum value : VisibilityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VisibilityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VisibilityEnum visibility = null;
  private Map<String, Object> schema = null;
  private Boolean requiresCurrentUser = null;
  private Boolean requiresCurrentUserOrPermission = null;

  private static class TransportsEnumDeserializer extends StdDeserializer<TransportsEnum> {
    public TransportsEnumDeserializer() {
      super(TransportsEnumDeserializer.class);
    }

    @Override
    public TransportsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TransportsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets transports
   */
 @JsonDeserialize(using = TransportsEnumDeserializer.class)
  public enum TransportsEnum {
    ALL("All"),
    WEBSOCKET("Websocket"),
    EVENTBRIDGE("EventBridge");

    private String value;

    TransportsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TransportsEnum fromString(String key) {
      if (key == null) return null;

      for (TransportsEnum value : TransportsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TransportsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<TransportsEnum> transports = new ArrayList<TransportsEnum>();
  private List<String> publicApiTemplateUriPaths = new ArrayList<String>();
  private List<String> topicParameters = new ArrayList<String>();

  
  /**
   **/
  public AvailableTopic description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public AvailableTopic id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Full detailed permissions required to subscribe to the topic
   **/
  public AvailableTopic permissionDetails(List<PermissionDetails> permissionDetails) {
    this.permissionDetails = permissionDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Full detailed permissions required to subscribe to the topic")
  @JsonProperty("permissionDetails")
  public List<PermissionDetails> getPermissionDetails() {
    return permissionDetails;
  }
  public void setPermissionDetails(List<PermissionDetails> permissionDetails) {
    this.permissionDetails = permissionDetails;
  }

  
  /**
   * Permissions required to subscribe to the topic
   **/
  public AvailableTopic requiresPermissions(List<String> requiresPermissions) {
    this.requiresPermissions = requiresPermissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Permissions required to subscribe to the topic")
  @JsonProperty("requiresPermissions")
  public List<String> getRequiresPermissions() {
    return requiresPermissions;
  }
  public void setRequiresPermissions(List<String> requiresPermissions) {
    this.requiresPermissions = requiresPermissions;
  }

  
  /**
   * True if the subscribing user must belong to the same division as the topic object ID
   **/
  public AvailableTopic requiresDivisionPermissions(Boolean requiresDivisionPermissions) {
    this.requiresDivisionPermissions = requiresDivisionPermissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the subscribing user must belong to the same division as the topic object ID")
  @JsonProperty("requiresDivisionPermissions")
  public Boolean getRequiresDivisionPermissions() {
    return requiresDivisionPermissions;
  }
  public void setRequiresDivisionPermissions(Boolean requiresDivisionPermissions) {
    this.requiresDivisionPermissions = requiresDivisionPermissions;
  }

  
  /**
   * If multiple permissions are required for this topic, such as both requiresCurrentUser and requiresDivisionPermissions, then true here indicates that meeting any one condition will satisfy the requirements; false indicates all conditions must be met.
   **/
  public AvailableTopic requiresAnyValidator(Boolean requiresAnyValidator) {
    this.requiresAnyValidator = requiresAnyValidator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If multiple permissions are required for this topic, such as both requiresCurrentUser and requiresDivisionPermissions, then true here indicates that meeting any one condition will satisfy the requirements; false indicates all conditions must be met.")
  @JsonProperty("requiresAnyValidator")
  public Boolean getRequiresAnyValidator() {
    return requiresAnyValidator;
  }
  public void setRequiresAnyValidator(Boolean requiresAnyValidator) {
    this.requiresAnyValidator = requiresAnyValidator;
  }

  
  /**
   * Whether or not the permissions on this topic are enforced
   **/
  public AvailableTopic enforced(Boolean enforced) {
    this.enforced = enforced;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the permissions on this topic are enforced")
  @JsonProperty("enforced")
  public Boolean getEnforced() {
    return enforced;
  }
  public void setEnforced(Boolean enforced) {
    this.enforced = enforced;
  }

  
  /**
   * Visibility of this topic (Public or Preview)
   **/
  public AvailableTopic visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Visibility of this topic (Public or Preview)")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  
  /**
   **/
  public AvailableTopic schema(Map<String, Object> schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schema")
  public Map<String, Object> getSchema() {
    return schema;
  }
  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }

  
  /**
   * True if the topic user ID is required to match the subscribing user ID
   **/
  public AvailableTopic requiresCurrentUser(Boolean requiresCurrentUser) {
    this.requiresCurrentUser = requiresCurrentUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the topic user ID is required to match the subscribing user ID")
  @JsonProperty("requiresCurrentUser")
  public Boolean getRequiresCurrentUser() {
    return requiresCurrentUser;
  }
  public void setRequiresCurrentUser(Boolean requiresCurrentUser) {
    this.requiresCurrentUser = requiresCurrentUser;
  }

  
  /**
   * True if permissions are only required when the topic user ID does not match the subscribing user ID
   **/
  public AvailableTopic requiresCurrentUserOrPermission(Boolean requiresCurrentUserOrPermission) {
    this.requiresCurrentUserOrPermission = requiresCurrentUserOrPermission;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if permissions are only required when the topic user ID does not match the subscribing user ID")
  @JsonProperty("requiresCurrentUserOrPermission")
  public Boolean getRequiresCurrentUserOrPermission() {
    return requiresCurrentUserOrPermission;
  }
  public void setRequiresCurrentUserOrPermission(Boolean requiresCurrentUserOrPermission) {
    this.requiresCurrentUserOrPermission = requiresCurrentUserOrPermission;
  }

  
  /**
   * Transports that support events for the topic
   **/
  public AvailableTopic transports(List<TransportsEnum> transports) {
    this.transports = transports;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transports that support events for the topic")
  @JsonProperty("transports")
  public List<TransportsEnum> getTransports() {
    return transports;
  }
  public void setTransports(List<TransportsEnum> transports) {
    this.transports = transports;
  }

  
  /**
   **/
  public AvailableTopic publicApiTemplateUriPaths(List<String> publicApiTemplateUriPaths) {
    this.publicApiTemplateUriPaths = publicApiTemplateUriPaths;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publicApiTemplateUriPaths")
  public List<String> getPublicApiTemplateUriPaths() {
    return publicApiTemplateUriPaths;
  }
  public void setPublicApiTemplateUriPaths(List<String> publicApiTemplateUriPaths) {
    this.publicApiTemplateUriPaths = publicApiTemplateUriPaths;
  }

  
  /**
   * Parameters in the topic name that can be substituted, in the order they appear in the topic name
   **/
  public AvailableTopic topicParameters(List<String> topicParameters) {
    this.topicParameters = topicParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameters in the topic name that can be substituted, in the order they appear in the topic name")
  @JsonProperty("topicParameters")
  public List<String> getTopicParameters() {
    return topicParameters;
  }
  public void setTopicParameters(List<String> topicParameters) {
    this.topicParameters = topicParameters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableTopic availableTopic = (AvailableTopic) o;
    return Objects.equals(this.description, availableTopic.description) &&
        Objects.equals(this.id, availableTopic.id) &&
        Objects.equals(this.permissionDetails, availableTopic.permissionDetails) &&
        Objects.equals(this.requiresPermissions, availableTopic.requiresPermissions) &&
        Objects.equals(this.requiresDivisionPermissions, availableTopic.requiresDivisionPermissions) &&
        Objects.equals(this.requiresAnyValidator, availableTopic.requiresAnyValidator) &&
        Objects.equals(this.enforced, availableTopic.enforced) &&
        Objects.equals(this.visibility, availableTopic.visibility) &&
        Objects.equals(this.schema, availableTopic.schema) &&
        Objects.equals(this.requiresCurrentUser, availableTopic.requiresCurrentUser) &&
        Objects.equals(this.requiresCurrentUserOrPermission, availableTopic.requiresCurrentUserOrPermission) &&
        Objects.equals(this.transports, availableTopic.transports) &&
        Objects.equals(this.publicApiTemplateUriPaths, availableTopic.publicApiTemplateUriPaths) &&
        Objects.equals(this.topicParameters, availableTopic.topicParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, permissionDetails, requiresPermissions, requiresDivisionPermissions, requiresAnyValidator, enforced, visibility, schema, requiresCurrentUser, requiresCurrentUserOrPermission, transports, publicApiTemplateUriPaths, topicParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTopic {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permissionDetails: ").append(toIndentedString(permissionDetails)).append("\n");
    sb.append("    requiresPermissions: ").append(toIndentedString(requiresPermissions)).append("\n");
    sb.append("    requiresDivisionPermissions: ").append(toIndentedString(requiresDivisionPermissions)).append("\n");
    sb.append("    requiresAnyValidator: ").append(toIndentedString(requiresAnyValidator)).append("\n");
    sb.append("    enforced: ").append(toIndentedString(enforced)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    requiresCurrentUser: ").append(toIndentedString(requiresCurrentUser)).append("\n");
    sb.append("    requiresCurrentUserOrPermission: ").append(toIndentedString(requiresCurrentUserOrPermission)).append("\n");
    sb.append("    transports: ").append(toIndentedString(transports)).append("\n");
    sb.append("    publicApiTemplateUriPaths: ").append(toIndentedString(publicApiTemplateUriPaths)).append("\n");
    sb.append("    topicParameters: ").append(toIndentedString(topicParameters)).append("\n");
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

