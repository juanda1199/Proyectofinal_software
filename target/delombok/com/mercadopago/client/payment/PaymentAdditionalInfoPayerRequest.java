// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.client.payment;

import com.mercadopago.client.common.AddressRequest;
import com.mercadopago.client.common.PhoneRequest;
import java.time.OffsetDateTime;

/**
 * PaymentAdditionalInfoPayerRequest class.
 */
public class PaymentAdditionalInfoPayerRequest {
  /**
   * Payer first name.
   */
  private final String firstName;
  /**
   * Payer last name.
   */
  private final String lastName;
  /**
   * Payer phone.
   */
  private final PhoneRequest phone;
  /**
   * Payer address.
   */
  private final AddressRequest address;
  /**
   * Payer registration date.
   */
  private final OffsetDateTime registrationDate;
  /**
   * Payer authentication type.
   */
  private final String authenticationType;
  /**
   * If payer is prime user.
   */
  private final boolean isPrimeUser;
  /**
   * If is first online purchase.
   */
  private final boolean isFirstPurchaseOnline;
  /**
   * Date of last purchase.
   */
  private final OffsetDateTime lastPurchase;

  @java.lang.SuppressWarnings("all")
  PaymentAdditionalInfoPayerRequest(final String firstName, final String lastName, final PhoneRequest phone, final AddressRequest address, final OffsetDateTime registrationDate, final String authenticationType, final boolean isPrimeUser, final boolean isFirstPurchaseOnline, final OffsetDateTime lastPurchase) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.address = address;
    this.registrationDate = registrationDate;
    this.authenticationType = authenticationType;
    this.isPrimeUser = isPrimeUser;
    this.isFirstPurchaseOnline = isFirstPurchaseOnline;
    this.lastPurchase = lastPurchase;
  }


  @java.lang.SuppressWarnings("all")
  public static class PaymentAdditionalInfoPayerRequestBuilder {
    @java.lang.SuppressWarnings("all")
    private String firstName;
    @java.lang.SuppressWarnings("all")
    private String lastName;
    @java.lang.SuppressWarnings("all")
    private PhoneRequest phone;
    @java.lang.SuppressWarnings("all")
    private AddressRequest address;
    @java.lang.SuppressWarnings("all")
    private OffsetDateTime registrationDate;
    @java.lang.SuppressWarnings("all")
    private String authenticationType;
    @java.lang.SuppressWarnings("all")
    private boolean isPrimeUser;
    @java.lang.SuppressWarnings("all")
    private boolean isFirstPurchaseOnline;
    @java.lang.SuppressWarnings("all")
    private OffsetDateTime lastPurchase;

    @java.lang.SuppressWarnings("all")
    PaymentAdditionalInfoPayerRequestBuilder() {
    }

    /**
     * Payer first name.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder firstName(final String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * Payer last name.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder lastName(final String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * Payer phone.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder phone(final PhoneRequest phone) {
      this.phone = phone;
      return this;
    }

    /**
     * Payer address.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder address(final AddressRequest address) {
      this.address = address;
      return this;
    }

    /**
     * Payer registration date.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder registrationDate(final OffsetDateTime registrationDate) {
      this.registrationDate = registrationDate;
      return this;
    }

    /**
     * Payer authentication type.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder authenticationType(final String authenticationType) {
      this.authenticationType = authenticationType;
      return this;
    }

    /**
     * If payer is prime user.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder isPrimeUser(final boolean isPrimeUser) {
      this.isPrimeUser = isPrimeUser;
      return this;
    }

    /**
     * If is first online purchase.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder isFirstPurchaseOnline(final boolean isFirstPurchaseOnline) {
      this.isFirstPurchaseOnline = isFirstPurchaseOnline;
      return this;
    }

    /**
     * Date of last purchase.
     * @return {@code this}.
     */
    @java.lang.SuppressWarnings("all")
    public PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder lastPurchase(final OffsetDateTime lastPurchase) {
      this.lastPurchase = lastPurchase;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public PaymentAdditionalInfoPayerRequest build() {
      return new PaymentAdditionalInfoPayerRequest(this.firstName, this.lastName, this.phone, this.address, this.registrationDate, this.authenticationType, this.isPrimeUser, this.isFirstPurchaseOnline, this.lastPurchase);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", phone=" + this.phone + ", address=" + this.address + ", registrationDate=" + this.registrationDate + ", authenticationType=" + this.authenticationType + ", isPrimeUser=" + this.isPrimeUser + ", isFirstPurchaseOnline=" + this.isFirstPurchaseOnline + ", lastPurchase=" + this.lastPurchase + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  public static PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder builder() {
    return new PaymentAdditionalInfoPayerRequest.PaymentAdditionalInfoPayerRequestBuilder();
  }

  /**
   * Payer first name.
   */
  @java.lang.SuppressWarnings("all")
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Payer last name.
   */
  @java.lang.SuppressWarnings("all")
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Payer phone.
   */
  @java.lang.SuppressWarnings("all")
  public PhoneRequest getPhone() {
    return this.phone;
  }

  /**
   * Payer address.
   */
  @java.lang.SuppressWarnings("all")
  public AddressRequest getAddress() {
    return this.address;
  }

  /**
   * Payer registration date.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getRegistrationDate() {
    return this.registrationDate;
  }

  /**
   * Payer authentication type.
   */
  @java.lang.SuppressWarnings("all")
  public String getAuthenticationType() {
    return this.authenticationType;
  }

  /**
   * If payer is prime user.
   */
  @java.lang.SuppressWarnings("all")
  public boolean isPrimeUser() {
    return this.isPrimeUser;
  }

  /**
   * If is first online purchase.
   */
  @java.lang.SuppressWarnings("all")
  public boolean isFirstPurchaseOnline() {
    return this.isFirstPurchaseOnline;
  }

  /**
   * Date of last purchase.
   */
  @java.lang.SuppressWarnings("all")
  public OffsetDateTime getLastPurchase() {
    return this.lastPurchase;
  }
}