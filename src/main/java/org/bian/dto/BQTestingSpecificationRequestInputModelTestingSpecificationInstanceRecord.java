package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationRequestInputModelTestingSpecificationInstanceRecord
 */
public class BQTestingSpecificationRequestInputModelTestingSpecificationInstanceRecord   {
  private String testingSpecificationTaskDefinition = null;

  private String testingSpecificationTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String systemTestingSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the testing tasks and deliverables of system development project 
   * @return testingSpecificationTaskDefinition
  **/

  public String getTestingSpecificationTaskDefinition() {
    return testingSpecificationTaskDefinition;
  }

  public void setTestingSpecificationTaskDefinition(String testingSpecificationTaskDefinition) {
    this.testingSpecificationTaskDefinition = testingSpecificationTaskDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Collection of design and development work products used in the testing of the developed system 
   * @return testingSpecificationTaskWorkProducts
  **/

  public String getTestingSpecificationTaskWorkProducts() {
    return testingSpecificationTaskWorkProducts;
  }

  public void setTestingSpecificationTaskWorkProducts(String testingSpecificationTaskWorkProducts) {
    this.testingSpecificationTaskWorkProducts = testingSpecificationTaskWorkProducts;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The testing specification and results as a suitably structured and formatted document 
   * @return systemTestingSpecification
  **/

  public String getSystemTestingSpecification() {
    return systemTestingSpecification;
  }

  public void setSystemTestingSpecification(String systemTestingSpecification) {
    this.systemTestingSpecification = systemTestingSpecification;
  }


}

