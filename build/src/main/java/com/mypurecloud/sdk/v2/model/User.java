package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Chat;
import com.mypurecloud.sdk.v2.model.Contact;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.Location;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserConversationSummary;
import com.mypurecloud.sdk.v2.model.UserImage;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.UserStations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * User
 */

public class User  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Chat chat = null;
  private String department = null;
  private String email = null;
  private List<Contact> primaryContactInfo = new ArrayList<Contact>();
  private List<Contact> addresses = new ArrayList<Contact>();

  /**
   * The current state for this user.
   */
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
  private String title = null;
  private String username = null;
  private User manager = null;
  private List<UserImage> images = new ArrayList<UserImage>();
  private Integer version = null;
  private RoutingStatus routingStatus = null;
  private UserPresence presence = null;
  private UserConversationSummary conversationSummary = null;
  private OutOfOffice outOfOffice = null;
  private Geolocation geolocation = null;
  private UserStations station = null;
  private UserAuthorization authorization = null;
  private List<String> profileSkills = new ArrayList<String>();
  private List<Location> locations = new ArrayList<Location>();
  private List<Group> groups = new ArrayList<Group>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public User name(String name) {
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
  public User chat(Chat chat) {
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
  public User department(String department) {
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
  public User email(String email) {
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

  
  /**
   * Auto populated from addresses.
   **/
  public User primaryContactInfo(List<Contact> primaryContactInfo) {
    this.primaryContactInfo = primaryContactInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Auto populated from addresses.")
  @JsonProperty("primaryContactInfo")
  public List<Contact> getPrimaryContactInfo() {
    return primaryContactInfo;
  }
  public void setPrimaryContactInfo(List<Contact> primaryContactInfo) {
    this.primaryContactInfo = primaryContactInfo;
  }

  
  /**
   * Email addresses and phone numbers for this user
   **/
  public User addresses(List<Contact> addresses) {
    this.addresses = addresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email addresses and phone numbers for this user")
  @JsonProperty("addresses")
  public List<Contact> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Contact> addresses) {
    this.addresses = addresses;
  }

  
  @ApiModelProperty(example = "null", value = "The current state for this user.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  
  /**
   **/
  public User title(String title) {
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
  public User username(String username) {
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
  public User manager(User manager) {
    this.manager = manager;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("manager")
  public User getManager() {
    return manager;
  }
  public void setManager(User manager) {
    this.manager = manager;
  }

  
  /**
   **/
  public User images(List<UserImage> images) {
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
   * Required when updating a user, this value should be the current version of the user.  The current version can be obtained with a GET on the user before doing a PATCH.
   **/
  public User version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Required when updating a user, this value should be the current version of the user.  The current version can be obtained with a GET on the user before doing a PATCH.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * ACD routing status
   **/
  public User routingStatus(RoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ACD routing status")
  @JsonProperty("routingStatus")
  public RoutingStatus getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(RoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
  }

  
  /**
   * Active presence
   **/
  public User presence(UserPresence presence) {
    this.presence = presence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Active presence")
  @JsonProperty("presence")
  public UserPresence getPresence() {
    return presence;
  }
  public void setPresence(UserPresence presence) {
    this.presence = presence;
  }

  
  /**
   * Summary of conversion statistics for conversation types.
   **/
  public User conversationSummary(UserConversationSummary conversationSummary) {
    this.conversationSummary = conversationSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Summary of conversion statistics for conversation types.")
  @JsonProperty("conversationSummary")
  public UserConversationSummary getConversationSummary() {
    return conversationSummary;
  }
  public void setConversationSummary(UserConversationSummary conversationSummary) {
    this.conversationSummary = conversationSummary;
  }

  
  /**
   * Determine if out of office is enabled
   **/
  public User outOfOffice(OutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determine if out of office is enabled")
  @JsonProperty("outOfOffice")
  public OutOfOffice getOutOfOffice() {
    return outOfOffice;
  }
  public void setOutOfOffice(OutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
  }

  
  /**
   * Current geolocation position
   **/
  public User geolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current geolocation position")
  @JsonProperty("geolocation")
  public Geolocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  
  /**
   * Effective, default, and last station information
   **/
  public User station(UserStations station) {
    this.station = station;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Effective, default, and last station information")
  @JsonProperty("station")
  public UserStations getStation() {
    return station;
  }
  public void setStation(UserStations station) {
    this.station = station;
  }

  
  /**
   * Roles and permissions assigned to the user
   **/
  public User authorization(UserAuthorization authorization) {
    this.authorization = authorization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Roles and permissions assigned to the user")
  @JsonProperty("authorization")
  public UserAuthorization getAuthorization() {
    return authorization;
  }
  public void setAuthorization(UserAuthorization authorization) {
    this.authorization = authorization;
  }

  
  /**
   * Skills possessed by the user
   **/
  public User profileSkills(List<String> profileSkills) {
    this.profileSkills = profileSkills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Skills possessed by the user")
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
  public User locations(List<Location> locations) {
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
  public User groups(List<Group> groups) {
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
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.chat, user.chat) &&
        Objects.equals(this.department, user.department) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.primaryContactInfo, user.primaryContactInfo) &&
        Objects.equals(this.addresses, user.addresses) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.title, user.title) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.manager, user.manager) &&
        Objects.equals(this.images, user.images) &&
        Objects.equals(this.version, user.version) &&
        Objects.equals(this.routingStatus, user.routingStatus) &&
        Objects.equals(this.presence, user.presence) &&
        Objects.equals(this.conversationSummary, user.conversationSummary) &&
        Objects.equals(this.outOfOffice, user.outOfOffice) &&
        Objects.equals(this.geolocation, user.geolocation) &&
        Objects.equals(this.station, user.station) &&
        Objects.equals(this.authorization, user.authorization) &&
        Objects.equals(this.profileSkills, user.profileSkills) &&
        Objects.equals(this.locations, user.locations) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.selfUri, user.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, chat, department, email, primaryContactInfo, addresses, state, title, username, manager, images, version, routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    primaryContactInfo: ").append(toIndentedString(primaryContactInfo)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    conversationSummary: ").append(toIndentedString(conversationSummary)).append("\n");
    sb.append("    outOfOffice: ").append(toIndentedString(outOfOffice)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    station: ").append(toIndentedString(station)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    profileSkills: ").append(toIndentedString(profileSkills)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

