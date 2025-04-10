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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SupportCenterLabelFilter
 */

public class SupportCenterLabelFilter  implements Serializable {
  
  private List<AddressableEntityRef> labels = null;

  public SupportCenterLabelFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      labels = new ArrayList<AddressableEntityRef>();
    }
  }

  
  /**
   * Labels to filter by.
   **/
  public SupportCenterLabelFilter labels(List<AddressableEntityRef> labels) {
    this.labels = labels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Labels to filter by.")
  @JsonProperty("labels")
  public List<AddressableEntityRef> getLabels() {
    return labels;
  }
  public void setLabels(List<AddressableEntityRef> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterLabelFilter supportCenterLabelFilter = (SupportCenterLabelFilter) o;

    return Objects.equals(this.labels, supportCenterLabelFilter.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterLabelFilter {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

