package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTechnicalSpecificationRequestInputModelTechnicalSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationRequestOutputModel
 */
public class BQTechnicalSpecificationRequestOutputModel   {
  private BQTechnicalSpecificationRequestInputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord = null;

  private String technicalSpecificationRequestActionTaskReference = null;

  private Object technicalSpecificationRequestActionTaskRecord = null;

  private String technicalSpecificationRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get technicalSpecificationInstanceRecord
   * @return technicalSpecificationInstanceRecord
  **/

  public BQTechnicalSpecificationRequestInputModelTechnicalSpecificationInstanceRecord getTechnicalSpecificationInstanceRecord() {
    return technicalSpecificationInstanceRecord;
  }

  public void setTechnicalSpecificationInstanceRecord(BQTechnicalSpecificationRequestInputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord) {
    this.technicalSpecificationInstanceRecord = technicalSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Technical Specification instance request service call 
   * @return technicalSpecificationRequestActionTaskReference
  **/

  public String getTechnicalSpecificationRequestActionTaskReference() {
    return technicalSpecificationRequestActionTaskReference;
  }

  public void setTechnicalSpecificationRequestActionTaskReference(String technicalSpecificationRequestActionTaskReference) {
    this.technicalSpecificationRequestActionTaskReference = technicalSpecificationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return technicalSpecificationRequestActionTaskRecord
  **/

  public Object getTechnicalSpecificationRequestActionTaskRecord() {
    return technicalSpecificationRequestActionTaskRecord;
  }

  public void setTechnicalSpecificationRequestActionTaskRecord(Object technicalSpecificationRequestActionTaskRecord) {
    this.technicalSpecificationRequestActionTaskRecord = technicalSpecificationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Technical Specification service request record 
   * @return technicalSpecificationRequestRecordReference
  **/

  public String getTechnicalSpecificationRequestRecordReference() {
    return technicalSpecificationRequestRecordReference;
  }

  public void setTechnicalSpecificationRequestRecordReference(String technicalSpecificationRequestRecordReference) {
    this.technicalSpecificationRequestRecordReference = technicalSpecificationRequestRecordReference;
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

