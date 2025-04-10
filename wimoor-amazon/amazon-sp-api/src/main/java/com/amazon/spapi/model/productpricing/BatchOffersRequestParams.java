/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.productpricing;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * BatchOffersRequestParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:49.847+08:00")
public class BatchOffersRequestParams {
  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  @SerializedName("ItemCondition")
  private ItemCondition itemCondition = null;

  @SerializedName("CustomerType")
  private CustomerType customerType = null;

  public BatchOffersRequestParams marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Get marketplaceId
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public BatchOffersRequestParams itemCondition(ItemCondition itemCondition) {
    this.itemCondition = itemCondition;
    return this;
  }

   /**
   * Filters the offer listings to be considered based on item condition. Possible values: New, Used, Collectible, Refurbished, Club.
   * @return itemCondition
  **/
  @ApiModelProperty(required = true, value = "Filters the offer listings to be considered based on item condition. Possible values: New, Used, Collectible, Refurbished, Club.")
  public ItemCondition getItemCondition() {
    return itemCondition;
  }

  public void setItemCondition(ItemCondition itemCondition) {
    this.itemCondition = itemCondition;
  }

  public BatchOffersRequestParams customerType(CustomerType customerType) {
    this.customerType = customerType;
    return this;
  }

   /**
   * Indicates whether to request Consumer or Business offers. Default is Consumer.
   * @return customerType
  **/
  @ApiModelProperty(value = "Indicates whether to request Consumer or Business offers. Default is Consumer.")
  public CustomerType getCustomerType() {
    return customerType;
  }

  public void setCustomerType(CustomerType customerType) {
    this.customerType = customerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchOffersRequestParams batchOffersRequestParams = (BatchOffersRequestParams) o;
    return Objects.equals(this.marketplaceId, batchOffersRequestParams.marketplaceId) &&
        Objects.equals(this.itemCondition, batchOffersRequestParams.itemCondition) &&
        Objects.equals(this.customerType, batchOffersRequestParams.customerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, itemCondition, customerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchOffersRequestParams {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    itemCondition: ").append(toIndentedString(itemCondition)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
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

