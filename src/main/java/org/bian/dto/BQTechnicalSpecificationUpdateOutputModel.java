package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTechnicalSpecificationUpdateInputModelTechnicalSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationUpdateOutputModel
 */
public class BQTechnicalSpecificationUpdateOutputModel   {
  private BQTechnicalSpecificationUpdateInputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord = null;

  private String technicalSpecificationUpdateActionTaskReference = null;

  private Object technicalSpecificationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return technicalSpecificationUpdateActionTaskReference
  **/

  public String getTechnicalSpecificationUpdateActionTaskReference() {
    return technicalSpecificationUpdateActionTaskReference;
  }

  public void setTechnicalSpecificationUpdateActionTaskReference(String technicalSpecificationUpdateActionTaskReference) {
    this.technicalSpecificationUpdateActionTaskReference = technicalSpecificationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

