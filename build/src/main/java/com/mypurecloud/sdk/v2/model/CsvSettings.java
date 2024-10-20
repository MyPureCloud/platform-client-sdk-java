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
import com.mypurecloud.sdk.v2.model.CsvMappingEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CsvSettings
 */

public class CsvSettings  implements Serializable {
  
  private String id = null;
  private String externalSettingsId = null;
  private List<CsvMappingEntry> mappings = new ArrayList<CsvMappingEntry>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Id of the external settings
   **/
  public CsvSettings externalSettingsId(String externalSettingsId) {
    this.externalSettingsId = externalSettingsId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the external settings")
  @JsonProperty("externalSettingsId")
  public String getExternalSettingsId() {
    return externalSettingsId;
  }
  public void setExternalSettingsId(String externalSettingsId) {
    this.externalSettingsId = externalSettingsId;
  }


  /**
   * Mappings for the transformation
   **/
  public CsvSettings mappings(List<CsvMappingEntry> mappings) {
    this.mappings = mappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Mappings for the transformation")
  @JsonProperty("mappings")
  public List<CsvMappingEntry> getMappings() {
    return mappings;
  }
  public void setMappings(List<CsvMappingEntry> mappings) {
    this.mappings = mappings;
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
    CsvSettings csvSettings = (CsvSettings) o;

    return Objects.equals(this.id, csvSettings.id) &&
            Objects.equals(this.externalSettingsId, csvSettings.externalSettingsId) &&
            Objects.equals(this.mappings, csvSettings.mappings) &&
            Objects.equals(this.selfUri, csvSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalSettingsId, mappings, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalSettingsId: ").append(toIndentedString(externalSettingsId)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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

