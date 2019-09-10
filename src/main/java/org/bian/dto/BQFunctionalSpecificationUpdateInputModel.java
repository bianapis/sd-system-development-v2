package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationUpdateInputModelFunctionalSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationUpdateInputModel
 */
public class BQFunctionalSpecificationUpdateInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String functionalSpecificationInstanceReference = null;

  private BQFunctionalSpecificationUpdateInputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord = null;

  private Object functionalSpecificationUpdateActionTaskRecord = null;

  private String functionalSpecificationUpdateActionRequest = null;


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
   * Get functionalSpecificationInstanceRecord
   * @return functionalSpecificationInstanceRecord
  **/

  public BQFunctionalSpecificationUpdateInputModelFunctionalSpecificationInstanceRecord getFunctionalSpecificationInstanceRecord() {
    return functionalSpecificationInstanceRecord;
  }

  public void setFunctionalSpecificationInstanceRecord(BQFunctionalSpecificationUpdateInputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord) {
    this.functionalSpecificationInstanceRecord = functionalSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return functionalSpecificationUpdateActionTaskRecord
  **/

  public Object getFunctionalSpecificationUpdateActionTaskRecord() {
    return functionalSpecificationUpdateActionTaskRecord;
  }

  public void setFunctionalSpecificationUpdateActionTaskRecord(Object functionalSpecificationUpdateActionTaskRecord) {
    this.functionalSpecificationUpdateActionTaskRecord = functionalSpecificationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return functionalSpecificationUpdateActionRequest
  **/

  public String getFunctionalSpecificationUpdateActionRequest() {
    return functionalSpecificationUpdateActionRequest;
  }

  public void setFunctionalSpecificationUpdateActionRequest(String functionalSpecificationUpdateActionRequest) {
    this.functionalSpecificationUpdateActionRequest = functionalSpecificationUpdateActionRequest;
  }


}

