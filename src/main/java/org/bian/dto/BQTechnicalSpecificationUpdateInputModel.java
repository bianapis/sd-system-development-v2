package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTechnicalSpecificationUpdateInputModelTechnicalSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationUpdateInputModel
 */
public class BQTechnicalSpecificationUpdateInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String technicalSpecificationInstanceReference = null;

  private BQTechnicalSpecificationUpdateInputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord = null;

  private Object technicalSpecificationUpdateActionTaskRecord = null;

  private String technicalSpecificationUpdateActionRequest = null;


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
   * Get technicalSpecificationInstanceRecord
   * @return technicalSpecificationInstanceRecord
  **/

  public BQTechnicalSpecificationUpdateInputModelTechnicalSpecificationInstanceRecord getTechnicalSpecificationInstanceRecord() {
    return technicalSpecificationInstanceRecord;
  }

  public void setTechnicalSpecificationInstanceRecord(BQTechnicalSpecificationUpdateInputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord) {
    this.technicalSpecificationInstanceRecord = technicalSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return technicalSpecificationUpdateActionTaskRecord
  **/

  public Object getTechnicalSpecificationUpdateActionTaskRecord() {
    return technicalSpecificationUpdateActionTaskRecord;
  }

  public void setTechnicalSpecificationUpdateActionTaskRecord(Object technicalSpecificationUpdateActionTaskRecord) {
    this.technicalSpecificationUpdateActionTaskRecord = technicalSpecificationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return technicalSpecificationUpdateActionRequest
  **/

  public String getTechnicalSpecificationUpdateActionRequest() {
    return technicalSpecificationUpdateActionRequest;
  }

  public void setTechnicalSpecificationUpdateActionRequest(String technicalSpecificationUpdateActionRequest) {
    this.technicalSpecificationUpdateActionRequest = technicalSpecificationUpdateActionRequest;
  }


}

