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
import com.mypurecloud.sdk.v2.model.Adjacents;
import com.mypurecloud.sdk.v2.model.Biography;
import com.mypurecloud.sdk.v2.model.Chat;
import com.mypurecloud.sdk.v2.model.Contact;
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.DomainOrganizationProduct;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.EmployerInfo;
import com.mypurecloud.sdk.v2.model.FieldConfigs;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.GeolocationSettings;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.Location;
import com.mypurecloud.sdk.v2.model.LocationDefinition;
import com.mypurecloud.sdk.v2.model.OAuthLastTokenIssued;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.ServerDate;
import com.mypurecloud.sdk.v2.model.Team;
import com.mypurecloud.sdk.v2.model.TokenInfo;
import com.mypurecloud.sdk.v2.model.Trustor;
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
 * UserMe
 */

public class UserMe  implements Serializable {
  
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
  private ServerDate date = null;
  private GeolocationSettings geolocationSettings = null;
  private Organization organization = null;
  private List<OrganizationPresence> presenceDefinitions = new ArrayList<OrganizationPresence>();
  private List<LocationDefinition> locationDefinitions = new ArrayList<LocationDefinition>();
  private List<DomainOrganizationRole> orgAuthorization = new ArrayList<DomainOrganizationRole>();
  private List<User> favorites = new ArrayList<User>();
  private List<User> superiors = new ArrayList<User>();
  private List<User> directReports = new ArrayList<User>();
  private Adjacents adjacents = null;
  private List<RoutingSkill> routingSkills = new ArrayList<RoutingSkill>();
  private FieldConfigs fieldConfigs = null;
  private TokenInfo token = null;
  private List<Trustor> trustors = new ArrayList<Trustor>();
  private List<DomainOrganizationProduct> orgProducts = new ArrayList<DomainOrganizationProduct>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public UserMe name(String name) {
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
  public UserMe division(Division division) {
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
  public UserMe chat(Chat chat) {
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
  public UserMe department(String department) {
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
  public UserMe email(String email) {
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
  public UserMe addresses(List<Contact> addresses) {
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
  public UserMe title(String title) {
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
  public UserMe username(String username) {
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
  public UserMe manager(User manager) {
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
  public UserMe images(List<UserImage> images) {
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
  public UserMe version(Integer version) {
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
  public UserMe certifications(List<String> certifications) {
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
  public UserMe biography(Biography biography) {
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
  public UserMe employerInfo(EmployerInfo employerInfo) {
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
  public UserMe acdAutoAnswer(Boolean acdAutoAnswer) {
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
  public UserMe lastTokenIssued(OAuthLastTokenIssued lastTokenIssued) {
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

  
  @ApiModelProperty(example = "null", value = "The PureCloud system date time.")
  @JsonProperty("date")
  public ServerDate getDate() {
    return date;
  }

  
  @ApiModelProperty(example = "null", value = "Geolocation settings for user's organization.")
  @JsonProperty("geolocationSettings")
  public GeolocationSettings getGeolocationSettings() {
    return geolocationSettings;
  }

  
  @ApiModelProperty(example = "null", value = "Organization details for this user.")
  @JsonProperty("organization")
  public Organization getOrganization() {
    return organization;
  }

  
  @ApiModelProperty(example = "null", value = "The first 100 presence definitions for user's organization.")
  @JsonProperty("presenceDefinitions")
  public List<OrganizationPresence> getPresenceDefinitions() {
    return presenceDefinitions;
  }

  
  @ApiModelProperty(example = "null", value = "The first 100 site locations for user's organization")
  @JsonProperty("locationDefinitions")
  public List<LocationDefinition> getLocationDefinitions() {
    return locationDefinitions;
  }

  
  @ApiModelProperty(example = "null", value = "The first 100 organization roles, with applicable permission policies, for user's organization.")
  @JsonProperty("orgAuthorization")
  public List<DomainOrganizationRole> getOrgAuthorization() {
    return orgAuthorization;
  }

  
  @ApiModelProperty(example = "null", value = "The first 50 favorited users.")
  @JsonProperty("favorites")
  public List<User> getFavorites() {
    return favorites;
  }

  
  @ApiModelProperty(example = "null", value = "The first 50 superiors of this user.")
  @JsonProperty("superiors")
  public List<User> getSuperiors() {
    return superiors;
  }

  
  @ApiModelProperty(example = "null", value = "The first 50 direct reports to this user.")
  @JsonProperty("directReports")
  public List<User> getDirectReports() {
    return directReports;
  }

  
  @ApiModelProperty(example = "null", value = "The first 50 superiors, direct reports, and siblings of this user. Mutually exclusive with superiors and direct reports expands.")
  @JsonProperty("adjacents")
  public Adjacents getAdjacents() {
    return adjacents;
  }

  
  @ApiModelProperty(example = "null", value = "The first 50 routing skills for user's organizations")
  @JsonProperty("routingSkills")
  public List<RoutingSkill> getRoutingSkills() {
    return routingSkills;
  }

  
  @ApiModelProperty(example = "null", value = "The field config for all entities types of user's organization")
  @JsonProperty("fieldConfigs")
  public FieldConfigs getFieldConfigs() {
    return fieldConfigs;
  }

  
  @ApiModelProperty(example = "null", value = "Information about the current token")
  @JsonProperty("token")
  public TokenInfo getToken() {
    return token;
  }

  
  @ApiModelProperty(example = "null", value = "Organizations having this user as a trustee")
  @JsonProperty("trustors")
  public List<Trustor> getTrustors() {
    return trustors;
  }

  
  @ApiModelProperty(example = "null", value = "Products enabled in this organization")
  @JsonProperty("orgProducts")
  public List<DomainOrganizationProduct> getOrgProducts() {
    return orgProducts;
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
    UserMe userMe = (UserMe) o;
    return Objects.equals(this.id, userMe.id) &&
        Objects.equals(this.name, userMe.name) &&
        Objects.equals(this.division, userMe.division) &&
        Objects.equals(this.chat, userMe.chat) &&
        Objects.equals(this.department, userMe.department) &&
        Objects.equals(this.email, userMe.email) &&
        Objects.equals(this.primaryContactInfo, userMe.primaryContactInfo) &&
        Objects.equals(this.addresses, userMe.addresses) &&
        Objects.equals(this.state, userMe.state) &&
        Objects.equals(this.title, userMe.title) &&
        Objects.equals(this.username, userMe.username) &&
        Objects.equals(this.manager, userMe.manager) &&
        Objects.equals(this.images, userMe.images) &&
        Objects.equals(this.version, userMe.version) &&
        Objects.equals(this.certifications, userMe.certifications) &&
        Objects.equals(this.biography, userMe.biography) &&
        Objects.equals(this.employerInfo, userMe.employerInfo) &&
        Objects.equals(this.routingStatus, userMe.routingStatus) &&
        Objects.equals(this.presence, userMe.presence) &&
        Objects.equals(this.conversationSummary, userMe.conversationSummary) &&
        Objects.equals(this.outOfOffice, userMe.outOfOffice) &&
        Objects.equals(this.geolocation, userMe.geolocation) &&
        Objects.equals(this.station, userMe.station) &&
        Objects.equals(this.authorization, userMe.authorization) &&
        Objects.equals(this.profileSkills, userMe.profileSkills) &&
        Objects.equals(this.locations, userMe.locations) &&
        Objects.equals(this.groups, userMe.groups) &&
        Objects.equals(this.team, userMe.team) &&
        Objects.equals(this.skills, userMe.skills) &&
        Objects.equals(this.languages, userMe.languages) &&
        Objects.equals(this.acdAutoAnswer, userMe.acdAutoAnswer) &&
        Objects.equals(this.languagePreference, userMe.languagePreference) &&
        Objects.equals(this.lastTokenIssued, userMe.lastTokenIssued) &&
        Objects.equals(this.dateLastLogin, userMe.dateLastLogin) &&
        Objects.equals(this.date, userMe.date) &&
        Objects.equals(this.geolocationSettings, userMe.geolocationSettings) &&
        Objects.equals(this.organization, userMe.organization) &&
        Objects.equals(this.presenceDefinitions, userMe.presenceDefinitions) &&
        Objects.equals(this.locationDefinitions, userMe.locationDefinitions) &&
        Objects.equals(this.orgAuthorization, userMe.orgAuthorization) &&
        Objects.equals(this.favorites, userMe.favorites) &&
        Objects.equals(this.superiors, userMe.superiors) &&
        Objects.equals(this.directReports, userMe.directReports) &&
        Objects.equals(this.adjacents, userMe.adjacents) &&
        Objects.equals(this.routingSkills, userMe.routingSkills) &&
        Objects.equals(this.fieldConfigs, userMe.fieldConfigs) &&
        Objects.equals(this.token, userMe.token) &&
        Objects.equals(this.trustors, userMe.trustors) &&
        Objects.equals(this.orgProducts, userMe.orgProducts) &&
        Objects.equals(this.selfUri, userMe.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, chat, department, email, primaryContactInfo, addresses, state, title, username, manager, images, version, certifications, biography, employerInfo, routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups, team, skills, languages, acdAutoAnswer, languagePreference, lastTokenIssued, dateLastLogin, date, geolocationSettings, organization, presenceDefinitions, locationDefinitions, orgAuthorization, favorites, superiors, directReports, adjacents, routingSkills, fieldConfigs, token, trustors, orgProducts, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMe {\n");
    
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
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    geolocationSettings: ").append(toIndentedString(geolocationSettings)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    presenceDefinitions: ").append(toIndentedString(presenceDefinitions)).append("\n");
    sb.append("    locationDefinitions: ").append(toIndentedString(locationDefinitions)).append("\n");
    sb.append("    orgAuthorization: ").append(toIndentedString(orgAuthorization)).append("\n");
    sb.append("    favorites: ").append(toIndentedString(favorites)).append("\n");
    sb.append("    superiors: ").append(toIndentedString(superiors)).append("\n");
    sb.append("    directReports: ").append(toIndentedString(directReports)).append("\n");
    sb.append("    adjacents: ").append(toIndentedString(adjacents)).append("\n");
    sb.append("    routingSkills: ").append(toIndentedString(routingSkills)).append("\n");
    sb.append("    fieldConfigs: ").append(toIndentedString(fieldConfigs)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    trustors: ").append(toIndentedString(trustors)).append("\n");
    sb.append("    orgProducts: ").append(toIndentedString(orgProducts)).append("\n");
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

