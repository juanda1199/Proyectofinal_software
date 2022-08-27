// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.resources.payment;

/**
 * PaymentPointOfInteraction class.
 */
public class PaymentPointOfInteraction {
  /**
   * Type.
   */
  private String type;
  /**
   * Sub type.
   */
  private String subType;
  /**
   * Linked to information.
   */
  private String linkedTo;
  /**
   * Application data.
   */
  private PaymentApplicationData applicationData;
  /**
   * Transaction data.
   */
  private PaymentTransactionData transactionData;

  /**
   * Type.
   */
  @java.lang.SuppressWarnings("all")
  public String getType() {
    return this.type;
  }

  /**
   * Sub type.
   */
  @java.lang.SuppressWarnings("all")
  public String getSubType() {
    return this.subType;
  }

  /**
   * Linked to information.
   */
  @java.lang.SuppressWarnings("all")
  public String getLinkedTo() {
    return this.linkedTo;
  }

  /**
   * Application data.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentApplicationData getApplicationData() {
    return this.applicationData;
  }

  /**
   * Transaction data.
   */
  @java.lang.SuppressWarnings("all")
  public PaymentTransactionData getTransactionData() {
    return this.transactionData;
  }
}