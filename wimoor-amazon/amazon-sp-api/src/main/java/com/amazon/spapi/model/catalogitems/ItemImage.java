/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.catalogitems;

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
 * Image for an item in the Amazon catalog.
 */
@ApiModel(description = "Image for an item in the Amazon catalog.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:25.977+08:00")
public class ItemImage {
  /**
   * Variant of the image, such as &#x60;MAIN&#x60; or &#x60;PT01&#x60;.
   */
  @JsonAdapter(VariantEnum.Adapter.class)
  public enum VariantEnum {
    MAIN("MAIN"),
    
    PT01("PT01"),
    
    PT02("PT02"),
    
    PT03("PT03"),
    
    PT04("PT04"),
    
    PT05("PT05"),
    
    PT06("PT06"),
    
    PT07("PT07"),
    
    PT08("PT08"),
    
    SWCH("SWCH");

    private String value;

    VariantEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VariantEnum fromValue(String text) {
      for (VariantEnum b : VariantEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VariantEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VariantEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VariantEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VariantEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("variant")
  private VariantEnum variant = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("width")
  private Integer width = null;

  public ItemImage variant(VariantEnum variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Variant of the image, such as &#x60;MAIN&#x60; or &#x60;PT01&#x60;.
   * @return variant
  **/
  @ApiModelProperty(example = "MAIN", required = true, value = "Variant of the image, such as `MAIN` or `PT01`.")
  public VariantEnum getVariant() {
    return variant;
  }

  public void setVariant(VariantEnum variant) {
    this.variant = variant;
  }

  public ItemImage link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Link, or URL, for the image.
   * @return link
  **/
  @ApiModelProperty(required = true, value = "Link, or URL, for the image.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ItemImage height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the image in pixels.
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Height of the image in pixels.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ItemImage width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the image in pixels.
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Width of the image in pixels.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemImage itemImage = (ItemImage) o;
    return Objects.equals(this.variant, itemImage.variant) &&
        Objects.equals(this.link, itemImage.link) &&
        Objects.equals(this.height, itemImage.height) &&
        Objects.equals(this.width, itemImage.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variant, link, height, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemImage {\n");
    
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

