package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationRequestInputModelFunctionalSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationRequestOutputModel
 */
public class BQFunctionalSpecificationRequestOutputModel   {
  private BQFunctionalSpecificationRequestInputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord = null;

  private String functionalSpecificationRequestActionTaskReference = null;

  private Object functionalSpecificationRequestActionTaskRecord = null;

  private String functionalSpecificationRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get functionalSpecificationInstanceRecord
   * @return functionalSpecificationInstanceRecord
  **/

  public BQFunctionalSpecificationRequestInputModelFunctionalSpecificationInstanceRecord getFunctionalSpecificationInstanceRecord() {
    return functionalSpecificationInstanceRecord;
  }

  public void setFunctionalSpecificationInstanceRecord(BQFunctionalSpecificationRequestInputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord) {
    this.functionalSpecificationInstanceRecord = functionalSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Specification instance request service call 
   * @return functionalSpecificationRequestActionTaskReference
  **/

  public String getFunctionalSpecificationRequestActionTaskReference() {
    return functionalSpecificationRequestActionTaskReference;
  }

  public void setFunctionalSpecificationRequestActionTaskReference(String functionalSpecificationRequestActionTaskReference) {
    this.functionalSpecificationRequestActionTaskReference = functionalSpecificationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return functionalSpecificationRequestActionTaskRecord
  **/

  public Object getFunctionalSpecificationRequestActionTaskRecord() {
    return functionalSpecificationRequestActionTaskRecord;
  }

  public void setFunctionalSpecificationRequestActionTaskRecord(Object functionalSpecificationRequestActionTaskRecord) {
    this.functionalSpecificationRequestActionTaskRecord = functionalSpecificationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Specification service request record 
   * @return functionalSpecificationRequestRecordReference
  **/

  public String getFunctionalSpecificationRequestRecordReference() {
    return functionalSpecificationRequestRecordReference;
  }

  public void setFunctionalSpecificationRequestRecordReference(String functionalSpecificationRequestRecordReference) {
    this.functionalSpecificationRequestRecordReference = functionalSpecificationRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

