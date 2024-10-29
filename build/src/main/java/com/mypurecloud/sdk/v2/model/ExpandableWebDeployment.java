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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.SupportedContentReference;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersionResponse;
import com.mypurecloud.sdk.v2.model.WebDeploymentFlowEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Details about a Web Deployment
 */
@ApiModel(description = "Details about a Web Deployment")

public class ExpandableWebDeployment  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean allowAllDomains = null;
  private List<String> allowedDomains = new ArrayList<String>();
  private SupportedContentReference supportedContent = null;
  private String snippet = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private AddressableEntityRef lastModifiedUser = null;
  private WebDeploymentFlowEntityRef flow = null;

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
   * The current status of the deployment
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
  private WebDeploymentConfigurationVersionResponse _configuration = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The deployment ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The deployment name
   **/
  public ExpandableWebDeployment name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The deployment name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of the config
   **/
  public ExpandableWebDeployment description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the config")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Property indicates whether all domains are allowed or not. allowedDomains must be empty when this is set as true.
   **/
  public ExpandableWebDeployment allowAllDomains(Boolean allowAllDomains) {
    this.allowAllDomains = allowAllDomains;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Property indicates whether all domains are allowed or not. allowedDomains must be empty when this is set as true.")
  @JsonProperty("allowAllDomains")
  public Boolean getAllowAllDomains() {
    return allowAllDomains;
  }
  public void setAllowAllDomains(Boolean allowAllDomains) {
    this.allowAllDomains = allowAllDomains;
  }


  /**
   * The list of domains that are approved to use this deployment; the list will be added to CORS headers for ease of web use.
   **/
  public ExpandableWebDeployment allowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of domains that are approved to use this deployment; the list will be added to CORS headers for ease of web use.")
  @JsonProperty("allowedDomains")
  public List<String> getAllowedDomains() {
    return allowedDomains;
  }
  public void setAllowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }


  /**
   * The supported content profile for a deployment
   **/
  public ExpandableWebDeployment supportedContent(SupportedContentReference supportedContent) {
    this.supportedContent = supportedContent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The supported content profile for a deployment")
  @JsonProperty("supportedContent")
  public SupportedContentReference getSupportedContent() {
    return supportedContent;
  }
  public void setSupportedContent(SupportedContentReference supportedContent) {
    this.supportedContent = supportedContent;
  }


  @ApiModelProperty(example = "null", value = "Javascript snippet used to load the config")
  @JsonProperty("snippet")
  public String getSnippet() {
    return snippet;
  }


  @ApiModelProperty(example = "null", value = "The date the deployment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The date the deployment was most recently modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "A reference to the user who most recently modified the deployment")
  @JsonProperty("lastModifiedUser")
  public AddressableEntityRef getLastModifiedUser() {
    return lastModifiedUser;
  }


  /**
   * A reference to the inboundshortmessage flow used by this deployment
   **/
  public ExpandableWebDeployment flow(WebDeploymentFlowEntityRef flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the inboundshortmessage flow used by this deployment")
  @JsonProperty("flow")
  public WebDeploymentFlowEntityRef getFlow() {
    return flow;
  }
  public void setFlow(WebDeploymentFlowEntityRef flow) {
    this.flow = flow;
  }


  /**
   * The current status of the deployment
   **/
  public ExpandableWebDeployment status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current status of the deployment")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The config version this deployment uses
   **/
  public ExpandableWebDeployment _configuration(WebDeploymentConfigurationVersionResponse _configuration) {
    this._configuration = _configuration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The config version this deployment uses")
  @JsonProperty("configuration")
  public WebDeploymentConfigurationVersionResponse getConfiguration() {
    return _configuration;
  }
  public void setConfiguration(WebDeploymentConfigurationVersionResponse _configuration) {
    this._configuration = _configuration;
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
    ExpandableWebDeployment expandableWebDeployment = (ExpandableWebDeployment) o;

    return Objects.equals(this.id, expandableWebDeployment.id) &&
            Objects.equals(this.name, expandableWebDeployment.name) &&
            Objects.equals(this.description, expandableWebDeployment.description) &&
            Objects.equals(this.allowAllDomains, expandableWebDeployment.allowAllDomains) &&
            Objects.equals(this.allowedDomains, expandableWebDeployment.allowedDomains) &&
            Objects.equals(this.supportedContent, expandableWebDeployment.supportedContent) &&
            Objects.equals(this.snippet, expandableWebDeployment.snippet) &&
            Objects.equals(this.dateCreated, expandableWebDeployment.dateCreated) &&
            Objects.equals(this.dateModified, expandableWebDeployment.dateModified) &&
            Objects.equals(this.lastModifiedUser, expandableWebDeployment.lastModifiedUser) &&
            Objects.equals(this.flow, expandableWebDeployment.flow) &&
            Objects.equals(this.status, expandableWebDeployment.status) &&
            Objects.equals(this._configuration, expandableWebDeployment._configuration) &&
            Objects.equals(this.selfUri, expandableWebDeployment.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, allowAllDomains, allowedDomains, supportedContent, snippet, dateCreated, dateModified, lastModifiedUser, flow, status, _configuration, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpandableWebDeployment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    allowAllDomains: ").append(toIndentedString(allowAllDomains)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    supportedContent: ").append(toIndentedString(supportedContent)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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

