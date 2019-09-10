package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationExchangeInputModel
 */
public class BQFunctionalSpecificationExchangeInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String functionalSpecificationInstanceReference = null;

  private Object functionalSpecificationExchangeActionTaskRecord = null;

  private CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest functionalSpecificationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Specification instance 
   * @return functionalSpecificationInstanceReference
  **/

  public String getFunctionalSpecificationInstanceReference() {
    return functionalSpecificationInstanceReference;
  }

  public void setFunctionalSpecificationInstanceReference(String functionalSpecificationInstanceReference) {
    this.functionalSpecificationInstanceReference = functionalSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return functionalSpecificationExchangeActionTaskRecord
  **/

  public Object getFunctionalSpecificationExchangeActionTaskRecord() {
    return functionalSpecificationExchangeActionTaskRecord;
  }

  public void setFunctionalSpecificationExchangeActionTaskRecord(Object functionalSpecificationExchangeActionTaskRecord) {
    this.functionalSpecificationExchangeActionTaskRecord = functionalSpecificationExchangeActionTaskRecord;
  }


  /**
   * Get functionalSpecificationExchangeActionRequest
   * @return functionalSpecificationExchangeActionRequest
  **/

  public CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest getFunctionalSpecificationExchangeActionRequest() {
    return functionalSpecificationExchangeActionRequest;
  }

  public void setFunctionalSpecificationExchangeActionRequest(CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest functionalSpecificationExchangeActionRequest) {
    this.functionalSpecificationExchangeActionRequest = functionalSpecificationExchangeActionRequest;
  }


}

