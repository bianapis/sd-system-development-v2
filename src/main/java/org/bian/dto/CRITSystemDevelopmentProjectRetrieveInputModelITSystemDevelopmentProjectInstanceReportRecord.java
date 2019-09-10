package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceReportRecord
 */
public class CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceReportRecord   {
  private String iTSystemDevelopmentProjectInstanceReportReference = null;

  private String iTSystemDevelopmentProjectInstanceReportType = null;

  private String iTSystemDevelopmentProjectInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return iTSystemDevelopmentProjectInstanceReportReference
  **/

  public String getITSystemDevelopmentProjectInstanceReportReference() {
    return iTSystemDevelopmentProjectInstanceReportReference;
  }

  public void setITSystemDevelopmentProjectInstanceReportReference(String iTSystemDevelopmentProjectInstanceReportReference) {
    this.iTSystemDevelopmentProjectInstanceReportReference = iTSystemDevelopmentProjectInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return iTSystemDevelopmentProjectInstanceReportType
  **/

  public String getITSystemDevelopmentProjectInstanceReportType() {
    return iTSystemDevelopmentProjectInstanceReportType;
  }

  public void setITSystemDevelopmentProjectInstanceReportType(String iTSystemDevelopmentProjectInstanceReportType) {
    this.iTSystemDevelopmentProjectInstanceReportType = iTSystemDevelopmentProjectInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return iTSystemDevelopmentProjectInstanceReportParameters
  **/

  public String getITSystemDevelopmentProjectInstanceReportParameters() {
    return iTSystemDevelopmentProjectInstanceReportParameters;
  }

  public void setITSystemDevelopmentProjectInstanceReportParameters(String iTSystemDevelopmentProjectInstanceReportParameters) {
    this.iTSystemDevelopmentProjectInstanceReportParameters = iTSystemDevelopmentProjectInstanceReportParameters;
  }


}

