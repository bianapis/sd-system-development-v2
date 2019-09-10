package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSoftwareandDataspecificationUpdateInputModelSoftwareandDataSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationUpdateInputModel
 */
public class BQSoftwareandDataspecificationUpdateInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String softwareandDataspecificationInstanceReference = null;

  private BQSoftwareandDataspecificationUpdateInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord = null;

  private Object softwareandDataspecificationUpdateActionTaskRecord = null;

  private String softwareandDataspecificationUpdateActionRequest = null;


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

  public BQSoftwareandDataspecificationUpdateInputModelSoftwareandDataSpecificationInstanceRecord getSoftwareandDataSpecificationInstanceRecord() {
    return softwareandDataSpecificationInstanceRecord;
  }

  public void setSoftwareandDataSpecificationInstanceRecord(BQSoftwareandDataspecificationUpdateInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord) {
    this.softwareandDataSpecificationInstanceRecord = softwareandDataSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return softwareandDataspecificationUpdateActionTaskRecord
  **/

  public Object getSoftwareandDataspecificationUpdateActionTaskRecord() {
    return softwareandDataspecificationUpdateActionTaskRecord;
  }

  public void setSoftwareandDataspecificationUpdateActionTaskRecord(Object softwareandDataspecificationUpdateActionTaskRecord) {
    this.softwareandDataspecificationUpdateActionTaskRecord = softwareandDataspecificationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return softwareandDataspecificationUpdateActionRequest
  **/

  public String getSoftwareandDataspecificationUpdateActionRequest() {
    return softwareandDataspecificationUpdateActionRequest;
  }

  public void setSoftwareandDataspecificationUpdateActionRequest(String softwareandDataspecificationUpdateActionRequest) {
    this.softwareandDataspecificationUpdateActionRequest = softwareandDataspecificationUpdateActionRequest;
  }


}

