package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationCaptureInputModelUsageSpecificationInstanceRecord
 */
public class BQUsageSpecificationCaptureInputModelUsageSpecificationInstanceRecord   {
  private String usageSpecificationTaskDefinition = null;

  private String usageSpecificationTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the usage guidelines specification tasks and deliverables of the system development project 
   * @return usageSpecificationTaskDefinition
  **/

  public String getUsageSpecificationTaskDefinition() {
    return usageSpecificationTaskDefinition;
  }

  public void setUsageSpecificationTaskDefinition(String usageSpecificationTaskDefinition) {
    this.usageSpecificationTaskDefinition = usageSpecificationTaskDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Collection of design and development work products used in the definition of usage guidelines etc. 
   * @return usageSpecificationTaskWorkProducts
  **/

  public String getUsageSpecificationTaskWorkProducts() {
    return usageSpecificationTaskWorkProducts;
  }

  public void setUsageSpecificationTaskWorkProducts(String usageSpecificationTaskWorkProducts) {
    this.usageSpecificationTaskWorkProducts = usageSpecificationTaskWorkProducts;
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

