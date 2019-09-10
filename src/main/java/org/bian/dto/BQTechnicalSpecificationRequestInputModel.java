package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTechnicalSpecificationRequestInputModelTechnicalSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationRequestInputModel
 */
public class BQTechnicalSpecificationRequestInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String technicalSpecificationInstanceReference = null;

  private BQTechnicalSpecificationRequestInputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord = null;

  private Object technicalSpecificationRequestActionTaskRecord = null;

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

  public BQTechnicalSpecificationRequestInputModelTechnicalSpecificationInstanceRecord getTechnicalSpecificationInstanceRecord() {
    return technicalSpecificationInstanceRecord;
  }

  public void setTechnicalSpecificationInstanceRecord(BQTechnicalSpecificationRequestInputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord) {
    this.technicalSpecificationInstanceRecord = technicalSpecificationInstanceRecord;
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

