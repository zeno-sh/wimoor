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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The standard product comparison table.
 */
@ApiModel(description = "The standard product comparison table.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:20.221+08:00")
public class StandardComparisonTableModule {
  @SerializedName("productColumns")
  private List<StandardComparisonProductBlock> productColumns = null;

  @SerializedName("metricRowLabels")
  private List<PlainTextItem> metricRowLabels = null;

  public StandardComparisonTableModule productColumns(List<StandardComparisonProductBlock> productColumns) {
    this.productColumns = productColumns;
    return this;
  }

  public StandardComparisonTableModule addProductColumnsItem(StandardComparisonProductBlock productColumnsItem) {
    if (this.productColumns == null) {
      this.productColumns = new ArrayList<StandardComparisonProductBlock>();
    }
    this.productColumns.add(productColumnsItem);
    return this;
  }

   /**
   * Get productColumns
   * @return productColumns
  **/
  @ApiModelProperty(value = "")
  public List<StandardComparisonProductBlock> getProductColumns() {
    return productColumns;
  }

  public void setProductColumns(List<StandardComparisonProductBlock> productColumns) {
    this.productColumns = productColumns;
  }

  public StandardComparisonTableModule metricRowLabels(List<PlainTextItem> metricRowLabels) {
    this.metricRowLabels = metricRowLabels;
    return this;
  }

  public StandardComparisonTableModule addMetricRowLabelsItem(PlainTextItem metricRowLabelsItem) {
    if (this.metricRowLabels == null) {
      this.metricRowLabels = new ArrayList<PlainTextItem>();
    }
    this.metricRowLabels.add(metricRowLabelsItem);
    return this;
  }

   /**
   * Get metricRowLabels
   * @return metricRowLabels
  **/
  @ApiModelProperty(value = "")
  public List<PlainTextItem> getMetricRowLabels() {
    return metricRowLabels;
  }

  public void setMetricRowLabels(List<PlainTextItem> metricRowLabels) {
    this.metricRowLabels = metricRowLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardComparisonTableModule standardComparisonTableModule = (StandardComparisonTableModule) o;
    return Objects.equals(this.productColumns, standardComparisonTableModule.productColumns) &&
        Objects.equals(this.metricRowLabels, standardComparisonTableModule.metricRowLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productColumns, metricRowLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardComparisonTableModule {\n");
    
    sb.append("    productColumns: ").append(toIndentedString(productColumns)).append("\n");
    sb.append("    metricRowLabels: ").append(toIndentedString(metricRowLabels)).append("\n");
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

