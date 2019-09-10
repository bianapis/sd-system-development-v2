/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SystemDevelopmentApiService {

	SDSystemDevelopmentActivateOutputModel activate(SDSystemDevelopmentActivateInputModel request);
	
	BQFunctionalSpecificationCaptureOutputModel captureFunctionalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalSpecificationCaptureInputModel request);
	
	BQSoftwareandDataspecificationCaptureOutputModel captureSoftwareanddataspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSoftwareandDataspecificationCaptureInputModel request);
	
	BQTechnicalSpecificationCaptureOutputModel captureTechnicalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnicalSpecificationCaptureInputModel request);
	
	BQTestingSpecificationCaptureOutputModel captureTestingspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingSpecificationCaptureInputModel request);
	
	BQUsageSpecificationCaptureOutputModel captureUsagespecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUsageSpecificationCaptureInputModel request);
	
	SDSystemDevelopmentConfigureOutputModel configure(String sdReferenceId, SDSystemDevelopmentConfigureInputModel request);
	
	CRITSystemDevelopmentProjectControlOutputModel control(String sdReferenceId, String crReferenceId, CRITSystemDevelopmentProjectControlInputModel request);
	
	CRITSystemDevelopmentProjectCreateOutputModel create(String sdReferenceId, CRITSystemDevelopmentProjectCreateInputModel request);
	
	BQFunctionalSpecificationExchangeOutputModel exchangeFunctionalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalSpecificationExchangeInputModel request);
	
	BQSoftwareandDataspecificationExchangeOutputModel exchangeSoftwareanddataspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSoftwareandDataspecificationExchangeInputModel request);
	
	BQTechnicalSpecificationExchangeOutputModel exchangeTechnicalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnicalSpecificationExchangeInputModel request);
	
	BQTestingSpecificationExchangeOutputModel exchangeTestingspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingSpecificationExchangeInputModel request);
	
	CRITSystemDevelopmentProjectExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRITSystemDevelopmentProjectExchangeInputModel request);
	
	BQUsageSpecificationExchangeOutputModel exchangeUsagespecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUsageSpecificationExchangeInputModel request);
	
	SDSystemDevelopmentFeedbackOutputModel feedback(String sdReferenceId, SDSystemDevelopmentFeedbackInputModel request);
	
	BQFunctionalSpecificationRequestOutputModel requestFunctionalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalSpecificationRequestInputModel request);
	
	BQSoftwareandDataspecificationRequestOutputModel requestSoftwareanddataspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSoftwareandDataspecificationRequestInputModel request);
	
	BQTechnicalSpecificationRequestOutputModel requestTechnicalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnicalSpecificationRequestInputModel request);
	
	BQTestingSpecificationRequestOutputModel requestTestingspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingSpecificationRequestInputModel request);
	
	CRITSystemDevelopmentProjectRequestOutputModel request(String sdReferenceId, String crReferenceId, CRITSystemDevelopmentProjectRequestInputModel request);
	
	BQUsageSpecificationRequestOutputModel requestUsagespecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUsageSpecificationRequestInputModel request);
	
	BQFunctionalSpecificationRetrieveOutputModel retrieveFunctionalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSoftwareandDataspecificationRetrieveOutputModel retrieveSoftwareanddataspecification(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTechnicalSpecificationRetrieveOutputModel retrieveTechnicalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTestingSpecificationRetrieveOutputModel retrieveTestingspecification(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQUsageSpecificationRetrieveOutputModel retrieveUsagespecification(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDSystemDevelopmentRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRITSystemDevelopmentProjectRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRITSystemDevelopmentProjectUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRITSystemDevelopmentProjectUpdateInputModel request);
	
	BQFunctionalSpecificationUpdateOutputModel updateFunctionalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalSpecificationUpdateInputModel request);
	
	BQSoftwareandDataspecificationUpdateOutputModel updateSoftwareanddataspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSoftwareandDataspecificationUpdateInputModel request);
	
	BQTechnicalSpecificationUpdateOutputModel updateTechnicalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnicalSpecificationUpdateInputModel request);
	
	BQTestingSpecificationUpdateOutputModel updateTestingspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingSpecificationUpdateInputModel request);
	
	BQUsageSpecificationUpdateOutputModel updateUsagespecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUsageSpecificationUpdateInputModel request);
	
}
