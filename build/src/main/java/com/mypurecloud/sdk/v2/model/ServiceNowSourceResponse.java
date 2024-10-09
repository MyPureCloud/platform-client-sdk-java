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
import com.mypurecloud.sdk.v2.model.KnowledgeIntegrationReference;
import com.mypurecloud.sdk.v2.model.ServiceNowSettings;
import com.mypurecloud.sdk.v2.model.SourceLastSync;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ServiceNowSourceResponse
 */

public class ServiceNowSourceResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The source type.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SALESFORCE("Salesforce"),
    SERVICENOW("ServiceNow");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private KnowledgeIntegrationReference integration = null;
  private Integer schedulePeriod = null;
  private SourceLastSync lastSync = null;
  private ServiceNowSettings settings = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Name of the source.
   **/
  public ServiceNowSourceResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the source.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Source creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ServiceNowSourceResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Source last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ServiceNowSourceResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The source type.
   **/
  public ServiceNowSourceResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source type.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The reference to the integration associated with the source.
   **/
  public ServiceNowSourceResponse integration(KnowledgeIntegrationReference integration) {
    this.integration = integration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference to the integration associated with the source.")
  @JsonProperty("integration")
  public KnowledgeIntegrationReference getIntegration() {
    return integration;
  }
  public void setIntegration(KnowledgeIntegrationReference integration) {
    this.integration = integration;
  }


  /**
   * The schedule period of the source in hours.
   **/
  public ServiceNowSourceResponse schedulePeriod(Integer schedulePeriod) {
    this.schedulePeriod = schedulePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule period of the source in hours.")
  @JsonProperty("schedulePeriod")
  public Integer getSchedulePeriod() {
    return schedulePeriod;
  }
  public void setSchedulePeriod(Integer schedulePeriod) {
    this.schedulePeriod = schedulePeriod;
  }


  /**
   * Additional information about the last synchronization of the source.
   **/
  public ServiceNowSourceResponse lastSync(SourceLastSync lastSync) {
    this.lastSync = lastSync;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional information about the last synchronization of the source.")
  @JsonProperty("lastSync")
  public SourceLastSync getLastSync() {
    return lastSync;
  }
  public void setLastSync(SourceLastSync lastSync) {
    this.lastSync = lastSync;
  }


  /**
   * The settings of the source.
   **/
  public ServiceNowSourceResponse settings(ServiceNowSettings settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings of the source.")
  @JsonProperty("settings")
  public ServiceNowSettings getSettings() {
    return settings;
  }
  public void setSettings(ServiceNowSettings settings) {
    this.settings = settings;
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
    ServiceNowSourceResponse serviceNowSourceResponse = (ServiceNowSourceResponse) o;

    return Objects.equals(this.id, serviceNowSourceResponse.id) &&
            Objects.equals(this.name, serviceNowSourceResponse.name) &&
            Objects.equals(this.dateCreated, serviceNowSourceResponse.dateCreated) &&
            Objects.equals(this.dateModified, serviceNowSourceResponse.dateModified) &&
            Objects.equals(this.type, serviceNowSourceResponse.type) &&
            Objects.equals(this.integration, serviceNowSourceResponse.integration) &&
            Objects.equals(this.schedulePeriod, serviceNowSourceResponse.schedulePeriod) &&
            Objects.equals(this.lastSync, serviceNowSourceResponse.lastSync) &&
            Objects.equals(this.settings, serviceNowSourceResponse.settings) &&
            Objects.equals(this.selfUri, serviceNowSourceResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, type, integration, schedulePeriod, lastSync, settings, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceNowSourceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    schedulePeriod: ").append(toIndentedString(schedulePeriod)).append("\n");
    sb.append("    lastSync: ").append(toIndentedString(lastSync)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

