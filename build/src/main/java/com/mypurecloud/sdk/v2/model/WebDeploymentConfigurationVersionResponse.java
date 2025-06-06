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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.AuthenticationSettings;
import com.mypurecloud.sdk.v2.model.CobrowseSettings;
import com.mypurecloud.sdk.v2.model.CustomI18nLabels;
import com.mypurecloud.sdk.v2.model.JourneyEventsSettings;
import com.mypurecloud.sdk.v2.model.MessengerSettings;
import com.mypurecloud.sdk.v2.model.PositionSettings;
import com.mypurecloud.sdk.v2.model.SupportCenterSettings;
import com.mypurecloud.sdk.v2.model.VideoSettings;
import com.mypurecloud.sdk.v2.model.WebDeploymentHeadlessMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Details about the configuration version of a Web Deployment
 */
@ApiModel(description = "Details about the configuration version of a Web Deployment")

public class WebDeploymentConfigurationVersionResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String version = null;
  private WebDeploymentHeadlessMode headlessMode = null;
  private String description = null;
  private List<String> languages = null;
  private String defaultLanguage = null;
  private List<CustomI18nLabels> customI18nLabels = null;
  private MessengerSettings messenger = null;
  private PositionSettings position = null;
  private SupportCenterSettings supportCenter = null;
  private CobrowseSettings cobrowse = null;
  private JourneyEventsSettings journeyEvents = null;
  private AuthenticationSettings authenticationSettings = null;
  private VideoSettings video = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Date datePublished = null;
  private AddressableEntityRef lastModifiedUser = null;
  private AddressableEntityRef createdUser = null;
  private AddressableEntityRef publishedUser = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current status of the configuration version
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    ERROR("Error"),
    DELETING("Deleting");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String selfUri = null;

  public WebDeploymentConfigurationVersionResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      languages = new ArrayList<String>();
      customI18nLabels = new ArrayList<CustomI18nLabels>();
    }
  }

  
  /**
   * The configuration version ID
   **/
  public WebDeploymentConfigurationVersionResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration version ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The configuration version name
   **/
  public WebDeploymentConfigurationVersionResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The configuration version name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The version of the configuration
   **/
  public WebDeploymentConfigurationVersionResponse version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "DRAFT, 1, 2", value = "The version of the configuration")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Headless Mode Support which Controls UI components. When enabled, native UI components will be disabled and allows for custom-built UI.
   **/
  public WebDeploymentConfigurationVersionResponse headlessMode(WebDeploymentHeadlessMode headlessMode) {
    this.headlessMode = headlessMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Headless Mode Support which Controls UI components. When enabled, native UI components will be disabled and allows for custom-built UI.")
  @JsonProperty("headlessMode")
  public WebDeploymentHeadlessMode getHeadlessMode() {
    return headlessMode;
  }
  public void setHeadlessMode(WebDeploymentHeadlessMode headlessMode) {
    this.headlessMode = headlessMode;
  }


  /**
   * The description of the configuration
   **/
  public WebDeploymentConfigurationVersionResponse description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the configuration")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * A list of languages supported on the configuration required if the messenger is enabled
   **/
  public WebDeploymentConfigurationVersionResponse languages(List<String> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "en-us, de-de", value = "A list of languages supported on the configuration required if the messenger is enabled")
  @JsonProperty("languages")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }


  /**
   * The default language to use for the configuration required if the messenger is enabled
   **/
  public WebDeploymentConfigurationVersionResponse defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "en-us, de-de", value = "The default language to use for the configuration required if the messenger is enabled")
  @JsonProperty("defaultLanguage")
  public String getDefaultLanguage() {
    return defaultLanguage;
  }
  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }


  /**
   * The localization settings for homescreen app
   **/
  public WebDeploymentConfigurationVersionResponse customI18nLabels(List<CustomI18nLabels> customI18nLabels) {
    this.customI18nLabels = customI18nLabels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The localization settings for homescreen app")
  @JsonProperty("customI18nLabels")
  public List<CustomI18nLabels> getCustomI18nLabels() {
    return customI18nLabels;
  }
  public void setCustomI18nLabels(List<CustomI18nLabels> customI18nLabels) {
    this.customI18nLabels = customI18nLabels;
  }


  /**
   * The settings for messenger
   **/
  public WebDeploymentConfigurationVersionResponse messenger(MessengerSettings messenger) {
    this.messenger = messenger;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for messenger")
  @JsonProperty("messenger")
  public MessengerSettings getMessenger() {
    return messenger;
  }
  public void setMessenger(MessengerSettings messenger) {
    this.messenger = messenger;
  }


  /**
   * The settings for position
   **/
  public WebDeploymentConfigurationVersionResponse position(PositionSettings position) {
    this.position = position;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for position")
  @JsonProperty("position")
  public PositionSettings getPosition() {
    return position;
  }
  public void setPosition(PositionSettings position) {
    this.position = position;
  }


  /**
   * The settings for knowledge portal (previously support center)
   **/
  public WebDeploymentConfigurationVersionResponse supportCenter(SupportCenterSettings supportCenter) {
    this.supportCenter = supportCenter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for knowledge portal (previously support center)")
  @JsonProperty("supportCenter")
  public SupportCenterSettings getSupportCenter() {
    return supportCenter;
  }
  public void setSupportCenter(SupportCenterSettings supportCenter) {
    this.supportCenter = supportCenter;
  }


  /**
   * The settings for cobrowse
   **/
  public WebDeploymentConfigurationVersionResponse cobrowse(CobrowseSettings cobrowse) {
    this.cobrowse = cobrowse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for cobrowse")
  @JsonProperty("cobrowse")
  public CobrowseSettings getCobrowse() {
    return cobrowse;
  }
  public void setCobrowse(CobrowseSettings cobrowse) {
    this.cobrowse = cobrowse;
  }


  /**
   * The settings for journey events
   **/
  public WebDeploymentConfigurationVersionResponse journeyEvents(JourneyEventsSettings journeyEvents) {
    this.journeyEvents = journeyEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for journey events")
  @JsonProperty("journeyEvents")
  public JourneyEventsSettings getJourneyEvents() {
    return journeyEvents;
  }
  public void setJourneyEvents(JourneyEventsSettings journeyEvents) {
    this.journeyEvents = journeyEvents;
  }


  /**
   * The settings for authenticated deployments
   **/
  public WebDeploymentConfigurationVersionResponse authenticationSettings(AuthenticationSettings authenticationSettings) {
    this.authenticationSettings = authenticationSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for authenticated deployments")
  @JsonProperty("authenticationSettings")
  public AuthenticationSettings getAuthenticationSettings() {
    return authenticationSettings;
  }
  public void setAuthenticationSettings(AuthenticationSettings authenticationSettings) {
    this.authenticationSettings = authenticationSettings;
  }


  /**
   * The settings for video
   **/
  public WebDeploymentConfigurationVersionResponse video(VideoSettings video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for video")
  @JsonProperty("video")
  public VideoSettings getVideo() {
    return video;
  }
  public void setVideo(VideoSettings video) {
    this.video = video;
  }


  @ApiModelProperty(example = "null", value = "The date the configuration version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The date the configuration version was most recently modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The date the configuration version was most recently published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("datePublished")
  public Date getDatePublished() {
    return datePublished;
  }


  @ApiModelProperty(example = "null", value = "A reference to the user who most recently modified the configuration version")
  @JsonProperty("lastModifiedUser")
  public AddressableEntityRef getLastModifiedUser() {
    return lastModifiedUser;
  }


  @ApiModelProperty(example = "null", value = "A reference to the user who created the configuration version")
  @JsonProperty("createdUser")
  public AddressableEntityRef getCreatedUser() {
    return createdUser;
  }


  @ApiModelProperty(example = "null", value = "A reference to the user who published the configuration version")
  @JsonProperty("publishedUser")
  public AddressableEntityRef getPublishedUser() {
    return publishedUser;
  }


  /**
   * The current status of the configuration version
   **/
  public WebDeploymentConfigurationVersionResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current status of the configuration version")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
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
    WebDeploymentConfigurationVersionResponse webDeploymentConfigurationVersionResponse = (WebDeploymentConfigurationVersionResponse) o;

    return Objects.equals(this.id, webDeploymentConfigurationVersionResponse.id) &&
            Objects.equals(this.name, webDeploymentConfigurationVersionResponse.name) &&
            Objects.equals(this.version, webDeploymentConfigurationVersionResponse.version) &&
            Objects.equals(this.headlessMode, webDeploymentConfigurationVersionResponse.headlessMode) &&
            Objects.equals(this.description, webDeploymentConfigurationVersionResponse.description) &&
            Objects.equals(this.languages, webDeploymentConfigurationVersionResponse.languages) &&
            Objects.equals(this.defaultLanguage, webDeploymentConfigurationVersionResponse.defaultLanguage) &&
            Objects.equals(this.customI18nLabels, webDeploymentConfigurationVersionResponse.customI18nLabels) &&
            Objects.equals(this.messenger, webDeploymentConfigurationVersionResponse.messenger) &&
            Objects.equals(this.position, webDeploymentConfigurationVersionResponse.position) &&
            Objects.equals(this.supportCenter, webDeploymentConfigurationVersionResponse.supportCenter) &&
            Objects.equals(this.cobrowse, webDeploymentConfigurationVersionResponse.cobrowse) &&
            Objects.equals(this.journeyEvents, webDeploymentConfigurationVersionResponse.journeyEvents) &&
            Objects.equals(this.authenticationSettings, webDeploymentConfigurationVersionResponse.authenticationSettings) &&
            Objects.equals(this.video, webDeploymentConfigurationVersionResponse.video) &&
            Objects.equals(this.dateCreated, webDeploymentConfigurationVersionResponse.dateCreated) &&
            Objects.equals(this.dateModified, webDeploymentConfigurationVersionResponse.dateModified) &&
            Objects.equals(this.datePublished, webDeploymentConfigurationVersionResponse.datePublished) &&
            Objects.equals(this.lastModifiedUser, webDeploymentConfigurationVersionResponse.lastModifiedUser) &&
            Objects.equals(this.createdUser, webDeploymentConfigurationVersionResponse.createdUser) &&
            Objects.equals(this.publishedUser, webDeploymentConfigurationVersionResponse.publishedUser) &&
            Objects.equals(this.status, webDeploymentConfigurationVersionResponse.status) &&
            Objects.equals(this.selfUri, webDeploymentConfigurationVersionResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, headlessMode, description, languages, defaultLanguage, customI18nLabels, messenger, position, supportCenter, cobrowse, journeyEvents, authenticationSettings, video, dateCreated, dateModified, datePublished, lastModifiedUser, createdUser, publishedUser, status, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentConfigurationVersionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    headlessMode: ").append(toIndentedString(headlessMode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    customI18nLabels: ").append(toIndentedString(customI18nLabels)).append("\n");
    sb.append("    messenger: ").append(toIndentedString(messenger)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    supportCenter: ").append(toIndentedString(supportCenter)).append("\n");
    sb.append("    cobrowse: ").append(toIndentedString(cobrowse)).append("\n");
    sb.append("    journeyEvents: ").append(toIndentedString(journeyEvents)).append("\n");
    sb.append("    authenticationSettings: ").append(toIndentedString(authenticationSettings)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    datePublished: ").append(toIndentedString(datePublished)).append("\n");
    sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
    sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
    sb.append("    publishedUser: ").append(toIndentedString(publishedUser)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

