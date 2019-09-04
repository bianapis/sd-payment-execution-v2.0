package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceAnalysis;
import org.bian.dto.CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceRecord;
import org.bian.dto.CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentExecutionProcedureRetrieveOutputModel
 */
public class CRPaymentExecutionProcedureRetrieveOutputModel   {
  private CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord = null;

  private String paymentExecutionProcedureRetrieveActionTaskReference = null;

  private Object paymentExecutionProcedureRetrieveActionTaskRecord = null;

  private String paymentExecutionProcedureRetrieveActionResponse = null;

  private CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceReportRecord paymentExecutionProcedureInstanceReportRecord = null;

  private CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceAnalysis paymentExecutionProcedureInstanceAnalysis = null;


  /**
   * Get paymentExecutionProcedureInstanceRecord
   * @return paymentExecutionProcedureInstanceRecord
  **/

  public CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceRecord getPaymentExecutionProcedureInstanceRecord() {
    return paymentExecutionProcedureInstanceRecord;
  }

  public void setPaymentExecutionProcedureInstanceRecord(CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord) {
    this.paymentExecutionProcedureInstanceRecord = paymentExecutionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment Execution Procedure instance retrieve service call 
   * @return paymentExecutionProcedureRetrieveActionTaskReference
  **/

  public String getPaymentExecutionProcedureRetrieveActionTaskReference() {
    return paymentExecutionProcedureRetrieveActionTaskReference;
  }

  public void setPaymentExecutionProcedureRetrieveActionTaskReference(String paymentExecutionProcedureRetrieveActionTaskReference) {
    this.paymentExecutionProcedureRetrieveActionTaskReference = paymentExecutionProcedureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return paymentExecutionProcedureRetrieveActionResponse
  **/

  public String getPaymentExecutionProcedureRetrieveActionResponse() {
    return paymentExecutionProcedureRetrieveActionResponse;
  }

  public void setPaymentExecutionProcedureRetrieveActionResponse(String paymentExecutionProcedureRetrieveActionResponse) {
    this.paymentExecutionProcedureRetrieveActionResponse = paymentExecutionProcedureRetrieveActionResponse;
  }


  /**
   * Get paymentExecutionProcedureInstanceReportRecord
   * @return paymentExecutionProcedureInstanceReportRecord
  **/

  public CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceReportRecord getPaymentExecutionProcedureInstanceReportRecord() {
    return paymentExecutionProcedureInstanceReportRecord;
  }

  public void setPaymentExecutionProcedureInstanceReportRecord(CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceReportRecord paymentExecutionProcedureInstanceReportRecord) {
    this.paymentExecutionProcedureInstanceReportRecord = paymentExecutionProcedureInstanceReportRecord;
  }


  /**
   * Get paymentExecutionProcedureInstanceAnalysis
   * @return paymentExecutionProcedureInstanceAnalysis
  **/

  public CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceAnalysis getPaymentExecutionProcedureInstanceAnalysis() {
    return paymentExecutionProcedureInstanceAnalysis;
  }

  public void setPaymentExecutionProcedureInstanceAnalysis(CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceAnalysis paymentExecutionProcedureInstanceAnalysis) {
    this.paymentExecutionProcedureInstanceAnalysis = paymentExecutionProcedureInstanceAnalysis;
  }


}

