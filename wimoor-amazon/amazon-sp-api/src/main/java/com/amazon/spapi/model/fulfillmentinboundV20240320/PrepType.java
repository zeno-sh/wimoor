/*
 * Fulfillment Inbound v2024-03-20
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinboundV20240320;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Preparation instructions for shipping an item to Amazon&#39;s fulfillment network. For more information about preparing items for shipment to Amazon&#39;s fulfillment network, refer to [Seller Central Help for your marketplace](https://developer-docs.amazon.com/sp-api/docs/seller-central-urls).
 */
@JsonAdapter(PrepType.Adapter.class)
public enum PrepType {
  
  BLACK_SHRINKWRAP("ITEM_BLACK_SHRINKWRAP"),
  
  BLANKSTK("ITEM_BLANKSTK"),
  
  BOXING("ITEM_BOXING"),
  
  BUBBLEWRAP("ITEM_BUBBLEWRAP"),
  
  CAP_SEALING("ITEM_CAP_SEALING"),
  
  DEBUNDLE("ITEM_DEBUNDLE"),
  
  HANG_GARMENT("ITEM_HANG_GARMENT"),
  
  LABELING("ITEM_LABELING"),
  
  NO_PREP("ITEM_NO_PREP"),
  
  POLYBAGGING("ITEM_POLYBAGGING"),
  
  RMOVHANG("ITEM_RMOVHANG"),
  
  SETCREAT("ITEM_SETCREAT"),
  
  SETSTK("ITEM_SETSTK"),
  
  SIOC("ITEM_SIOC"),
  
  SUFFOSTK("ITEM_SUFFOSTK"),
  
  TAPING("ITEM_TAPING");

  private String value;

  PrepType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PrepType fromValue(String text) {
    for (PrepType b : PrepType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PrepType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PrepType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PrepType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PrepType.fromValue(String.valueOf(value));
    }
  }
}

