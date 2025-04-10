/*
 * Amazon Shipping API
 * The Amazon Shipping API is designed to support outbound shipping use cases both for orders originating on Amazon-owned marketplaces as well as external channels/marketplaces. With these APIs, you can request shipping rates, create shipments, cancel shipments, and track shipments.
 *
 * OpenAPI spec version: v2
 * Contact: swa-api-core@amazon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipping;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object representing an excluded benefit that is excluded for an ShippingOffering/Rate.
 */
@ApiModel(description = "Object representing an excluded benefit that is excluded for an ShippingOffering/Rate.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class ExcludedBenefit {
  @SerializedName("benefit")
  private String benefit = null;

  @SerializedName("reasonCode")
  private String reasonCode = null;

  public ExcludedBenefit benefit(String benefit) {
    this.benefit = benefit;
    return this;
  }

   /**
   * Get benefit
   * @return benefit
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBenefit() {
    return benefit;
  }

  public void setBenefit(String benefit) {
    this.benefit = benefit;
  }

  public ExcludedBenefit reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcludedBenefit excludedBenefit = (ExcludedBenefit) o;
    return Objects.equals(this.benefit, excludedBenefit.benefit) &&
        Objects.equals(this.reasonCode, excludedBenefit.reasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefit, reasonCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcludedBenefit {\n");
    
    sb.append("    benefit: ").append(toIndentedString(benefit)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
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

