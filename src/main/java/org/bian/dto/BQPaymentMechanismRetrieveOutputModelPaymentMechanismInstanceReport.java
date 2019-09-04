package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceReport
 */
public class BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceReport   {
  private Object paymentMechanismInstanceReportRecord = null;

  private String paymentMechanismInstanceReportType = null;

  private String paymentMechanismInstanceReportParameters = null;

  private Object paymentMechanismInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return paymentMechanismInstanceReportRecord
  **/

  public Object getPaymentMechanismInstanceReportRecord() {
    return paymentMechanismInstanceReportRecord;
  }

  public void setPaymentMechanismInstanceReportRecord(Object paymentMechanismInstanceReportRecord) {
    this.paymentMechanismInstanceReportRecord = paymentMechanismInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentMechanismInstanceReportType
  **/

  public String getPaymentMechanismInstanceReportType() {
    return paymentMechanismInstanceReportType;
  }

  public void setPaymentMechanismInstanceReportType(String paymentMechanismInstanceReportType) {
    this.paymentMechanismInstanceReportType = paymentMechanismInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentMechanismInstanceReportParameters
  **/

  public String getPaymentMechanismInstanceReportParameters() {
    return paymentMechanismInstanceReportParameters;
  }

  public void setPaymentMechanismInstanceReportParameters(String paymentMechanismInstanceReportParameters) {
    this.paymentMechanismInstanceReportParameters = paymentMechanismInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return paymentMechanismInstanceReport
  **/

  public Object getPaymentMechanismInstanceReport() {
    return paymentMechanismInstanceReport;
  }

  public void setPaymentMechanismInstanceReport(Object paymentMechanismInstanceReport) {
    this.paymentMechanismInstanceReport = paymentMechanismInstanceReport;
  }


}

