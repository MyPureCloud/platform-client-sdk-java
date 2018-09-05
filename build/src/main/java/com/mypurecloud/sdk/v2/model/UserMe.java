package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Adjacents;
import com.mypurecloud.sdk.v2.model.Chat;
import com.mypurecloud.sdk.v2.model.Contact;
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.DomainOrganizationProduct;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.FieldConfigs;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.GeolocationSettings;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.Location;
import com.mypurecloud.sdk.v2.model.LocationDefinition;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.ServerDate;
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
  private List<UserRoutingSkill> skills = new ArrayList<UserRoutingSkill>();
  private List<UserRoutingLanguage> languages = new ArrayList<UserRoutingLanguage>();
  private Boolean acdAutoAnswer = null;
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

  
  /**
   * Auto populated from addresses.
   **/
  public UserMe primaryContactInfo(List<Contact> primaryContactInfo) {
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
   * ACD routing status
   **/
  public UserMe routingStatus(RoutingStatus routingStatus) {
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
  public UserMe presence(UserPresence presence) {
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
  public UserMe conversationSummary(UserConversationSummary conversationSummary) {
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
  public UserMe outOfOffice(OutOfOffice outOfOffice) {
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
  public UserMe geolocation(Geolocation geolocation) {
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
  public UserMe station(UserStations station) {
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
  public UserMe authorization(UserAuthorization authorization) {
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
   * Profile skills possessed by the user
   **/
  public UserMe profileSkills(List<String> profileSkills) {
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
  public UserMe locations(List<Location> locations) {
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
  public UserMe groups(List<Group> groups) {
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
   * Routing (ACD) skills possessed by the user
   **/
  public UserMe skills(List<UserRoutingSkill> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing (ACD) skills possessed by the user")
  @JsonProperty("skills")
  public List<UserRoutingSkill> getSkills() {
    return skills;
  }
  public void setSkills(List<UserRoutingSkill> skills) {
    this.skills = skills;
  }

  
  /**
   * Routing (ACD) languages possessed by the user
   **/
  public UserMe languages(List<UserRoutingLanguage> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing (ACD) languages possessed by the user")
  @JsonProperty("languages")
  public List<UserRoutingLanguage> getLanguages() {
    return languages;
  }
  public void setLanguages(List<UserRoutingLanguage> languages) {
    this.languages = languages;
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

  
  /**
   * The PureCloud system date time.
   **/
  public UserMe date(ServerDate date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud system date time.")
  @JsonProperty("date")
  public ServerDate getDate() {
    return date;
  }
  public void setDate(ServerDate date) {
    this.date = date;
  }

  
  /**
   * Geolocation settings for user's organization.
   **/
  public UserMe geolocationSettings(GeolocationSettings geolocationSettings) {
    this.geolocationSettings = geolocationSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geolocation settings for user's organization.")
  @JsonProperty("geolocationSettings")
  public GeolocationSettings getGeolocationSettings() {
    return geolocationSettings;
  }
  public void setGeolocationSettings(GeolocationSettings geolocationSettings) {
    this.geolocationSettings = geolocationSettings;
  }

  
  /**
   * Organization details for this user.
   **/
  public UserMe organization(Organization organization) {
    this.organization = organization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Organization details for this user.")
  @JsonProperty("organization")
  public Organization getOrganization() {
    return organization;
  }
  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  
  /**
   * The first 100 presence definitions for user's organization.
   **/
  public UserMe presenceDefinitions(List<OrganizationPresence> presenceDefinitions) {
    this.presenceDefinitions = presenceDefinitions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first 100 presence definitions for user's organization.")
  @JsonProperty("presenceDefinitions")
  public List<OrganizationPresence> getPresenceDefinitions() {
    return presenceDefinitions;
  }
  public void setPresenceDefinitions(List<OrganizationPresence> presenceDefinitions) {
    this.presenceDefinitions = presenceDefinitions;
  }

  
  /**
   * The first 100 site locations for user's organization
   **/
  public UserMe locationDefinitions(List<LocationDefinition> locationDefinitions) {
    this.locationDefinitions = locationDefinitions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first 100 site locations for user's organization")
  @JsonProperty("locationDefinitions")
  public List<LocationDefinition> getLocationDefinitions() {
    return locationDefinitions;
  }
  public void setLocationDefinitions(List<LocationDefinition> locationDefinitions) {
    this.locationDefinitions = locationDefinitions;
  }

  
  /**
   * The first 100 organization roles, with applicable permission policies, for user's organization.
   **/
  public UserMe orgAuthorization(List<DomainOrganizationRole> orgAuthorization) {
    this.orgAuthorization = orgAuthorization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first 100 organization roles, with applicable permission policies, for user's organization.")
  @JsonProperty("orgAuthorization")
  public List<DomainOrganizationRole> getOrgAuthorization() {
    return orgAuthorization;
  }
  public void setOrgAuthorization(List<DomainOrganizationRole> orgAuthorization) {
    this.orgAuthorization = orgAuthorization;
  }

  
  /**
   * The first 50 favorited users.
   **/
  public UserMe favorites(List<User> favorites) {
    this.favorites = favorites;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first 50 favorited users.")
  @JsonProperty("favorites")
  public List<User> getFavorites() {
    return favorites;
  }
  public void setFavorites(List<User> favorites) {
    this.favorites = favorites;
  }

  
  /**
   * The first 50 superiors of this user.
   **/
  public UserMe superiors(List<User> superiors) {
    this.superiors = superiors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first 50 superiors of this user.")
  @JsonProperty("superiors")
  public List<User> getSuperiors() {
    return superiors;
  }
  public void setSuperiors(List<User> superiors) {
    this.superiors = superiors;
  }

  
  /**
   * The first 50 direct reports to this user.
   **/
  public UserMe directReports(List<User> directReports) {
    this.directReports = directReports;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first 50 direct reports to this user.")
  @JsonProperty("directReports")
  public List<User> getDirectReports() {
    return directReports;
  }
  public void setDirectReports(List<User> directReports) {
    this.directReports = directReports;
  }

  
  /**
   * The first 50 superiors, direct reports, and siblings of this user. Mutually exclusive with superiors and direct reports expands.
   **/
  public UserMe adjacents(Adjacents adjacents) {
    this.adjacents = adjacents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first 50 superiors, direct reports, and siblings of this user. Mutually exclusive with superiors and direct reports expands.")
  @JsonProperty("adjacents")
  public Adjacents getAdjacents() {
    return adjacents;
  }
  public void setAdjacents(Adjacents adjacents) {
    this.adjacents = adjacents;
  }

  
  /**
   * The first 50 routing skills for user's organizations
   **/
  public UserMe routingSkills(List<RoutingSkill> routingSkills) {
    this.routingSkills = routingSkills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first 50 routing skills for user's organizations")
  @JsonProperty("routingSkills")
  public List<RoutingSkill> getRoutingSkills() {
    return routingSkills;
  }
  public void setRoutingSkills(List<RoutingSkill> routingSkills) {
    this.routingSkills = routingSkills;
  }

  
  /**
   * The field config for all entities types of user's organization
   **/
  public UserMe fieldConfigs(FieldConfigs fieldConfigs) {
    this.fieldConfigs = fieldConfigs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The field config for all entities types of user's organization")
  @JsonProperty("fieldConfigs")
  public FieldConfigs getFieldConfigs() {
    return fieldConfigs;
  }
  public void setFieldConfigs(FieldConfigs fieldConfigs) {
    this.fieldConfigs = fieldConfigs;
  }

  
  /**
   * Information about the current token
   **/
  public UserMe token(TokenInfo token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the current token")
  @JsonProperty("token")
  public TokenInfo getToken() {
    return token;
  }
  public void setToken(TokenInfo token) {
    this.token = token;
  }

  
  /**
   * Organizations having this user as a trustee
   **/
  public UserMe trustors(List<Trustor> trustors) {
    this.trustors = trustors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Organizations having this user as a trustee")
  @JsonProperty("trustors")
  public List<Trustor> getTrustors() {
    return trustors;
  }
  public void setTrustors(List<Trustor> trustors) {
    this.trustors = trustors;
  }

  
  /**
   * Products enabled in this organization
   **/
  public UserMe orgProducts(List<DomainOrganizationProduct> orgProducts) {
    this.orgProducts = orgProducts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Products enabled in this organization")
  @JsonProperty("orgProducts")
  public List<DomainOrganizationProduct> getOrgProducts() {
    return orgProducts;
  }
  public void setOrgProducts(List<DomainOrganizationProduct> orgProducts) {
    this.orgProducts = orgProducts;
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
        Objects.equals(this.skills, userMe.skills) &&
        Objects.equals(this.languages, userMe.languages) &&
        Objects.equals(this.acdAutoAnswer, userMe.acdAutoAnswer) &&
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
    return Objects.hash(id, name, division, chat, department, email, primaryContactInfo, addresses, state, title, username, manager, images, version, routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups, skills, languages, acdAutoAnswer, date, geolocationSettings, organization, presenceDefinitions, locationDefinitions, orgAuthorization, favorites, superiors, directReports, adjacents, routingSkills, fieldConfigs, token, trustors, orgProducts, selfUri);
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
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    acdAutoAnswer: ").append(toIndentedString(acdAutoAnswer)).append("\n");
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

