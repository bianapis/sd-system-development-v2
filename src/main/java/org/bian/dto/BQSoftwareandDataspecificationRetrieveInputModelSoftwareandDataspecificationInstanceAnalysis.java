package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceAnalysis
 */
public class BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceAnalysis   {
  private String softwareandDataspecificationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return softwareandDataspecificationInstanceAnalysisReference
  **/

  public String getSoftwareandDataspecificationInstanceAnalysisReference() {
    return softwareandDataspecificationInstanceAnalysisReference;
  }

  public void setSoftwareandDataspecificationInstanceAnalysisReference(String softwareandDataspecificationInstanceAnalysisReference) {
    this.softwareandDataspecificationInstanceAnalysisReference = softwareandDataspecificationInstanceAnalysisReference;
  }


}

