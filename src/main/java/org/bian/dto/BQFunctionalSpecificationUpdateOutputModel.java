package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationUpdateInputModelFunctionalSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationUpdateOutputModel
 */
public class BQFunctionalSpecificationUpdateOutputModel   {
  private BQFunctionalSpecificationUpdateInputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord = null;

  private String functionalSpecificationUpdateActionTaskReference = null;

  private Object functionalSpecificationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return functionalSpecificationUpdateActionTaskReference
  **/

  public String getFunctionalSpecificationUpdateActionTaskReference() {
    return functionalSpecificationUpdateActionTaskReference;
  }

  public void setFunctionalSpecificationUpdateActionTaskReference(String functionalSpecificationUpdateActionTaskReference) {
    this.functionalSpecificationUpdateActionTaskReference = functionalSpecificationUpdateActionTaskReference;
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

