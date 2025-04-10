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
import com.mypurecloud.sdk.v2.model.OrgUser;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TrustGroup
 */

public class TrustGroup  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Date dateModified = null;
  private Long memberCount = null;

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
   * Active, inactive, or deleted state.
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
   * Type of group.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFFICIAL("official"),
    SOCIAL("social");

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
    OWNERS("owners"),
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
  private List<User> owners = null;
  private Date dateCreated = null;
  private OrgUser createdBy = null;

  public TrustGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      images = new ArrayList<Image>();
      addresses = new ArrayList<GroupContact>();
      owners = new ArrayList<User>();
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
  public TrustGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The group name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public TrustGroup description(String description) {
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


  @ApiModelProperty(example = "null", value = "Last modified date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "Number of members.")
  @JsonProperty("memberCount")
  public Long getMemberCount() {
    return memberCount;
  }


  @ApiModelProperty(example = "null", value = "Active, inactive, or deleted state.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }


  @ApiModelProperty(example = "null", value = "Current version for this resource.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }


  /**
   * Type of group.
   **/
  public TrustGroup type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of group.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public TrustGroup images(List<Image> images) {
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
  public TrustGroup addresses(List<GroupContact> addresses) {
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
  public TrustGroup rulesVisible(Boolean rulesVisible) {
    this.rulesVisible = rulesVisible;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Are membership rules visible to the person requesting to view the group")
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
  public TrustGroup visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Who can view this group")
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
  public TrustGroup rolesEnabled(Boolean rolesEnabled) {
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
  public TrustGroup includeOwners(Boolean includeOwners) {
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
  public TrustGroup callsEnabled(Boolean callsEnabled) {
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
  public TrustGroup owners(List<User> owners) {
    this.owners = owners;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Owners of the group")
  @JsonProperty("owners")
  public List<User> getOwners() {
    return owners;
  }
  public void setOwners(List<User> owners) {
    this.owners = owners;
  }


  @ApiModelProperty(example = "null", value = "The date on which the trusted group was added. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The user that added trusted group.")
  @JsonProperty("createdBy")
  public OrgUser getCreatedBy() {
    return createdBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustGroup trustGroup = (TrustGroup) o;

    return Objects.equals(this.id, trustGroup.id) &&
            Objects.equals(this.name, trustGroup.name) &&
            Objects.equals(this.description, trustGroup.description) &&
            Objects.equals(this.dateModified, trustGroup.dateModified) &&
            Objects.equals(this.memberCount, trustGroup.memberCount) &&
            Objects.equals(this.state, trustGroup.state) &&
            Objects.equals(this.version, trustGroup.version) &&
            Objects.equals(this.type, trustGroup.type) &&
            Objects.equals(this.images, trustGroup.images) &&
            Objects.equals(this.addresses, trustGroup.addresses) &&
            Objects.equals(this.rulesVisible, trustGroup.rulesVisible) &&
            Objects.equals(this.visibility, trustGroup.visibility) &&
            Objects.equals(this.rolesEnabled, trustGroup.rolesEnabled) &&
            Objects.equals(this.includeOwners, trustGroup.includeOwners) &&
            Objects.equals(this.callsEnabled, trustGroup.callsEnabled) &&
            Objects.equals(this.owners, trustGroup.owners) &&
            Objects.equals(this.dateCreated, trustGroup.dateCreated) &&
            Objects.equals(this.createdBy, trustGroup.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dateModified, memberCount, state, version, type, images, addresses, rulesVisible, visibility, rolesEnabled, includeOwners, callsEnabled, owners, dateCreated, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    rulesVisible: ").append(toIndentedString(rulesVisible)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    rolesEnabled: ").append(toIndentedString(rolesEnabled)).append("\n");
    sb.append("    includeOwners: ").append(toIndentedString(includeOwners)).append("\n");
    sb.append("    callsEnabled: ").append(toIndentedString(callsEnabled)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

