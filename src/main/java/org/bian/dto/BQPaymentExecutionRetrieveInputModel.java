package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceAnalysis;
import org.bian.dto.BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentExecutionRetrieveInputModel
 */
public class BQPaymentExecutionRetrieveInputModel   {
  private Object paymentExecutionRetrieveActionTaskRecord = null;

  private String paymentExecutionRetrieveActionRequest = null;

  private BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceReport paymentExecutionInstanceReport = null;

  private BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceAnalysis paymentExecutionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentExecutionRetrieveActionTaskRecord
  **/

  public Object getPaymentExecutionRetrieveActionTaskRecord() {
    return paymentExecutionRetrieveActionTaskRecord;
  }

  public void setPaymentExecutionRetrieveActionTaskRecord(Object paymentExecutionRetrieveActionTaskRecord) {
    this.paymentExecutionRetrieveActionTaskRecord = paymentExecutionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentExecutionRetrieveActionRequest
  **/

  public String getPaymentExecutionRetrieveActionRequest() {
    return paymentExecutionRetrieveActionRequest;
  }

  public void setPaymentExecutionRetrieveActionRequest(String paymentExecutionRetrieveActionRequest) {
    this.paymentExecutionRetrieveActionRequest = paymentExecutionRetrieveActionRequest;
  }


  /**
   * Get paymentExecutionInstanceReport
   * @return paymentExecutionInstanceReport
  **/

  public BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceReport getPaymentExecutionInstanceReport() {
    return paymentExecutionInstanceReport;
  }

  public void setPaymentExecutionInstanceReport(BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceReport paymentExecutionInstanceReport) {
    this.paymentExecutionInstanceReport = paymentExecutionInstanceReport;
  }


  /**
   * Get paymentExecutionInstanceAnalysis
   * @return paymentExecutionInstanceAnalysis
  **/

  public BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceAnalysis getPaymentExecutionInstanceAnalysis() {
    return paymentExecutionInstanceAnalysis;
  }

  public void setPaymentExecutionInstanceAnalysis(BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceAnalysis paymentExecutionInstanceAnalysis) {
    this.paymentExecutionInstanceAnalysis = paymentExecutionInstanceAnalysis;
  }


}

