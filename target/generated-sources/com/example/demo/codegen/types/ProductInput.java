package com.example.demo.codegen.types;

import jakarta.annotation.Generated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2025-01-26T13:30:19.978170Z"
)
@com.example.demo.codegen.Generated
public class ProductInput {
  private String name;

  private String description;

  private int price;

  public ProductInput() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "ProductInput{name='" + name + "', description='" + description + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductInput that = (ProductInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        price == that.price;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2025-01-26T13:30:19.978170Z"
  )
  @com.example.demo.codegen.Generated
  public static class Builder {
    private String name;

    private String description;

    private int price;

    public ProductInput build() {
      ProductInput result = new ProductInput();
      result.name = this.name;
      result.description = this.description;
      result.price = this.price;
      return result;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder price(int price) {
      this.price = price;
      return this;
    }
  }
}
