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
import com.mypurecloud.sdk.v2.model.Biography;
import com.mypurecloud.sdk.v2.model.Chat;
import com.mypurecloud.sdk.v2.model.Contact;
import com.mypurecloud.sdk.v2.model.EmployerInfo;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.Location;
import com.mypurecloud.sdk.v2.model.UserImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UpdateUser
 */

public class UpdateUser  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Chat chat = null;
  private String department = null;
  private String email = null;
  private List<Contact> primaryContactInfo = new ArrayList<Contact>();
  private List<Contact> addresses = new ArrayList<Contact>();
  private String title = null;
  private String username = null;
  private String manager = null;
  private List<UserImage> images = new ArrayList<UserImage>();
  private Integer version = null;
  private List<String> profileSkills = new ArrayList<String>();
  private List<Location> locations = new ArrayList<Location>();
  private List<Group> groups = new ArrayList<Group>();

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
   * The state of the user. This property can be used to restore a deleted user or transition between active and inactive. If specified, it is the only modifiable field.
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
  private Boolean acdAutoAnswer = null;
  private List<String> certifications = new ArrayList<String>();
  private Biography biography = null;
  private EmployerInfo employerInfo = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public UpdateUser name(String name) {
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
  public UpdateUser chat(Chat chat) {
    this.chat = chat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chat")
  public Chat getChat() {
    return chat;
  }
  public void setChat(Chat chat) {
    this.chat = chat;
  }

  
  /**
   **/
  public UpdateUser department(String department) {
    this.department = department;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("department")
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }

  
  /**
   **/
  public UpdateUser email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  @ApiModelProperty(example = "null", value = "The address(s) used for primary contact. Updates to the corresponding address in the addresses list will be reflected here.")
  @JsonProperty("primaryContactInfo")
  public List<Contact> getPrimaryContactInfo() {
    return primaryContactInfo;
  }

  
  /**
   * Email address, phone number, and/or extension for this user. One entry is allowed per media type
   **/
  public UpdateUser addresses(List<Contact> addresses) {
    this.addresses = addresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email address, phone number, and/or extension for this user. One entry is allowed per media type")
  @JsonProperty("addresses")
  public List<Contact> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Contact> addresses) {
    this.addresses = addresses;
  }

  
  /**
   **/
  public UpdateUser title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  public UpdateUser username(String username) {
    this.username = username;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   **/
  public UpdateUser manager(String manager) {
    this.manager = manager;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("manager")
  public String getManager() {
    return manager;
  }
  public void setManager(String manager) {
    this.manager = manager;
  }

  
  /**
   **/
  public UpdateUser images(List<UserImage> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("images")
  public List<UserImage> getImages() {
    return images;
  }
  public void setImages(List<UserImage> images) {
    this.images = images;
  }

  
  /**
   * This value should be the current version of the user. The current version can be obtained with a GET on the user before doing a PATCH.
   **/
  public UpdateUser version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This value should be the current version of the user. The current version can be obtained with a GET on the user before doing a PATCH.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * Profile skills possessed by the user
   **/
  public UpdateUser profileSkills(List<String> profileSkills) {
    this.profileSkills = profileSkills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Profile skills possessed by the user")
  @JsonProperty("profileSkills")
  public List<String> getProfileSkills() {
    return profileSkills;
  }
  public void setProfileSkills(List<String> profileSkills) {
    this.profileSkills = profileSkills;
  }

  
  /**
   * The user placement at each site location.
   **/
  public UpdateUser locations(List<Location> locations) {
    this.locations = locations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user placement at each site location.")
  @JsonProperty("locations")
  public List<Location> getLocations() {
    return locations;
  }
  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }

  
  /**
   * The groups the user is a member of
   **/
  public UpdateUser groups(List<Group> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The groups the user is a member of")
  @JsonProperty("groups")
  public List<Group> getGroups() {
    return groups;
  }
  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  
  /**
   * The state of the user. This property can be used to restore a deleted user or transition between active and inactive. If specified, it is the only modifiable field.
   **/
  public UpdateUser state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the user. This property can be used to restore a deleted user or transition between active and inactive. If specified, it is the only modifiable field.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The value that denotes if acdAutoAnswer is set on the user
   **/
  public UpdateUser acdAutoAnswer(Boolean acdAutoAnswer) {
    this.acdAutoAnswer = acdAutoAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value that denotes if acdAutoAnswer is set on the user")
  @JsonProperty("acdAutoAnswer")
  public Boolean getAcdAutoAnswer() {
    return acdAutoAnswer;
  }
  public void setAcdAutoAnswer(Boolean acdAutoAnswer) {
    this.acdAutoAnswer = acdAutoAnswer;
  }

  
  /**
   **/
  public UpdateUser certifications(List<String> certifications) {
    this.certifications = certifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("certifications")
  public List<String> getCertifications() {
    return certifications;
  }
  public void setCertifications(List<String> certifications) {
    this.certifications = certifications;
  }

  
  /**
   **/
  public UpdateUser biography(Biography biography) {
    this.biography = biography;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("biography")
  public Biography getBiography() {
    return biography;
  }
  public void setBiography(Biography biography) {
    this.biography = biography;
  }

  
  /**
   **/
  public UpdateUser employerInfo(EmployerInfo employerInfo) {
    this.employerInfo = employerInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("employerInfo")
  public EmployerInfo getEmployerInfo() {
    return employerInfo;
  }
  public void setEmployerInfo(EmployerInfo employerInfo) {
    this.employerInfo = employerInfo;
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
    UpdateUser updateUser = (UpdateUser) o;
    return Objects.equals(this.id, updateUser.id) &&
        Objects.equals(this.name, updateUser.name) &&
        Objects.equals(this.chat, updateUser.chat) &&
        Objects.equals(this.department, updateUser.department) &&
        Objects.equals(this.email, updateUser.email) &&
        Objects.equals(this.primaryContactInfo, updateUser.primaryContactInfo) &&
        Objects.equals(this.addresses, updateUser.addresses) &&
        Objects.equals(this.title, updateUser.title) &&
        Objects.equals(this.username, updateUser.username) &&
        Objects.equals(this.manager, updateUser.manager) &&
        Objects.equals(this.images, updateUser.images) &&
        Objects.equals(this.version, updateUser.version) &&
        Objects.equals(this.profileSkills, updateUser.profileSkills) &&
        Objects.equals(this.locations, updateUser.locations) &&
        Objects.equals(this.groups, updateUser.groups) &&
        Objects.equals(this.state, updateUser.state) &&
        Objects.equals(this.acdAutoAnswer, updateUser.acdAutoAnswer) &&
        Objects.equals(this.certifications, updateUser.certifications) &&
        Objects.equals(this.biography, updateUser.biography) &&
        Objects.equals(this.employerInfo, updateUser.employerInfo) &&
        Objects.equals(this.selfUri, updateUser.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, chat, department, email, primaryContactInfo, addresses, title, username, manager, images, version, profileSkills, locations, groups, state, acdAutoAnswer, certifications, biography, employerInfo, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    primaryContactInfo: ").append(toIndentedString(primaryContactInfo)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    profileSkills: ").append(toIndentedString(profileSkills)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    acdAutoAnswer: ").append(toIndentedString(acdAutoAnswer)).append("\n");
    sb.append("    certifications: ").append(toIndentedString(certifications)).append("\n");
    sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
    sb.append("    employerInfo: ").append(toIndentedString(employerInfo)).append("\n");
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

