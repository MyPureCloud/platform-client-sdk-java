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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WrapUpCodeMapping
 */

public class WrapUpCodeMapping  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;

  private static class DefaultSetEnumDeserializer extends StdDeserializer<DefaultSetEnum> {
    public DefaultSetEnumDeserializer() {
      super(DefaultSetEnumDeserializer.class);
    }

    @Override
    public DefaultSetEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DefaultSetEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets defaultSet
   */
 @JsonDeserialize(using = DefaultSetEnumDeserializer.class)
  public enum DefaultSetEnum {
    CONTACT_UNCALLABLE("CONTACT_UNCALLABLE"),
    NUMBER_UNCALLABLE("NUMBER_UNCALLABLE"),
    RIGHT_PARTY_CONTACT("RIGHT_PARTY_CONTACT");

    private String value;

    DefaultSetEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DefaultSetEnum fromString(String key) {
      if (key == null) return null;

      for (DefaultSetEnum value : DefaultSetEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DefaultSetEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DefaultSetEnum> defaultSet = new ArrayList<DefaultSetEnum>();
  private Map<String, List<String>> mapping = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public WrapUpCodeMapping name(String name) {
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

  
  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public WrapUpCodeMapping version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The default set of wrap-up flags. These will be used if there is no entry for a given wrap-up code in the mapping.
   **/
  public WrapUpCodeMapping defaultSet(List<DefaultSetEnum> defaultSet) {
    this.defaultSet = defaultSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default set of wrap-up flags. These will be used if there is no entry for a given wrap-up code in the mapping.")
  @JsonProperty("defaultSet")
  public List<DefaultSetEnum> getDefaultSet() {
    return defaultSet;
  }
  public void setDefaultSet(List<DefaultSetEnum> defaultSet) {
    this.defaultSet = defaultSet;
  }

  
  /**
   * A map from wrap-up code identifiers to a set of wrap-up flags.
   **/
  public WrapUpCodeMapping mapping(Map<String, List<String>> mapping) {
    this.mapping = mapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map from wrap-up code identifiers to a set of wrap-up flags.")
  @JsonProperty("mapping")
  public Map<String, List<String>> getMapping() {
    return mapping;
  }
  public void setMapping(Map<String, List<String>> mapping) {
    this.mapping = mapping;
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
    WrapUpCodeMapping wrapUpCodeMapping = (WrapUpCodeMapping) o;
    return Objects.equals(this.id, wrapUpCodeMapping.id) &&
        Objects.equals(this.name, wrapUpCodeMapping.name) &&
        Objects.equals(this.dateCreated, wrapUpCodeMapping.dateCreated) &&
        Objects.equals(this.dateModified, wrapUpCodeMapping.dateModified) &&
        Objects.equals(this.version, wrapUpCodeMapping.version) &&
        Objects.equals(this.defaultSet, wrapUpCodeMapping.defaultSet) &&
        Objects.equals(this.mapping, wrapUpCodeMapping.mapping) &&
        Objects.equals(this.selfUri, wrapUpCodeMapping.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, defaultSet, mapping, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapUpCodeMapping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    defaultSet: ").append(toIndentedString(defaultSet)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

