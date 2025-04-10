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
import com.mypurecloud.sdk.v2.model.NluUtterance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AdditionalLanguagesIntent
 */

public class AdditionalLanguagesIntent  implements Serializable {
  
  private String id = null;
  private List<NluUtterance> utterances = null;

  public AdditionalLanguagesIntent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      utterances = new ArrayList<NluUtterance>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "ID of the intent for respective additional language")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Utterances list for additional language
   **/
  public AdditionalLanguagesIntent utterances(List<NluUtterance> utterances) {
    this.utterances = utterances;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Utterances list for additional language")
  @JsonProperty("utterances")
  public List<NluUtterance> getUtterances() {
    return utterances;
  }
  public void setUtterances(List<NluUtterance> utterances) {
    this.utterances = utterances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalLanguagesIntent additionalLanguagesIntent = (AdditionalLanguagesIntent) o;

    return Objects.equals(this.id, additionalLanguagesIntent.id) &&
            Objects.equals(this.utterances, additionalLanguagesIntent.utterances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, utterances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalLanguagesIntent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    utterances: ").append(toIndentedString(utterances)).append("\n");
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

