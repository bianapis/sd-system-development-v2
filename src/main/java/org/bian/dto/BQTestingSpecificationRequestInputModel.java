package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingSpecificationRequestInputModelTestingSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationRequestInputModel
 */
public class BQTestingSpecificationRequestInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String testingSpecificationInstanceReference = null;

  private BQTestingSpecificationRequestInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord = null;

  private Object testingSpecificationRequestActionTaskRecord = null;

  private CRITSystemDevelopmentProjectRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQTestingSpecificationRequestInputModelTestingSpecificationInstanceRecord getTestingSpecificationInstanceRecord() {
    return testingSpecificationInstanceRecord;
  }

  public void setTestingSpecificationInstanceRecord(BQTestingSpecificationRequestInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord) {
    this.testingSpecificationInstanceRecord = testingSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return testingSpecificationRequestActionTaskRecord
  **/

  public Object getTestingSpecificationRequestActionTaskRecord() {
    return testingSpecificationRequestActionTaskRecord;
  }

  public void setTestingSpecificationRequestActionTaskRecord(Object testingSpecificationRequestActionTaskRecord) {
    this.testingSpecificationRequestActionTaskRecord = testingSpecificationRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRITSystemDevelopmentProjectRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRITSystemDevelopmentProjectRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

