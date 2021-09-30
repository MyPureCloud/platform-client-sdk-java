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
import com.mypurecloud.sdk.v2.model.IntentDefinition;
import com.mypurecloud.sdk.v2.model.NamedEntityDefinition;
import com.mypurecloud.sdk.v2.model.NamedEntityTypeDefinition;
import com.mypurecloud.sdk.v2.model.NluDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * NluDomainVersion
 */

public class NluDomainVersion  implements Serializable {
  
  private String id = null;
  private NluDomain domain = null;
  private String description = null;
  private String language = null;
  private Boolean published = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Date dateTrained = null;
  private Date datePublished = null;

  private static class TrainingStatusEnumDeserializer extends StdDeserializer<TrainingStatusEnum> {
    public TrainingStatusEnumDeserializer() {
      super(TrainingStatusEnumDeserializer.class);
    }

    @Override
    public TrainingStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TrainingStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The training status of the NLU domain version.
   */
 @JsonDeserialize(using = TrainingStatusEnumDeserializer.class)
  public enum TrainingStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNTRAINED("Untrained"),
    TRAINING("Training"),
    TRAINED("Trained"),
    ERROR("Error"),
    UNKNOWN("Unknown");

    private String value;

    TrainingStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TrainingStatusEnum fromString(String key) {
      if (key == null) return null;

      for (TrainingStatusEnum value : TrainingStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TrainingStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TrainingStatusEnum trainingStatus = null;

  private static class EvaluationStatusEnumDeserializer extends StdDeserializer<EvaluationStatusEnum> {
    public EvaluationStatusEnumDeserializer() {
      super(EvaluationStatusEnumDeserializer.class);
    }

    @Override
    public EvaluationStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EvaluationStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The evaluation status of the NLU domain version.
   */
 @JsonDeserialize(using = EvaluationStatusEnumDeserializer.class)
  public enum EvaluationStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNEVALUATED("Unevaluated"),
    EVALUATING("Evaluating"),
    EVALUATED("Evaluated"),
    ERROR("Error");

    private String value;

    EvaluationStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EvaluationStatusEnum fromString(String key) {
      if (key == null) return null;

      for (EvaluationStatusEnum value : EvaluationStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EvaluationStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EvaluationStatusEnum evaluationStatus = null;
  private List<IntentDefinition> intents = new ArrayList<IntentDefinition>();
  private List<NamedEntityTypeDefinition> entityTypes = new ArrayList<NamedEntityTypeDefinition>();
  private List<NamedEntityDefinition> entities = new ArrayList<NamedEntityDefinition>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The NLU domain of the version.")
  @JsonProperty("domain")
  public NluDomain getDomain() {
    return domain;
  }

  
  /**
   * The description of the NLU domain version.
   **/
  public NluDomainVersion description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the NLU domain version.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The language that the NLU domain version supports.
   **/
  public NluDomainVersion language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The language that the NLU domain version supports.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  @ApiModelProperty(example = "null", value = "Whether this NLU domain version has been published.")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }

  
  @ApiModelProperty(example = "null", value = "The date when the NLU domain version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "The date when the NLU domain version was updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  @ApiModelProperty(example = "null", value = "The date when the NLU domain version was trained. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateTrained")
  public Date getDateTrained() {
    return dateTrained;
  }

  
  @ApiModelProperty(example = "null", value = "The date when the NLU domain version was published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("datePublished")
  public Date getDatePublished() {
    return datePublished;
  }

  
  @ApiModelProperty(example = "null", value = "The training status of the NLU domain version.")
  @JsonProperty("trainingStatus")
  public TrainingStatusEnum getTrainingStatus() {
    return trainingStatus;
  }

  
  @ApiModelProperty(example = "null", value = "The evaluation status of the NLU domain version.")
  @JsonProperty("evaluationStatus")
  public EvaluationStatusEnum getEvaluationStatus() {
    return evaluationStatus;
  }

  
  /**
   * The intents defined for this NLU domain version.
   **/
  public NluDomainVersion intents(List<IntentDefinition> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intents defined for this NLU domain version.")
  @JsonProperty("intents")
  public List<IntentDefinition> getIntents() {
    return intents;
  }
  public void setIntents(List<IntentDefinition> intents) {
    this.intents = intents;
  }

  
  /**
   * The entity types defined for this NLU domain version.
   **/
  public NluDomainVersion entityTypes(List<NamedEntityTypeDefinition> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entity types defined for this NLU domain version.")
  @JsonProperty("entityTypes")
  public List<NamedEntityTypeDefinition> getEntityTypes() {
    return entityTypes;
  }
  public void setEntityTypes(List<NamedEntityTypeDefinition> entityTypes) {
    this.entityTypes = entityTypes;
  }

  
  /**
   * The entities defined for this NLU domain version.This field is mutually exclusive with entityTypeBindings
   **/
  public NluDomainVersion entities(List<NamedEntityDefinition> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entities defined for this NLU domain version.This field is mutually exclusive with entityTypeBindings")
  @JsonProperty("entities")
  public List<NamedEntityDefinition> getEntities() {
    return entities;
  }
  public void setEntities(List<NamedEntityDefinition> entities) {
    this.entities = entities;
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
    NluDomainVersion nluDomainVersion = (NluDomainVersion) o;
    return Objects.equals(this.id, nluDomainVersion.id) &&
        Objects.equals(this.domain, nluDomainVersion.domain) &&
        Objects.equals(this.description, nluDomainVersion.description) &&
        Objects.equals(this.language, nluDomainVersion.language) &&
        Objects.equals(this.published, nluDomainVersion.published) &&
        Objects.equals(this.dateCreated, nluDomainVersion.dateCreated) &&
        Objects.equals(this.dateModified, nluDomainVersion.dateModified) &&
        Objects.equals(this.dateTrained, nluDomainVersion.dateTrained) &&
        Objects.equals(this.datePublished, nluDomainVersion.datePublished) &&
        Objects.equals(this.trainingStatus, nluDomainVersion.trainingStatus) &&
        Objects.equals(this.evaluationStatus, nluDomainVersion.evaluationStatus) &&
        Objects.equals(this.intents, nluDomainVersion.intents) &&
        Objects.equals(this.entityTypes, nluDomainVersion.entityTypes) &&
        Objects.equals(this.entities, nluDomainVersion.entities) &&
        Objects.equals(this.selfUri, nluDomainVersion.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domain, description, language, published, dateCreated, dateModified, dateTrained, datePublished, trainingStatus, evaluationStatus, intents, entityTypes, entities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluDomainVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateTrained: ").append(toIndentedString(dateTrained)).append("\n");
    sb.append("    datePublished: ").append(toIndentedString(datePublished)).append("\n");
    sb.append("    trainingStatus: ").append(toIndentedString(trainingStatus)).append("\n");
    sb.append("    evaluationStatus: ").append(toIndentedString(evaluationStatus)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

