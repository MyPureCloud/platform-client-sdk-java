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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TwitterDataIngestionRuleVersionResponse
 */

public class TwitterDataIngestionRuleVersionResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private String searchTerms = null;
  private List<String> countries = new ArrayList<String>();
  private Date dateCreated = null;
  private Date dateModified = null;

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
   * The status of the data ingestion rule.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("Active"),
    DELETED("Deleted"),
    ERROR("Error"),
    PAUSED("Paused"),
    PENDING("Pending"),
    SYSTEMPAUSED("SystemPaused");

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
  private Integer version = null;
  private String selfUri = null;

  
  /**
   * ID of the data ingestion rule.
   **/
  public TwitterDataIngestionRuleVersionResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the data ingestion rule.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the data ingestion rule.
   **/
  public TwitterDataIngestionRuleVersionResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the data ingestion rule.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * A description of the data ingestion rule.
   **/
  public TwitterDataIngestionRuleVersionResponse description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the data ingestion rule.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Search terms for X (formally Twitter).
   **/
  public TwitterDataIngestionRuleVersionResponse searchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Search terms for X (formally Twitter).")
  @JsonProperty("searchTerms")
  public String getSearchTerms() {
    return searchTerms;
  }
  public void setSearchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
  }


  /**
   * ISO 3166-1 alpha-2 country codes where Data Ingestion Rules should apply. Defaults to worldwide.
   **/
  public TwitterDataIngestionRuleVersionResponse countries(List<String> countries) {
    this.countries = countries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 3166-1 alpha-2 country codes where Data Ingestion Rules should apply. Defaults to worldwide.")
  @JsonProperty("countries")
  public List<String> getCountries() {
    return countries;
  }
  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  /**
   * Timestamp indicating when the data ingestion rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TwitterDataIngestionRuleVersionResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the data ingestion rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Timestamp indicating when the data ingestion rule was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TwitterDataIngestionRuleVersionResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the data ingestion rule was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The status of the data ingestion rule.
   **/
  public TwitterDataIngestionRuleVersionResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the data ingestion rule.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The version number of the data ingestion rule.
   **/
  public TwitterDataIngestionRuleVersionResponse version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version number of the data ingestion rule.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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
    TwitterDataIngestionRuleVersionResponse twitterDataIngestionRuleVersionResponse = (TwitterDataIngestionRuleVersionResponse) o;

    return Objects.equals(this.id, twitterDataIngestionRuleVersionResponse.id) &&
            Objects.equals(this.name, twitterDataIngestionRuleVersionResponse.name) &&
            Objects.equals(this.description, twitterDataIngestionRuleVersionResponse.description) &&
            Objects.equals(this.searchTerms, twitterDataIngestionRuleVersionResponse.searchTerms) &&
            Objects.equals(this.countries, twitterDataIngestionRuleVersionResponse.countries) &&
            Objects.equals(this.dateCreated, twitterDataIngestionRuleVersionResponse.dateCreated) &&
            Objects.equals(this.dateModified, twitterDataIngestionRuleVersionResponse.dateModified) &&
            Objects.equals(this.status, twitterDataIngestionRuleVersionResponse.status) &&
            Objects.equals(this.version, twitterDataIngestionRuleVersionResponse.version) &&
            Objects.equals(this.selfUri, twitterDataIngestionRuleVersionResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, searchTerms, countries, dateCreated, dateModified, status, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterDataIngestionRuleVersionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

