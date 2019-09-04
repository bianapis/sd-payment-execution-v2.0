package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceAnalysis;
import org.bian.dto.CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentExecutionProcedureRetrieveInputModel
 */
public class CRPaymentExecutionProcedureRetrieveInputModel   {
  private Object paymentExecutionProcedureRetrieveActionTaskRecord = null;

  private String paymentExecutionProcedureRetrieveActionRequest = null;

  private CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceReportRecord paymentExecutionProcedureInstanceReportRecord = null;

  private CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceAnalysis paymentExecutionProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentExecutionProcedureRetrieveActionTaskRecord
  **/

  public Object getPaymentExecutionProcedureRetrieveActionTaskRecord() {
    return paymentExecutionProcedureRetrieveActionTaskRecord;
  }

  public void setPaymentExecutionProcedureRetrieveActionTaskRecord(Object paymentExecutionProcedureRetrieveActionTaskRecord) {
    this.paymentExecutionProcedureRetrieveActionTaskRecord = paymentExecutionProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentExecutionProcedureRetrieveActionRequest
  **/

  public String getPaymentExecutionProcedureRetrieveActionRequest() {
    return paymentExecutionProcedureRetrieveActionRequest;
  }

  public void setPaymentExecutionProcedureRetrieveActionRequest(String paymentExecutionProcedureRetrieveActionRequest) {
    this.paymentExecutionProcedureRetrieveActionRequest = paymentExecutionProcedureRetrieveActionRequest;
  }


  /**
   * Get paymentExecutionProcedureInstanceReportRecord
   * @return paymentExecutionProcedureInstanceReportRecord
  **/

  public CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceReportRecord getPaymentExecutionProcedureInstanceReportRecord() {
    return paymentExecutionProcedureInstanceReportRecord;
  }

  public void setPaymentExecutionProcedureInstanceReportRecord(CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceReportRecord paymentExecutionProcedureInstanceReportRecord) {
    this.paymentExecutionProcedureInstanceReportRecord = paymentExecutionProcedureInstanceReportRecord;
  }


  /**
   * Get paymentExecutionProcedureInstanceAnalysis
   * @return paymentExecutionProcedureInstanceAnalysis
  **/

  public CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceAnalysis getPaymentExecutionProcedureInstanceAnalysis() {
    return paymentExecutionProcedureInstanceAnalysis;
  }

  public void setPaymentExecutionProcedureInstanceAnalysis(CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceAnalysis paymentExecutionProcedureInstanceAnalysis) {
    this.paymentExecutionProcedureInstanceAnalysis = paymentExecutionProcedureInstanceAnalysis;
  }


}

