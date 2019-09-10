package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationExchangeInputModel
 */
public class BQTestingSpecificationExchangeInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String testingSpecificationInstanceReference = null;

  private Object testingSpecificationExchangeActionTaskRecord = null;

  private CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest testingSpecificationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return testingSpecificationExchangeActionTaskRecord
  **/

  public Object getTestingSpecificationExchangeActionTaskRecord() {
    return testingSpecificationExchangeActionTaskRecord;
  }

  public void setTestingSpecificationExchangeActionTaskRecord(Object testingSpecificationExchangeActionTaskRecord) {
    this.testingSpecificationExchangeActionTaskRecord = testingSpecificationExchangeActionTaskRecord;
  }


  /**
   * Get testingSpecificationExchangeActionRequest
   * @return testingSpecificationExchangeActionRequest
  **/

  public CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest getTestingSpecificationExchangeActionRequest() {
    return testingSpecificationExchangeActionRequest;
  }

  public void setTestingSpecificationExchangeActionRequest(CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest testingSpecificationExchangeActionRequest) {
    this.testingSpecificationExchangeActionRequest = testingSpecificationExchangeActionRequest;
  }


}

