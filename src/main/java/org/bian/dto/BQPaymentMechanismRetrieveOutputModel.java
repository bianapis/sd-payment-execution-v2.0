package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentMechanismRetrieveOutputModelPaymentExecutionProcedureInstanceRecord;
import org.bian.dto.BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceAnalysis;
import org.bian.dto.BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentMechanismRetrieveOutputModel
 */
public class BQPaymentMechanismRetrieveOutputModel   {
  private BQPaymentMechanismRetrieveOutputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord = null;

  private String paymentMechanismRetrieveActionTaskReference = null;

  private Object paymentMechanismRetrieveActionTaskRecord = null;

  private String paymentMechanismRetrieveActionResponse = null;

  private BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceReport paymentMechanismInstanceReport = null;

  private BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceAnalysis paymentMechanismInstanceAnalysis = null;


  /**
   * Get paymentExecutionProcedureInstanceRecord
   * @return paymentExecutionProcedureInstanceRecord
  **/

  public BQPaymentMechanismRetrieveOutputModelPaymentExecutionProcedureInstanceRecord getPaymentExecutionProcedureInstanceRecord() {
    return paymentExecutionProcedureInstanceRecord;
  }

  public void setPaymentExecutionProcedureInstanceRecord(BQPaymentMechanismRetrieveOutputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord) {
    this.paymentExecutionProcedureInstanceRecord = paymentExecutionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment Mechanism instance retrieve service call 
   * @return paymentMechanismRetrieveActionTaskReference
  **/

  public String getPaymentMechanismRetrieveActionTaskReference() {
    return paymentMechanismRetrieveActionTaskReference;
  }

  public void setPaymentMechanismRetrieveActionTaskReference(String paymentMechanismRetrieveActionTaskReference) {
    this.paymentMechanismRetrieveActionTaskReference = paymentMechanismRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return paymentMechanismRetrieveActionResponse
  **/

  public String getPaymentMechanismRetrieveActionResponse() {
    return paymentMechanismRetrieveActionResponse;
  }

  public void setPaymentMechanismRetrieveActionResponse(String paymentMechanismRetrieveActionResponse) {
    this.paymentMechanismRetrieveActionResponse = paymentMechanismRetrieveActionResponse;
  }


  /**
   * Get paymentMechanismInstanceReport
   * @return paymentMechanismInstanceReport
  **/

  public BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceReport getPaymentMechanismInstanceReport() {
    return paymentMechanismInstanceReport;
  }

  public void setPaymentMechanismInstanceReport(BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceReport paymentMechanismInstanceReport) {
    this.paymentMechanismInstanceReport = paymentMechanismInstanceReport;
  }


  /**
   * Get paymentMechanismInstanceAnalysis
   * @return paymentMechanismInstanceAnalysis
  **/

  public BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceAnalysis getPaymentMechanismInstanceAnalysis() {
    return paymentMechanismInstanceAnalysis;
  }

  public void setPaymentMechanismInstanceAnalysis(BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceAnalysis paymentMechanismInstanceAnalysis) {
    this.paymentMechanismInstanceAnalysis = paymentMechanismInstanceAnalysis;
  }


}

