package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationRequestInputModelFunctionalSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationRequestInputModel
 */
public class BQFunctionalSpecificationRequestInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String functionalSpecificationInstanceReference = null;

  private BQFunctionalSpecificationRequestInputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord = null;

  private Object functionalSpecificationRequestActionTaskRecord = null;

  private CRITSystemDevelopmentProjectRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQFunctionalSpecificationRequestInputModelFunctionalSpecificationInstanceRecord getFunctionalSpecificationInstanceRecord() {
    return functionalSpecificationInstanceRecord;
  }

  public void setFunctionalSpecificationInstanceRecord(BQFunctionalSpecificationRequestInputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord) {
    this.functionalSpecificationInstanceRecord = functionalSpecificationInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRITSystemDevelopmentProjectRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRITSystemDevelopmentProjectRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

