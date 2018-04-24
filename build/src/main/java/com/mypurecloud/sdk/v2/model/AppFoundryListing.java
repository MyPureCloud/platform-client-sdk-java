package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AppFoundryListingRegistryInfo;
import com.mypurecloud.sdk.v2.model.LocalizedField;
import com.mypurecloud.sdk.v2.model.MarketingInfo;
import com.mypurecloud.sdk.v2.model.Platform;
import com.mypurecloud.sdk.v2.model.PricingOption;
import com.mypurecloud.sdk.v2.model.SmartCase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Represents a listing in the AppFoundry
 */
@ApiModel(description = "Represents a listing in the AppFoundry")

public class AppFoundryListing  implements Serializable {
  
  private String id = null;
  private LocalizedField name = null;
  private AppFoundryListingRegistryInfo registryInfo = null;
  private MarketingInfo marketingInfo = null;
  private LocalizedField tagline = null;
  private LocalizedField briefDescription = null;
  private LocalizedField fullDescription = null;
  private Platform platform = null;
  private String companyLogo = null;
  private String appLogo = null;
  private LocalizedField companyName = null;
  private LocalizedField website = null;
  private List<String> screenshots = new ArrayList<String>();
  private List<String> videoLinks = new ArrayList<String>();
  private List<String> languages = new ArrayList<String>();
  private String vendorEmail = null;
  private String termsOfService = null;
  private LocalizedField helpDocumentationURL = null;
  private LocalizedField marketingURL = null;
  private List<String> industries = new ArrayList<String>();
  private List<String> categories = new ArrayList<String>();
  private List<SmartCase> smartCases = new ArrayList<SmartCase>();
  private List<PricingOption> pricing = new ArrayList<PricingOption>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Localized name
   **/
  public AppFoundryListing name(LocalizedField name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Localized name")
  @JsonProperty("name")
  public LocalizedField getName() {
    return name;
  }
  public void setName(LocalizedField name) {
    this.name = name;
  }

  
  /**
   * Provides information about the integration implementation
   **/
  public AppFoundryListing registryInfo(AppFoundryListingRegistryInfo registryInfo) {
    this.registryInfo = registryInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides information about the integration implementation")
  @JsonProperty("registryInfo")
  public AppFoundryListingRegistryInfo getRegistryInfo() {
    return registryInfo;
  }
  public void setRegistryInfo(AppFoundryListingRegistryInfo registryInfo) {
    this.registryInfo = registryInfo;
  }

  
  /**
   * Marketing data
   **/
  public AppFoundryListing marketingInfo(MarketingInfo marketingInfo) {
    this.marketingInfo = marketingInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Marketing data")
  @JsonProperty("marketingInfo")
  public MarketingInfo getMarketingInfo() {
    return marketingInfo;
  }
  public void setMarketingInfo(MarketingInfo marketingInfo) {
    this.marketingInfo = marketingInfo;
  }

  
  /**
   * Localized tagline
   **/
  public AppFoundryListing tagline(LocalizedField tagline) {
    this.tagline = tagline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Localized tagline")
  @JsonProperty("tagline")
  public LocalizedField getTagline() {
    return tagline;
  }
  public void setTagline(LocalizedField tagline) {
    this.tagline = tagline;
  }

  
  /**
   * Localized short description
   **/
  public AppFoundryListing briefDescription(LocalizedField briefDescription) {
    this.briefDescription = briefDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Localized short description")
  @JsonProperty("briefDescription")
  public LocalizedField getBriefDescription() {
    return briefDescription;
  }
  public void setBriefDescription(LocalizedField briefDescription) {
    this.briefDescription = briefDescription;
  }

  
  /**
   * Localized full description
   **/
  public AppFoundryListing fullDescription(LocalizedField fullDescription) {
    this.fullDescription = fullDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Localized full description")
  @JsonProperty("fullDescription")
  public LocalizedField getFullDescription() {
    return fullDescription;
  }
  public void setFullDescription(LocalizedField fullDescription) {
    this.fullDescription = fullDescription;
  }

  
  /**
   * The supported platform
   **/
  public AppFoundryListing platform(Platform platform) {
    this.platform = platform;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The supported platform")
  @JsonProperty("platform")
  public Platform getPlatform() {
    return platform;
  }
  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  
  /**
   * URL to the company logo to be displayed
   **/
  public AppFoundryListing companyLogo(String companyLogo) {
    this.companyLogo = companyLogo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL to the company logo to be displayed")
  @JsonProperty("companyLogo")
  public String getCompanyLogo() {
    return companyLogo;
  }
  public void setCompanyLogo(String companyLogo) {
    this.companyLogo = companyLogo;
  }

  
  /**
   * URL to the app logo to be displayed
   **/
  public AppFoundryListing appLogo(String appLogo) {
    this.appLogo = appLogo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL to the app logo to be displayed")
  @JsonProperty("appLogo")
  public String getAppLogo() {
    return appLogo;
  }
  public void setAppLogo(String appLogo) {
    this.appLogo = appLogo;
  }

  
  /**
   * Localized company name for the listing publisher
   **/
  public AppFoundryListing companyName(LocalizedField companyName) {
    this.companyName = companyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Localized company name for the listing publisher")
  @JsonProperty("companyName")
  public LocalizedField getCompanyName() {
    return companyName;
  }
  public void setCompanyName(LocalizedField companyName) {
    this.companyName = companyName;
  }

  
  /**
   * Localized URL to the website associated with the listing
   **/
  public AppFoundryListing website(LocalizedField website) {
    this.website = website;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Localized URL to the website associated with the listing")
  @JsonProperty("website")
  public LocalizedField getWebsite() {
    return website;
  }
  public void setWebsite(LocalizedField website) {
    this.website = website;
  }

  
  /**
   * Screenshot URLS
   **/
  public AppFoundryListing screenshots(List<String> screenshots) {
    this.screenshots = screenshots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Screenshot URLS")
  @JsonProperty("screenshots")
  public List<String> getScreenshots() {
    return screenshots;
  }
  public void setScreenshots(List<String> screenshots) {
    this.screenshots = screenshots;
  }

  
  /**
   * Usage video URLS
   **/
  public AppFoundryListing videoLinks(List<String> videoLinks) {
    this.videoLinks = videoLinks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Usage video URLS")
  @JsonProperty("videoLinks")
  public List<String> getVideoLinks() {
    return videoLinks;
  }
  public void setVideoLinks(List<String> videoLinks) {
    this.videoLinks = videoLinks;
  }

  
  /**
   * Indicates the languages that the application supports. Supported application languages may differ from the listing localization languages
   **/
  public AppFoundryListing languages(List<String> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the languages that the application supports. Supported application languages may differ from the listing localization languages")
  @JsonProperty("languages")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  
  /**
   * Contact email for the listing publisher
   **/
  public AppFoundryListing vendorEmail(String vendorEmail) {
    this.vendorEmail = vendorEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact email for the listing publisher")
  @JsonProperty("vendorEmail")
  public String getVendorEmail() {
    return vendorEmail;
  }
  public void setVendorEmail(String vendorEmail) {
    this.vendorEmail = vendorEmail;
  }

  
  /**
   * URL to the terms of service
   **/
  public AppFoundryListing termsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL to the terms of service")
  @JsonProperty("termsOfService")
  public String getTermsOfService() {
    return termsOfService;
  }
  public void setTermsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
  }

  
  /**
   * URL to help documentation
   **/
  public AppFoundryListing helpDocumentationURL(LocalizedField helpDocumentationURL) {
    this.helpDocumentationURL = helpDocumentationURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL to help documentation")
  @JsonProperty("helpDocumentationURL")
  public LocalizedField getHelpDocumentationURL() {
    return helpDocumentationURL;
  }
  public void setHelpDocumentationURL(LocalizedField helpDocumentationURL) {
    this.helpDocumentationURL = helpDocumentationURL;
  }

  
  /**
   * URL to external marketing page
   **/
  public AppFoundryListing marketingURL(LocalizedField marketingURL) {
    this.marketingURL = marketingURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL to external marketing page")
  @JsonProperty("marketingURL")
  public LocalizedField getMarketingURL() {
    return marketingURL;
  }
  public void setMarketingURL(LocalizedField marketingURL) {
    this.marketingURL = marketingURL;
  }

  
  /**
   * Industries targeted
   **/
  public AppFoundryListing industries(List<String> industries) {
    this.industries = industries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Industries targeted")
  @JsonProperty("industries")
  public List<String> getIndustries() {
    return industries;
  }
  public void setIndustries(List<String> industries) {
    this.industries = industries;
  }

  
  /**
   * Indicated the categories the listing belongs to
   **/
  public AppFoundryListing categories(List<String> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicated the categories the listing belongs to")
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  
  /**
   * Use cases the listing is meant to address
   **/
  public AppFoundryListing smartCases(List<SmartCase> smartCases) {
    this.smartCases = smartCases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Use cases the listing is meant to address")
  @JsonProperty("smartCases")
  public List<SmartCase> getSmartCases() {
    return smartCases;
  }
  public void setSmartCases(List<SmartCase> smartCases) {
    this.smartCases = smartCases;
  }

  
  /**
   * Pricing options for the listing
   **/
  public AppFoundryListing pricing(List<PricingOption> pricing) {
    this.pricing = pricing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pricing options for the listing")
  @JsonProperty("pricing")
  public List<PricingOption> getPricing() {
    return pricing;
  }
  public void setPricing(List<PricingOption> pricing) {
    this.pricing = pricing;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppFoundryListing appFoundryListing = (AppFoundryListing) o;
    return Objects.equals(this.id, appFoundryListing.id) &&
        Objects.equals(this.name, appFoundryListing.name) &&
        Objects.equals(this.registryInfo, appFoundryListing.registryInfo) &&
        Objects.equals(this.marketingInfo, appFoundryListing.marketingInfo) &&
        Objects.equals(this.tagline, appFoundryListing.tagline) &&
        Objects.equals(this.briefDescription, appFoundryListing.briefDescription) &&
        Objects.equals(this.fullDescription, appFoundryListing.fullDescription) &&
        Objects.equals(this.platform, appFoundryListing.platform) &&
        Objects.equals(this.companyLogo, appFoundryListing.companyLogo) &&
        Objects.equals(this.appLogo, appFoundryListing.appLogo) &&
        Objects.equals(this.companyName, appFoundryListing.companyName) &&
        Objects.equals(this.website, appFoundryListing.website) &&
        Objects.equals(this.screenshots, appFoundryListing.screenshots) &&
        Objects.equals(this.videoLinks, appFoundryListing.videoLinks) &&
        Objects.equals(this.languages, appFoundryListing.languages) &&
        Objects.equals(this.vendorEmail, appFoundryListing.vendorEmail) &&
        Objects.equals(this.termsOfService, appFoundryListing.termsOfService) &&
        Objects.equals(this.helpDocumentationURL, appFoundryListing.helpDocumentationURL) &&
        Objects.equals(this.marketingURL, appFoundryListing.marketingURL) &&
        Objects.equals(this.industries, appFoundryListing.industries) &&
        Objects.equals(this.categories, appFoundryListing.categories) &&
        Objects.equals(this.smartCases, appFoundryListing.smartCases) &&
        Objects.equals(this.pricing, appFoundryListing.pricing) &&
        Objects.equals(this.selfUri, appFoundryListing.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, registryInfo, marketingInfo, tagline, briefDescription, fullDescription, platform, companyLogo, appLogo, companyName, website, screenshots, videoLinks, languages, vendorEmail, termsOfService, helpDocumentationURL, marketingURL, industries, categories, smartCases, pricing, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppFoundryListing {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    registryInfo: ").append(toIndentedString(registryInfo)).append("\n");
    sb.append("    marketingInfo: ").append(toIndentedString(marketingInfo)).append("\n");
    sb.append("    tagline: ").append(toIndentedString(tagline)).append("\n");
    sb.append("    briefDescription: ").append(toIndentedString(briefDescription)).append("\n");
    sb.append("    fullDescription: ").append(toIndentedString(fullDescription)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    companyLogo: ").append(toIndentedString(companyLogo)).append("\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    screenshots: ").append(toIndentedString(screenshots)).append("\n");
    sb.append("    videoLinks: ").append(toIndentedString(videoLinks)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    vendorEmail: ").append(toIndentedString(vendorEmail)).append("\n");
    sb.append("    termsOfService: ").append(toIndentedString(termsOfService)).append("\n");
    sb.append("    helpDocumentationURL: ").append(toIndentedString(helpDocumentationURL)).append("\n");
    sb.append("    marketingURL: ").append(toIndentedString(marketingURL)).append("\n");
    sb.append("    industries: ").append(toIndentedString(industries)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    smartCases: ").append(toIndentedString(smartCases)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

