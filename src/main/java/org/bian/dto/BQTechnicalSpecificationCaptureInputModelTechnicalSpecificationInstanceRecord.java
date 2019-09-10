package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationCaptureInputModelTechnicalSpecificationInstanceRecord
 */
public class BQTechnicalSpecificationCaptureInputModelTechnicalSpecificationInstanceRecord   {
  private String technicalSpecificationTaskDefinition = null;

  private String technicalSpecificationTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the technical specification tasks and deliverables of system development project 
   * @return technicalSpecificationTaskDefinition
  **/

  public String getTechnicalSpecificationTaskDefinition() {
    return technicalSpecificationTaskDefinition;
  }

  public void setTechnicalSpecificationTaskDefinition(String technicalSpecificationTaskDefinition) {
    this.technicalSpecificationTaskDefinition = technicalSpecificationTaskDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Collection of design and development work products used in the definition of technical requirements 
   * @return technicalSpecificationTaskWorkProducts
  **/

  public String getTechnicalSpecificationTaskWorkProducts() {
    return technicalSpecificationTaskWorkProducts;
  }

  public void setTechnicalSpecificationTaskWorkProducts(String technicalSpecificationTaskWorkProducts) {
    this.technicalSpecificationTaskWorkProducts = technicalSpecificationTaskWorkProducts;
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


}

