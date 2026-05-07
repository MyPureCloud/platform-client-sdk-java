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
import com.mypurecloud.sdk.v2.model.OutlierResultTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OutlierData
 */

public class OutlierData  implements Serializable {
  
  private List<String> downloadUrls = null;
  private OutlierResultTemplate downloadResultTemplate = null;

  public OutlierData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      downloadUrls = new ArrayList<String>();
    }
  }

  
  /**
   * List of URLs to fetch the result of the outliers data. This field is populated only if session state is 'Complete' and outliers are present
   **/
  public OutlierData downloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of URLs to fetch the result of the outliers data. This field is populated only if session state is 'Complete' and outliers are present")
  @JsonProperty("downloadUrls")
  public List<String> getDownloadUrls() {
    return downloadUrls;
  }
  public void setDownloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
  }


  /**
   * Result will always come via downloadUrls; however the schema is included for documentation
   **/
  public OutlierData downloadResultTemplate(OutlierResultTemplate downloadResultTemplate) {
    this.downloadResultTemplate = downloadResultTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Result will always come via downloadUrls; however the schema is included for documentation")
  @JsonProperty("downloadResultTemplate")
  public OutlierResultTemplate getDownloadResultTemplate() {
    return downloadResultTemplate;
  }
  public void setDownloadResultTemplate(OutlierResultTemplate downloadResultTemplate) {
    this.downloadResultTemplate = downloadResultTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlierData outlierData = (OutlierData) o;

    return Objects.equals(this.downloadUrls, outlierData.downloadUrls) &&
            Objects.equals(this.downloadResultTemplate, outlierData.downloadResultTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrls, downloadResultTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlierData {\n");
    
    sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
    sb.append("    downloadResultTemplate: ").append(toIndentedString(downloadResultTemplate)).append("\n");
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

