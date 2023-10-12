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
 * Data property required as input for installing an accelerator
 */
@ApiModel(description = "Data property required as input for installing an accelerator")

public class MetadataProperty  implements Serializable {
  
  private String type = null;
  private String description = null;
  private String sensitive = null;
  private String help = null;
  private String _default = null;
  private List<String> _enum = new ArrayList<String>();

  
  @ApiModelProperty(example = "null", value = "the data type of the input property")
  @JsonProperty("type")
  public String getType() {
    return type;
  }


  @ApiModelProperty(example = "null", value = "brief description of the input property")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }


  @ApiModelProperty(example = "null", value = "whether the property's value should be hidden from display")
  @JsonProperty("sensitive")
  public String getSensitive() {
    return sensitive;
  }


  @ApiModelProperty(example = "null", value = "optional URL with addition information about the input property")
  @JsonProperty("help")
  public String getHelp() {
    return help;
  }


  @ApiModelProperty(example = "null", value = "optional default value of the input property")
  @JsonProperty("default")
  public String getDefault() {
    return _default;
  }


  @ApiModelProperty(example = "null", value = "set of possible values if the input property is an enumeration")
  @JsonProperty("enum")
  public List<String> getEnum() {
    return _enum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataProperty metadataProperty = (MetadataProperty) o;

    return Objects.equals(this.type, metadataProperty.type) &&
            Objects.equals(this.description, metadataProperty.description) &&
            Objects.equals(this.sensitive, metadataProperty.sensitive) &&
            Objects.equals(this.help, metadataProperty.help) &&
            Objects.equals(this._default, metadataProperty._default) &&
            Objects.equals(this._enum, metadataProperty._enum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, sensitive, help, _default, _enum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataProperty {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
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

