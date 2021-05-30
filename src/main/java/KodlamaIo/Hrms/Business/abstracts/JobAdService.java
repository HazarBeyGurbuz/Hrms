package KodlamaIo.Hrms.Business.abstracts;

import java.sql.Date;
import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.JobAd;

public interface JobAdService {
	DataResult<List<JobAd>> getAll();

	Result add(JobAd jobPosting);

	DataResult<List<JobAd>> getActiveAd();

	DataResult<List<JobAd>> getIsActiveTrueAndDeadlineDate(Date deadlineDate);

	DataResult<List<JobAd>> getIsActiveTrueAndEmployerId(int employerId);

	Result changeJobAdActivity(int jobAdId);
}
