package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceAnalysis;
import org.bian.dto.BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceRecord;
import org.bian.dto.BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceReport;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationRetrieveOutputModel
 */
public class BQTestingSpecificationRetrieveOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord = null;

  private String testingSpecificationRetrieveActionTaskReference = null;

  private Object testingSpecificationRetrieveActionTaskRecord = null;

  private String testingSpecificationRetrieveActionResponse = null;

  private BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceReport testingSpecificationInstanceReport = null;

  private BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceAnalysis testingSpecificationInstanceAnalysis = null;


  /**
   * Get iTSystemDevelopmentProjectInstanceRecord
   * @return iTSystemDevelopmentProjectInstanceRecord
  **/

  public CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord getITSystemDevelopmentProjectInstanceRecord() {
    return iTSystemDevelopmentProjectInstanceRecord;
  }
  
  @JsonProperty("iTSystemDevelopmentProjectInstanceRecord")
  public void setITSystemDevelopmentProjectInstanceRecord(CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord) {
    this.iTSystemDevelopmentProjectInstanceRecord = iTSystemDevelopmentProjectInstanceRecord;
  }


  /**
   * Get testingSpecificationInstanceRecord
   * @return testingSpecificationInstanceRecord
  **/

  public BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceRecord getTestingSpecificationInstanceRecord() {
    return testingSpecificationInstanceRecord;
  }

  public void setTestingSpecificationInstanceRecord(BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord) {
    this.testingSpecificationInstanceRecord = testingSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Testing Specification instance retrieve service call 
   * @return testingSpecificationRetrieveActionTaskReference
  **/

  public String getTestingSpecificationRetrieveActionTaskReference() {
    return testingSpecificationRetrieveActionTaskReference;
  }

  public void setTestingSpecificationRetrieveActionTaskReference(String testingSpecificationRetrieveActionTaskReference) {
    this.testingSpecificationRetrieveActionTaskReference = testingSpecificationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return testingSpecificationRetrieveActionResponse
  **/

  public String getTestingSpecificationRetrieveActionResponse() {
    return testingSpecificationRetrieveActionResponse;
  }

  public void setTestingSpecificationRetrieveActionResponse(String testingSpecificationRetrieveActionResponse) {
    this.testingSpecificationRetrieveActionResponse = testingSpecificationRetrieveActionResponse;
  }


  /**
   * Get testingSpecificationInstanceReport
   * @return testingSpecificationInstanceReport
  **/

  public BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceReport getTestingSpecificationInstanceReport() {
    return testingSpecificationInstanceReport;
  }

  public void setTestingSpecificationInstanceReport(BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceReport testingSpecificationInstanceReport) {
    this.testingSpecificationInstanceReport = testingSpecificationInstanceReport;
  }


  /**
   * Get testingSpecificationInstanceAnalysis
   * @return testingSpecificationInstanceAnalysis
  **/

  public BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceAnalysis getTestingSpecificationInstanceAnalysis() {
    return testingSpecificationInstanceAnalysis;
  }

  public void setTestingSpecificationInstanceAnalysis(BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceAnalysis testingSpecificationInstanceAnalysis) {
    this.testingSpecificationInstanceAnalysis = testingSpecificationInstanceAnalysis;
  }


}

