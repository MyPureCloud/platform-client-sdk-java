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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ListItem
 */

public class ListItem  implements Serializable {
  
  private String value = null;
  private List<String> synonyms = null;
  private Boolean active = null;
  private String description = null;

  public ListItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      synonyms = new ArrayList<String>();
    }
  }

  public ListItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      synonyms = new ArrayList<String>();
    }
  }

  
  /**
   * The value returned when this item is selected.
   **/
  public ListItem value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value returned when this item is selected.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Alternative phrases that should match this value. Used only with Exact match type.
   **/
  public ListItem synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alternative phrases that should match this value. Used only with Exact match type.")
  @JsonProperty("synonyms")
  public List<String> getSynonyms() {
    return synonyms;
  }
  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }


  /**
   * Whether this list item is active and available for selection.
   **/
  public ListItem active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this list item is active and available for selection.")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }


  /**
   * Description of this value for semantic matching. Used only with Semantic match type.
   **/
  public ListItem description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of this value for semantic matching. Used only with Semantic match type.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListItem listItem = (ListItem) o;

    return Objects.equals(this.value, listItem.value) &&
            Objects.equals(this.synonyms, listItem.synonyms) &&
            Objects.equals(this.active, listItem.active) &&
            Objects.equals(this.description, listItem.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, synonyms, active, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItem {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

