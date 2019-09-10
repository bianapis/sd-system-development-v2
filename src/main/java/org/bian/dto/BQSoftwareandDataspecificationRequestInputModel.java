package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSoftwareandDataspecificationRequestInputModelSoftwareandDataSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationRequestInputModel
 */
public class BQSoftwareandDataspecificationRequestInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String softwareandDataspecificationInstanceReference = null;

  private BQSoftwareandDataspecificationRequestInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord = null;

  private Object softwareandDataspecificationRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Software and Data specification instance 
   * @return softwareandDataspecificationInstanceReference
  **/

  public String getSoftwareandDataspecificationInstanceReference() {
    return softwareandDataspecificationInstanceReference;
  }

  public void setSoftwareandDataspecificationInstanceReference(String softwareandDataspecificationInstanceReference) {
    this.softwareandDataspecificationInstanceReference = softwareandDataspecificationInstanceReference;
  }


  /**
   * Get softwareandDataSpecificationInstanceRecord
   * @return softwareandDataSpecificationInstanceRecord
  **/

  public BQSoftwareandDataspecificationRequestInputModelSoftwareandDataSpecificationInstanceRecord getSoftwareandDataSpecificationInstanceRecord() {
    return softwareandDataSpecificationInstanceRecord;
  }

  public void setSoftwareandDataSpecificationInstanceRecord(BQSoftwareandDataspecificationRequestInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord) {
    this.softwareandDataSpecificationInstanceRecord = softwareandDataSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return softwareandDataspecificationRequestActionTaskRecord
  **/

  public Object getSoftwareandDataspecificationRequestActionTaskRecord() {
    return softwareandDataspecificationRequestActionTaskRecord;
  }

  public void setSoftwareandDataspecificationRequestActionTaskRecord(Object softwareandDataspecificationRequestActionTaskRecord) {
    this.softwareandDataspecificationRequestActionTaskRecord = softwareandDataspecificationRequestActionTaskRecord;
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

