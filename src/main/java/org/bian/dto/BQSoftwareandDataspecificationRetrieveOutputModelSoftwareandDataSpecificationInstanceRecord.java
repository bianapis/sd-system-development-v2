package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataSpecificationInstanceRecord
 */
public class BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataSpecificationInstanceRecord   {
  private String softwareandDataSpecificationTaskDefinition = null;

  private String softwareandDataSpecificationTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String systemSoftwareandDataSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the software and data specification/development tasks and deliverables of system development project 
   * @return softwareandDataSpecificationTaskDefinition
  **/

  public String getSoftwareandDataSpecificationTaskDefinition() {
    return softwareandDataSpecificationTaskDefinition;
  }

  public void setSoftwareandDataSpecificationTaskDefinition(String softwareandDataSpecificationTaskDefinition) {
    this.softwareandDataSpecificationTaskDefinition = softwareandDataSpecificationTaskDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Collection of design and development work products used in the implementation of the software and data specification 
   * @return softwareandDataSpecificationTaskWorkProducts
  **/

  public String getSoftwareandDataSpecificationTaskWorkProducts() {
    return softwareandDataSpecificationTaskWorkProducts;
  }

  public void setSoftwareandDataSpecificationTaskWorkProducts(String softwareandDataSpecificationTaskWorkProducts) {
    this.softwareandDataSpecificationTaskWorkProducts = softwareandDataSpecificationTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated project documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The developed software and data specification in a format suited for production deployment 
   * @return systemSoftwareandDataSpecification
  **/

  public String getSystemSoftwareandDataSpecification() {
    return systemSoftwareandDataSpecification;
  }

  public void setSystemSoftwareandDataSpecification(String systemSoftwareandDataSpecification) {
    this.systemSoftwareandDataSpecification = systemSoftwareandDataSpecification;
  }


}

