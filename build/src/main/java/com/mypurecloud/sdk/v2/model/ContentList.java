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
import com.mypurecloud.sdk.v2.model.ContentActions;
import com.mypurecloud.sdk.v2.model.ListItemComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * List content object.
 */
@ApiModel(description = "List content object.")

public class ContentList  implements Serializable {
  
  private String id = null;

  private static class ListTypeEnumDeserializer extends StdDeserializer<ListTypeEnum> {
    public ListTypeEnumDeserializer() {
      super(ListTypeEnumDeserializer.class);
    }

    @Override
    public ListTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ListTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of list this instance represents.
   */
 @JsonDeserialize(using = ListTypeEnumDeserializer.class)
  public enum ListTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SELECTION("Selection"),
    VERTICAL("Vertical");

    private String value;

    ListTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ListTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ListTypeEnum value : ListTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ListTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ListTypeEnum listType = null;
  private String title = null;
  private String description = null;
  private String submitLabel = null;
  private ContentActions actions = null;
  private List<ListItemComponent> components = new ArrayList<ListItemComponent>();

  
  /**
   * A unique ID assigned to this rich message content.
   **/
  public ContentList id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique ID assigned to this rich message content.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The type of list this instance represents.
   **/
  public ContentList listType(ListTypeEnum listType) {
    this.listType = listType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of list this instance represents.")
  @JsonProperty("listType")
  public ListTypeEnum getListType() {
    return listType;
  }
  public void setListType(ListTypeEnum listType) {
    this.listType = listType;
  }

  
  /**
   * Text to show in the title.
   **/
  public ContentList title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Text to show in the description.
   **/
  public ContentList description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Label for Submit button.
   **/
  public ContentList submitLabel(String submitLabel) {
    this.submitLabel = submitLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Label for Submit button.")
  @JsonProperty("submitLabel")
  public String getSubmitLabel() {
    return submitLabel;
  }
  public void setSubmitLabel(String submitLabel) {
    this.submitLabel = submitLabel;
  }

  
  /**
   * The list actions.
   **/
  public ContentList actions(ContentActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list actions.")
  @JsonProperty("actions")
  public ContentActions getActions() {
    return actions;
  }
  public void setActions(ContentActions actions) {
    this.actions = actions;
  }

  
  /**
   * An array of component objects.
   **/
  public ContentList components(List<ListItemComponent> components) {
    this.components = components;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of component objects.")
  @JsonProperty("components")
  public List<ListItemComponent> getComponents() {
    return components;
  }
  public void setComponents(List<ListItemComponent> components) {
    this.components = components;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentList contentList = (ContentList) o;
    return Objects.equals(this.id, contentList.id) &&
        Objects.equals(this.listType, contentList.listType) &&
        Objects.equals(this.title, contentList.title) &&
        Objects.equals(this.description, contentList.description) &&
        Objects.equals(this.submitLabel, contentList.submitLabel) &&
        Objects.equals(this.actions, contentList.actions) &&
        Objects.equals(this.components, contentList.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, listType, title, description, submitLabel, actions, components);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    submitLabel: ").append(toIndentedString(submitLabel)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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

