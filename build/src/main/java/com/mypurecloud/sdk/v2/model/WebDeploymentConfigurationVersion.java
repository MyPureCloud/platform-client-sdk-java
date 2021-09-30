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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.AuthenticationSettings;
import com.mypurecloud.sdk.v2.model.CobrowseSettings;
import com.mypurecloud.sdk.v2.model.JourneyEventsSettings;
import com.mypurecloud.sdk.v2.model.MessengerSettings;
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

public class WebDeploymentConfigurationVersion  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String version = null;
  private String description = null;
  private List<String> languages = new ArrayList<String>();
  private String defaultLanguage = null;
  private MessengerSettings messenger = null;
  private CobrowseSettings cobrowse = null;
  private JourneyEventsSettings journeyEvents = null;
  private AuthenticationSettings authenticationSettings = null;
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

  
  @ApiModelProperty(example = "null", value = "The configuration version ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The configuration version name
   **/
  public WebDeploymentConfigurationVersion name(String name) {
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

  
  @ApiModelProperty(example = "DRAFT, 1, 2", value = "The version of the configuration")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  
  /**
   * The description of the configuration
   **/
  public WebDeploymentConfigurationVersion description(String description) {
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
   * A list of languages supported on the configuration
   **/
  public WebDeploymentConfigurationVersion languages(List<String> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "en-us, de-de", value = "A list of languages supported on the configuration")
  @JsonProperty("languages")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  
  /**
   * The default language to use for the configuration
   **/
  public WebDeploymentConfigurationVersion defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "en-us, de-de", value = "The default language to use for the configuration")
  @JsonProperty("defaultLanguage")
  public String getDefaultLanguage() {
    return defaultLanguage;
  }
  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  
  /**
   * The settings for messenger
   **/
  public WebDeploymentConfigurationVersion messenger(MessengerSettings messenger) {
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
   * The settings for cobrowse
   **/
  public WebDeploymentConfigurationVersion cobrowse(CobrowseSettings cobrowse) {
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
  public WebDeploymentConfigurationVersion journeyEvents(JourneyEventsSettings journeyEvents) {
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
  public WebDeploymentConfigurationVersion authenticationSettings(AuthenticationSettings authenticationSettings) {
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
  public WebDeploymentConfigurationVersion status(StatusEnum status) {
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
    WebDeploymentConfigurationVersion webDeploymentConfigurationVersion = (WebDeploymentConfigurationVersion) o;
    return Objects.equals(this.id, webDeploymentConfigurationVersion.id) &&
        Objects.equals(this.name, webDeploymentConfigurationVersion.name) &&
        Objects.equals(this.version, webDeploymentConfigurationVersion.version) &&
        Objects.equals(this.description, webDeploymentConfigurationVersion.description) &&
        Objects.equals(this.languages, webDeploymentConfigurationVersion.languages) &&
        Objects.equals(this.defaultLanguage, webDeploymentConfigurationVersion.defaultLanguage) &&
        Objects.equals(this.messenger, webDeploymentConfigurationVersion.messenger) &&
        Objects.equals(this.cobrowse, webDeploymentConfigurationVersion.cobrowse) &&
        Objects.equals(this.journeyEvents, webDeploymentConfigurationVersion.journeyEvents) &&
        Objects.equals(this.authenticationSettings, webDeploymentConfigurationVersion.authenticationSettings) &&
        Objects.equals(this.dateCreated, webDeploymentConfigurationVersion.dateCreated) &&
        Objects.equals(this.dateModified, webDeploymentConfigurationVersion.dateModified) &&
        Objects.equals(this.datePublished, webDeploymentConfigurationVersion.datePublished) &&
        Objects.equals(this.lastModifiedUser, webDeploymentConfigurationVersion.lastModifiedUser) &&
        Objects.equals(this.createdUser, webDeploymentConfigurationVersion.createdUser) &&
        Objects.equals(this.publishedUser, webDeploymentConfigurationVersion.publishedUser) &&
        Objects.equals(this.status, webDeploymentConfigurationVersion.status) &&
        Objects.equals(this.selfUri, webDeploymentConfigurationVersion.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, description, languages, defaultLanguage, messenger, cobrowse, journeyEvents, authenticationSettings, dateCreated, dateModified, datePublished, lastModifiedUser, createdUser, publishedUser, status, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentConfigurationVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    messenger: ").append(toIndentedString(messenger)).append("\n");
    sb.append("    cobrowse: ").append(toIndentedString(cobrowse)).append("\n");
    sb.append("    journeyEvents: ").append(toIndentedString(journeyEvents)).append("\n");
    sb.append("    authenticationSettings: ").append(toIndentedString(authenticationSettings)).append("\n");
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

