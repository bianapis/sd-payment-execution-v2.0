package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentMechanismRetrieveInputModelPaymentMechanismInstanceAnalysis;
import org.bian.dto.BQPaymentMechanismRetrieveInputModelPaymentMechanismInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentMechanismRetrieveInputModel
 */
public class BQPaymentMechanismRetrieveInputModel   {
  private Object paymentMechanismRetrieveActionTaskRecord = null;

  private String paymentMechanismRetrieveActionRequest = null;

  private BQPaymentMechanismRetrieveInputModelPaymentMechanismInstanceReport paymentMechanismInstanceReport = null;

  private BQPaymentMechanismRetrieveInputModelPaymentMechanismInstanceAnalysis paymentMechanismInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentMechanismRetrieveActionTaskRecord
  **/

  public Object getPaymentMechanismRetrieveActionTaskRecord() {
    return paymentMechanismRetrieveActionTaskRecord;
  }

  public void setPaymentMechanismRetrieveActionTaskRecord(Object paymentMechanismRetrieveActionTaskRecord) {
    this.paymentMechanismRetrieveActionTaskRecord = paymentMechanismRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentMechanismRetrieveActionRequest
  **/

  public String getPaymentMechanismRetrieveActionRequest() {
    return paymentMechanismRetrieveActionRequest;
  }

  public void setPaymentMechanismRetrieveActionRequest(String paymentMechanismRetrieveActionRequest) {
    this.paymentMechanismRetrieveActionRequest = paymentMechanismRetrieveActionRequest;
  }


  /**
   * Get paymentMechanismInstanceReport
   * @return paymentMechanismInstanceReport
  **/

  public BQPaymentMechanismRetrieveInputModelPaymentMechanismInstanceReport getPaymentMechanismInstanceReport() {
    return paymentMechanismInstanceReport;
  }

  public void setPaymentMechanismInstanceReport(BQPaymentMechanismRetrieveInputModelPaymentMechanismInstanceReport paymentMechanismInstanceReport) {
    this.paymentMechanismInstanceReport = paymentMechanismInstanceReport;
  }


  /**
   * Get paymentMechanismInstanceAnalysis
   * @return paymentMechanismInstanceAnalysis
  **/

  public BQPaymentMechanismRetrieveInputModelPaymentMechanismInstanceAnalysis getPaymentMechanismInstanceAnalysis() {
    return paymentMechanismInstanceAnalysis;
  }

  public void setPaymentMechanismInstanceAnalysis(BQPaymentMechanismRetrieveInputModelPaymentMechanismInstanceAnalysis paymentMechanismInstanceAnalysis) {
    this.paymentMechanismInstanceAnalysis = paymentMechanismInstanceAnalysis;
  }


}

