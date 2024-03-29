package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceReport
 */
public class BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceReport   {
  private Object paymentExecutionInstanceReportRecord = null;

  private String paymentExecutionInstanceReportType = null;

  private String paymentExecutionInstanceReportParameters = null;

  private Object paymentExecutionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return paymentExecutionInstanceReportRecord
  **/

  public Object getPaymentExecutionInstanceReportRecord() {
    return paymentExecutionInstanceReportRecord;
  }

  public void setPaymentExecutionInstanceReportRecord(Object paymentExecutionInstanceReportRecord) {
    this.paymentExecutionInstanceReportRecord = paymentExecutionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentExecutionInstanceReportType
  **/

  public String getPaymentExecutionInstanceReportType() {
    return paymentExecutionInstanceReportType;
  }

  public void setPaymentExecutionInstanceReportType(String paymentExecutionInstanceReportType) {
    this.paymentExecutionInstanceReportType = paymentExecutionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentExecutionInstanceReportParameters
  **/

  public String getPaymentExecutionInstanceReportParameters() {
    return paymentExecutionInstanceReportParameters;
  }

  public void setPaymentExecutionInstanceReportParameters(String paymentExecutionInstanceReportParameters) {
    this.paymentExecutionInstanceReportParameters = paymentExecutionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return paymentExecutionInstanceReport
  **/

  public Object getPaymentExecutionInstanceReport() {
    return paymentExecutionInstanceReport;
  }

  public void setPaymentExecutionInstanceReport(Object paymentExecutionInstanceReport) {
    this.paymentExecutionInstanceReport = paymentExecutionInstanceReport;
  }


}

