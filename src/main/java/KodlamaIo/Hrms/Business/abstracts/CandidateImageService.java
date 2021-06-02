package KodlamaIo.Hrms.Business.abstracts;

import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.CandidateImage;

public interface CandidateImageService {
	Result upload(CandidateImage candidateImage);
}
