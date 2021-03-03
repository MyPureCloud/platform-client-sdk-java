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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.FacetStatistics;
import com.mypurecloud.sdk.v2.model.FacetTerm;
import com.mypurecloud.sdk.v2.model.TermAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FacetEntry
 */

public class FacetEntry  implements Serializable {
  
  private TermAttribute attribute = null;
  private FacetStatistics statistics = null;
  private Long other = null;
  private Long total = null;
  private Long missing = null;
  private Integer termCount = null;

  private static class TermTypeEnumDeserializer extends StdDeserializer<TermTypeEnum> {
    public TermTypeEnumDeserializer() {
      super(TermTypeEnumDeserializer.class);
    }

    @Override
    public TermTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TermTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets termType
   */
 @JsonDeserialize(using = TermTypeEnumDeserializer.class)
  public enum TermTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TERM("TERM"),
    NUMBERRANGE("NUMBERRANGE"),
    NUMBERHISTOGRAM("NUMBERHISTOGRAM"),
    DATERANGE("DATERANGE"),
    DATEHISTOGRAM("DATEHISTOGRAM"),
    ID("ID");

    private String value;

    TermTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TermTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TermTypeEnum value : TermTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TermTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TermTypeEnum termType = null;
  private List<FacetTerm> terms = new ArrayList<FacetTerm>();

  
  /**
   **/
  public FacetEntry attribute(TermAttribute attribute) {
    this.attribute = attribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attribute")
  public TermAttribute getAttribute() {
    return attribute;
  }
  public void setAttribute(TermAttribute attribute) {
    this.attribute = attribute;
  }

  
  /**
   **/
  public FacetEntry statistics(FacetStatistics statistics) {
    this.statistics = statistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statistics")
  public FacetStatistics getStatistics() {
    return statistics;
  }
  public void setStatistics(FacetStatistics statistics) {
    this.statistics = statistics;
  }

  
  /**
   **/
  public FacetEntry other(Long other) {
    this.other = other;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("other")
  public Long getOther() {
    return other;
  }
  public void setOther(Long other) {
    this.other = other;
  }

  
  /**
   **/
  public FacetEntry total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  
  /**
   **/
  public FacetEntry missing(Long missing) {
    this.missing = missing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("missing")
  public Long getMissing() {
    return missing;
  }
  public void setMissing(Long missing) {
    this.missing = missing;
  }

  
  /**
   **/
  public FacetEntry termCount(Integer termCount) {
    this.termCount = termCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("termCount")
  public Integer getTermCount() {
    return termCount;
  }
  public void setTermCount(Integer termCount) {
    this.termCount = termCount;
  }

  
  /**
   **/
  public FacetEntry termType(TermTypeEnum termType) {
    this.termType = termType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("termType")
  public TermTypeEnum getTermType() {
    return termType;
  }
  public void setTermType(TermTypeEnum termType) {
    this.termType = termType;
  }

  
  /**
   **/
  public FacetEntry terms(List<FacetTerm> terms) {
    this.terms = terms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("terms")
  public List<FacetTerm> getTerms() {
    return terms;
  }
  public void setTerms(List<FacetTerm> terms) {
    this.terms = terms;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetEntry facetEntry = (FacetEntry) o;
    return Objects.equals(this.attribute, facetEntry.attribute) &&
        Objects.equals(this.statistics, facetEntry.statistics) &&
        Objects.equals(this.other, facetEntry.other) &&
        Objects.equals(this.total, facetEntry.total) &&
        Objects.equals(this.missing, facetEntry.missing) &&
        Objects.equals(this.termCount, facetEntry.termCount) &&
        Objects.equals(this.termType, facetEntry.termType) &&
        Objects.equals(this.terms, facetEntry.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, statistics, other, total, missing, termCount, termType, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetEntry {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    missing: ").append(toIndentedString(missing)).append("\n");
    sb.append("    termCount: ").append(toIndentedString(termCount)).append("\n");
    sb.append("    termType: ").append(toIndentedString(termType)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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

