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
import com.mypurecloud.sdk.v2.model.PlanningGroupModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ModelData
 */

public class ModelData  implements Serializable {
  
  private List<String> downloadUrls = null;
  private List<PlanningGroupModel> downloadResult = null;

  public ModelData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      downloadUrls = new ArrayList<String>();
      downloadResult = new ArrayList<PlanningGroupModel>();
    }
  }

  
  /**
   * List of URLs to fetch the results of the forecast model. This field is populated only if session state is Complete
   **/
  public ModelData downloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of URLs to fetch the results of the forecast model. This field is populated only if session state is Complete")
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
  public ModelData downloadResult(List<PlanningGroupModel> downloadResult) {
    this.downloadResult = downloadResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Result will always come via downloadUrls; however the schema is included for documentation")
  @JsonProperty("downloadResult")
  public List<PlanningGroupModel> getDownloadResult() {
    return downloadResult;
  }
  public void setDownloadResult(List<PlanningGroupModel> downloadResult) {
    this.downloadResult = downloadResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelData modelData = (ModelData) o;

    return Objects.equals(this.downloadUrls, modelData.downloadUrls) &&
            Objects.equals(this.downloadResult, modelData.downloadResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrls, downloadResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelData {\n");
    
    sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
    sb.append("    downloadResult: ").append(toIndentedString(downloadResult)).append("\n");
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

