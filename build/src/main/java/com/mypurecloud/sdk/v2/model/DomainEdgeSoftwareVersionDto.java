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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DomainEdgeSoftwareVersionDto
 */

public class DomainEdgeSoftwareVersionDto  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String edgeVersion = null;
  private Date publishDate = null;
  private String edgeUri = null;
  private Boolean latestRelease = null;
  private Boolean current = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DomainEdgeSoftwareVersionDto name(String name) {
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
   **/
  public DomainEdgeSoftwareVersionDto edgeVersion(String edgeVersion) {
    this.edgeVersion = edgeVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeVersion")
  public String getEdgeVersion() {
    return edgeVersion;
  }
  public void setEdgeVersion(String edgeVersion) {
    this.edgeVersion = edgeVersion;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DomainEdgeSoftwareVersionDto publishDate(Date publishDate) {
    this.publishDate = publishDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("publishDate")
  public Date getPublishDate() {
    return publishDate;
  }
  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }

  
  /**
   **/
  public DomainEdgeSoftwareVersionDto edgeUri(String edgeUri) {
    this.edgeUri = edgeUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeUri")
  public String getEdgeUri() {
    return edgeUri;
  }
  public void setEdgeUri(String edgeUri) {
    this.edgeUri = edgeUri;
  }

  
  /**
   **/
  public DomainEdgeSoftwareVersionDto latestRelease(Boolean latestRelease) {
    this.latestRelease = latestRelease;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("latestRelease")
  public Boolean getLatestRelease() {
    return latestRelease;
  }
  public void setLatestRelease(Boolean latestRelease) {
    this.latestRelease = latestRelease;
  }

  
  /**
   **/
  public DomainEdgeSoftwareVersionDto current(Boolean current) {
    this.current = current;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("current")
  public Boolean getCurrent() {
    return current;
  }
  public void setCurrent(Boolean current) {
    this.current = current;
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
    DomainEdgeSoftwareVersionDto domainEdgeSoftwareVersionDto = (DomainEdgeSoftwareVersionDto) o;
    return Objects.equals(this.id, domainEdgeSoftwareVersionDto.id) &&
        Objects.equals(this.name, domainEdgeSoftwareVersionDto.name) &&
        Objects.equals(this.edgeVersion, domainEdgeSoftwareVersionDto.edgeVersion) &&
        Objects.equals(this.publishDate, domainEdgeSoftwareVersionDto.publishDate) &&
        Objects.equals(this.edgeUri, domainEdgeSoftwareVersionDto.edgeUri) &&
        Objects.equals(this.latestRelease, domainEdgeSoftwareVersionDto.latestRelease) &&
        Objects.equals(this.current, domainEdgeSoftwareVersionDto.current) &&
        Objects.equals(this.selfUri, domainEdgeSoftwareVersionDto.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, edgeVersion, publishDate, edgeUri, latestRelease, current, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainEdgeSoftwareVersionDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    edgeVersion: ").append(toIndentedString(edgeVersion)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    edgeUri: ").append(toIndentedString(edgeUri)).append("\n");
    sb.append("    latestRelease: ").append(toIndentedString(latestRelease)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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

