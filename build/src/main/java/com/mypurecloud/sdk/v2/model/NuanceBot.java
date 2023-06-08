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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.NuanceApplication;
import com.mypurecloud.sdk.v2.model.NuanceBotCredentials;
import com.mypurecloud.sdk.v2.model.NuanceBotTransferNode;
import com.mypurecloud.sdk.v2.model.NuanceBotVariable;
import com.mypurecloud.sdk.v2.model.NuanceChannel;
import com.mypurecloud.sdk.v2.model.NuanceEnvironment;
import com.mypurecloud.sdk.v2.model.NuanceGeography;
import com.mypurecloud.sdk.v2.model.NuanceOrganization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Model for a Nuance bot
 */
@ApiModel(description = "Model for a Nuance bot")

public class NuanceBot  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String integrationId = null;
  private NuanceOrganization nuanceOrganization = null;
  private NuanceApplication application = null;
  private NuanceEnvironment nuanceEnvironment = null;
  private NuanceGeography geography = null;
  private List<NuanceBotCredentials> credentials = new ArrayList<NuanceBotCredentials>();
  private List<NuanceBotVariable> variables = new ArrayList<NuanceBotVariable>();
  private List<NuanceBotTransferNode> transferNodes = new ArrayList<NuanceBotTransferNode>();
  private List<String> locales = new ArrayList<String>();
  private List<NuanceChannel> channels = new ArrayList<NuanceChannel>();
  private String selfUri = null;

  
  /**
   * Nuance bot Id
   **/
  public NuanceBot id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nuance bot Id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Nuance bot name
   **/
  public NuanceBot name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nuance bot name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The Integration Id for this bot
   **/
  public NuanceBot integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Integration Id for this bot")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  /**
   * The Nuance Organization for this bot
   **/
  public NuanceBot nuanceOrganization(NuanceOrganization nuanceOrganization) {
    this.nuanceOrganization = nuanceOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Nuance Organization for this bot")
  @JsonProperty("nuanceOrganization")
  public NuanceOrganization getNuanceOrganization() {
    return nuanceOrganization;
  }
  public void setNuanceOrganization(NuanceOrganization nuanceOrganization) {
    this.nuanceOrganization = nuanceOrganization;
  }


  /**
   * The Application for this bot
   **/
  public NuanceBot application(NuanceApplication application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Application for this bot")
  @JsonProperty("application")
  public NuanceApplication getApplication() {
    return application;
  }
  public void setApplication(NuanceApplication application) {
    this.application = application;
  }


  /**
   * The environment of the Nuance bot
   **/
  public NuanceBot nuanceEnvironment(NuanceEnvironment nuanceEnvironment) {
    this.nuanceEnvironment = nuanceEnvironment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The environment of the Nuance bot")
  @JsonProperty("nuanceEnvironment")
  public NuanceEnvironment getNuanceEnvironment() {
    return nuanceEnvironment;
  }
  public void setNuanceEnvironment(NuanceEnvironment nuanceEnvironment) {
    this.nuanceEnvironment = nuanceEnvironment;
  }


  /**
   * The Geography of the Nuance bot
   **/
  public NuanceBot geography(NuanceGeography geography) {
    this.geography = geography;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Geography of the Nuance bot")
  @JsonProperty("geography")
  public NuanceGeography getGeography() {
    return geography;
  }
  public void setGeography(NuanceGeography geography) {
    this.geography = geography;
  }


  /**
   * client ID/Secret objects for the credentials that execute this Nuance bot
   **/
  public NuanceBot credentials(List<NuanceBotCredentials> credentials) {
    this.credentials = credentials;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "client ID/Secret objects for the credentials that execute this Nuance bot")
  @JsonProperty("credentials")
  public List<NuanceBotCredentials> getCredentials() {
    return credentials;
  }
  public void setCredentials(List<NuanceBotCredentials> credentials) {
    this.credentials = credentials;
  }


  /**
   * List of available variables in this Nuance bot.  When querying, use the 'expand=variables' query param to populate this value
   **/
  public NuanceBot variables(List<NuanceBotVariable> variables) {
    this.variables = variables;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of available variables in this Nuance bot.  When querying, use the 'expand=variables' query param to populate this value")
  @JsonProperty("variables")
  public List<NuanceBotVariable> getVariables() {
    return variables;
  }
  public void setVariables(List<NuanceBotVariable> variables) {
    this.variables = variables;
  }


  /**
   * List of transferNodes in this Nuance bot.  When querying, use the 'expand=transferNodes' query param to populate this value
   **/
  public NuanceBot transferNodes(List<NuanceBotTransferNode> transferNodes) {
    this.transferNodes = transferNodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of transferNodes in this Nuance bot.  When querying, use the 'expand=transferNodes' query param to populate this value")
  @JsonProperty("transferNodes")
  public List<NuanceBotTransferNode> getTransferNodes() {
    return transferNodes;
  }
  public void setTransferNodes(List<NuanceBotTransferNode> transferNodes) {
    this.transferNodes = transferNodes;
  }


  /**
   * List of locales associated with this Nuance bot.  Generally in the ISO format such as 'en-US'
   **/
  public NuanceBot locales(List<String> locales) {
    this.locales = locales;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of locales associated with this Nuance bot.  Generally in the ISO format such as 'en-US'")
  @JsonProperty("locales")
  public List<String> getLocales() {
    return locales;
  }
  public void setLocales(List<String> locales) {
    this.locales = locales;
  }


  /**
   * List of channels associated with this Nuance bot.
   **/
  public NuanceBot channels(List<NuanceChannel> channels) {
    this.channels = channels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of channels associated with this Nuance bot.")
  @JsonProperty("channels")
  public List<NuanceChannel> getChannels() {
    return channels;
  }
  public void setChannels(List<NuanceChannel> channels) {
    this.channels = channels;
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
    NuanceBot nuanceBot = (NuanceBot) o;

    return Objects.equals(this.id, nuanceBot.id) &&
            Objects.equals(this.name, nuanceBot.name) &&
            Objects.equals(this.integrationId, nuanceBot.integrationId) &&
            Objects.equals(this.nuanceOrganization, nuanceBot.nuanceOrganization) &&
            Objects.equals(this.application, nuanceBot.application) &&
            Objects.equals(this.nuanceEnvironment, nuanceBot.nuanceEnvironment) &&
            Objects.equals(this.geography, nuanceBot.geography) &&
            Objects.equals(this.credentials, nuanceBot.credentials) &&
            Objects.equals(this.variables, nuanceBot.variables) &&
            Objects.equals(this.transferNodes, nuanceBot.transferNodes) &&
            Objects.equals(this.locales, nuanceBot.locales) &&
            Objects.equals(this.channels, nuanceBot.channels) &&
            Objects.equals(this.selfUri, nuanceBot.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationId, nuanceOrganization, application, nuanceEnvironment, geography, credentials, variables, transferNodes, locales, channels, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NuanceBot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    nuanceOrganization: ").append(toIndentedString(nuanceOrganization)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    nuanceEnvironment: ").append(toIndentedString(nuanceEnvironment)).append("\n");
    sb.append("    geography: ").append(toIndentedString(geography)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    transferNodes: ").append(toIndentedString(transferNodes)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

