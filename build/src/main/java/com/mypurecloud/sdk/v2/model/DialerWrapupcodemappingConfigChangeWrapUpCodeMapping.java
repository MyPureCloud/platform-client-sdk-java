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
 * DialerWrapupcodemappingConfigChangeWrapUpCodeMapping
 */

public class DialerWrapupcodemappingConfigChangeWrapUpCodeMapping  implements Serializable {
  
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

  
  /**
   **/
  public DialerWrapupcodemappingConfigChangeWrapUpCodeMapping id(String id) {
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
  public DialerWrapupcodemappingConfigChangeWrapUpCodeMapping name(String name) {
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
  public DialerWrapupcodemappingConfigChangeWrapUpCodeMapping dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public DialerWrapupcodemappingConfigChangeWrapUpCodeMapping dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public DialerWrapupcodemappingConfigChangeWrapUpCodeMapping version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   **/
  public DialerWrapupcodemappingConfigChangeWrapUpCodeMapping defaultSet(List<DefaultSetEnum> defaultSet) {
    this.defaultSet = defaultSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultSet")
  public List<DefaultSetEnum> getDefaultSet() {
    return defaultSet;
  }
  public void setDefaultSet(List<DefaultSetEnum> defaultSet) {
    this.defaultSet = defaultSet;
  }

  
  /**
   **/
  public DialerWrapupcodemappingConfigChangeWrapUpCodeMapping mapping(Map<String, List<String>> mapping) {
    this.mapping = mapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mapping")
  public Map<String, List<String>> getMapping() {
    return mapping;
  }
  public void setMapping(Map<String, List<String>> mapping) {
    this.mapping = mapping;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerWrapupcodemappingConfigChangeWrapUpCodeMapping dialerWrapupcodemappingConfigChangeWrapUpCodeMapping = (DialerWrapupcodemappingConfigChangeWrapUpCodeMapping) o;
    return Objects.equals(this.id, dialerWrapupcodemappingConfigChangeWrapUpCodeMapping.id) &&
        Objects.equals(this.name, dialerWrapupcodemappingConfigChangeWrapUpCodeMapping.name) &&
        Objects.equals(this.dateCreated, dialerWrapupcodemappingConfigChangeWrapUpCodeMapping.dateCreated) &&
        Objects.equals(this.dateModified, dialerWrapupcodemappingConfigChangeWrapUpCodeMapping.dateModified) &&
        Objects.equals(this.version, dialerWrapupcodemappingConfigChangeWrapUpCodeMapping.version) &&
        Objects.equals(this.defaultSet, dialerWrapupcodemappingConfigChangeWrapUpCodeMapping.defaultSet) &&
        Objects.equals(this.mapping, dialerWrapupcodemappingConfigChangeWrapUpCodeMapping.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, defaultSet, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerWrapupcodemappingConfigChangeWrapUpCodeMapping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    defaultSet: ").append(toIndentedString(defaultSet)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

