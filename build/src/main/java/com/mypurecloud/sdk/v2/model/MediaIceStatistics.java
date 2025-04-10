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
import com.mypurecloud.sdk.v2.model.MediaIceSelectedPair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MediaIceStatistics
 */

public class MediaIceStatistics  implements Serializable {
  
  private List<MediaIceSelectedPair> selectedPairs = null;

  public MediaIceStatistics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      selectedPairs = new ArrayList<MediaIceSelectedPair>();
    }
  }

  
  /**
   * The candidate pairs selected for the media stream
   **/
  public MediaIceStatistics selectedPairs(List<MediaIceSelectedPair> selectedPairs) {
    this.selectedPairs = selectedPairs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The candidate pairs selected for the media stream")
  @JsonProperty("selectedPairs")
  public List<MediaIceSelectedPair> getSelectedPairs() {
    return selectedPairs;
  }
  public void setSelectedPairs(List<MediaIceSelectedPair> selectedPairs) {
    this.selectedPairs = selectedPairs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaIceStatistics mediaIceStatistics = (MediaIceStatistics) o;

    return Objects.equals(this.selectedPairs, mediaIceStatistics.selectedPairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedPairs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaIceStatistics {\n");
    
    sb.append("    selectedPairs: ").append(toIndentedString(selectedPairs)).append("\n");
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

