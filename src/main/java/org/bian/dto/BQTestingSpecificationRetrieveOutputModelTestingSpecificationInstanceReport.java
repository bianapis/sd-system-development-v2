package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceReport
 */
public class BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceReport   {
  private Object testingSpecificationInstanceReportRecord = null;

  private String testingSpecificationInstanceReportType = null;

  private String testingSpecificationInstanceReportParameters = null;

  private Object testingSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return testingSpecificationInstanceReportRecord
  **/

  public Object getTestingSpecificationInstanceReportRecord() {
    return testingSpecificationInstanceReportRecord;
  }

  public void setTestingSpecificationInstanceReportRecord(Object testingSpecificationInstanceReportRecord) {
    this.testingSpecificationInstanceReportRecord = testingSpecificationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return testingSpecificationInstanceReportType
  **/

  public String getTestingSpecificationInstanceReportType() {
    return testingSpecificationInstanceReportType;
  }

  public void setTestingSpecificationInstanceReportType(String testingSpecificationInstanceReportType) {
    this.testingSpecificationInstanceReportType = testingSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return testingSpecificationInstanceReportParameters
  **/

  public String getTestingSpecificationInstanceReportParameters() {
    return testingSpecificationInstanceReportParameters;
  }

  public void setTestingSpecificationInstanceReportParameters(String testingSpecificationInstanceReportParameters) {
    this.testingSpecificationInstanceReportParameters = testingSpecificationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return testingSpecificationInstanceReport
  **/

  public Object getTestingSpecificationInstanceReport() {
    return testingSpecificationInstanceReport;
  }

  public void setTestingSpecificationInstanceReport(Object testingSpecificationInstanceReport) {
    this.testingSpecificationInstanceReport = testingSpecificationInstanceReport;
  }


}

