package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceAnalysis;
import org.bian.dto.BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceRecord;
import org.bian.dto.BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceReport;
import org.bian.dto.BQPaymentExecutionRetrieveOutputModelPaymentExecutionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentExecutionRetrieveOutputModel
 */
public class BQPaymentExecutionRetrieveOutputModel   {
  private BQPaymentExecutionRetrieveOutputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord = null;

  private BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceRecord paymentExecutionInstanceRecord = null;

  private String paymentExecutionRetrieveActionTaskReference = null;

  private Object paymentExecutionRetrieveActionTaskRecord = null;

  private String paymentExecutionRetrieveActionResponse = null;

  private BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceReport paymentExecutionInstanceReport = null;

  private BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceAnalysis paymentExecutionInstanceAnalysis = null;


  /**
   * Get paymentExecutionProcedureInstanceRecord
   * @return paymentExecutionProcedureInstanceRecord
  **/

  public BQPaymentExecutionRetrieveOutputModelPaymentExecutionProcedureInstanceRecord getPaymentExecutionProcedureInstanceRecord() {
    return paymentExecutionProcedureInstanceRecord;
  }

  public void setPaymentExecutionProcedureInstanceRecord(BQPaymentExecutionRetrieveOutputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord) {
    this.paymentExecutionProcedureInstanceRecord = paymentExecutionProcedureInstanceRecord;
  }


  /**
   * Get paymentExecutionInstanceRecord
   * @return paymentExecutionInstanceRecord
  **/

  public BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceRecord getPaymentExecutionInstanceRecord() {
    return paymentExecutionInstanceRecord;
  }

  public void setPaymentExecutionInstanceRecord(BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceRecord paymentExecutionInstanceRecord) {
    this.paymentExecutionInstanceRecord = paymentExecutionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment Execution instance retrieve service call 
   * @return paymentExecutionRetrieveActionTaskReference
  **/

  public String getPaymentExecutionRetrieveActionTaskReference() {
    return paymentExecutionRetrieveActionTaskReference;
  }

  public void setPaymentExecutionRetrieveActionTaskReference(String paymentExecutionRetrieveActionTaskReference) {
    this.paymentExecutionRetrieveActionTaskReference = paymentExecutionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return paymentExecutionRetrieveActionResponse
  **/

  public String getPaymentExecutionRetrieveActionResponse() {
    return paymentExecutionRetrieveActionResponse;
  }

  public void setPaymentExecutionRetrieveActionResponse(String paymentExecutionRetrieveActionResponse) {
    this.paymentExecutionRetrieveActionResponse = paymentExecutionRetrieveActionResponse;
  }


  /**
   * Get paymentExecutionInstanceReport
   * @return paymentExecutionInstanceReport
  **/

  public BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceReport getPaymentExecutionInstanceReport() {
    return paymentExecutionInstanceReport;
  }

  public void setPaymentExecutionInstanceReport(BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceReport paymentExecutionInstanceReport) {
    this.paymentExecutionInstanceReport = paymentExecutionInstanceReport;
  }


  /**
   * Get paymentExecutionInstanceAnalysis
   * @return paymentExecutionInstanceAnalysis
  **/

  public BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceAnalysis getPaymentExecutionInstanceAnalysis() {
    return paymentExecutionInstanceAnalysis;
  }

  public void setPaymentExecutionInstanceAnalysis(BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceAnalysis paymentExecutionInstanceAnalysis) {
    this.paymentExecutionInstanceAnalysis = paymentExecutionInstanceAnalysis;
  }


}

