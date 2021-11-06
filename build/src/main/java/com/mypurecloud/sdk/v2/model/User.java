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
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.EmployerInfo;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.Location;
import com.mypurecloud.sdk.v2.model.OAuthLastTokenIssued;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.Team;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserConversationSummary;
import com.mypurecloud.sdk.v2.model.UserImage;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.UserStations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * User
 */

public class User  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private Chat chat = null;
  private String department = null;
  private String email = null;
  private List<Contact> primaryContactInfo = new ArrayList<Contact>();
  private List<Contact> addresses = new ArrayList<Contact>();

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
   * The current state for this user.
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
  private String title = null;
  private String username = null;
  private User manager = null;
  private List<UserImage> images = new ArrayList<UserImage>();
  private Integer version = null;
  private List<String> certifications = new ArrayList<String>();
  private Biography biography = null;
  private EmployerInfo employerInfo = null;
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
  private Team team = null;
  private List<UserRoutingSkill> skills = new ArrayList<UserRoutingSkill>();
  private List<UserRoutingLanguage> languages = new ArrayList<UserRoutingLanguage>();
  private Boolean acdAutoAnswer = null;
  private String languagePreference = null;
  private OAuthLastTokenIssued lastTokenIssued = null;
  private Date dateLastLogin = null;
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
   * The division to which this entity belongs.
   **/
  public User division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
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

  
  @ApiModelProperty(example = "null", value = "Auto populated from addresses.")
  @JsonProperty("primaryContactInfo")
  public List<Contact> getPrimaryContactInfo() {
    return primaryContactInfo;
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
   **/
  public User certifications(List<String> certifications) {
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
  public User biography(Biography biography) {
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
  public User employerInfo(EmployerInfo employerInfo) {
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

  
  @ApiModelProperty(example = "null", value = "ACD routing status")
  @JsonProperty("routingStatus")
  public RoutingStatus getRoutingStatus() {
    return routingStatus;
  }

  
  @ApiModelProperty(example = "null", value = "Active presence")
  @JsonProperty("presence")
  public UserPresence getPresence() {
    return presence;
  }

  
  @ApiModelProperty(example = "null", value = "Summary of conversion statistics for conversation types.")
  @JsonProperty("conversationSummary")
  public UserConversationSummary getConversationSummary() {
    return conversationSummary;
  }

  
  @ApiModelProperty(example = "null", value = "Determine if out of office is enabled")
  @JsonProperty("outOfOffice")
  public OutOfOffice getOutOfOffice() {
    return outOfOffice;
  }

  
  @ApiModelProperty(example = "null", value = "Current geolocation position")
  @JsonProperty("geolocation")
  public Geolocation getGeolocation() {
    return geolocation;
  }

  
  @ApiModelProperty(example = "null", value = "Effective, default, and last station information")
  @JsonProperty("station")
  public UserStations getStation() {
    return station;
  }

  
  @ApiModelProperty(example = "null", value = "Roles and permissions assigned to the user")
  @JsonProperty("authorization")
  public UserAuthorization getAuthorization() {
    return authorization;
  }

  
  @ApiModelProperty(example = "null", value = "Profile skills possessed by the user")
  @JsonProperty("profileSkills")
  public List<String> getProfileSkills() {
    return profileSkills;
  }

  
  @ApiModelProperty(example = "null", value = "The user placement at each site location.")
  @JsonProperty("locations")
  public List<Location> getLocations() {
    return locations;
  }

  
  @ApiModelProperty(example = "null", value = "The groups the user is a member of")
  @JsonProperty("groups")
  public List<Group> getGroups() {
    return groups;
  }

  
  @ApiModelProperty(example = "null", value = "The team the user is a member of")
  @JsonProperty("team")
  public Team getTeam() {
    return team;
  }

  
  @ApiModelProperty(example = "null", value = "Routing (ACD) skills possessed by the user")
  @JsonProperty("skills")
  public List<UserRoutingSkill> getSkills() {
    return skills;
  }

  
  @ApiModelProperty(example = "null", value = "Routing (ACD) languages possessed by the user")
  @JsonProperty("languages")
  public List<UserRoutingLanguage> getLanguages() {
    return languages;
  }

  
  /**
   * acd auto answer
   **/
  public User acdAutoAnswer(Boolean acdAutoAnswer) {
    this.acdAutoAnswer = acdAutoAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "acd auto answer")
  @JsonProperty("acdAutoAnswer")
  public Boolean getAcdAutoAnswer() {
    return acdAutoAnswer;
  }
  public void setAcdAutoAnswer(Boolean acdAutoAnswer) {
    this.acdAutoAnswer = acdAutoAnswer;
  }

  
  @ApiModelProperty(example = "null", value = "preferred language by the user")
  @JsonProperty("languagePreference")
  public String getLanguagePreference() {
    return languagePreference;
  }

  
  /**
   **/
  public User lastTokenIssued(OAuthLastTokenIssued lastTokenIssued) {
    this.lastTokenIssued = lastTokenIssued;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastTokenIssued")
  public OAuthLastTokenIssued getLastTokenIssued() {
    return lastTokenIssued;
  }
  public void setLastTokenIssued(OAuthLastTokenIssued lastTokenIssued) {
    this.lastTokenIssued = lastTokenIssued;
  }

  
  @ApiModelProperty(example = "null", value = "The last time the user logged in using username and password. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLastLogin")
  public Date getDateLastLogin() {
    return dateLastLogin;
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
        Objects.equals(this.division, user.division) &&
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
        Objects.equals(this.certifications, user.certifications) &&
        Objects.equals(this.biography, user.biography) &&
        Objects.equals(this.employerInfo, user.employerInfo) &&
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
        Objects.equals(this.team, user.team) &&
        Objects.equals(this.skills, user.skills) &&
        Objects.equals(this.languages, user.languages) &&
        Objects.equals(this.acdAutoAnswer, user.acdAutoAnswer) &&
        Objects.equals(this.languagePreference, user.languagePreference) &&
        Objects.equals(this.lastTokenIssued, user.lastTokenIssued) &&
        Objects.equals(this.dateLastLogin, user.dateLastLogin) &&
        Objects.equals(this.selfUri, user.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, chat, department, email, primaryContactInfo, addresses, state, title, username, manager, images, version, certifications, biography, employerInfo, routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups, team, skills, languages, acdAutoAnswer, languagePreference, lastTokenIssued, dateLastLogin, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
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
    sb.append("    certifications: ").append(toIndentedString(certifications)).append("\n");
    sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
    sb.append("    employerInfo: ").append(toIndentedString(employerInfo)).append("\n");
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
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    acdAutoAnswer: ").append(toIndentedString(acdAutoAnswer)).append("\n");
    sb.append("    languagePreference: ").append(toIndentedString(languagePreference)).append("\n");
    sb.append("    lastTokenIssued: ").append(toIndentedString(lastTokenIssued)).append("\n");
    sb.append("    dateLastLogin: ").append(toIndentedString(dateLastLogin)).append("\n");
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

