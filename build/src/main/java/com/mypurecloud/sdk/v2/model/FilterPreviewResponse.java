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
import com.mypurecloud.sdk.v2.model.DialerContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FilterPreviewResponse
 */

public class FilterPreviewResponse  implements Serializable {
  
  private Long filteredContacts = null;
  private Long totalContacts = null;
  private List<DialerContact> preview = new ArrayList<DialerContact>();

  
  /**
   **/
  public FilterPreviewResponse filteredContacts(Long filteredContacts) {
    this.filteredContacts = filteredContacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("filteredContacts")
  public Long getFilteredContacts() {
    return filteredContacts;
  }
  public void setFilteredContacts(Long filteredContacts) {
    this.filteredContacts = filteredContacts;
  }

  
  /**
   **/
  public FilterPreviewResponse totalContacts(Long totalContacts) {
    this.totalContacts = totalContacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalContacts")
  public Long getTotalContacts() {
    return totalContacts;
  }
  public void setTotalContacts(Long totalContacts) {
    this.totalContacts = totalContacts;
  }

  
  /**
   **/
  public FilterPreviewResponse preview(List<DialerContact> preview) {
    this.preview = preview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("preview")
  public List<DialerContact> getPreview() {
    return preview;
  }
  public void setPreview(List<DialerContact> preview) {
    this.preview = preview;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterPreviewResponse filterPreviewResponse = (FilterPreviewResponse) o;
    return Objects.equals(this.filteredContacts, filterPreviewResponse.filteredContacts) &&
        Objects.equals(this.totalContacts, filterPreviewResponse.totalContacts) &&
        Objects.equals(this.preview, filterPreviewResponse.preview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filteredContacts, totalContacts, preview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterPreviewResponse {\n");
    
    sb.append("    filteredContacts: ").append(toIndentedString(filteredContacts)).append("\n");
    sb.append("    totalContacts: ").append(toIndentedString(totalContacts)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
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

