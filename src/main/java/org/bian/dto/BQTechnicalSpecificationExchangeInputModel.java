package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationExchangeInputModel
 */
public class BQTechnicalSpecificationExchangeInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String technicalSpecificationInstanceReference = null;

  private Object technicalSpecificationExchangeActionTaskRecord = null;

  private CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest technicalSpecificationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Technical Specification instance 
   * @return technicalSpecificationInstanceReference
  **/

  public String getTechnicalSpecificationInstanceReference() {
    return technicalSpecificationInstanceReference;
  }

  public void setTechnicalSpecificationInstanceReference(String technicalSpecificationInstanceReference) {
    this.technicalSpecificationInstanceReference = technicalSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return technicalSpecificationExchangeActionTaskRecord
  **/

  public Object getTechnicalSpecificationExchangeActionTaskRecord() {
    return technicalSpecificationExchangeActionTaskRecord;
  }

  public void setTechnicalSpecificationExchangeActionTaskRecord(Object technicalSpecificationExchangeActionTaskRecord) {
    this.technicalSpecificationExchangeActionTaskRecord = technicalSpecificationExchangeActionTaskRecord;
  }


  /**
   * Get technicalSpecificationExchangeActionRequest
   * @return technicalSpecificationExchangeActionRequest
  **/

  public CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest getTechnicalSpecificationExchangeActionRequest() {
    return technicalSpecificationExchangeActionRequest;
  }

  public void setTechnicalSpecificationExchangeActionRequest(CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest technicalSpecificationExchangeActionRequest) {
    this.technicalSpecificationExchangeActionRequest = technicalSpecificationExchangeActionRequest;
  }


}

