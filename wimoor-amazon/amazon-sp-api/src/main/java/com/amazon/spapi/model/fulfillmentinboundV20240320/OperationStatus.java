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
 * The status of an operation.
 */
@JsonAdapter(OperationStatus.Adapter.class)
public enum OperationStatus {
  
  SUCCESS("SUCCESS"),
  
  FAILED("FAILED"),
  
  IN_PROGRESS("IN_PROGRESS");

  private String value;

  OperationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperationStatus fromValue(String text) {
    for (OperationStatus b : OperationStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OperationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final OperationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OperationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OperationStatus.fromValue(String.valueOf(value));
    }
  }
}

