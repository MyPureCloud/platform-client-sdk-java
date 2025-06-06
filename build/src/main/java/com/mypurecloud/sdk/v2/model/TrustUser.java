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
import com.mypurecloud.sdk.v2.model.Biography;
import com.mypurecloud.sdk.v2.model.Chat;
import com.mypurecloud.sdk.v2.model.Contact;
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.EmployerInfo;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.Image;
import com.mypurecloud.sdk.v2.model.Location;
import com.mypurecloud.sdk.v2.model.OAuthLastTokenIssued;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.Team;
import com.mypurecloud.sdk.v2.model.TrustUserDetails;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserConversationSummary;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.UserStations;
import com.mypurecloud.sdk.v2.model.WorkPlanBidRanks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TrustUser
 */

public class TrustUser  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private Chat chat = null;
  private String department = null;
  private String email = null;
  private List<Contact> primaryContactInfo = null;
  private List<Contact> addresses = null;

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
  private List<Image> images = null;
  private Integer version = null;
  private List<String> certifications = null;
  private Biography biography = null;
  private EmployerInfo employerInfo = null;
  private String preferredName = null;
  private RoutingStatus routingStatus = null;
  private UserPresence presence = null;
  private UserPresence integrationPresence = null;
  private UserConversationSummary conversationSummary = null;
  private OutOfOffice outOfOffice = null;
  private Geolocation geolocation = null;
  private UserStations station = null;
  private UserAuthorization authorization = null;
  private List<String> profileSkills = null;
  private List<Location> locations = null;
  private List<Group> groups = null;
  private Team team = null;
  private WorkPlanBidRanks workPlanBidRanks = null;
  private List<UserRoutingSkill> skills = null;
  private List<UserRoutingLanguage> languages = null;
  private Boolean acdAutoAnswer = null;
  private String languagePreference = null;
  private OAuthLastTokenIssued lastTokenIssued = null;
  private Date dateLastLogin = null;
  private Date dateWelcomeSent = null;
  private TrustUserDetails trustUserDetails = null;

  public TrustUser() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      primaryContactInfo = new ArrayList<Contact>();
      addresses = new ArrayList<Contact>();
      images = new ArrayList<Image>();
      certifications = new ArrayList<String>();
      profileSkills = new ArrayList<String>();
      locations = new ArrayList<Location>();
      groups = new ArrayList<Group>();
      skills = new ArrayList<UserRoutingSkill>();
      languages = new ArrayList<UserRoutingLanguage>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public TrustUser name(String name) {
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
  public TrustUser division(Division division) {
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
  public TrustUser chat(Chat chat) {
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
  public TrustUser department(String department) {
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
  public TrustUser email(String email) {
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
  public TrustUser addresses(List<Contact> addresses) {
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
  public TrustUser title(String title) {
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
  public TrustUser username(String username) {
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
  public TrustUser manager(User manager) {
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
  public TrustUser images(List<Image> images) {
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
   * Required when updating a user, this value should be the current version of the user.  The current version can be obtained with a GET on the user before doing a PATCH.
   **/
  public TrustUser version(Integer version) {
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
  public TrustUser certifications(List<String> certifications) {
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
  public TrustUser biography(Biography biography) {
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
  public TrustUser employerInfo(EmployerInfo employerInfo) {
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


  /**
   * Preferred full name of the agent
   **/
  public TrustUser preferredName(String preferredName) {
    this.preferredName = preferredName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Preferred full name of the agent")
  @JsonProperty("preferredName")
  public String getPreferredName() {
    return preferredName;
  }
  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
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


  @ApiModelProperty(example = "null", value = "Integration presence")
  @JsonProperty("integrationPresence")
  public UserPresence getIntegrationPresence() {
    return integrationPresence;
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


  @ApiModelProperty(example = "null", value = "The WFM work plan bid rank settings for the user")
  @JsonProperty("workPlanBidRanks")
  public WorkPlanBidRanks getWorkPlanBidRanks() {
    return workPlanBidRanks;
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
  public TrustUser acdAutoAnswer(Boolean acdAutoAnswer) {
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
  public TrustUser lastTokenIssued(OAuthLastTokenIssued lastTokenIssued) {
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


  @ApiModelProperty(example = "null", value = "The date & time the user was sent their welcome email. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateWelcomeSent")
  public Date getDateWelcomeSent() {
    return dateWelcomeSent;
  }


  /**
   **/
  public TrustUser trustUserDetails(TrustUserDetails trustUserDetails) {
    this.trustUserDetails = trustUserDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trustUserDetails")
  public TrustUserDetails getTrustUserDetails() {
    return trustUserDetails;
  }
  public void setTrustUserDetails(TrustUserDetails trustUserDetails) {
    this.trustUserDetails = trustUserDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustUser trustUser = (TrustUser) o;

    return Objects.equals(this.id, trustUser.id) &&
            Objects.equals(this.name, trustUser.name) &&
            Objects.equals(this.division, trustUser.division) &&
            Objects.equals(this.chat, trustUser.chat) &&
            Objects.equals(this.department, trustUser.department) &&
            Objects.equals(this.email, trustUser.email) &&
            Objects.equals(this.primaryContactInfo, trustUser.primaryContactInfo) &&
            Objects.equals(this.addresses, trustUser.addresses) &&
            Objects.equals(this.state, trustUser.state) &&
            Objects.equals(this.title, trustUser.title) &&
            Objects.equals(this.username, trustUser.username) &&
            Objects.equals(this.manager, trustUser.manager) &&
            Objects.equals(this.images, trustUser.images) &&
            Objects.equals(this.version, trustUser.version) &&
            Objects.equals(this.certifications, trustUser.certifications) &&
            Objects.equals(this.biography, trustUser.biography) &&
            Objects.equals(this.employerInfo, trustUser.employerInfo) &&
            Objects.equals(this.preferredName, trustUser.preferredName) &&
            Objects.equals(this.routingStatus, trustUser.routingStatus) &&
            Objects.equals(this.presence, trustUser.presence) &&
            Objects.equals(this.integrationPresence, trustUser.integrationPresence) &&
            Objects.equals(this.conversationSummary, trustUser.conversationSummary) &&
            Objects.equals(this.outOfOffice, trustUser.outOfOffice) &&
            Objects.equals(this.geolocation, trustUser.geolocation) &&
            Objects.equals(this.station, trustUser.station) &&
            Objects.equals(this.authorization, trustUser.authorization) &&
            Objects.equals(this.profileSkills, trustUser.profileSkills) &&
            Objects.equals(this.locations, trustUser.locations) &&
            Objects.equals(this.groups, trustUser.groups) &&
            Objects.equals(this.team, trustUser.team) &&
            Objects.equals(this.workPlanBidRanks, trustUser.workPlanBidRanks) &&
            Objects.equals(this.skills, trustUser.skills) &&
            Objects.equals(this.languages, trustUser.languages) &&
            Objects.equals(this.acdAutoAnswer, trustUser.acdAutoAnswer) &&
            Objects.equals(this.languagePreference, trustUser.languagePreference) &&
            Objects.equals(this.lastTokenIssued, trustUser.lastTokenIssued) &&
            Objects.equals(this.dateLastLogin, trustUser.dateLastLogin) &&
            Objects.equals(this.dateWelcomeSent, trustUser.dateWelcomeSent) &&
            Objects.equals(this.trustUserDetails, trustUser.trustUserDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, chat, department, email, primaryContactInfo, addresses, state, title, username, manager, images, version, certifications, biography, employerInfo, preferredName, routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups, team, workPlanBidRanks, skills, languages, acdAutoAnswer, languagePreference, lastTokenIssued, dateLastLogin, dateWelcomeSent, trustUserDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustUser {\n");
    
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
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    integrationPresence: ").append(toIndentedString(integrationPresence)).append("\n");
    sb.append("    conversationSummary: ").append(toIndentedString(conversationSummary)).append("\n");
    sb.append("    outOfOffice: ").append(toIndentedString(outOfOffice)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    station: ").append(toIndentedString(station)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    profileSkills: ").append(toIndentedString(profileSkills)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    workPlanBidRanks: ").append(toIndentedString(workPlanBidRanks)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    acdAutoAnswer: ").append(toIndentedString(acdAutoAnswer)).append("\n");
    sb.append("    languagePreference: ").append(toIndentedString(languagePreference)).append("\n");
    sb.append("    lastTokenIssued: ").append(toIndentedString(lastTokenIssued)).append("\n");
    sb.append("    dateLastLogin: ").append(toIndentedString(dateLastLogin)).append("\n");
    sb.append("    dateWelcomeSent: ").append(toIndentedString(dateWelcomeSent)).append("\n");
    sb.append("    trustUserDetails: ").append(toIndentedString(trustUserDetails)).append("\n");
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

