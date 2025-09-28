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
import com.mypurecloud.sdk.v2.model.FeatureSupport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LanguageSupportInfoRecord
 */

public class LanguageSupportInfoRecord  implements Serializable {
  
  private String language = null;
  private List<FeatureSupport> featureSupport = null;

  public LanguageSupportInfoRecord() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      featureSupport = new ArrayList<FeatureSupport>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "Language of the copilot, e.g. 'en-US'.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }


  @ApiModelProperty(example = "null", value = "Information about the support of features.")
  @JsonProperty("featureSupport")
  public List<FeatureSupport> getFeatureSupport() {
    return featureSupport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageSupportInfoRecord languageSupportInfoRecord = (LanguageSupportInfoRecord) o;

    return Objects.equals(this.language, languageSupportInfoRecord.language) &&
            Objects.equals(this.featureSupport, languageSupportInfoRecord.featureSupport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, featureSupport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageSupportInfoRecord {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    featureSupport: ").append(toIndentedString(featureSupport)).append("\n");
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

