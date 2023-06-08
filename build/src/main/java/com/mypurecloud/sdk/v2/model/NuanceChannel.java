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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Model for a Nuance channel
 */
@ApiModel(description = "Model for a Nuance channel")

public class NuanceChannel  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<String> modes = new ArrayList<String>();
  private String color = null;

  
  /**
   * The channel ID
   **/
  public NuanceChannel id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The channel name
   **/
  public NuanceChannel name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The channel name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Supported Channel Modes
   **/
  public NuanceChannel modes(List<String> modes) {
    this.modes = modes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Supported Channel Modes")
  @JsonProperty("modes")
  public List<String> getModes() {
    return modes;
  }
  public void setModes(List<String> modes) {
    this.modes = modes;
  }


  /**
   * The Channel Color
   **/
  public NuanceChannel color(String color) {
    this.color = color;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Channel Color")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NuanceChannel nuanceChannel = (NuanceChannel) o;

    return Objects.equals(this.id, nuanceChannel.id) &&
            Objects.equals(this.name, nuanceChannel.name) &&
            Objects.equals(this.modes, nuanceChannel.modes) &&
            Objects.equals(this.color, nuanceChannel.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, modes, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NuanceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modes: ").append(toIndentedString(modes)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

