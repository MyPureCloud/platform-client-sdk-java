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
import com.mypurecloud.sdk.v2.model.FormPageComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A page in a form with title, subtitle, and components
 */
@ApiModel(description = "A page in a form with title, subtitle, and components")

public class FormPage  implements Serializable {
  
  private String title = null;
  private String subtitle = null;
  private List<FormPageComponent> pageComponents = null;

  public FormPage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      pageComponents = new ArrayList<FormPageComponent>();
    }
  }

  
  /**
   * Title of the page
   **/
  public FormPage title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Title of the page")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Subtitle of the page
   **/
  public FormPage subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Subtitle of the page")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * Components on this page
   **/
  public FormPage pageComponents(List<FormPageComponent> pageComponents) {
    this.pageComponents = pageComponents;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Components on this page")
  @JsonProperty("pageComponents")
  public List<FormPageComponent> getPageComponents() {
    return pageComponents;
  }
  public void setPageComponents(List<FormPageComponent> pageComponents) {
    this.pageComponents = pageComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormPage formPage = (FormPage) o;

    return Objects.equals(this.title, formPage.title) &&
            Objects.equals(this.subtitle, formPage.subtitle) &&
            Objects.equals(this.pageComponents, formPage.pageComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, pageComponents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormPage {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    pageComponents: ").append(toIndentedString(pageComponents)).append("\n");
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

