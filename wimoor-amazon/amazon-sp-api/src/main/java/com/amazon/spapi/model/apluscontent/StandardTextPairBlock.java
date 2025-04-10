/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.apluscontent;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The A+ Content standard label and description block, comprised of a pair of text components.
 */
@ApiModel(description = "The A+ Content standard label and description block, comprised of a pair of text components.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:20.221+08:00")
public class StandardTextPairBlock {
  @SerializedName("label")
  private TextComponent label = null;

  @SerializedName("description")
  private TextComponent description = null;

  public StandardTextPairBlock label(TextComponent label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public TextComponent getLabel() {
    return label;
  }

  public void setLabel(TextComponent label) {
    this.label = label;
  }

  public StandardTextPairBlock description(TextComponent description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public TextComponent getDescription() {
    return description;
  }

  public void setDescription(TextComponent description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardTextPairBlock standardTextPairBlock = (StandardTextPairBlock) o;
    return Objects.equals(this.label, standardTextPairBlock.label) &&
        Objects.equals(this.description, standardTextPairBlock.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardTextPairBlock {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

