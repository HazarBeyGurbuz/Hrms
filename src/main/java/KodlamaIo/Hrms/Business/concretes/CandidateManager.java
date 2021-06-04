package KodlamaIo.Hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.CandidateEducationService;
import KodlamaIo.Hrms.Business.abstracts.CandidateExperianceService;
import KodlamaIo.Hrms.Business.abstracts.CandidateImageService;
import KodlamaIo.Hrms.Business.abstracts.CandidateLanguageService;
import KodlamaIo.Hrms.Business.abstracts.CandidateLinksService;
import KodlamaIo.Hrms.Business.abstracts.CandidateService;
import KodlamaIo.Hrms.Business.abstracts.CandidateSkillsService;
import KodlamaIo.Hrms.Business.abstracts.CandidateVerificationService;
import KodlamaIo.Hrms.Business.abstracts.CoverLetterService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.CandidateDao;
import KodlamaIo.Hrms.entities.concretes.Candidate;
import KodlamaIo.Hrms.entities.dtos.CvDto;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private CandidateVerificationService candidateVerificationService;
	private CandidateEducationService candidateEducationService;
	private CandidateExperianceService candidateExperianceService;
	private CandidateImageService candidateImageService;
	private CandidateLanguageService candidateLanguageService;
	private CandidateLinksService candidateLinksService;
	private CandidateSkillsService candidateSkillsService;
	private CoverLetterService coverLetterService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, CandidateVerificationService candidateVerificationService,
			CandidateEducationService candidateEducationService, CandidateExperianceService candidateExperianceService,
			CandidateImageService candidateImageService, CandidateLanguageService candidateLanguageService,
			CandidateLinksService candidateLinksService, CandidateSkillsService candidateSkillsService,
			CoverLetterService coverLetterService) {
		super();
		this.candidateDao = candidateDao;
		this.candidateVerificationService = candidateVerificationService;
		this.candidateEducationService = candidateEducationService;
		this.candidateExperianceService = candidateExperianceService;
		this.candidateImageService = candidateImageService;
		this.candidateLanguageService = candidateLanguageService;
		this.candidateLinksService = candidateLinksService;
		this.candidateSkillsService = candidateSkillsService;
		this.coverLetterService = coverLetterService;
	}


	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		
		Result checkTotal = candidateVerificationService.checkTotal(candidate);
		
		if(!checkTotal.isSuccess()) {
			return checkTotal;
		}
		
		this.candidateDao.save(candidate);
		return new SuccessResult("İş arayan başarıyla kaydedildi.");
	}
	
	
	@Override
	public DataResult<List<Candidate>> getById(int candidateId) {
	
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.getById(candidateId));
	}
	
	
	@Override
	public DataResult<List<CvDto>> getCvByCandidate(int candidateId) {
		CvDto cvDto = new CvDto();
		cvDto.setCandidate(this.getById(candidateId).getData());
		cvDto.setCandidateEducationStatus(this.candidateEducationService.getByCandidateId(candidateId).getData());
		cvDto.setCandidateExperiance(this.candidateExperianceService.getByCandidateId(candidateId).getData());
		cvDto.setCandidateLanguage(this.candidateLanguageService.getAllByCandidateId(candidateId).getData());
		cvDto.setCandidateLinks(this.candidateLinksService.getAllByCandidateId(candidateId).getData());
		cvDto.setCandidateSkills(this.candidateSkillsService.getAllByCandidateId(candidateId).getData());
		cvDto.setCoverLetter(this.coverLetterService.getByCandidateId(candidateId).getData());
		return new SuccessDataResult<List<CvDto>>();
	}






}
