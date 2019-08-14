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
import com.sap.apibhub.sdk.api_reservation_document_srv.model.CollectionOfAReservationDocumentItemType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-07T11:14:01.327Z")
public class APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType {
  @SerializedName("Reservation")
  private String reservation = null;
  
  @SerializedName("OrderID")
  private String orderID = null;
  
  @SerializedName("GoodsMovementType")
  private String goodsMovementType = null;
  
  @SerializedName("CostCenter")
  private String costCenter = null;
  
  @SerializedName("GoodsRecipientName")
  private String goodsRecipientName = null;
  
  @SerializedName("ReservationDate")
  private String reservationDate = null;
  
  @SerializedName("IsCheckedAgainstFactoryCal")
  private String isCheckedAgainstFactoryCal = null;
  
  @SerializedName("Customer")
  private String customer = null;
  
  @SerializedName("WBSElement")
  private String wBSElement = null;
  
  @SerializedName("ControllingArea")
  private String controllingArea = null;
  
  @SerializedName("SalesOrder")
  private String salesOrder = null;
  
  @SerializedName("SalesOrderItem")
  private String salesOrderItem = null;
  
  @SerializedName("SalesOrderScheduleLine")
  private String salesOrderScheduleLine = null;
  
  @SerializedName("assetNumber")
  private String assetNumber = null;
  
  @SerializedName("AssetSubNumber")
  private String assetSubNumber = null;
  
  @SerializedName("NetworkNumberForAcctAssgmt")
  private String networkNumberForAcctAssgmt = null;
  
  @SerializedName("IssuingOrReceivingPlant")
  private String issuingOrReceivingPlant = null;
  
  @SerializedName("IssuingOrReceivingStorageLoc")
  private String issuingOrReceivingStorageLoc = null;
  

  @SerializedName("to_ReservationDocumentItem")
  private CollectionOfAReservationDocumentItemType toReservationDocumentItem = null;

  public APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType reservation(String reservation) {
    this.reservation = reservation;
    return this;
  }

   /**
   * Number of Reservation/Dependent Requirement   Alphanumeric key uniquely identifying the document.
   * @return reservation
  **/
  @ApiModelProperty(value = "Number of Reservation/Dependent Requirement   Alphanumeric key uniquely identifying the document.")
  public String getReservation() {
    return reservation;
  }

  public void setReservation(String reservation) {
    this.reservation = reservation;
  }
  
  
  

  public String getOrderID() {
	return orderID;
}

public void setOrderID(String orderID) {
	this.orderID = orderID;
}

public String getGoodsMovementType() {
	return goodsMovementType;
}

public void setGoodsMovementType(String goodsMovementType) {
	this.goodsMovementType = goodsMovementType;
}

public String getCostCenter() {
	return costCenter;
}

public void setCostCenter(String costCenter) {
	this.costCenter = costCenter;
}

public String getGoodsRecipientName() {
	return goodsRecipientName;
}

public void setGoodsRecipientName(String goodsRecipientName) {
	this.goodsRecipientName = goodsRecipientName;
}

public String getReservationDate() {
	return reservationDate;
}

public void setReservationDate(String reservationDate) {
	this.reservationDate = reservationDate;
}

public String getIsCheckedAgainstFactoryCal() {
	return isCheckedAgainstFactoryCal;
}

public void setIsCheckedAgainstFactoryCal(String isCheckedAgainstFactoryCal) {
	this.isCheckedAgainstFactoryCal = isCheckedAgainstFactoryCal;
}

public String getCustomer() {
	return customer;
}

public void setCustomer(String customer) {
	this.customer = customer;
}

public String getwBSElement() {
	return wBSElement;
}

public void setwBSElement(String wBSElement) {
	this.wBSElement = wBSElement;
}

public String getControllingArea() {
	return controllingArea;
}

public void setControllingArea(String controllingArea) {
	this.controllingArea = controllingArea;
}

public String getSalesOrder() {
	return salesOrder;
}

public void setSalesOrder(String salesOrder) {
	this.salesOrder = salesOrder;
}

public String getSalesOrderItem() {
	return salesOrderItem;
}

public void setSalesOrderItem(String salesOrderItem) {
	this.salesOrderItem = salesOrderItem;
}

public String getSalesOrderScheduleLine() {
	return salesOrderScheduleLine;
}

public void setSalesOrderScheduleLine(String salesOrderScheduleLine) {
	this.salesOrderScheduleLine = salesOrderScheduleLine;
}

public String getAssetNumber() {
	return assetNumber;
}

public void setAssetNumber(String assetNumber) {
	this.assetNumber = assetNumber;
}

public String getAssetSubNumber() {
	return assetSubNumber;
}

public void setAssetSubNumber(String assetSubNumber) {
	this.assetSubNumber = assetSubNumber;
}

public String getNetworkNumberForAcctAssgmt() {
	return networkNumberForAcctAssgmt;
}

public void setNetworkNumberForAcctAssgmt(String networkNumberForAcctAssgmt) {
	this.networkNumberForAcctAssgmt = networkNumberForAcctAssgmt;
}

public String getIssuingOrReceivingPlant() {
	return issuingOrReceivingPlant;
}

public void setIssuingOrReceivingPlant(String issuingOrReceivingPlant) {
	this.issuingOrReceivingPlant = issuingOrReceivingPlant;
}

public String getIssuingOrReceivingStorageLoc() {
	return issuingOrReceivingStorageLoc;
}

public void setIssuingOrReceivingStorageLoc(String issuingOrReceivingStorageLoc) {
	this.issuingOrReceivingStorageLoc = issuingOrReceivingStorageLoc;
}

public APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType toReservationDocumentItem(CollectionOfAReservationDocumentItemType toReservationDocumentItem) {
    this.toReservationDocumentItem = toReservationDocumentItem;
    return this;
  }

   /**
   * Get toReservationDocumentItem
   * @return toReservationDocumentItem
  **/
  @ApiModelProperty(value = "")
  public CollectionOfAReservationDocumentItemType getToReservationDocumentItem() {
    return toReservationDocumentItem;
  }

  public void setToReservationDocumentItem(CollectionOfAReservationDocumentItemType toReservationDocumentItem) {
    this.toReservationDocumentItem = toReservationDocumentItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType apIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType = (APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType) o;
    return Objects.equals(this.reservation, apIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType.reservation) &&
        Objects.equals(this.toReservationDocumentItem, apIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType.toReservationDocumentItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservation, toReservationDocumentItem);
  }


  

  @Override
public String toString() {
	return "APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType [reservation=" + reservation + ",\n orderID="
			+ orderID + ", goodsMovementType=" + goodsMovementType + ", costCenter=" + costCenter
			+ ",\n goodsRecipientName=" + goodsRecipientName + ", reservationDate=" + reservationDate
			+ ",\n isCheckedAgainstFactoryCal=" + isCheckedAgainstFactoryCal + ", customer=" + customer + ", wBSElement="
			+ wBSElement + ",\n controllingArea=" + controllingArea + ", salesOrder=" + salesOrder + ", salesOrderItem="
			+ salesOrderItem + ",\n salesOrderScheduleLine=" + salesOrderScheduleLine + ", assetNumber=" + assetNumber
			+ ",\n assetSubNumber=" + assetSubNumber + ", networkNumberForAcctAssgmt=" + networkNumberForAcctAssgmt
			+ ",\n issuingOrReceivingPlant=" + issuingOrReceivingPlant + ", issuingOrReceivingStorageLoc="
			+ issuingOrReceivingStorageLoc + ",\n toReservationDocumentItem=" + toReservationDocumentItem + "]";
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

