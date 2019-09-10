package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingSpecificationCaptureInputModelTestingSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationCaptureOutputModel
 */
public class BQTestingSpecificationCaptureOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private BQTestingSpecificationCaptureInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord = null;

  private String testingSpecificationCaptureActionTaskReference = null;

  private Object testingSpecificationCaptureActionTaskRecord = null;

  private String testingSpecificationCaptureRecordReference = null;

  private Object captureResponseRecord = null;


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

  public BQTestingSpecificationCaptureInputModelTestingSpecificationInstanceRecord getTestingSpecificationInstanceRecord() {
    return testingSpecificationInstanceRecord;
  }

  public void setTestingSpecificationInstanceRecord(BQTestingSpecificationCaptureInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord) {
    this.testingSpecificationInstanceRecord = testingSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Testing Specification instance capture service call 
   * @return testingSpecificationCaptureActionTaskReference
  **/

  public String getTestingSpecificationCaptureActionTaskReference() {
    return testingSpecificationCaptureActionTaskReference;
  }

  public void setTestingSpecificationCaptureActionTaskReference(String testingSpecificationCaptureActionTaskReference) {
    this.testingSpecificationCaptureActionTaskReference = testingSpecificationCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return testingSpecificationCaptureActionTaskRecord
  **/

  public Object getTestingSpecificationCaptureActionTaskRecord() {
    return testingSpecificationCaptureActionTaskRecord;
  }

  public void setTestingSpecificationCaptureActionTaskRecord(Object testingSpecificationCaptureActionTaskRecord) {
    this.testingSpecificationCaptureActionTaskRecord = testingSpecificationCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Testing Specification structured input transaction/record 
   * @return testingSpecificationCaptureRecordReference
  **/

  public String getTestingSpecificationCaptureRecordReference() {
    return testingSpecificationCaptureRecordReference;
  }

  public void setTestingSpecificationCaptureRecordReference(String testingSpecificationCaptureRecordReference) {
    this.testingSpecificationCaptureRecordReference = testingSpecificationCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

