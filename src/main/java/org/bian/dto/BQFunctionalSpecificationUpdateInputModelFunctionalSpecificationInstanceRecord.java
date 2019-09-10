package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationUpdateInputModelFunctionalSpecificationInstanceRecord
 */
public class BQFunctionalSpecificationUpdateInputModelFunctionalSpecificationInstanceRecord   {
  private String functionalSpecificationTaskDefinition = null;

  private String functionalSpecificationTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String systemFunctionalSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the functional specification tasks and deliverables of system development project 
   * @return functionalSpecificationTaskDefinition
  **/

  public String getFunctionalSpecificationTaskDefinition() {
    return functionalSpecificationTaskDefinition;
  }

  public void setFunctionalSpecificationTaskDefinition(String functionalSpecificationTaskDefinition) {
    this.functionalSpecificationTaskDefinition = functionalSpecificationTaskDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Collection of design and development work products used in the definition of functional requirements 
   * @return functionalSpecificationTaskWorkProducts
  **/

  public String getFunctionalSpecificationTaskWorkProducts() {
    return functionalSpecificationTaskWorkProducts;
  }

  public void setFunctionalSpecificationTaskWorkProducts(String functionalSpecificationTaskWorkProducts) {
    this.functionalSpecificationTaskWorkProducts = functionalSpecificationTaskWorkProducts;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The functional specification as a suitably structured and formatted document 
   * @return systemFunctionalSpecification
  **/

  public String getSystemFunctionalSpecification() {
    return systemFunctionalSpecification;
  }

  public void setSystemFunctionalSpecification(String systemFunctionalSpecification) {
    this.systemFunctionalSpecification = systemFunctionalSpecification;
  }


}

