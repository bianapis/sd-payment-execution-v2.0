package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceReportRecord
 */
public class CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceReportRecord   {
  private String paymentExecutionProcedureInstanceReportData = null;

  private String paymentExecutionProcedureInstanceReportType = null;

  private Object paymentExecutionProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return paymentExecutionProcedureInstanceReportData
  **/

  public String getPaymentExecutionProcedureInstanceReportData() {
    return paymentExecutionProcedureInstanceReportData;
  }

  public void setPaymentExecutionProcedureInstanceReportData(String paymentExecutionProcedureInstanceReportData) {
    this.paymentExecutionProcedureInstanceReportData = paymentExecutionProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentExecutionProcedureInstanceReportType
  **/

  public String getPaymentExecutionProcedureInstanceReportType() {
    return paymentExecutionProcedureInstanceReportType;
  }

  public void setPaymentExecutionProcedureInstanceReportType(String paymentExecutionProcedureInstanceReportType) {
    this.paymentExecutionProcedureInstanceReportType = paymentExecutionProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return paymentExecutionProcedureInstanceReport
  **/

  public Object getPaymentExecutionProcedureInstanceReport() {
    return paymentExecutionProcedureInstanceReport;
  }

  public void setPaymentExecutionProcedureInstanceReport(Object paymentExecutionProcedureInstanceReport) {
    this.paymentExecutionProcedureInstanceReport = paymentExecutionProcedureInstanceReport;
  }


}

