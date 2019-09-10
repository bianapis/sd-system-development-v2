package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationCaptureInputModelCaptureRecordType;
import org.bian.dto.BQTestingSpecificationCaptureInputModelTestingSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationCaptureInputModel
 */
public class BQTestingSpecificationCaptureInputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String testingSpecificationInstanceReference = null;

  private BQTestingSpecificationCaptureInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord = null;

  private Object testingSpecificationCaptureActionTaskRecord = null;

  private BQFunctionalSpecificationCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * Get iTSystemDevelopmentProjectInstanceRecord
   * @return iTSystemDevelopmentProjectInstanceRecord
  **/

  public CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord getITSystemDevelopmentProjectInstanceRecord() {
    return iTSystemDevelopmentProjectInstanceRecord;
  }

  public void setITSystemDevelopmentProjectInstanceRecord(CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord) {
    this.iTSystemDevelopmentProjectInstanceRecord = iTSystemDevelopmentProjectInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent IT System Development Project instance 
   * @return iTSystemDevelopmentProjectInstanceReference
  **/

  public String getITSystemDevelopmentProjectInstanceReference() {
    return iTSystemDevelopmentProjectInstanceReference;
  }

  public void setITSystemDevelopmentProjectInstanceReference(String iTSystemDevelopmentProjectInstanceReference) {
    this.iTSystemDevelopmentProjectInstanceReference = iTSystemDevelopmentProjectInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Testing Specification instance 
   * @return testingSpecificationInstanceReference
  **/

  public String getTestingSpecificationInstanceReference() {
    return testingSpecificationInstanceReference;
  }

  public void setTestingSpecificationInstanceReference(String testingSpecificationInstanceReference) {
    this.testingSpecificationInstanceReference = testingSpecificationInstanceReference;
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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQFunctionalSpecificationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQFunctionalSpecificationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

