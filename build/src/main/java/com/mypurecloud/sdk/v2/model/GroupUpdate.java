package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.GroupContact;
import com.mypurecloud.sdk.v2.model.Image;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GroupUpdate
 */

public class GroupUpdate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * State of the group.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Integer version = null;
  private List<Image> images = null;
  private List<GroupContact> addresses = null;
  private Boolean rulesVisible = null;

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
   * Who can view this group
   */
 @JsonDeserialize(using = VisibilityEnumDeserializer.class)
  public enum VisibilityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PUBLIC("public"),
    OWNERIDS("ownerIds"),
    MEMBERS("members");

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
  private Boolean rolesEnabled = null;
  private Boolean includeOwners = null;
  private Boolean callsEnabled = null;
  private List<String> ownerIds = null;
  private String selfUri = null;

  public GroupUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      images = new ArrayList<Image>();
      addresses = new ArrayList<GroupContact>();
      ownerIds = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The group name.
   **/
  public GroupUpdate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The group name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public GroupUpdate description(String description) {
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
   * State of the group.
   **/
  public GroupUpdate state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State of the group.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Current version for this resource.
   **/
  public GroupUpdate version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Current version for this resource.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   **/
  public GroupUpdate images(List<Image> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("images")
  public List<Image> getImages() {
    return images;
  }
  public void setImages(List<Image> images) {
    this.images = images;
  }


  /**
   **/
  public GroupUpdate addresses(List<GroupContact> addresses) {
    this.addresses = addresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addresses")
  public List<GroupContact> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<GroupContact> addresses) {
    this.addresses = addresses;
  }


  /**
   * Are membership rules visible to the person requesting to view the group
   **/
  public GroupUpdate rulesVisible(Boolean rulesVisible) {
    this.rulesVisible = rulesVisible;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Are membership rules visible to the person requesting to view the group")
  @JsonProperty("rulesVisible")
  public Boolean getRulesVisible() {
    return rulesVisible;
  }
  public void setRulesVisible(Boolean rulesVisible) {
    this.rulesVisible = rulesVisible;
  }


  /**
   * Who can view this group
   **/
  public GroupUpdate visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Who can view this group")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  /**
   * Allow roles to be assigned to this group
   **/
  public GroupUpdate rolesEnabled(Boolean rolesEnabled) {
    this.rolesEnabled = rolesEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allow roles to be assigned to this group")
  @JsonProperty("rolesEnabled")
  public Boolean getRolesEnabled() {
    return rolesEnabled;
  }
  public void setRolesEnabled(Boolean rolesEnabled) {
    this.rolesEnabled = rolesEnabled;
  }


  /**
   * Allow owners to be included as members of the group
   **/
  public GroupUpdate includeOwners(Boolean includeOwners) {
    this.includeOwners = includeOwners;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allow owners to be included as members of the group")
  @JsonProperty("includeOwners")
  public Boolean getIncludeOwners() {
    return includeOwners;
  }
  public void setIncludeOwners(Boolean includeOwners) {
    this.includeOwners = includeOwners;
  }


  /**
   * Allow calls to be placed to this group.
   **/
  public GroupUpdate callsEnabled(Boolean callsEnabled) {
    this.callsEnabled = callsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allow calls to be placed to this group.")
  @JsonProperty("callsEnabled")
  public Boolean getCallsEnabled() {
    return callsEnabled;
  }
  public void setCallsEnabled(Boolean callsEnabled) {
    this.callsEnabled = callsEnabled;
  }


  /**
   * Owners of the group
   **/
  public GroupUpdate ownerIds(List<String> ownerIds) {
    this.ownerIds = ownerIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Owners of the group")
  @JsonProperty("ownerIds")
  public List<String> getOwnerIds() {
    return ownerIds;
  }
  public void setOwnerIds(List<String> ownerIds) {
    this.ownerIds = ownerIds;
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
    GroupUpdate groupUpdate = (GroupUpdate) o;

    return Objects.equals(this.id, groupUpdate.id) &&
            Objects.equals(this.name, groupUpdate.name) &&
            Objects.equals(this.description, groupUpdate.description) &&
            Objects.equals(this.state, groupUpdate.state) &&
            Objects.equals(this.version, groupUpdate.version) &&
            Objects.equals(this.images, groupUpdate.images) &&
            Objects.equals(this.addresses, groupUpdate.addresses) &&
            Objects.equals(this.rulesVisible, groupUpdate.rulesVisible) &&
            Objects.equals(this.visibility, groupUpdate.visibility) &&
            Objects.equals(this.rolesEnabled, groupUpdate.rolesEnabled) &&
            Objects.equals(this.includeOwners, groupUpdate.includeOwners) &&
            Objects.equals(this.callsEnabled, groupUpdate.callsEnabled) &&
            Objects.equals(this.ownerIds, groupUpdate.ownerIds) &&
            Objects.equals(this.selfUri, groupUpdate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, state, version, images, addresses, rulesVisible, visibility, rolesEnabled, includeOwners, callsEnabled, ownerIds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    rulesVisible: ").append(toIndentedString(rulesVisible)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    rolesEnabled: ").append(toIndentedString(rolesEnabled)).append("\n");
    sb.append("    includeOwners: ").append(toIndentedString(includeOwners)).append("\n");
    sb.append("    callsEnabled: ").append(toIndentedString(callsEnabled)).append("\n");
    sb.append("    ownerIds: ").append(toIndentedString(ownerIds)).append("\n");
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

