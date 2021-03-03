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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentationResult
 */

public class DocumentationResult  implements Serializable {
  
  private Integer id = null;
  private List<Integer> categories = new ArrayList<Integer>();
  private String description = null;
  private String content = null;
  private String excerpt = null;
  private String link = null;
  private Date modified = null;
  private String name = null;
  private List<Integer> service = new ArrayList<Integer>();
  private String slug = null;
  private String title = null;
  private String getType = null;
  private List<Integer> facetFeature = new ArrayList<Integer>();
  private List<Integer> facetRole = new ArrayList<Integer>();
  private List<Integer> facetService = new ArrayList<Integer>();
  private List<Integer> faqCategories = new ArrayList<Integer>();
  private List<Integer> releasenoteCategory = new ArrayList<Integer>();
  private List<Integer> releasenoteTag = new ArrayList<Integer>();
  private List<Integer> serviceArea = new ArrayList<Integer>();
  private List<Integer> videoCategories = new ArrayList<Integer>();

  
  /**
   * The globally unique identifier for the object.
   **/
  public DocumentationResult id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * The category of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult categories(List<Integer> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("categories")
  public List<Integer> getCategories() {
    return categories;
  }
  public void setCategories(List<Integer> categories) {
    this.categories = categories;
  }

  
  /**
   * The description of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The text or html content for the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult content(String content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The text or html content for the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   * The excerpt of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult excerpt(String excerpt) {
    this.excerpt = excerpt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The excerpt of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("excerpt")
  public String getExcerpt() {
    return excerpt;
  }
  public void setExcerpt(String excerpt) {
    this.excerpt = excerpt;
  }

  
  /**
   * URL link for the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult link(String link) {
    this.link = link;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL link for the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
  /**
   * The modified date for the documentation entity. Will be returned in responses for certain entities. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DocumentationResult modified(Date modified) {
    this.modified = modified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The modified date for the documentation entity. Will be returned in responses for certain entities. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modified")
  public Date getModified() {
    return modified;
  }
  public void setModified(Date modified) {
    this.modified = modified;
  }

  
  /**
   * The name of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The service of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult service(List<Integer> service) {
    this.service = service;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The service of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("service")
  public List<Integer> getService() {
    return service;
  }
  public void setService(List<Integer> service) {
    this.service = service;
  }

  
  /**
   * The slug of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult slug(String slug) {
    this.slug = slug;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The slug of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  
  /**
   * The title of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The title of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * The search type. Will be returned in responses for certain entities.
   **/
  public DocumentationResult getType(String getType) {
    this.getType = getType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The search type. Will be returned in responses for certain entities.")
  @JsonProperty("get_type")
  public String getGetType() {
    return getType;
  }
  public void setGetType(String getType) {
    this.getType = getType;
  }

  
  /**
   * The facet feature of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult facetFeature(List<Integer> facetFeature) {
    this.facetFeature = facetFeature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The facet feature of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("facet_feature")
  public List<Integer> getFacetFeature() {
    return facetFeature;
  }
  public void setFacetFeature(List<Integer> facetFeature) {
    this.facetFeature = facetFeature;
  }

  
  /**
   * The facet role of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult facetRole(List<Integer> facetRole) {
    this.facetRole = facetRole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The facet role of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("facet_role")
  public List<Integer> getFacetRole() {
    return facetRole;
  }
  public void setFacetRole(List<Integer> facetRole) {
    this.facetRole = facetRole;
  }

  
  /**
   * The facet service of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult facetService(List<Integer> facetService) {
    this.facetService = facetService;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The facet service of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("facet_service")
  public List<Integer> getFacetService() {
    return facetService;
  }
  public void setFacetService(List<Integer> facetService) {
    this.facetService = facetService;
  }

  
  /**
   * The faq categories of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult faqCategories(List<Integer> faqCategories) {
    this.faqCategories = faqCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The faq categories of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("faq_categories")
  public List<Integer> getFaqCategories() {
    return faqCategories;
  }
  public void setFaqCategories(List<Integer> faqCategories) {
    this.faqCategories = faqCategories;
  }

  
  /**
   * The releasenote category of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult releasenoteCategory(List<Integer> releasenoteCategory) {
    this.releasenoteCategory = releasenoteCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The releasenote category of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("releasenote_category")
  public List<Integer> getReleasenoteCategory() {
    return releasenoteCategory;
  }
  public void setReleasenoteCategory(List<Integer> releasenoteCategory) {
    this.releasenoteCategory = releasenoteCategory;
  }

  
  /**
   * The releasenote tag of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult releasenoteTag(List<Integer> releasenoteTag) {
    this.releasenoteTag = releasenoteTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The releasenote tag of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("releasenote_tag")
  public List<Integer> getReleasenoteTag() {
    return releasenoteTag;
  }
  public void setReleasenoteTag(List<Integer> releasenoteTag) {
    this.releasenoteTag = releasenoteTag;
  }

  
  /**
   * The service area of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult serviceArea(List<Integer> serviceArea) {
    this.serviceArea = serviceArea;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The service area of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("service-area")
  public List<Integer> getServiceArea() {
    return serviceArea;
  }
  public void setServiceArea(List<Integer> serviceArea) {
    this.serviceArea = serviceArea;
  }

  
  /**
   * The video categories of the documentation entity. Will be returned in responses for certain entities.
   **/
  public DocumentationResult videoCategories(List<Integer> videoCategories) {
    this.videoCategories = videoCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The video categories of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("video_categories")
  public List<Integer> getVideoCategories() {
    return videoCategories;
  }
  public void setVideoCategories(List<Integer> videoCategories) {
    this.videoCategories = videoCategories;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentationResult documentationResult = (DocumentationResult) o;
    return Objects.equals(this.id, documentationResult.id) &&
        Objects.equals(this.categories, documentationResult.categories) &&
        Objects.equals(this.description, documentationResult.description) &&
        Objects.equals(this.content, documentationResult.content) &&
        Objects.equals(this.excerpt, documentationResult.excerpt) &&
        Objects.equals(this.link, documentationResult.link) &&
        Objects.equals(this.modified, documentationResult.modified) &&
        Objects.equals(this.name, documentationResult.name) &&
        Objects.equals(this.service, documentationResult.service) &&
        Objects.equals(this.slug, documentationResult.slug) &&
        Objects.equals(this.title, documentationResult.title) &&
        Objects.equals(this.getType, documentationResult.getType) &&
        Objects.equals(this.facetFeature, documentationResult.facetFeature) &&
        Objects.equals(this.facetRole, documentationResult.facetRole) &&
        Objects.equals(this.facetService, documentationResult.facetService) &&
        Objects.equals(this.faqCategories, documentationResult.faqCategories) &&
        Objects.equals(this.releasenoteCategory, documentationResult.releasenoteCategory) &&
        Objects.equals(this.releasenoteTag, documentationResult.releasenoteTag) &&
        Objects.equals(this.serviceArea, documentationResult.serviceArea) &&
        Objects.equals(this.videoCategories, documentationResult.videoCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categories, description, content, excerpt, link, modified, name, service, slug, title, getType, facetFeature, facetRole, facetService, faqCategories, releasenoteCategory, releasenoteTag, serviceArea, videoCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentationResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    excerpt: ").append(toIndentedString(excerpt)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    getType: ").append(toIndentedString(getType)).append("\n");
    sb.append("    facetFeature: ").append(toIndentedString(facetFeature)).append("\n");
    sb.append("    facetRole: ").append(toIndentedString(facetRole)).append("\n");
    sb.append("    facetService: ").append(toIndentedString(facetService)).append("\n");
    sb.append("    faqCategories: ").append(toIndentedString(faqCategories)).append("\n");
    sb.append("    releasenoteCategory: ").append(toIndentedString(releasenoteCategory)).append("\n");
    sb.append("    releasenoteTag: ").append(toIndentedString(releasenoteTag)).append("\n");
    sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
    sb.append("    videoCategories: ").append(toIndentedString(videoCategories)).append("\n");
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

