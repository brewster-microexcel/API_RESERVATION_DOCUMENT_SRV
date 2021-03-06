/*
 * Reservation Document - Read, Create, Delete
 * This service enables you to retrieve,  create and delete reservation documents.  For example, a user might create a  reservation for a material with some  quantity and assign that reserved material  to a cost center, a sales order or an  asset. A reservation can also be created  for a transfer posting from one plant to  another. The service also allows to delete  existing reservation documents. It can be  consumed by external systems and user  interfaces.
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_reservation_document_srv.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CollectionOfAReservationDocumentHeaderType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-07T11:14:01.327Z")
public class CollectionOfAReservationDocumentHeaderType {
  @SerializedName("results")
  private List<APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType> results = null;

  public CollectionOfAReservationDocumentHeaderType results(List<APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType> results) {
    this.results = results;
    return this;
  }

  public CollectionOfAReservationDocumentHeaderType addResultsItem(APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType> getResults() {
    return results;
  }

  public void setResults(List<APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionOfAReservationDocumentHeaderType collectionOfAReservationDocumentHeaderType = (CollectionOfAReservationDocumentHeaderType) o;
    return Objects.equals(this.results, collectionOfAReservationDocumentHeaderType.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionOfAReservationDocumentHeaderType {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

