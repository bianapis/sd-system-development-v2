package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingSpecificationUpdateInputModelTestingSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationUpdateInputModel
 */
public class BQTestingSpecificationUpdateInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String testingSpecificationInstanceReference = null;

  private BQTestingSpecificationUpdateInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord = null;

  private Object testingSpecificationUpdateActionTaskRecord = null;

  private String testingSpecificationUpdateActionRequest = null;


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

  public BQTestingSpecificationUpdateInputModelTestingSpecificationInstanceRecord getTestingSpecificationInstanceRecord() {
    return testingSpecificationInstanceRecord;
  }

  public void setTestingSpecificationInstanceRecord(BQTestingSpecificationUpdateInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord) {
    this.testingSpecificationInstanceRecord = testingSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return testingSpecificationUpdateActionTaskRecord
  **/

  public Object getTestingSpecificationUpdateActionTaskRecord() {
    return testingSpecificationUpdateActionTaskRecord;
  }

  public void setTestingSpecificationUpdateActionTaskRecord(Object testingSpecificationUpdateActionTaskRecord) {
    this.testingSpecificationUpdateActionTaskRecord = testingSpecificationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return testingSpecificationUpdateActionRequest
  **/

  public String getTestingSpecificationUpdateActionRequest() {
    return testingSpecificationUpdateActionRequest;
  }

  public void setTestingSpecificationUpdateActionRequest(String testingSpecificationUpdateActionRequest) {
    this.testingSpecificationUpdateActionRequest = testingSpecificationUpdateActionRequest;
  }


}

