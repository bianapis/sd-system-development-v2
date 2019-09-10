package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceAnalysis;
import org.bian.dto.BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationRetrieveInputModel
 */
public class BQTestingSpecificationRetrieveInputModel   {
  private Object testingSpecificationRetrieveActionTaskRecord = null;

  private String testingSpecificationRetrieveActionRequest = null;

  private BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceReport testingSpecificationInstanceReport = null;

  private BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceAnalysis testingSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return testingSpecificationRetrieveActionTaskRecord
  **/

  public Object getTestingSpecificationRetrieveActionTaskRecord() {
    return testingSpecificationRetrieveActionTaskRecord;
  }

  public void setTestingSpecificationRetrieveActionTaskRecord(Object testingSpecificationRetrieveActionTaskRecord) {
    this.testingSpecificationRetrieveActionTaskRecord = testingSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return testingSpecificationRetrieveActionRequest
  **/

  public String getTestingSpecificationRetrieveActionRequest() {
    return testingSpecificationRetrieveActionRequest;
  }

  public void setTestingSpecificationRetrieveActionRequest(String testingSpecificationRetrieveActionRequest) {
    this.testingSpecificationRetrieveActionRequest = testingSpecificationRetrieveActionRequest;
  }


  /**
   * Get testingSpecificationInstanceReport
   * @return testingSpecificationInstanceReport
  **/

  public BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceReport getTestingSpecificationInstanceReport() {
    return testingSpecificationInstanceReport;
  }

  public void setTestingSpecificationInstanceReport(BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceReport testingSpecificationInstanceReport) {
    this.testingSpecificationInstanceReport = testingSpecificationInstanceReport;
  }


  /**
   * Get testingSpecificationInstanceAnalysis
   * @return testingSpecificationInstanceAnalysis
  **/

  public BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceAnalysis getTestingSpecificationInstanceAnalysis() {
    return testingSpecificationInstanceAnalysis;
  }

  public void setTestingSpecificationInstanceAnalysis(BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceAnalysis testingSpecificationInstanceAnalysis) {
    this.testingSpecificationInstanceAnalysis = testingSpecificationInstanceAnalysis;
  }


}

