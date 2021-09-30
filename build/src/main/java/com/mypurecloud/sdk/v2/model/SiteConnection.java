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
import com.mypurecloud.sdk.v2.model.ConnectedEdge;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SiteConnection
 */

public class SiteConnection  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String selfUri = null;
  private Boolean managed = null;

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
   * Connection method from site to site (Direct, Indirect, CloudProxy
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DIRECT("Direct"),
    INDIRECT("Indirect"),
    CLOUDPROXY("CloudProxy");

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
  private Boolean enabled = null;

  private static class MediaModelEnumDeserializer extends StdDeserializer<MediaModelEnum> {
    public MediaModelEnumDeserializer() {
      super(MediaModelEnumDeserializer.class);
    }

    @Override
    public MediaModelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaModelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Media model for the current site.
   */
 @JsonDeserialize(using = MediaModelEnumDeserializer.class)
  public enum MediaModelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PREMISES("Premises"),
    CLOUD("Cloud");

    private String value;

    MediaModelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaModelEnum fromString(String key) {
      if (key == null) return null;

      for (MediaModelEnum value : MediaModelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaModelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaModelEnum mediaModel = null;
  private List<ConnectedEdge> edgeList = new ArrayList<ConnectedEdge>();
  private Boolean coreSite = null;
  private List<DomainEntityRef> primaryCoreSites = new ArrayList<DomainEntityRef>();
  private List<DomainEntityRef> secondaryCoreSites = new ArrayList<DomainEntityRef>();

  
  /**
   **/
  public SiteConnection id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public SiteConnection name(String name) {
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
  public SiteConnection selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }

  
  /**
   **/
  public SiteConnection managed(Boolean managed) {
    this.managed = managed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managed")
  public Boolean getManaged() {
    return managed;
  }
  public void setManaged(Boolean managed) {
    this.managed = managed;
  }

  
  /**
   * Connection method from site to site (Direct, Indirect, CloudProxy
   **/
  public SiteConnection type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Connection method from site to site (Direct, Indirect, CloudProxy")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Indicates if the current site is linked
   **/
  public SiteConnection enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the current site is linked")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  @ApiModelProperty(example = "null", value = "Media model for the current site.")
  @JsonProperty("mediaModel")
  public MediaModelEnum getMediaModel() {
    return mediaModel;
  }

  
  @ApiModelProperty(example = "null", value = "All of the edges to which the site connects")
  @JsonProperty("edgeList")
  public List<ConnectedEdge> getEdgeList() {
    return edgeList;
  }

  
  @ApiModelProperty(example = "null", value = "The core site")
  @JsonProperty("coreSite")
  public Boolean getCoreSite() {
    return coreSite;
  }

  
  @ApiModelProperty(example = "null", value = "List of site ids names and selfUris for the primary core sites")
  @JsonProperty("primaryCoreSites")
  public List<DomainEntityRef> getPrimaryCoreSites() {
    return primaryCoreSites;
  }

  
  @ApiModelProperty(example = "null", value = "List of site ids names and selfUris for the secondary core sites")
  @JsonProperty("secondaryCoreSites")
  public List<DomainEntityRef> getSecondaryCoreSites() {
    return secondaryCoreSites;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteConnection siteConnection = (SiteConnection) o;
    return Objects.equals(this.id, siteConnection.id) &&
        Objects.equals(this.name, siteConnection.name) &&
        Objects.equals(this.selfUri, siteConnection.selfUri) &&
        Objects.equals(this.managed, siteConnection.managed) &&
        Objects.equals(this.type, siteConnection.type) &&
        Objects.equals(this.enabled, siteConnection.enabled) &&
        Objects.equals(this.mediaModel, siteConnection.mediaModel) &&
        Objects.equals(this.edgeList, siteConnection.edgeList) &&
        Objects.equals(this.coreSite, siteConnection.coreSite) &&
        Objects.equals(this.primaryCoreSites, siteConnection.primaryCoreSites) &&
        Objects.equals(this.secondaryCoreSites, siteConnection.secondaryCoreSites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, selfUri, managed, type, enabled, mediaModel, edgeList, coreSite, primaryCoreSites, secondaryCoreSites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteConnection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    mediaModel: ").append(toIndentedString(mediaModel)).append("\n");
    sb.append("    edgeList: ").append(toIndentedString(edgeList)).append("\n");
    sb.append("    coreSite: ").append(toIndentedString(coreSite)).append("\n");
    sb.append("    primaryCoreSites: ").append(toIndentedString(primaryCoreSites)).append("\n");
    sb.append("    secondaryCoreSites: ").append(toIndentedString(secondaryCoreSites)).append("\n");
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

